package com.microservice.bff.service;

import com.microservice.bff.grpc.BookingServiceGrpcClient;
import com.microservice.bff.grpc.MovieServiceGrpcClient;
import com.microservice.bff.response.*;
import com.microservice.booking_proto.GetBookingByShowtimeRequest;
import com.microservice.booking_proto.GetBookingByShowtimeResponse;
import com.microservice.movie_proto.GetMovieRequest;
import com.microservice.movie_proto.GetMovieResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

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
    GetBookingByShowtimeRequest request = GetBookingByShowtimeRequest.newBuilder()
            .setShowtimeId(showtimeId).build();

    GetBookingByShowtimeResponse response = bookingServiceGrpcClient.getBookingByShowtime(request);
    if (!response.hasShowtime()) {
      return new ResponseError(HttpStatus.NOT_FOUND.value(), "Showtime not found");
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
    System.out.println(movieId);
    GetMovieResponse movieResponse = movieServiceGrpcClient.getMovie(GetMovieRequest.newBuilder().setId(movieId).build());
    Movie movie = null;
    if (movieResponse.hasMovie()) {
      movie = Movie.builder()
              .id(movieResponse.getMovie().getId())
              .name(movieResponse.getMovie().getName())
              .poster(movieResponse.getMovie().getPoster())
              .backdrop(movieResponse.getMovie().getBackdrop())
              .build();
    }

    return new ResponseData(HttpStatus.OK.value(), "Success", Map.of(
            "movie", movie,
            "showtime", showtime,
            "seats", seats
    ));
  }
}
