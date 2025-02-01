package com.microservice.movieservice.grpc;

import com.microservice.movie_proto.*;
import com.microservice.movieservice.service.MovieService;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.stereotype.Service;


@Service
@GrpcService
@RequiredArgsConstructor
public class MovieServiceGrpcServer extends MovieServiceGrpc.MovieServiceImplBase {
  private final MovieService movieService;

  @Override
  public void createMovie(CreateMovieRequest request, StreamObserver<CreateMovieResponse> responseObserver) {
    CreateMovieResponse response = movieService.createMovie(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }


  @Override
  public void getMovies(GetMoviesRequest request, StreamObserver<GetMoviesResponse> responseObserver) {
    GetMoviesResponse response = movieService.getMovies(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void getMovie(GetMovieRequest request, StreamObserver<GetMovieResponse> responseObserver) {
    GetMovieResponse response = movieService.getMovie(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void searchMovies(SearchMoviesRequest request, StreamObserver<SearchMoviesResponse> responseObserver) {
    SearchMoviesResponse response = movieService.searchMovies(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void updateMovie(UpdateMovieRequest request, StreamObserver<UpdateMovieResponse> responseObserver) {
    UpdateMovieResponse response = movieService.updateMovie(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void isMoviePlayingNow(IsMoviePlayingNowRequest request, StreamObserver<IsMoviePlayingNowResponse> responseObserver) {
    IsMoviePlayingNowResponse response = movieService.isMoviePlayingNow(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

}