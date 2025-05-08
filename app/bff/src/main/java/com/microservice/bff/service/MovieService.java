package com.microservice.bff.service;

import com.google.protobuf.Int64Value;
import com.google.protobuf.StringValue;
import com.microservice.bff.exceptions.ResourceNotFoundException;
import com.microservice.bff.grpc.BookingServiceGrpcClient;
import com.microservice.bff.grpc.MovieServiceGrpcClient;
import com.microservice.bff.request.Movie;
import com.microservice.bff.response.ResponseData;
import com.microservice.booking_proto.GetMovieShowtimesRequest;
import com.microservice.booking_proto.GetMovieShowtimesResponse;
import com.microservice.movie_proto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class MovieService {
  private final MovieServiceGrpcClient movieServiceGrpcClient;

  public ResponseData createMovie(com.microservice.bff.request.NewMovie movie) {
    NewMovie newMovie = NewMovie.newBuilder().setName(movie.getName()).setBackdrop(movie.getBackdrop()).setPoster(movie.getPoster()).setDescription(movie.getDescription()).setTrailer(movie.getTrailer()).setReleaseDate(movie.getReleaseDate().getTime()).addAllGenre(Arrays.stream(movie.getGenres()).toList()).build();

    CreateMovieRequest request = CreateMovieRequest.newBuilder().setMovie(newMovie).build();
    CreateMovieResponse response = movieServiceGrpcClient.createMovie(request);


    return ResponseData.builder().status(response.getStatus()).message(response.getMessage()).build();
  }

  public ResponseData getMovies(int page, int size, String sort) {
    GetMoviesRequest request = GetMoviesRequest.newBuilder().setPage(page).setSize(size).setSort(sort).build();

    try {
      GetMoviesResponse response = movieServiceGrpcClient.getMovies(request);
      List<Movie> movies = response.getMoviesList().stream().map(movie -> Movie.builder().id(movie.getId()).name(movie.getName()).description(movie.getDescription()).trailer(movie.getTrailer()).releaseDate(new Date(movie.getReleaseDate())).poster(movie.getPoster()).backdrop(movie.getBackdrop()).status(movie.getStatus()).genres(movie.getGenreList().stream().map(genre -> com.microservice.bff.request.Genre.builder().id(genre.getId()).name(genre.getName()).build()).toList()).build()).toList();

      if (movies.isEmpty()) {
        return ResponseData.builder().status(response.getStatus()).message(response.getMessage()).build();
      }

      return ResponseData.builder().status(response.getStatus()).message(response.getMessage()).data(Map.of("movies", movies, "totalPages", response.getTotalElement(), "totalElements", response.getTotalPage(), "page", page + 1, "size", size)).build();
    } catch (Exception e) {
      throw new RuntimeException("Error fetching movies", e);
    }
  }

  public ResponseData getMovie(int id) {
    GetMovieRequest request = GetMovieRequest.newBuilder().setId(id).build();
    GetMovieResponse response = movieServiceGrpcClient.getMovie(request);
    if (!response.hasMovie()) {
      throw new ResourceNotFoundException(response.getMessage());
    }
    com.microservice.movie_proto.Movie movieResponse = response.getMovie();
    Movie movie = Movie.builder().id(movieResponse.getId()).name(movieResponse.getName()).description(movieResponse.getDescription()).trailer(movieResponse.getTrailer()).releaseDate(new Date(movieResponse.getReleaseDate())).poster(movieResponse.getPoster()).backdrop(movieResponse.getBackdrop()).status(movieResponse.getStatus()).genres(movieResponse.getGenreList().stream().map(genre -> com.microservice.bff.request.Genre.builder().id(genre.getId()).name(genre.getName()).build()).toList()).build();

    return ResponseData.builder().status(response.getStatus()).message(response.getMessage()).data(movie).build();
  }

  public ResponseData searchMovies(Map<String, String> criteria, Integer page, Integer size, String sort) {
    SearchMoviesRequest request = SearchMoviesRequest.newBuilder().putAllCriteria(criteria).setPage(page).setSize(size).setSort(sort).build();

    SearchMoviesResponse response = movieServiceGrpcClient.searchMovies(request);
    List<Movie> movies = response.getMoviesList().stream().map(movie -> Movie.builder().id(movie.getId()).name(movie.getName()).description(movie.getDescription()).trailer(movie.getTrailer()).releaseDate(new Date(movie.getReleaseDate())).poster(movie.getPoster()).backdrop(movie.getBackdrop()).status(movie.getStatus()).genres(movie.getGenreList().stream().map(genre -> com.microservice.bff.request.Genre.builder().id(genre.getId()).name(genre.getName()).build()).toList()).build()).toList();

    return ResponseData.builder().status(response.getStatus()).message(response.getMessage()).data(Map.of("movies", movies, "totalPages", response.getTotalElement(), "totalElements", response.getTotalPage(), "page", page + 1, "size", size)).build();
  }

  public ResponseData updateMovie(int movieId, com.microservice.bff.request.UpdateMovie updateMovie) {

    UpdateMovie.Builder builder = UpdateMovie.newBuilder();
    builder.setId(movieId);
    if (StringUtils.hasText(updateMovie.getName())) {
      builder.setName(StringValue.of(updateMovie.getName()));
    }
    if (StringUtils.hasText(updateMovie.getDescription())) {
      builder.setDescription(StringValue.of(updateMovie.getDescription()));
    }
    if (StringUtils.hasText(updateMovie.getTrailer())) {
      builder.setTrailer(StringValue.of(updateMovie.getTrailer()));
    }
    if (updateMovie.getReleaseDate() != null) {
      builder.setReleaseDate(Int64Value.of(updateMovie.getReleaseDate().getTime()));
    }
    if (StringUtils.hasText(updateMovie.getPoster())) {
      builder.setPoster(StringValue.of(updateMovie.getPoster()));
    }
    if (StringUtils.hasText(updateMovie.getBackdrop())) {
      builder.setBackdrop(StringValue.of(updateMovie.getBackdrop()));
    }

    if (StringUtils.hasText(updateMovie.getStatus())) {
      builder.setStatus(StringValue.of(updateMovie.getStatus()));
    }

    UpdateMovieRequest request = UpdateMovieRequest.newBuilder().setMovie(builder.build()).build();
    UpdateMovieResponse response = movieServiceGrpcClient.updateMovie(request);
    return ResponseData.builder()
            .status(response.getStatus())
            .message(response.getMessage())
            .build();
  }


  public ResponseData getNowPlayingMovies(int page, int size, String sort) {
    GetNowPlayingMoviesRequest request = GetNowPlayingMoviesRequest.newBuilder().setPage(page).setSize(size).setSort(sort).build();
    GetNowPlayingMoviesResponse response = movieServiceGrpcClient.getNowPlayingMovies(request);
    List<Movie> movies = response
            .getMoviesList().stream().map(movie -> Movie.builder()
                    .id(movie.getId()).name(movie.getName())
                    .description(movie.getDescription())
                    .trailer(movie.getTrailer())
                    .releaseDate(new Date(movie.getReleaseDate()))
                    .poster(movie.getPoster())
                    .backdrop(movie.getBackdrop())
                    .status(movie.getStatus())
                    .genres(movie.getGenreList().stream().map(genre -> com.microservice.bff.request.Genre.builder().id(genre.getId()).name(genre.getName()).build()).toList())
                    .build())
            .toList();

    if (movies.isEmpty()) {
      return ResponseData.builder().status(response.getStatus()).message(response.getMessage()).build();
    }

    return ResponseData.builder()
            .status(response.getStatus())
            .message(response.getMessage())
            .data(Map.of("movies", movies,
                    "totalPages", response.getTotalElement(),
                    "totalElements", response.getTotalPage(),
                    "page", page + 1,
                    "size", size))
            .build();
  }
}
