package com.microservice.bff.service;

import com.google.protobuf.Int32Value;
import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
import com.microservice.bff.grpc.BookingServiceGrpcClient;
import com.microservice.bff.request.CreateShowtime;
import com.microservice.bff.request.UpdateShowtime;
import com.microservice.bff.response.Cinema;
import com.microservice.bff.response.ResponseData;
import com.microservice.bff.response.Room;
import com.microservice.bff.response.Showtime;
import com.microservice.booking_proto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class ShowtimeService {
  private final BookingServiceGrpcClient bookingServiceGrpcClient;


  public ResponseData createShowtime(CreateShowtime createShowtime) {
    /// Hàm thực hiện tạo mới 1 xuất chiếu.

    CreateShowtimeRequest request = CreateShowtimeRequest.newBuilder()
            .setRoomId(createShowtime.getRoomId())
            .setMovieId(createShowtime.getMovieId())
            .setStartTime(String.valueOf(createShowtime.getStartTime()))
            .setEndTime(String.valueOf(createShowtime.getEndTime()))
            .setDate(createShowtime.getDate().getTime())
            .build();

    CreateShowtimeResponse response = bookingServiceGrpcClient.createShowtime(request);
    return ResponseData.builder()
            .status(response.getStatus())
            .message(response.getMessage())
            .build();
  }

  public ResponseData getShowtimes(int page, int size, String sort) {
    /// Hàm lấy danh sách suất chiếu.

    GetShowtimesRequest request = GetShowtimesRequest.newBuilder()
            .setPage(page)
            .setSize(size)
            .setSort(sort)
            .build();

    GetShowtimesResponse response = bookingServiceGrpcClient.getShowtimes(request);

    List<Showtime> showtimes = response.getShowtimesList().stream().map(showtime -> Showtime.builder()
            .id(showtime.getId())
            .movieId(showtime.getMovieId())
            .room(Room.builder()
                    .id(showtime.getRoom().getId())
                    .name(showtime.getRoom().getName())
                    .location(showtime.getRoom().getLocation())
                    .cinema(Cinema.builder()
                            .id(showtime.getRoom().getCinema().getId())
                            .name(showtime.getRoom().getCinema().getName())
                            .address(showtime.getRoom().getCinema().getAddress())
                            .province(com.microservice.bff.response.Province.builder()
                                    .id(showtime.getRoom().getCinema().getProvince().getId())
                                    .name(showtime.getRoom().getCinema().getProvince().getName())
                                    .build())
                            .build())
                    .build())
            .date(new Date(showtime.getDate()))
            .startTime(new Time(showtime.getStartTime()))
            .endTime(new Time(showtime.getEndTime()))
            .build()).toList();

    if (showtimes.isEmpty()) {
      return ResponseData.builder()
              .status(response.getStatus())
              .message(response.getMessage())
              .build();
    }


    return ResponseData.builder()
            .status(response.getStatus())
            .message(response.getMessage())
            .data(Map.of(
                    "showtimes", showtimes,
                    "totalElement", response.getTotalElement(),
                    "totalPage", response.getTotalPage(),
                    "page", page + 1,
                    "size", size
            ))
            .build();
  }

  public ResponseData updateShowtime(int id, UpdateShowtime updateShowtime) {
    /// Hàm cập nhật thông tin của một suất chiếu.

    UpdateShowtimeRequest.Builder builder = UpdateShowtimeRequest.newBuilder();
    builder.setId(id);

    if (updateShowtime.getRoomId() != null) {
      builder.setRoomId(Int32Value.of(updateShowtime.getRoomId()));
    }
    if (updateShowtime.getMovieId() != null) {
      builder.setMovieId(Int32Value.of(updateShowtime.getMovieId()));
    }
    if (updateShowtime.getStartTime() != null) {
      builder.setStartTime(Int64Value.of(updateShowtime.getStartTime().getTime()));
    }
    if (updateShowtime.getEndTime() != null) {
      builder.setEndTime(Int64Value.of(updateShowtime.getEndTime().getTime()));
    }
    if (updateShowtime.getDate() != null) {
      builder.setDate(Int64Value.of(updateShowtime.getDate().getTime()));
    }

    UpdateShowtimeRequest request = builder.build();

    UpdateShowtimeResponse response = bookingServiceGrpcClient.updateShowtime(request);
    return ResponseData.builder()
            .status(response.getStatus())
            .message(response.getMessage())
            .build();
  }

  public ResponseData getShowtime(int id) {

    GetShowtimeRequest request = GetShowtimeRequest.newBuilder()
            .setId(id)
            .build();

    GetShowtimeResponse response = bookingServiceGrpcClient.getShowtime(request);
    if (!response.hasShowtime()) {
      return ResponseData.builder()
              .status(response.getStatus())
              .message(response.getMessage())
              .build();
    }

    com.microservice.booking_proto.Showtime showtimeMsg = response.getShowtime();

    Showtime showtime = Showtime.builder()
            .id(showtimeMsg.getId())
            .movieId(showtimeMsg.getMovieId())
            .room(Room.builder()
                    .id(showtimeMsg.getRoom().getId())
                    .name(showtimeMsg.getRoom().getName())
                    .location(showtimeMsg.getRoom().getLocation())
                    .cinema(Cinema.builder()
                            .id(showtimeMsg.getRoom().getCinema().getId())
                            .name(showtimeMsg.getRoom().getCinema().getName())
                            .address(showtimeMsg.getRoom().getCinema().getAddress())
                            .province(com.microservice.bff.response.Province.builder()
                                    .id(showtimeMsg.getRoom().getCinema().getProvince().getId())
                                    .name(showtimeMsg.getRoom().getCinema().getProvince().getName())
                                    .build())
                            .build())
                    .build())
            .date(new Date(showtimeMsg.getDate()))
            .startTime(new Time(showtimeMsg.getStartTime()))
            .endTime(new Time(showtimeMsg.getEndTime()))
            .build();

    return ResponseData.builder()
            .status(response.getStatus())
            .message(response.getMessage())
            .data(showtime)
            .build();
  }

  public ResponseData deleteShowtime(int id) {
    DeleteShowtimeRequest request = DeleteShowtimeRequest.newBuilder()
            .setId(id)
            .build();

    DeleteShowtimeResponse response = bookingServiceGrpcClient.deleteShowtime(request);
    return ResponseData.builder()
            .status(response.getStatus())
            .message(response.getMessage())
            .build();
  }

  public ResponseData searchShowtimes(Map<String, String> criteria, int page, int size, String sort) {
    SearchShowtimesRequest request = SearchShowtimesRequest.newBuilder()
            .putAllCriteria(criteria)
            .setPage(page)
            .setSize(size)
            .setSort(sort)
            .build();

    SearchShowtimesResponse response = bookingServiceGrpcClient.searchShowtimes(request);

    List<Showtime> showtimes = response.getShowtimesList().stream().map(showtime -> Showtime.builder()
            .id(showtime.getId())
            .movieId(showtime.getMovieId())
            .room(Room.builder()
                    .id(showtime.getRoom().getId())
                    .name(showtime.getRoom().getName())
                    .location(showtime.getRoom().getLocation())
                    .cinema(Cinema.builder()
                            .id(showtime.getRoom().getCinema().getId())
                            .name(showtime.getRoom().getCinema().getName())
                            .address(showtime.getRoom().getCinema().getAddress())
                            .province(com.microservice.bff.response.Province.builder()
                                    .id(showtime.getRoom().getCinema().getProvince().getId())
                                    .name(showtime.getRoom().getCinema().getProvince().getName())
                                    .build())
                            .build())
                    .build())
            .date(new Date(showtime.getDate()))
            .startTime(new Time(showtime.getStartTime()))
            .endTime(new Time(showtime.getEndTime()))
            .build()).toList();

    if (showtimes.isEmpty()) {
      return ResponseData.builder()
              .status(response.getStatus())
              .message(response.getMessage())
              .build();
    }

    return ResponseData.builder()
            .status(response.getStatus())
            .message(response.getMessage())
            .data(Map.of(
                    "showtimes", showtimes,
                    "totalElement", response.getTotalElement(),
                    "totalPage", response.getTotalPage(),
                    "page", page + 1,
                    "size", size
            ))
            .build();

  }

  public ResponseData getMovieShowtimes(int id, int page, int size, String sort) {

    GetMovieShowtimesRequest request = GetMovieShowtimesRequest.newBuilder()
            .setMovieId(id)
            .setPage(page)
            .setSize(size)
            .setSort(sort)
            .build();

    GetMovieShowtimesResponse response = bookingServiceGrpcClient.getMovieShowtimes(request);
    List<Showtime> showtimes = response.getShowtimesList().stream().map(showtime -> Showtime.builder()
                    .id(showtime.getId())
                    .movieId(showtime.getMovieId())
                    .room(com.microservice.bff.response.Room.builder()
                            .id(showtime.getRoom().getId())
                            .name(showtime.getRoom().getName())
                            .location(showtime.getRoom().getLocation())
                            .cinema(com.microservice.bff.response.Cinema.builder()
                                    .id(showtime.getRoom().getCinema().getId())
                                    .name(showtime.getRoom().getCinema().getName())
                                    .address(showtime.getRoom().getCinema().getAddress())
                                    .province(com.microservice.bff.response.Province.builder()
                                            .id(showtime.getRoom().getCinema().getProvince().getId())
                                            .name(showtime.getRoom().getCinema().getProvince().getName())
                                            .build())
                                    .build())
                            .build())
                    .date(new java.sql.Date(showtime.getDate()))
                    .startTime(new java.sql.Time(showtime.getStartTime()))
                    .endTime(new java.sql.Time(showtime.getEndTime()))
                    .build())
            .toList();

    if (showtimes.isEmpty()) {
      return ResponseData.builder()
              .status(response.getStatus())
              .message(response.getMessage())
              .build();
    }

    return ResponseData.builder()
            .status(response.getStatus())
            .message(response.getMessage())
            .data(Map.of(
                    "showtimes", showtimes,
                    "totalPages", response.getTotalElement(),
                    "totalElements", response.getTotalPage(),
                    "page", page + 1,
                    "size", size))
            .build();
  }
}
