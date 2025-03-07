package com.microservice.bookingservice.service;

import com.microservice.booking_proto.*;
import com.microservice.booking_proto.Room;
import com.microservice.bookingservice.grpc.MovieServiceGrpcClient;
import com.microservice.bookingservice.model.*;
import com.microservice.bookingservice.model.Cinema;
import com.microservice.bookingservice.model.Province;
import com.microservice.bookingservice.model.Seat;
import com.microservice.bookingservice.model.Showtime;
import com.microservice.bookingservice.repository.*;
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
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.util.*;

import static com.microservice.bookingservice.specifications.CinemaSpecs.containsName;
import static org.springframework.data.jpa.domain.Specification.where;

@Service
@RequiredArgsConstructor
@Transactional(propagation = Propagation.REQUIRED)
public class BookingService {

  private final ProvinceRepo provinceRepo;
  private final PhotoRepo photoRepo;
  private final CinemaRepo cinemaRepo;
  private final ShowtimeService showtimeService;
  private final ShowtimeRepo showtimeRepo;
  private final SeatRepo seatRepo;
  private final BookingRepo bookingRepo;
  private final BookedSeatRepo bookedSeatRepo;

  public CreateCinemaResponse createCinema(CreateCinemaRequest request) {

    Province province = provinceRepo.findById(request.getProvinceId()).orElse(null);
    if (province == null) {
      return CreateCinemaResponse.newBuilder()
              .setStatus(400)
              .setMessage("Province not found")
              .build();
    }

    List<String> photos = request.getPhotosList().stream().toList();

    Cinema cinema = Cinema.builder()
            .name(request.getName())
            .address(request.getAddress())
            .province(province)
            .build();

    try {
      cinemaRepo.save(cinema);
    } catch (Exception e) {
      return CreateCinemaResponse.newBuilder()
              .setStatus(500)
              .setMessage("Can not create cinema")
              .build();
    }

    for (String photo : photos) {
      Photo p = Photo.builder()
              .url(photo)
              .cinema(cinema)
              .build();
      photoRepo.save(p);
    }
    return CreateCinemaResponse.newBuilder()
            .setStatus(200)
            .setMessage("Success")
            .build();
  }

  public GetCinemasResponse getCinemas(GetCinemasRequest request) {
    int size = request.getSize();
    int page = request.getPage();
    String sort = request.getSort();

    Pageable pageable = null;
    if (StringUtils.hasText(sort)) {
      /// sort=id:desc
      List<Sort.Order> orders = new ArrayList<>();
      String[] list = sort.split(",");
      for (String element : list) {
        orders.add(new Sort.Order(Sort.Direction.fromString(element.split(":")[1].toUpperCase()), element.split(":")[0]));
      }
      pageable = PageRequest.of(page, size, Sort.by(orders));
    } else pageable = org.springframework.data.domain.PageRequest.of(page, size);

    Page<Cinema> pageCinema = cinemaRepo.findAll(pageable);
    List<Cinema> cinemas = pageCinema.getContent();

    List<com.microservice.booking_proto.Cinema> cinemaList = new ArrayList<>();
    for (Cinema cinema : cinemas) {
      List<String> photos = new ArrayList<>();
      for (Photo photo : cinema.getPhotos()) {
        photos.add(photo.getUrl());
      }
      com.microservice.booking_proto.Cinema c = com.microservice.booking_proto.Cinema.newBuilder()
              .setId(cinema.getId())
              .setName(cinema.getName())
              .setAddress(cinema.getAddress())
              .setProvince(com.microservice.booking_proto.Province.newBuilder()
                      .setId(cinema.getProvince().getId())
                      .setName(cinema.getProvince().getName())
                      .build())
              .addAllPhotos(photos)
              .build();
      cinemaList.add(c);
    }

    return GetCinemasResponse.newBuilder()
            .setStatus(200)
            .setMessage("Success")
            .addAllCinemas(cinemaList)
            .setTotalElement(pageCinema.getTotalElements())
            .setTotalPage(pageCinema.getTotalPages())
            .build();
  }

  public GetCinemaResponse getCinema(GetCinemaRequest request) {
    /// Hàm thực hiện lấy thông tin rạp cụ thể.
    int id = request.getId();
    Cinema cinema = cinemaRepo.findById(id).orElse(null);
    if (cinema == null) {
      return GetCinemaResponse.newBuilder()
              .setStatus(404)
              .setMessage("Not found")
              .build();
    }

    return GetCinemaResponse.newBuilder()
            .setStatus(200)
            .setMessage("Success")
            .setCinema(com.microservice.booking_proto.Cinema.newBuilder()
                    .setId(cinema.getId())
                    .setName(cinema.getName())
                    .setAddress(cinema.getAddress())
                    .setProvince(com.microservice.booking_proto.Province.newBuilder()
                            .setId(cinema.getProvince().getId())
                            .setName(cinema.getProvince().getName())
                            .build())
                    .addAllPhotos(cinema.getPhotos().stream().map(Photo::getUrl).toList())
                    .build())
            .build();
  }

