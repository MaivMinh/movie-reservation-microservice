package com.microservice.authservice.services;

import com.microservice.authservice.model.Role;
import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.stub.StreamObserver;
import io.jsonwebtoken.Claims;
import lombok.AllArgsConstructor;
import net.devh.boot.grpc.examples.lib.*;
import net.devh.boot.grpc.server.security.authentication.GrpcAuthenticationReader;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;

import javax.annotation.Nullable;
import java.util.Date;

@GrpcService
@Service
@AllArgsConstructor
public class AuthServiceGrpcServer extends AuthServiceGrpc.AuthServiceImplBase {
  private final JwtUtilsService jwtUtilsService;
  private final AccountService accountService;

  @Bean
  public GrpcAuthenticationReader grpcAuthenticationReader() {
    return new GrpcAuthenticationReader() {
      @Nullable
      @Override
      public Authentication readAuthentication(ServerCall<?, ?> call, Metadata headers) throws AuthenticationException {
        return null;
      }
    };
  }

  @Override
  public void doAuthenticate(AuthenticateRequest request, StreamObserver<AuthenticateResponse> streamObserver) {
    String token = request.getToken();
    try {
      Claims claims = jwtUtilsService.verifyToken(token);
      long ttl = Long.parseLong(claims.get("exp").toString()) - new Date().getTime() / 1000;
      streamObserver.onNext(AuthenticateResponse.newBuilder().setIsValid(true).setUserId(claims.get("user_id").toString()).setTtl(ttl).build());
      System.out.println("Response to gRPC Client: " + claims.get("user_id"));
    } catch (RuntimeException e) {
      streamObserver.onNext(AuthenticateResponse.newBuilder().setIsValid(false).setUserId("").setTtl(0).build());
    }
    streamObserver.onCompleted();
  }

  @Override
  public void doIdentity(IdentityRequest request, StreamObserver<IdentityResponse> streamObserver) {
    String userId = request.getUserId();
    Role role = accountService.doIntrospect(userId);
    if (role == null) {
      streamObserver.onNext(IdentityResponse.newBuilder().setActive(false).setRoles("").build());
    } else {
      streamObserver.onNext(IdentityResponse.newBuilder().setActive(true).setRoles(role.getName().toString()).build());
    }
    streamObserver.onCompleted();
  }
}
