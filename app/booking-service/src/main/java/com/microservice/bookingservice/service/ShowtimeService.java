package com.microservice.bookingservice.service;

import com.microservice.booking_proto.*;
import com.microservice.bookingservice.grpc.MovieServiceGrpcClient;
import com.microservice.bookingservice.model.Room;
import com.microservice.bookingservice.model.Showtime;
import com.microservice.bookingservice.repository.RoomRepo;
import com.microservice.bookingservice.repository.ShowtimeRepo;
import com.microservice.movie_proto.IsMoviePlayingNowRequest;
import com.microservice.movie_proto.IsMoviePlayingNowResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.microservice.bookingservice.specifications.ShowtimeSpecs.*;
import static org.springframework.data.jpa.domain.Specification.where;

@Service
@RequiredArgsConstructor
@Transactional(propagation = Propagation.REQUIRED)
public class ShowtimeService {
  private final MovieServiceGrpcClient movieServiceGrpcClient;
  private final RoomRepo roomRepo;
  private final ShowtimeRepo showtimeRepo;

  public CreateShowtimeResponse createShowtime(CreateShowtimeRequest request) {
    /// Kiểm tra xem phim có đang chiếu không. Gọi tới movie-service.
    int movieId = request.getMovieId();

    IsMoviePlayingNowRequest isMoviePlayingNowRequest = IsMoviePlayingNowRequest.newBuilder()
            .setId(movieId)
            .build();
    IsMoviePlayingNowResponse isMoviePlayingNowResponse = movieServiceGrpcClient.isMoviePlayingNow(isMoviePlayingNowRequest);
    if (!isMoviePlayingNowResponse.getIsNowPlaying()) {
      return CreateShowtimeResponse.newBuilder()
              .setStatus(400)
              .setMessage("Movie is not playing now")
              .build();
    }

    Room room = roomRepo.findById(request.getRoomId()).orElse(null);
    if (room == null || room.getId() <= 0) {
      return CreateShowtimeResponse.newBuilder()
              .setStatus(400)
              .setMessage("Room not found")
              .build();
    }

    /// Kiểm tra thời gian bắt đầu và kết thúc có hợp lý.
    if (request.getStartTime().isEmpty() || request.getEndTime().isEmpty()) {
      return CreateShowtimeResponse.newBuilder()
              .setStatus(400)
              .setMessage("Start time or end time is empty")
              .build();
    }

    Time startTime = Time.valueOf(request.getStartTime());
    Time endTime = Time.valueOf(request.getEndTime());
    if (startTime.after(endTime)) {
      return CreateShowtimeResponse.newBuilder()
              .setStatus(400)
              .setMessage("Start time must be before end time")
              .build();
    }

    /// Tạo mới Showtime.
    Showtime showtime = Showtime.builder()
            .room(room)
            .movieId(movieId)
            .startTime(startTime)
            .endTime(endTime)
            .date(new Date(request.getDate()))
            .build();

    try {
      showtimeRepo.save(showtime);
    } catch (Exception e) {
      return CreateShowtimeResponse.newBuilder()
              .setStatus(500)
              .setMessage("Can not create showtime")
              .build();
    }

    /// Tạo mới showtime thành công.
    return CreateShowtimeResponse.newBuilder()
            .setStatus(200)
            .setMessage("Success")
            .build();
  }

