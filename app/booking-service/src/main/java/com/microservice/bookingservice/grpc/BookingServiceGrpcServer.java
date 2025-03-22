package com.microservice.bookingservice.grpc;

import com.microservice.booking_proto.*;
import com.microservice.bookingservice.service.BookingService;
import com.microservice.bookingservice.service.ShowtimeService;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
@RequiredArgsConstructor
public class BookingServiceGrpcServer extends BookingServiceGrpc.BookingServiceImplBase {
  private final BookingService bookingService;
  private final ShowtimeService showtimeService;

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

  @Override
  public void createShowtime(CreateShowtimeRequest request, StreamObserver<CreateShowtimeResponse> responseObserver) {
    CreateShowtimeResponse response = showtimeService.createShowtime(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void getShowtimes(GetShowtimesRequest request, StreamObserver<GetShowtimesResponse> responseObserver) {
    GetShowtimesResponse response = showtimeService.getShowtimes(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void updateShowtime(UpdateShowtimeRequest request, StreamObserver<UpdateShowtimeResponse> responseObserver) {
    UpdateShowtimeResponse response = showtimeService.updateShowtime(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void getShowtime(GetShowtimeRequest request, StreamObserver<GetShowtimeResponse> responseObserver) {
    GetShowtimeResponse response = showtimeService.getShowtime(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void deleteShowtime(DeleteShowtimeRequest request, StreamObserver<DeleteShowtimeResponse> responseObserver) {
    DeleteShowtimeResponse response = showtimeService.deleteShowtime(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void searchShowtimes(SearchShowtimesRequest request, StreamObserver<SearchShowtimesResponse> responseObserver) {
    SearchShowtimesResponse response = showtimeService.searchShowtimes(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void getMovieShowtimes(GetMovieShowtimesRequest request, StreamObserver<GetMovieShowtimesResponse> responseObserver) {
    GetMovieShowtimesResponse response = showtimeService.getMovieShowtimes(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void getBookingByShowtime(GetBookingByShowtimeRequest request, StreamObserver<GetBookingByShowtimeResponse> responseObserver) {
    GetBookingByShowtimeResponse response = bookingService.getBookingByShowtime(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void handlePreSeatReservation(HandlePreSeatReservationRequest request, StreamObserver<HandlePreSeatReservationResponse> responseObserver) {
    HandlePreSeatReservationResponse response = bookingService.handlePreSeatReservation(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void handleDeclareQueue(HandleDeclareQueueRequest request, StreamObserver<HandleDeclareQueueResponse> responseObserver) {
    HandleDeclareQueueResponse response = bookingService.handleDeclareQueue(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void handleRemoveQueue(HandleRemoveQueueRequest request, StreamObserver<HandleRemoveQueueResponse> responseObserver) {
    HandleRemoveQueueResponse response = bookingService.handleRemoveQueue(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }
}
