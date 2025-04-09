package com.microservice.apigateway.filters;

import com.microservice.apigateway.services.AuthService;
import com.microservice.apigateway.services.RedisService;
import com.microservice.auth_proto.AuthenticateResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.Objects;

@Slf4j
@Component
public class AuthenticationFilter implements GlobalFilter, Ordered {
  private final AuthService authenticationService;
  private final RedisService redisService;

  public AuthenticationFilter(AuthService authenticationService, RedisService redisService) {
    this.authenticationService = authenticationService;
    this.redisService = redisService;
  }

  @Override
  public int getOrder() {
    return -1;
  }

  @Override
  public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
    if (exchange.getRequest().getURI().getPath().startsWith("/api/auth") || exchange.getRequest().getURI().getPath().startsWith("/api-docs/") || exchange.getRequest().getURI().getPath().startsWith("/v3/api-docs")) {
      return chain.filter(exchange);
    }

    String authorization = exchange.getRequest().getHeaders().getFirst("Authorization");
    if (authorization != null) {
      String token = authorization.substring(7);
      // Tìm token trong Redis. {token} -> {account_id}
      String value = null;
      try {
        value = redisService.get(token);
      } catch (Exception e) {
        throw new RuntimeException(e);
      }
      if (value != null && !value.isEmpty()) {
        ServerHttpRequest request = exchange.getRequest()
                .mutate()
                .header("X-ACCOUNT-ID", value)
                .build();
        ServerWebExchange updated = exchange.mutate().request(request).build();
        return chain.filter(updated);
      } else {
        /// Nếu không có token trong Redis thì có nghĩa hoặc là token không hợp lệ, hoặc là token hết hạn.
        exchange.getResponse().setRawStatusCode(498);
        return exchange.getResponse().setComplete();
      }
    }
    return chain.filter(exchange);
  }
}
