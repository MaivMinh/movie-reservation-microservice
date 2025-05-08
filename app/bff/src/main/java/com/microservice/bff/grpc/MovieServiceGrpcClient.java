package com.microservice.bff.grpc;

import com.microservice.movie_proto.*;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import io.github.resilience4j.timelimiter.TimeLimiter;
import io.github.resilience4j.timelimiter.TimeLimiterConfig;
import io.github.resilience4j.timelimiter.TimeLimiterRegistry;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.time.Duration;
import java.util.concurrent.CompletableFuture;

@Slf4j
@RequiredArgsConstructor
@Service
public class MovieServiceGrpcClient {
  @GrpcClient("movieService")
  private MovieServiceGrpc.MovieServiceBlockingStub movieServiceBlockingStub;

  private final TimeLimiterRegistry timeLimiterRegistry;

  private CreateMovieResponse fallbackCreateMovie(CreateMovieRequest request, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in movie service"
            : "Movie service is currently unavailable. Please try again later.";
    return CreateMovieResponse.newBuilder()
            .setStatus(HttpStatus.SERVICE_UNAVAILABLE.value())
            .setMessage(message)
            .build();
  }

  @CircuitBreaker(name = "movieService", fallbackMethod = "fallbackCreateMovie")
  public CreateMovieResponse createMovie(CreateMovieRequest request) {
    return movieServiceBlockingStub.createMovie(request);
  }

  private GetMoviesResponse fallbackGetMovies(GetMoviesRequest request, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in movie service"
            : "Movie service is currently unavailable. Please try again later.";
    return GetMoviesResponse.newBuilder()
            .setStatus(HttpStatus.SERVICE_UNAVAILABLE.value())
            .setMessage(message)
            .build();
  }

  @io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker(name = "movieService", fallbackMethod = "fallbackGetMovies")
  public GetMoviesResponse getMovies(GetMoviesRequest request) throws Exception {
    /**
     * Khi chúng ta sử dụng thêm TimeLimter thì chúng ta sẽ sinh ra 2 log ở Circuit Breaker.
     * Log thứ nhất sẽ của TimeLimiter. Log này sẽ được sinh ra mặc định bởi vì chúng ta áp dụng TimeLimter pattern cho MovieService.
     * Và trạng thái của log này sẽ phụ thuộc vào thời gian mà chúng ta set (timeout-duration), nếu trong đoạn timeout-duration mà chúng ta không nhận được response từ MovieService thì log này sẽ có trạng thái là TIMEOUT. Hay nói cách khác là EROR.
     * Log thứ hai sẽ là log của Circuit Breaker. Log này sinh ra do ta áp dụng Circuit Breaker pattern cho MovieService.
     * Trạng thái của Log này tùy thuộc vào chúng ta có nhận được response hay không(dù success hay thất bài). Nếu nhận được Response thì log này sẽ có trạng thái là SUCCESS. Còn nếu là Exception thì log này sẽ có trạng thái là ERROR.
     * Vì vậy, chúng ta sẽ có 2 Log khác nhau cho 1 request.
     */
    TimeLimiter timeLimiter = timeLimiterRegistry.timeLimiter("movieService");
    return timeLimiter.executeFutureSupplier(
            () -> CompletableFuture.supplyAsync(() -> movieServiceBlockingStub.getMovies(request)));
  }

  private GetMovieResponse fallbackGetMovie(GetMovieRequest request, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in movie service"
            : "Movie service is currently unavailable. Please try again later.";
    return GetMovieResponse.newBuilder()
            .setStatus(HttpStatus.SERVICE_UNAVAILABLE.value())
            .setMessage(message)
            .build();
  }

  @CircuitBreaker(name = "mvoieService", fallbackMethod = "fallbackGetMovie")
  public GetMovieResponse getMovie(GetMovieRequest request) {
    return movieServiceBlockingStub.getMovie(request);
  }

  private SearchMoviesResponse fallbackSearchMovies(SearchMoviesRequest request, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in movie service"
            : "Movie service is currently unavailable. Please try again later.";
    return SearchMoviesResponse.newBuilder()
            .setStatus(HttpStatus.SERVICE_UNAVAILABLE.value())
            .setMessage(message)
            .build();
  }

  @CircuitBreaker(name = "movieService", fallbackMethod = "fallbackSearchMovies")
  public SearchMoviesResponse searchMovies(SearchMoviesRequest request) {
    return movieServiceBlockingStub.searchMovies(request);
  }

  private UpdateMovieResponse fallbackUpdateMovie(UpdateMovieRequest request, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in movie service"
            : "Movie service is currently unavailable. Please try again later.";
    return UpdateMovieResponse.newBuilder()
            .setStatus(HttpStatus.SERVICE_UNAVAILABLE.value())
            .setMessage(message)
            .build();
  }

  @CircuitBreaker(name = "movieService", fallbackMethod = "fallbackUpdateMovie")
  public UpdateMovieResponse updateMovie(UpdateMovieRequest request) {
    return movieServiceBlockingStub.updateMovie(request);
  }

  private GetNowPlayingMoviesResponse fallbackGetNowPlayingMovies(GetNowPlayingMoviesRequest request, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in movie service"
            : "Movie service is currently unavailable. Please try again later.";
    return GetNowPlayingMoviesResponse.newBuilder()
            .setStatus(HttpStatus.SERVICE_UNAVAILABLE.value())
            .setMessage(message)
            .build();
  }

  @CircuitBreaker(name = "movieService", fallbackMethod = "fallbackGetNowPlayingMovies")
  public GetNowPlayingMoviesResponse getNowPlayingMovies(GetNowPlayingMoviesRequest request) {
    return movieServiceBlockingStub.getNowPlayingMovies(request);
  }
}
