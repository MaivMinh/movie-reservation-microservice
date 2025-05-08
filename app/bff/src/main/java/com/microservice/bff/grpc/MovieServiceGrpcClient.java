package com.microservice.bff.grpc;

import com.microservice.movie_proto.*;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class MovieServiceGrpcClient {
  @GrpcClient("movieService")
  private MovieServiceGrpc.MovieServiceBlockingStub movieServiceBlockingStub;


  public CreateMovieResponse createMovie(CreateMovieRequest request) {
    return movieServiceBlockingStub.createMovie(request);
  }

  private GetMoviesResponse fallbackGetMovies(GetMoviesRequest request, Throwable throwable) {
    log.error("Fallback triggered for getMovies: {}", throwable.getMessage(), throwable);
    System.out.println("Fallback triggered for getMovies: " + throwable.getMessage());
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in movie service"
            : "Movie service is currently unavailable. Please try again later.";
    return GetMoviesResponse.newBuilder()
            .setStatus(HttpStatus.SERVICE_UNAVAILABLE.value())
            .setMessage(message)
            .build();
  }

  @io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker(name = "movieService", fallbackMethod = "fallbackGetMovies")
  public GetMoviesResponse getMovies(GetMoviesRequest request) {
    return movieServiceBlockingStub.getMovies(request);
  }

  public GetMovieResponse getMovie(GetMovieRequest request) {
    return movieServiceBlockingStub.getMovie(request);
  }

  public SearchMoviesResponse searchMovies(SearchMoviesRequest request) {
    return movieServiceBlockingStub.searchMovies(request);
  }

  public UpdateMovieResponse updateMovie(UpdateMovieRequest request) {
    return movieServiceBlockingStub.updateMovie(request);
  }

  public GetNowPlayingMoviesResponse getNowPlayingMovies(GetNowPlayingMoviesRequest request) {
    return movieServiceBlockingStub.getNowPlayingMovies(request);
  }
}
