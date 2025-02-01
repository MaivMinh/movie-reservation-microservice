package com.microservice.bookingservice.grpc;

import com.microservice.movie_proto.IsMoviePlayingNowRequest;
import com.microservice.movie_proto.IsMoviePlayingNowResponse;
import com.microservice.movie_proto.MovieServiceGrpc;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MovieServiceGrpcClient {
  @GrpcClient("movieService")
  private MovieServiceGrpc.MovieServiceBlockingStub movieServiceBlockingStub;

  public IsMoviePlayingNowResponse isMoviePlayingNow(IsMoviePlayingNowRequest request) {
    return movieServiceBlockingStub.isMoviePlayingNow(request);
  }
}
