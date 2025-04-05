package com.microservice.authservice.grpc;

import com.microservice.auth_proto.*;
import com.microservice.authservice.services.AuthService;
import io.grpc.Metadata;
import io.grpc.ServerCall;
import io.grpc.stub.StreamObserver;
import lombok.AllArgsConstructor;
import net.devh.boot.grpc.server.security.authentication.GrpcAuthenticationReader;
import net.devh.boot.grpc.server.service.GrpcService;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Service;

import javax.annotation.Nullable;

@GrpcService
@Service
@AllArgsConstructor
public class AuthServiceGrpcServer extends AuthServiceGrpc.AuthServiceImplBase {
  private final AuthService authService;

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
    System.out.println("doAuthenticate AuthService");
    AuthenticateResponse response = authService.doAuthenticate(request);
    streamObserver.onNext(response);
    streamObserver.onCompleted();
  }

  @Override
  public void doIdentity(IdentityRequest request, StreamObserver<IdentityResponse> streamObserver) {
    IdentityResponse response = authService.doIdentity(request);
    streamObserver.onNext(response);
    streamObserver.onCompleted();
  }

  @Override
  public void postRegister(RegisterRequest request, StreamObserver<RegisterResponse> responseObserver) {
    RegisterResponse response = authService.register(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void postLogin(LoginRequest request, StreamObserver<LoginResponse> responseObserver) {
    LoginResponse response = authService.login(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void postLogout(LogoutRequest request, StreamObserver<LogoutResponse> responseObserver) {
    LogoutResponse response = authService.logout(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void getProfile(ProfileRequest request, StreamObserver<ProfileResponse> responseObserver) {
    ProfileResponse response = authService.profile(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void isAdmin(IsAdminRequest request, StreamObserver<IsAdminResponse> responseObserver) {
    IsAdminResponse response = authService.isAdmin(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void forgotPassword(ForgotPasswordRequest request, StreamObserver<ForgotPasswordResponse> responseObserver) {
    ForgotPasswordResponse response = authService.forgotPassword(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void resetPassword(ResetPasswordRequest request, StreamObserver<ResetPasswordResponse> responseObserver) {
    ResetPasswordResponse response = authService.resetPassword(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void verifyEmail(VerifyEmailRequest request, StreamObserver<VerifyEmailResponse> responseObserver) {
    VerifyEmailResponse response = authService.verifyEmail(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }
}
