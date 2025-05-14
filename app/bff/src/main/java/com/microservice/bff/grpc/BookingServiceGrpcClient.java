package com.microservice.bff.grpc;

import com.microservice.booking_proto.*;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.timelimiter.TimeLimiter;
import io.github.resilience4j.timelimiter.TimeLimiterRegistry;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@RequiredArgsConstructor
@Service
public class BookingServiceGrpcClient {
  @GrpcClient("bookingService")
  private BookingServiceGrpc.BookingServiceBlockingStub bookingServiceBlockingStub;
  private final TimeLimiterRegistry timeLimiterRegistry;

  private CreateCinemaResponse fallbackCreateCinema(CreateCinemaRequest request, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in booking service"
            : "Booking service is currently unavailable. Please try again later.";
    return CreateCinemaResponse.newBuilder()
            .setStatus(500)
            .setMessage(message)
            .build();
  }
  @CircuitBreaker(name = "bookingService", fallbackMethod = "fallbackCreateCinema")
  public CreateCinemaResponse createCinema(CreateCinemaRequest request) throws Exception {
    TimeLimiter timeLimiter = timeLimiterRegistry.timeLimiter("bookingService");
    return timeLimiter.executeFutureSupplier(
            () -> CompletableFuture.supplyAsync(() -> bookingServiceBlockingStub.createCinema(request)));
  }

  private GetCinemasResponse fallbackGetCinemas(GetCinemasRequest request, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in booking service"
            : "Booking service is currently unavailable. Please try again later.";
    return GetCinemasResponse.newBuilder()
            .setStatus(500)
            .setMessage(message)
            .setTotalElement(0)
            .setTotalPage(0)
            .addAllCinemas(List.of())
            .build();
  }
  @CircuitBreaker(name = "bookingService", fallbackMethod = "fallbackGetCinemas")
  public GetCinemasResponse getCinemas(GetCinemasRequest request) throws Exception {
    TimeLimiter timeLimiter = timeLimiterRegistry.timeLimiter("bookingService");
    return timeLimiter.executeFutureSupplier(
            () -> CompletableFuture.supplyAsync(() -> bookingServiceBlockingStub.getCinemas(request)));
  }

  private GetCinemaResponse fallbackGetCinema(GetCinemaRequest request, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in booking service"
            : "Booking service is currently unavailable. Please try again later.";
    return GetCinemaResponse.newBuilder()
            .setStatus(500)
            .setMessage(message)
            .build();
  }
  @CircuitBreaker(name = "bookingService", fallbackMethod = "fallbackGetCinema")
  public GetCinemaResponse getCinema(GetCinemaRequest request) throws Exception {
    TimeLimiter timeLimiter = timeLimiterRegistry.timeLimiter("bookingService");
    return timeLimiter.executeFutureSupplier(
            () -> CompletableFuture.supplyAsync(() -> bookingServiceBlockingStub.getCinema(request)));
  }

  public SearchCinemasResponse searchCinemas(SearchCinemasRequest request) {
    return bookingServiceBlockingStub.searchCinemas(request);
  }

  private UpdateCinemaResponse fallbackUpdateCinema(UpdateCinemaRequest request, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in booking service"
            : "Booking service is currently unavailable. Please try again later.";
    return UpdateCinemaResponse.newBuilder()
            .setStatus(500)
            .setMessage(message)
            .build();
  }
  @CircuitBreaker(name = "bookingService", fallbackMethod = "fallbackUpdateCinema")
  public UpdateCinemaResponse updateCinema(UpdateCinemaRequest request) {
    return bookingServiceBlockingStub.updateCinema(request);
  }

  private CreateShowtimeResponse fallbackCreateShowtime(CreateShowtimeRequest request, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in booking service"
            : "Booking service is currently unavailable. Please try again later.";
    return CreateShowtimeResponse.newBuilder()
            .setStatus(500)
            .setMessage(message)
            .build();
  }
  @CircuitBreaker(name = "bookingService", fallbackMethod = "fallbackCreateShowtime")
  public CreateShowtimeResponse createShowtime(CreateShowtimeRequest request) {
    return bookingServiceBlockingStub.createShowtime(request);
  }

  private GetShowtimesResponse fallbackGetShowtimes(GetShowtimesRequest request, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in booking service"
            : "Booking service is currently unavailable. Please try again later.";
    return GetShowtimesResponse.newBuilder()
            .setStatus(500)
            .setMessage(message)
            .addAllShowtimes(List.of())
            .setTotalPage(0)
            .setTotalElement(0)
            .build();
  }
  @CircuitBreaker(name = "bookingService", fallbackMethod = "fallbackGetShowtimes")
  public GetShowtimesResponse getShowtimes(GetShowtimesRequest request) {
    return bookingServiceBlockingStub.getShowtimes(request);
  }

