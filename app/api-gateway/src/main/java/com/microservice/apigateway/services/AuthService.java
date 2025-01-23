package com.microservice.apigateway.services;

import com.microservice.auth.AuthenticateRequest;
import com.microservice.auth.AuthenticateResponse;
import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.concurrent.ExecutionException;

@Service
@AllArgsConstructor
public class AuthService {
  private final AuthServiceGrpcClient authenticateServiceGrpcClient;

  public AuthenticateResponse doAuthenticate(String token) throws ExecutionException, InterruptedException {
    AuthenticateRequest request = AuthenticateRequest.newBuilder().setToken(token).build();
    return (AuthenticateResponse) Mono.create(sink -> {
      authenticateServiceGrpcClient.doAuthenticate(request, new StreamObserver<>() {
        @Override
        public void onNext(AuthenticateResponse value) {
          sink.success(value);
        }

        @Override
        public void onError(Throwable t) {
          sink.error(t);
        }

        @Override
        public void onCompleted() {
          sink.success();
        }
      });
    }).toFuture().get();
  }
}
