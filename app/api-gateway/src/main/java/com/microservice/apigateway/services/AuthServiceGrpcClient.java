package com.microservice.apigateway.services;

import com.microservice.auth_proto.*;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AuthServiceGrpcClient extends AuthServiceGrpc.AuthServiceImplBase {
  @GrpcClient("authService")
  private AuthServiceGrpc.AuthServiceStub authServiceStub;


  public void doAuthenticate(AuthenticateRequest request, StreamObserver<AuthenticateResponse> responseObserver) {
    authServiceStub.doAuthenticate(request, responseObserver);
  }
}