package com.microservice.apigateway.services;

import com.microservice.auth.AuthServiceGrpc;
import com.microservice.auth.AuthenticateRequest;
import com.microservice.auth.AuthenticateResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import java.util.Objects;

@Slf4j
@Service
public class AuthServiceGrpcClient extends AuthServiceGrpc.AuthServiceImplBase {
  private final AuthServiceGrpc.AuthServiceStub authServiceStub;

  public AuthServiceGrpcClient(Environment env) {
    String name = env.getProperty("AUTH_GRPC_SERVER_NAME", "localhost");
    int port = Integer.parseInt(Objects.requireNonNull(env.getProperty("AUTH_GRPC_SERVER_PORT", "9091")));
    ManagedChannel channel = ManagedChannelBuilder.forAddress(name, port).usePlaintext().build();
    this.authServiceStub = AuthServiceGrpc.newStub(channel);
  }

  @Override
  public void doAuthenticate(AuthenticateRequest request, StreamObserver<AuthenticateResponse> responseObserver) {
    authServiceStub.doAuthenticate(request, responseObserver);
  }
}