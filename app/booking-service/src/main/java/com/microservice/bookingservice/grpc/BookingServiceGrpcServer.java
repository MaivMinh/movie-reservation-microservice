package com.microservice.bookingservice.grpc;

import com.microservice.booking_proto.*;
import com.microservice.bookingservice.service.BookingService;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
@RequiredArgsConstructor
public class BookingServiceGrpcServer extends BookingServiceGrpc.BookingServiceImplBase {
  private final BookingService bookingService;

  @Override
  public void createCinema(CreateCinemaRequest request, StreamObserver<CreateCinemaResponse> responseObserver) {
    CreateCinemaResponse response = bookingService.createCinema(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void getCinemas(GetCinemasRequest request, StreamObserver<GetCinemasResponse> responseObserver) {
    GetCinemasResponse response = bookingService.getCinemas(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void getCinema(GetCinemaRequest request, StreamObserver<GetCinemaResponse> responseObserver) {
    GetCinemaResponse response = bookingService.getCinema(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void searchCinemas(SearchCinemasRequest request, StreamObserver<SearchCinemasResponse> responseObserver) {
    SearchCinemasResponse response = bookingService.searchCinemas(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void updateCinema(UpdateCinemaRequest request, StreamObserver<UpdateCinemaResponse> responseObserver) {
    UpdateCinemaResponse response = bookingService.updateCinema(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }
}
