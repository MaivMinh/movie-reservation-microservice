package com.microservice.bff.service;

import com.microservice.bff.grpc.BookingServiceGrpcClient;
import com.microservice.bff.grpc.MovieServiceGrpcClient;
import com.microservice.bff.request.Movie;
import com.microservice.bff.response.ResponseData;
import com.microservice.bff.response.Showtime;
import com.microservice.booking_proto.GetMovieShowtimesRequest;
import com.microservice.booking_proto.GetMovieShowtimesResponse;
import com.microservice.movie_proto.GetMovieRequest;
import com.microservice.movie_proto.GetMovieResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class BuyTicketService {
  private final MovieServiceGrpcClient movieServiceGrpcClient;
  private final BookingServiceGrpcClient bookingServiceGrpcClient;


  public ResponseData getBuyTicket(int movieId) {
    /// 1. Thực hiện lấy thông tin phim.
    GetMovieResponse movieResponse = movieServiceGrpcClient.getMovie(GetMovieRequest.newBuilder().setId(movieId).build());
    if (!movieResponse.hasMovie()) {
      /// Nếu không có thông tin movie thì trả về luôn.
      return ResponseData.builder().status(movieResponse.getStatus()).message(movieResponse.getMessage()).build();
    }
    com.microservice.movie_proto.Movie respondingMovie = movieResponse.getMovie();
    Movie movie = Movie.builder()
            .id(respondingMovie.getId())
            .name(respondingMovie.getName())
            .description(respondingMovie.getDescription())
            .trailer(respondingMovie.getTrailer())
            .releaseDate(new Date(respondingMovie.getReleaseDate()))
            .poster(respondingMovie.getPoster())
            .backdrop(respondingMovie.getBackdrop())
            .status(respondingMovie.getStatus())
            .genres(respondingMovie.getGenreList().stream().map(genre -> com.microservice.bff.request.Genre.builder().id(genre.getId()).name(genre.getName()).build()).toList())
            .build();

    /// 2. Thực hiện lấy thông tin suất chiếu.
    GetMovieShowtimesResponse showtimesResponse = bookingServiceGrpcClient.getMovieShowtimes(GetMovieShowtimesRequest.newBuilder().setMovieId(movieId).build());

    List<Showtime> showtimes = showtimesResponse.getShowtimesList().stream().map(showtime -> Showtime.builder()
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

    return ResponseData.builder().status(HttpStatus.OK.value()).message("Success").data(Map.of("movie", movie, "showtimes", showtimes)).build();
  }
}