  private UpdateShowtimeResponse fallbackUpdateShowtime(UpdateShowtimeRequest request, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in booking service"
            : "Booking service is currently unavailable. Please try again later.";
    return UpdateShowtimeResponse.newBuilder()
            .setStatus(500)
            .setMessage(message)
            .build();
  }
  @CircuitBreaker(name = "bookingService", fallbackMethod = "fallbackUpdateShowtime")
  public UpdateShowtimeResponse updateShowtime(UpdateShowtimeRequest request) {
    return bookingServiceBlockingStub.updateShowtime(request);
  }


  private GetShowtimeResponse fallbackGetShowtime(GetShowtimeRequest request, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in booking service"
            : "Booking service is currently unavailable. Please try again later.";
    return GetShowtimeResponse.newBuilder()
            .setStatus(500)
            .setMessage(message)
            .build();
  }
  @CircuitBreaker(name = "bookingService", fallbackMethod = "fallbackGetShowtime")
  public GetShowtimeResponse getShowtime(GetShowtimeRequest request) {
    return bookingServiceBlockingStub.getShowtime(request);
  }


  private DeleteShowtimeResponse fallbackDeleteShowtime(DeleteShowtimeRequest request, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in booking service"
            : "Booking service is currently unavailable. Please try again later.";
    return DeleteShowtimeResponse.newBuilder()
            .setStatus(500)
            .setMessage(message)
            .build();
  }
  @CircuitBreaker(name = "bookingService", fallbackMethod = "fallbackDeleteShowtime")
  public DeleteShowtimeResponse deleteShowtime(DeleteShowtimeRequest request) {
    return bookingServiceBlockingStub.deleteShowtime(request);
  }


  private SearchShowtimesResponse fallbackSearchShowtimes(SearchShowtimesRequest request, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in booking service"
            : "Booking service is currently unavailable. Please try again later.";
    return SearchShowtimesResponse.newBuilder()
            .setStatus(500)
            .setMessage(message)
            .addAllShowtimes(List.of())
            .setTotalPage(0)
            .setTotalElement(0)
            .build();
  }
  public SearchShowtimesResponse searchShowtimes(SearchShowtimesRequest request) {
    return bookingServiceBlockingStub.searchShowtimes(request);
  }


  private GetMovieShowtimesResponse fallbackGetMovieShowtimes(GetMovieShowtimesRequest request, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in booking service"
            : "Booking service is currently unavailable. Please try again later.";
    return GetMovieShowtimesResponse.newBuilder()
            .setStatus(500)
            .setMessage(message)
            .addAllShowtimes(List.of())
            .build();
  }
  public GetMovieShowtimesResponse getMovieShowtimes(GetMovieShowtimesRequest request) {
    return bookingServiceBlockingStub.getMovieShowtimes(request);
  }


  private GetBookingByShowtimeResponse fallbackGetBookingByShowtime(GetBookingByShowtimeRequest request, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in booking service"
            : "Booking service is currently unavailable. Please try again later.";
    return GetBookingByShowtimeResponse.newBuilder()
            .setStatus(500)
            .setMessage(message)
            .build();
  }
  @CircuitBreaker(name = "bookingService", fallbackMethod = "fallbackGetBookingByShowtime")
  public GetBookingByShowtimeResponse getBookingByShowtime(GetBookingByShowtimeRequest request) {
    return bookingServiceBlockingStub.getBookingByShowtime(request);
  }

  private HandlePreSeatReservationResponse fallbackHandlePreSeatReservation(HandlePreSeatReservationRequest request, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in booking service"
            : "Booking service is currently unavailable. Please try again later.";
    return HandlePreSeatReservationResponse.newBuilder()
            .setStatus(500)
            .setMessage(message)
            .build();
  }
  @CircuitBreaker(name = "bookingService", fallbackMethod = "fallbackHandlePreSeatReservation")
  public HandlePreSeatReservationResponse handlePreSeatReservation(HandlePreSeatReservationRequest request) {
    return bookingServiceBlockingStub.handlePreSeatReservation(request);
  }

  private HandleDeclareQueueResponse fallbackHandleDeclareQueue(HandleDeclareQueueRequest request, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in booking service"
            : "Booking service is currently unavailable. Please try again later.";
    return HandleDeclareQueueResponse.newBuilder()
            .setStatus(500)
            .setMessage(message)
            .build();
  }
  @CircuitBreaker(name = "bookingService", fallbackMethod = "fallbackHandleDeclareQueue")
  public HandleDeclareQueueResponse handleDeclareQueue(HandleDeclareQueueRequest build) {
    return bookingServiceBlockingStub.handleDeclareQueue(build);
  }

  private HandleRemoveQueueResponse fallbackHandleRemoveQueue(HandleRemoveQueueRequest request, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in booking service"
            : "Booking service is currently unavailable. Please try again later.";
    return HandleRemoveQueueResponse.newBuilder()
            .setStatus(500)
            .setMessage(message)
            .build();
  }
  @CircuitBreaker(name = "bookingService", fallbackMethod = "fallbackHandleRemoveQueue")
  public HandleRemoveQueueResponse handleRemoveQueue(HandleRemoveQueueRequest build) {
    return bookingServiceBlockingStub.handleRemoveQueue(build);
  }
}