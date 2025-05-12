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

  private GetMoviesResponse fallbackGetMovies(GetMoviesRequest request, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in movie service"
            : "Movie service is currently unavailable. Please try again later.";
    return GetMoviesResponse.newBuilder()
            .setStatus(HttpStatus.SERVICE_UNAVAILABLE.value())
            .setMessage(message)
            .build();
  }
  @CircuitBreaker(name = "movieService", fallbackMethod = "fallbackGetMovies")
  public GetMoviesResponse getMovies(GetMoviesRequest request) throws Exception {
    /**
     Retry ( CircuitBreaker ( RateLimiter ( TimeLimiter ( Bulkhead ( Function ) ) ) ) )
     - Phía trên là thứ tự thực hiện (mặc định) của các decorator.
     - Bulkhead sẽ được thực hiện đầu tiên, sau đó là TimeLimiter, tiếp theo là RateLimiter, và cuối cùng là CircuitBreaker và Retry.
     - Về cơ bản, khi các exception xảy ra trong các decorator, chúng sẽ được ném ra cho các decorator phía trên.
     - Ví dụ: nếu TimeLimiter ném ra một exception, thì RateLimiter sẽ không thực hiện và sẽ ném ra exception đó cho CircuitBreaker.
     - Nếu CircuitBreaker ném ra một exception, thì Retry sẽ không thực hiện và sẽ ném ra exception đó cho người gọi.
     - Nếu Retry ném ra một exception, thì người gọi sẽ nhận được exception đó.
     Ví du: - Hiện tại, chúng ta đang sử dụng CircuitBreaker và TimeLimiter.
     - TimeLimiter sẽ thực hiện đầu tiên, sau đó là CircuitBreaker. Nếu TimeLimiter ném ra một exception, thì CircuitBreaker sẽ xử lý exception này do chúng ta đang có một hàm fallback method là fallbackGetMovies(). Nên do đó, khi timeout xảy ra người dùng sẽ nhận được response mà hàm fallback này trả về.
     - Nhưng nếu trong trường hợp mà TimeLimiter không ném ra exception mà CircuitBreaker ném ra exception(Ví dụ như Database không hoạt động), thì hàm fallbackGetMovies() vẫn sẽ hoạt động và exception này sẽ được tính cho CircuitBreaker.
     - Trong trường hợp cả 2 không ném ra exception thì hàm getMovies() sẽ được thực hiện và trả về kết quả.
     */
    TimeLimiter timeLimiter = timeLimiterRegistry.timeLimiter("movieService");
    return timeLimiter.executeFutureSupplier(
            () -> CompletableFuture.supplyAsync(() -> movieServiceBlockingStub.getMovies(request)));
  }

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

  private GetMovieResponse fallbackGetMovie(GetMovieRequest request, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in movie service"
            : "Movie service is currently unavailable. Please try again later.";
    return GetMovieResponse.newBuilder()
            .setStatus(HttpStatus.SERVICE_UNAVAILABLE.value())
            .setMessage(message)
            .build();
  }
  @CircuitBreaker(name = "movieService", fallbackMethod = "fallbackGetMovie")
  public GetMovieResponse getMovie(GetMovieRequest request) throws Exception {
    TimeLimiter timeLimiter = timeLimiterRegistry.timeLimiter("movieService");
    return timeLimiter.executeFutureSupplier(
            () -> CompletableFuture.supplyAsync(() -> movieServiceBlockingStub.getMovie(request)));
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
  public SearchMoviesResponse searchMovies(SearchMoviesRequest request) throws Exception {
    TimeLimiter timeLimiter = timeLimiterRegistry.timeLimiter("movieService");
    return timeLimiter.executeFutureSupplier(
            () -> CompletableFuture.supplyAsync(() -> movieServiceBlockingStub.searchMovies(request)));
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
  public UpdateMovieResponse updateMovie(UpdateMovieRequest request) throws Exception {
    TimeLimiter timeLimiter = timeLimiterRegistry.timeLimiter("movieService");
    return timeLimiter.executeFutureSupplier(
            () -> CompletableFuture.supplyAsync(() -> movieServiceBlockingStub.updateMovie(request)));
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
  public GetNowPlayingMoviesResponse getNowPlayingMovies(GetNowPlayingMoviesRequest request) throws Exception {
    TimeLimiter timeLimiter = timeLimiterRegistry.timeLimiter("movieService");
    return timeLimiter.executeFutureSupplier(
            () -> CompletableFuture.supplyAsync(() -> movieServiceBlockingStub.getNowPlayingMovies(request)));
  }
}
