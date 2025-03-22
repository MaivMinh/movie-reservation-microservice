package com.microservice.bff.grpc;

import com.microservice.booking_proto.*;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class BookingServiceGrpcClient {
  @GrpcClient("bookingService")
  private BookingServiceGrpc.BookingServiceBlockingStub bookingServiceBlockingStub;


  public CreateCinemaResponse createCinema(CreateCinemaRequest request) {
    return bookingServiceBlockingStub.createCinema(request);
  }

  public GetCinemasResponse getCinemas(GetCinemasRequest request) {
    return bookingServiceBlockingStub.getCinemas(request);
  }

  public GetCinemaResponse getCinema(GetCinemaRequest request) {
    return bookingServiceBlockingStub.getCinema(request);
  }

  public SearchCinemasResponse searchCinemas(SearchCinemasRequest request) {
    return bookingServiceBlockingStub.searchCinemas(request);
  }

  public UpdateCinemaResponse updateCinema(UpdateCinemaRequest request) {
    return bookingServiceBlockingStub.updateCinema(request);
  }

  public CreateShowtimeResponse createShowtime(CreateShowtimeRequest request) {
    return bookingServiceBlockingStub.createShowtime(request);
  }

  public GetShowtimesResponse getShowtimes(GetShowtimesRequest request) {
    return bookingServiceBlockingStub.getShowtimes(request);
  }

  public UpdateShowtimeResponse updateShowtime(UpdateShowtimeRequest request) {
    return bookingServiceBlockingStub.updateShowtime(request);
  }

  public GetShowtimeResponse getShowtime(GetShowtimeRequest request) {
    return bookingServiceBlockingStub.getShowtime(request);
  }

  public DeleteShowtimeResponse deleteShowtime(DeleteShowtimeRequest request) {
    return bookingServiceBlockingStub.deleteShowtime(request);
  }

  public SearchShowtimesResponse searchShowtimes(SearchShowtimesRequest request) {
    return bookingServiceBlockingStub.searchShowtimes(request);
  }

  public GetMovieShowtimesResponse getMovieShowtimes(GetMovieShowtimesRequest request) {
    return bookingServiceBlockingStub.getMovieShowtimes(request);
  }


  public GetBookingByShowtimeResponse getBookingByShowtime(GetBookingByShowtimeRequest request) {
    return bookingServiceBlockingStub.getBookingByShowtime(request);
  }

  public HandlePreSeatReservationResponse handlePreSeatReservation(HandlePreSeatReservationRequest request) {
    return bookingServiceBlockingStub.handlePreSeatReservation(request);
  }

  public HandleDeclareQueueResponse handleDeclareQueue(HandleDeclareQueueRequest build) {
    return bookingServiceBlockingStub.handleDeclareQueue(build);
  }

  public HandleRemoveQueueResponse handleRemoveQueue(HandleRemoveQueueRequest build) {
    return bookingServiceBlockingStub.handleRemoveQueue(build);
  }
}
