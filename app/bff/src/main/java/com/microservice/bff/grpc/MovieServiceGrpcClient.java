package com.microservice.bff.grpc;

import com.microservice.booking_proto.GetMovieShowtimesRequest;
import com.microservice.booking_proto.GetMovieShowtimesResponse;
import com.microservice.movie_proto.*;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MovieServiceGrpcClient {
  @GrpcClient("movieService")
  private MovieServiceGrpc.MovieServiceBlockingStub movieServiceBlockingStub;


  public CreateMovieResponse createMovie(CreateMovieRequest request) {
    return movieServiceBlockingStub.createMovie(request);
  }

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
}