  public SearchCinemasResponse searchCinemas(SearchCinemasRequest request) {
    int page = request.getPage();
    int size = request.getSize();
    String sort = request.getSort();
    Map<String, String> criteria = request.getCriteriaMap();

    Pageable pageable = null;
    if (StringUtils.hasText(sort)) {
      /// sort=id:desc
      List<Sort.Order> orders = new ArrayList<>();
      String[] list = sort.split(",");
      for (String element : list) {
        orders.add(new Sort.Order(Sort.Direction.fromString(element.split(":")[1].toUpperCase()), element.split(":")[0]));
      }
      pageable = PageRequest.of(page, size, Sort.by(orders));
    } else pageable = org.springframework.data.domain.PageRequest.of(page, size);

    Page<Cinema> pageCinema = null;

    try {
      pageCinema = this.searchByCriteria(criteria, pageable);
    } catch (ParseException e) {
      return SearchCinemasResponse.newBuilder()
              .setStatus(500)
              .setMessage("Can not search cinema")
              .build();
    }

    List<com.microservice.booking_proto.Cinema> cinemaList = new ArrayList<>();
    for (Cinema cinema : pageCinema.getContent()) {
      List<String> photos = new ArrayList<>();
      for (Photo photo : cinema.getPhotos()) {
        photos.add(photo.getUrl());
      }
      com.microservice.booking_proto.Cinema c = com.microservice.booking_proto.Cinema.newBuilder()
              .setId(cinema.getId())
              .setName(cinema.getName())
              .setAddress(cinema.getAddress())
              .setProvince(com.microservice.booking_proto.Province.newBuilder()
                      .setId(cinema.getProvince().getId())
                      .setName(cinema.getProvince().getName())
                      .build())
              .addAllPhotos(photos)
              .build();
      cinemaList.add(c);
    }

    return SearchCinemasResponse.newBuilder()
            .setStatus(200)
            .setMessage("Success")
            .addAllCinemas(cinemaList)
            .setTotalElement(pageCinema.getTotalElements())
            .setTotalPage(pageCinema.getTotalPages())
            .build();
  }

  private Page<Cinema> searchByCriteria(Map<String, String> criteria, Pageable pageable) throws ParseException {
    Specification<Cinema> specification = where(null);
    if (StringUtils.hasText(criteria.get("name"))) {
      specification = specification.and(containsName(criteria.get("name")));
    }
    return cinemaRepo.findAll(specification, pageable);
  }

  public UpdateCinemaResponse updateCinema(UpdateCinemaRequest request) {
    int id = request.getId();
    Cinema cinema = cinemaRepo.findById(id).orElse(null);
    if (cinema == null) {
      return UpdateCinemaResponse.newBuilder()
              .setStatus(404)
              .setMessage("Not found")
              .build();
    }

    if (request.hasProvince()) {
      Province province = provinceRepo.findById(request.getProvince().getId()).orElse(null);
      if (province == null) {
        return UpdateCinemaResponse.newBuilder()
                .setStatus(400)
                .setMessage("Province not found")
                .build();
      }
      cinema.setProvince(province);
    }

    if (request.hasName()) cinema.setName(request.getName().getValue());
    if (request.hasAddress()) cinema.setAddress(request.getAddress().getValue());

    try {
      cinemaRepo.save(cinema);
    } catch (Exception e) {
      return UpdateCinemaResponse.newBuilder()
              .setStatus(500)
              .setMessage("Can not update cinema")
              .build();
    }

    return UpdateCinemaResponse.newBuilder()
            .setStatus(200)
            .setMessage("Success")
            .build();
  }

  public GetBookingByShowtimeResponse getBookingByShowtime(GetBookingByShowtimeRequest request) {
    /// Hàm thực hiện lấy thông tin của booking thông qua showtime.

    int showtimeId = request.getShowtimeId();
    Showtime showtime = showtimeRepo.findById(showtimeId).orElse(null);

    if (showtime == null) {
      return GetBookingByShowtimeResponse.newBuilder()
              .setStatus(HttpStatus.NOT_FOUND.value())
              .setMessage("Showtime not found")
              .build();
    }


    /// Lấy danh sách tất cả các ghế ngồi mặc định của rạp tương ứng.
    int roomId = showtime.getRoom().getId();
    List<Seat> seats = seatRepo.findAllByRoomId(roomId);

    /// Lấy danh sách tất cả booking của showtime hiện tại.
    List<Booking> bookings = bookingRepo.findAllByShowtime(showtime);
    Set<Integer> booked = new HashSet<>();  /// Danh sách các ghế đã được đặt.
    for (Booking booking : bookings) {
      bookedSeatRepo.findAllByBookingId(booking.getId()).stream().forEach(bookedSeat -> {
        booked.add(bookedSeat.getSeat().getId()); /// ID của mỗi ghế này là Unique.
      });
    }

    List<SeatDTO> seatDTOs = new ArrayList<>();
    for (Seat seat : seats) {
      SeatDTO.SeatDTOBuilder cur = SeatDTO.builder();
      cur.id(seat.getId());
      cur.type(String.valueOf(seat.getType()));
      cur.price(seat.getPrice());
      cur.seatRow(seat.getSeatRow());
      cur.seatNumber(seat.getSeatNumber());
      cur.isBooked(booked.contains(seat.getId()));
      seatDTOs.add(cur.build());
    }

    return GetBookingByShowtimeResponse.newBuilder()
            .setStatus(HttpStatus.OK.value())
            .setMessage("Success")
            .setShowtime(com.microservice.booking_proto.Showtime.newBuilder()
                    .setId(showtime.getId())
                    .setMovieId(showtime.getMovieId())
                    .setDate(showtime.getDate().getTime())
                    .setStartTime(showtime.getStartTime().getTime())
                    .setEndTime(showtime.getEndTime().getTime())
                    .setRoom(Room.newBuilder()
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
                    .build())
            .addAllSeats(seatDTOs.stream().map(dto -> com.microservice.booking_proto.Seat.newBuilder()
                    .setId(dto.getId())
                    .setType(dto.getType())
                    .setPrice(dto.getPrice())
                    .setSeatRow(dto.getSeatRow())
                    .setSeatNumber(dto.getSeatNumber())
                    .setIsBooked(dto.isBooked())
                    .build())
                    .toList())
            .build();
  }
}
