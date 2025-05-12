package com.microservice.bff.service;

import com.microservice.bff.exceptions.BadRequestException;
import com.microservice.bff.exceptions.ResourceNotFoundException;
import com.microservice.bff.grpc.BookingServiceGrpcClient;
import com.microservice.bff.grpc.MovieServiceGrpcClient;
import com.microservice.bff.request.DeclareQueueRequest;
import com.microservice.bff.request.ReserveRequest;
import com.microservice.bff.response.*;
import com.microservice.bff.response.Cinema;
import com.microservice.bff.response.Province;
import com.microservice.bff.response.Room;
import com.microservice.bff.response.Seat;
import com.microservice.bff.response.Showtime;
import com.microservice.booking_proto.*;
import com.microservice.movie_proto.GetMovieRequest;
import com.microservice.movie_proto.GetMovieResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.sql.Time;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class BookingService {
  private final BookingServiceGrpcClient bookingServiceGrpcClient;
  private final MovieServiceGrpcClient movieServiceGrpcClient;

  public ResponseData getBookingByShowtime(int showtimeId) {
    try {
      GetBookingByShowtimeRequest request = GetBookingByShowtimeRequest.newBuilder()
              .setShowtimeId(showtimeId).build();

      GetBookingByShowtimeResponse response = bookingServiceGrpcClient.getBookingByShowtime(request);
      if (!response.hasShowtime()) {
        throw new ResourceNotFoundException(response.getMessage());
      }

      com.microservice.booking_proto.Showtime showtimeResponse = response.getShowtime();
      Showtime showtime = Showtime.builder()
              .id(showtimeResponse.getId())
              .movieId(showtimeResponse.getMovieId())
              .date(new Date(showtimeResponse.getDate()))
              .startTime(new Time(showtimeResponse.getStartTime()))
              .endTime(new Time(showtimeResponse.getEndTime()))
              .room(Room.builder()
                      .id(showtimeResponse.getRoom().getId())
                      .name(showtimeResponse.getRoom().getName())
                      .location(showtimeResponse.getRoom().getLocation())
                      .cinema(Cinema.builder()
                              .id(showtimeResponse.getRoom().getCinema().getId())
                              .name(showtimeResponse.getRoom().getCinema().getName())
                              .address(showtimeResponse.getRoom().getCinema().getAddress())
                              .name(showtimeResponse.getRoom().getCinema().getName())
                              .province(Province.builder()
                                      .id(showtimeResponse.getRoom().getCinema().getProvince().getId())
                                      .name(showtimeResponse.getRoom().getCinema().getProvince().getName())
                                      .build())
                              .build())
                      .build())
              .build();

      List<Seat> seats = response.getSeatsList().stream().map(seat -> Seat.builder()
                      .id(seat.getId())
                      .type(seat.getType())
                      .price(seat.getPrice())
                      .seatRow(seat.getSeatRow())
                      .seatNumber(seat.getSeatNumber())
                      .roomId(showtime.getRoom().getId())
                      .isBooked(seat.getIsBooked())
                      .build())
              .toList();


      /// Lấy thông tin movie.
      int movieId = showtime.getMovieId();
      GetMovieResponse movieResponse = movieServiceGrpcClient.getMovie(GetMovieRequest.newBuilder().setId(movieId).build());
      if (movieResponse.hasMovie()) {
        Movie movie = Movie.builder()
                .id(movieResponse.getMovie().getId())
                .name(movieResponse.getMovie().getName())
                .poster(movieResponse.getMovie().getPoster())
                .backdrop(movieResponse.getMovie().getBackdrop())
                .build();
        return new ResponseData(HttpStatus.OK.value(), "Success", Map.of(
                "movie", movie,
                "showtime", showtime,
                "seats", seats
        ));
      }
      return new ResponseData(HttpStatus.NOT_FOUND.value(), "Booking not found", null);
    } catch (Exception e) {
      throw new ResourceNotFoundException("Booking not found");
    }
  }

  public ResponseData handlePreSeatReservation(ReserveRequest reserve) {
    Integer showtimeId = reserve.getShowtimeId();
    List<Integer> seats = reserve.getSeats();
    if (showtimeId == null || seats == null || seats.isEmpty()) {
      throw new BadRequestException("Invalid request");
    }

    HandlePreSeatReservationRequest request = HandlePreSeatReservationRequest.newBuilder()
            .setShowtimeId(showtimeId)
            .addAllSeats(seats)
            .build();

    HandlePreSeatReservationResponse response = bookingServiceGrpcClient.handlePreSeatReservation(request);
    if (response.getStatus() != HttpStatus.OK.value()) {
      throw new RuntimeException(response.getMessage());
    }
    return new ResponseData(response.getStatus(), response.getMessage());
  }

  public ResponseData handleReleaseSeat(ReserveRequest reserve) {
    return null;
  }

  public ResponseData declareQueue(DeclareQueueRequest request) {
    String accountString = request.getAccountId();
    if (!StringUtils.hasText(accountString)) {
      throw new BadRequestException("Unauthenticated user");
    }
    int accountId = Integer.parseInt(request.getAccountId());
    HandleDeclareQueueResponse response = bookingServiceGrpcClient.handleDeclareQueue(HandleDeclareQueueRequest.newBuilder()
            .setAccountId(accountId)
            .build());
    if (response.getStatus() != HttpStatus.OK.value() || response.getStatus() != HttpStatus.CREATED.value()) {
      throw new RuntimeException(response.getMessage());
    }
    return new ResponseData(response.getStatus(), response.getMessage());
  }

  public ResponseData removeQueue(DeclareQueueRequest request) {
    int accountId = Integer.parseInt(request.getAccountId());
    HandleRemoveQueueResponse response = bookingServiceGrpcClient.handleRemoveQueue(HandleRemoveQueueRequest.newBuilder()
            .setAccountId(accountId)
            .build());
    if (response.getStatus() != HttpStatus.OK.value()) {
      throw new RuntimeException(response.getMessage());
    }
    return new ResponseData(response.getStatus(), response.getMessage());
  }
}