  @Transactional(readOnly = true)
  public GetShowtimesResponse getShowtimes(GetShowtimesRequest request) {
    int page = request.getPage();
    int size = request.getSize();
    String sort = request.getSort();

    Pageable pageable = null;

    if (StringUtils.hasText(sort)) {
      List<Sort.Order> orders = new ArrayList<>();
      String[] list = sort.split(",");
      for (String element : list) {
        orders.add(new Sort.Order(Sort.Direction.fromString(element.split(":")[1].toUpperCase()), element.split(":")[0]));
      }
      pageable = PageRequest.of(page, size, Sort.by(orders));
    } else pageable = PageRequest.of(page, size);

    try {
      Page<Showtime> pageShowtime = showtimeRepo.findAll(pageable);
      List<Showtime> showtimes = pageShowtime.getContent();
      return GetShowtimesResponse.newBuilder()
              .setStatus(200)
              .setMessage("Success")
              .addAllShowtimes(showtimes.stream().map(showtime -> com.microservice.booking_proto.Showtime.newBuilder()
                              .setId(showtime.getId())
                              .setRoom(com.microservice.booking_proto.Room.newBuilder()
                                      .setId(showtime.getRoom().getId())
                                      .setName(showtime.getRoom().getName())
                                      .setLocation(showtime.getRoom().getLocation())
                                      .setCinema(com.microservice.booking_proto.Cinema.newBuilder()
                                              .setId(showtime.getRoom().getCinema().getId())
                                              .setName(showtime.getRoom().getCinema().getName())
                                              .setAddress(showtime.getRoom().getCinema().getAddress())
                                              .setProvince(com.microservice.booking_proto.Province.newBuilder()
                                                      .setId(showtime.getRoom().getCinema().getProvince().getId())
                                                      .setName(showtime.getRoom().getCinema().getProvince().getName())
                                                      .build())
                                              .build())
                                      .build())
                              .setMovieId(showtime.getMovieId())
                              .setDate(showtime.getDate().getTime())
                              .setStartTime(showtime.getStartTime().getTime())
                              .setEndTime(showtime.getEndTime().getTime())
                              .build())
                      .toList())
              .setTotalElement(pageShowtime.getTotalElements())
              .setTotalPage(pageShowtime.getTotalPages())
              .build();
    } catch (Exception e) {
      return GetShowtimesResponse.newBuilder()
              .setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value())
              .setMessage("Can not get showtimes")
              .setTotalElement(0)
              .setTotalPage(0)
              .addAllShowtimes(new ArrayList<>())
              .build();
    }
  }

  public UpdateShowtimeResponse updateShowtime(UpdateShowtimeRequest request) {
    int id = request.getId();
    Showtime showtime = showtimeRepo.findById(id).orElse(null);
    if (showtime == null) {
      return UpdateShowtimeResponse.newBuilder()
              .setStatus(404)
              .setMessage("Showtime not found")
              .build();
    }

    if (request.hasRoomId()) {
      Room room = roomRepo.findById(request.getRoomId().getValue()).orElse(null);
      if (room == null) {
        return UpdateShowtimeResponse.newBuilder()
                .setStatus(404)
                .setMessage("Room not found")
                .build();
      }
      showtime.setRoom(room);
    }

    if (request.hasMovieId()) {
      int movieId = request.getMovieId().getValue();
      if (movieId != showtime.getMovieId()) {
        IsMoviePlayingNowRequest isMoviePlayingNowRequest = IsMoviePlayingNowRequest.newBuilder()
                .setId(movieId)
                .build();

        IsMoviePlayingNowResponse isMoviePlayingNowResponse = movieServiceGrpcClient.isMoviePlayingNow(isMoviePlayingNowRequest);
        if (!isMoviePlayingNowResponse.getIsNowPlaying()) {
          return UpdateShowtimeResponse.newBuilder()
                  .setStatus(HttpStatus.BAD_REQUEST.value())
                  .setMessage("Movie is not playing now")
                  .build();
        }
        showtime.setMovieId(movieId);
      }
    }

    if (request.hasStartTime()) {
      showtime.setStartTime(new Time(request.getStartTime().getValue()));
    }

    if (request.hasEndTime()) {
      showtime.setEndTime(new Time(request.getEndTime().getValue()));
    }

    if (request.hasDate()) {
      showtime.setDate(new Date(request.getDate().getValue()));
    }

    try {
      showtimeRepo.save(showtime);
    } catch (Exception e) {
      return UpdateShowtimeResponse.newBuilder()
              .setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value())
              .setMessage("Can not update showtime")
              .build();
    }

    return UpdateShowtimeResponse.newBuilder()
            .setStatus(200)
            .setMessage("Success")
            .build();
  }

  @Transactional(readOnly = true)
  public GetShowtimeResponse getShowtime(GetShowtimeRequest request) {
    /// Hàm thực hiện lấy thông tin 1 showtime.
    int id = request.getId();
    try {
      Showtime showtime = showtimeRepo.findById(id).orElse(null);
      if (showtime == null || showtime.getId() <= 0) {
        return GetShowtimeResponse.newBuilder()
                .setStatus(HttpStatus.NOT_FOUND.value())
                .setMessage("Showtime not found")
                .build();
      }
      return GetShowtimeResponse.newBuilder()
              .setStatus(200)
              .setMessage("Success")
              .setShowtime(com.microservice.booking_proto.Showtime.newBuilder()
                      .setId(showtime.getId())
                      .setRoom(com.microservice.booking_proto.Room.newBuilder()
                              .setId(showtime.getRoom().getId())
                              .setName(showtime.getRoom().getName())
                              .setLocation(showtime.getRoom().getLocation())
                              .setCinema(com.microservice.booking_proto.Cinema.newBuilder()
                                      .setId(showtime.getRoom().getCinema().getId())
                                      .setName(showtime.getRoom().getCinema().getName())
                                      .setAddress(showtime.getRoom().getCinema().getAddress())
                                      .setProvince(com.microservice.booking_proto.Province.newBuilder()
                                              .setId(showtime.getRoom().getCinema().getProvince().getId())
                                              .setName(showtime.getRoom().getCinema().getProvince().getName())
                                              .build())
                                      .build())
                              .build())
                      .setMovieId(showtime.getMovieId())
                      .setDate(showtime.getDate().getTime())
                      .setStartTime(showtime.getStartTime().getTime())
                      .setEndTime(showtime.getEndTime().getTime())
                      .build())
              .build();
    } catch (Exception e) {
      return GetShowtimeResponse.newBuilder()
              .setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value())
              .setMessage("Can not get showtime")
              .build();
    }
  }

  public DeleteShowtimeResponse deleteShowtime(DeleteShowtimeRequest request) {
    int id = request.getId();
    Showtime showtime = showtimeRepo.findById(id).orElse(null);
    if (showtime == null || showtime.getId() <= 0) {
      return DeleteShowtimeResponse.newBuilder()
              .setStatus(404)
              .setMessage("Showtime not found")
              .build();
    }
    try {
      showtimeRepo.delete(showtime);
    } catch (Exception e) {
      return DeleteShowtimeResponse.newBuilder()
              .setStatus(500)
              .setMessage("Can not delete showtime")
              .build();
    }
    return DeleteShowtimeResponse.newBuilder()
            .setStatus(200)
            .setMessage("Success")
            .build();
  }

  @Transactional(readOnly = true)
  public SearchShowtimesResponse searchShowtimes(SearchShowtimesRequest request) {
    /// Hàm thực hiện tìm kiếm showtime theo điều kiện.
    int page = request.getPage();
    int size = request.getSize();
    String sort = request.getSort();
    Map<String, String> criteria = request.getCriteriaMap();

    Pageable pageable = null;
    if (StringUtils.hasText(sort)) {
      List<Sort.Order> orders = new ArrayList<>();
      String[] list = sort.split(",");
      for (String element : list) {
        orders.add(new Sort.Order(Sort.Direction.fromString(element.split(":")[1].toUpperCase()), element.split(":")[0]));
      }
      pageable = PageRequest.of(page, size, Sort.by(orders));
    } else pageable = PageRequest.of(page, size);

    Page<Showtime> pageShowtime = null;
    try {
      pageShowtime = this.searchByCriteria(criteria, pageable);
    } catch (Exception e) {
      return SearchShowtimesResponse.newBuilder()
              .setStatus(500)
              .setMessage("Can not search showtime")
              .build();
    }

    List<com.microservice.booking_proto.Showtime> showtimes = new ArrayList<>();
    for (Showtime showtime : pageShowtime.getContent()) {
      showtimes.add(com.microservice.booking_proto.Showtime.newBuilder()
              .setId(showtime.getId())
              .setRoom(com.microservice.booking_proto.Room.newBuilder()
                      .setId(showtime.getRoom().getId())
                      .setName(showtime.getRoom().getName())
                      .setLocation(showtime.getRoom().getLocation())
                      .setCinema(com.microservice.booking_proto.Cinema.newBuilder()
                              .setId(showtime.getRoom().getCinema().getId())
                              .setName(showtime.getRoom().getCinema().getName())
                              .setAddress(showtime.getRoom().getCinema().getAddress())
                              .setProvince(com.microservice.booking_proto.Province.newBuilder()
                                      .setId(showtime.getRoom().getCinema().getProvince().getId())
                                      .setName(showtime.getRoom().getCinema().getProvince().getName())
                                      .build())
                              .build())
                      .build())
              .setMovieId(showtime.getMovieId())
              .setDate(showtime.getDate().getTime())
              .setStartTime(showtime.getStartTime().getTime())
              .setEndTime(showtime.getEndTime().getTime())
              .build());
    }
    return SearchShowtimesResponse.newBuilder()
            .setStatus(200)
            .setMessage("Success")
            .addAllShowtimes(showtimes)
            .setTotalElement(pageShowtime.getTotalElements())
            .setTotalPage(pageShowtime.getTotalPages())
            .build();
  }

  @Transactional(readOnly = true)
  public Page<Showtime> searchByCriteria(Map<String, String> criteria, Pageable pageable) {
    Specification<Showtime> specification = where(null);

    if (StringUtils.hasText(criteria.get("roomId"))) {
      int roomId = Integer.parseInt(criteria.get("roomId"));
      specification = specification.and(hasRoom(roomId));
    }

    if (StringUtils.hasText(criteria.get("movieId"))) {
      specification = specification.and(hasMovieId(Integer.parseInt(criteria.get("movieId"))));
    }

    return showtimeRepo.findAll(specification, pageable);
  }

  @Transactional(readOnly = true)
  public GetMovieShowtimesResponse getMovieShowtimes(GetMovieShowtimesRequest request) {
    /// Hàm thực hiện lấy tất cả suất chiếu của 1 phim cụ thể tính từ thời điểm hiện tại.
    try {
      int movieId = request.getMovieId();
      List<Showtime> result = showtimeRepo.findCurrentAndFutureShowtimesByMovieId(movieId);

      List<com.microservice.booking_proto.Showtime> showtimes = result.stream().map(showtime -> com.microservice.booking_proto.Showtime.newBuilder()
                      .setId(showtime.getId())
                      .setRoom(com.microservice.booking_proto.Room.newBuilder()
                              .setId(showtime.getRoom().getId())
                              .setName(showtime.getRoom().getName())
                              .setLocation(showtime.getRoom().getLocation())
                              .setCinema(com.microservice.booking_proto.Cinema.newBuilder()
                                      .setId(showtime.getRoom().getCinema().getId())
                                      .setName(showtime.getRoom().getCinema().getName())
                                      .setAddress(showtime.getRoom().getCinema().getAddress())
                                      .setProvince(com.microservice.booking_proto.Province.newBuilder()
                                              .setId(showtime.getRoom().getCinema().getProvince().getId())
                                              .setName(showtime.getRoom().getCinema().getProvince().getName())
                                              .build())
                                      .build())
                              .build())
                      .setMovieId(showtime.getMovieId())
                      .setDate(showtime.getDate().getTime())
                      .setStartTime(showtime.getStartTime().getTime())
                      .setEndTime(showtime.getEndTime().getTime())
                      .build())
              .toList();

      return GetMovieShowtimesResponse.newBuilder()
              .setStatus(200)
              .setMessage("Success")
              .addAllShowtimes(showtimes)
              .build();
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
