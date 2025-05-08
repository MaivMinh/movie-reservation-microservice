package com.microservice.bff.config;

import com.microservice.bff.interceptor.CircuitBreakerClientInterceptor;
import io.github.resilience4j.circuitbreaker.CircuitBreakerRegistry;
import net.devh.boot.grpc.client.interceptor.GrpcGlobalClientInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GrpcInterceptorConfig {
  @Bean
  @GrpcGlobalClientInterceptor
  public CircuitBreakerClientInterceptor cbInterceptor(CircuitBreakerRegistry registry) {
    return new CircuitBreakerClientInterceptor(
            registry.circuitBreaker("movieService"));
  }
}
