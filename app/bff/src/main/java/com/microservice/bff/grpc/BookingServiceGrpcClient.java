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
    return  bookingServiceBlockingStub.searchCinemas(request);
  }

  public UpdateCinemaResponse updateCinema(UpdateCinemaRequest request) {
    return bookingServiceBlockingStub.updateCinema(request);
  }
}
