package com.microservice.bff.grpc;

import com.microservice.auth_proto.*;
import io.github.resilience4j.circuitbreaker.CallNotPermittedException;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AuthServiceGrpcClient {
  @GrpcClient("authService")
  private AuthServiceGrpc.AuthServiceBlockingStub authServiceBlockingStub;

  private RegisterResponse fallbackRegister(RegisterRequest registerRequest, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in auth service"
            : "Auth service is currently unavailable. Please try again later.";
    return RegisterResponse.newBuilder()
            .setStatus(500)
            .setMessage(message)
            .build();
  }
  @CircuitBreaker(name = "authService", fallbackMethod = "fallbackRegister")
  public RegisterResponse register(RegisterRequest registerRequest) {
    return authServiceBlockingStub.postRegister(registerRequest);
  }

  private LoginResponse fallbackLogin(LoginRequest loginRequest, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in auth service"
            : "Auth service is currently unavailable. Please try again later.";
    return LoginResponse.newBuilder()
            .setStatus(500)
            .setMessage(message)
            .build();
  }
  @CircuitBreaker(name = "authService", fallbackMethod = "fallbackLogin")
  public LoginResponse login(LoginRequest request) {
    return authServiceBlockingStub.postLogin(request);
  }

  private ProfileResponse fallbackGetProfile(ProfileRequest request, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in auth service"
            : "Auth service is currently unavailable. Please try again later.";
    return ProfileResponse.newBuilder()
            .setStatus(500)
            .setMessage(message)
            .build();
  }
  @CircuitBreaker(name="authService", fallbackMethod = "fallbackGetProfile")
  public ProfileResponse getProfile(ProfileRequest request) {
    return authServiceBlockingStub.getProfile(request);
  }

  private IsAdminResponse fallbackIsAdmin(IsAdminRequest isAdminRequest, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in auth service"
            : "Auth service is currently unavailable. Please try again later.";
    return IsAdminResponse.newBuilder()
            .setIsAdmin(false)
            .build();
  }
  public IsAdminResponse isAdmin(IsAdminRequest request) {
    return authServiceBlockingStub.isAdmin(request);
  }

  private ForgotPasswordResponse fallbackForgotPassword(ForgotPasswordRequest request, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in auth service"
            : "Auth service is currently unavailable. Please try again later.";
    return ForgotPasswordResponse.newBuilder()
            .setStatus(500)
            .setMessage(message)
            .build();
  }
  @CircuitBreaker(name = "authService", fallbackMethod = "fallbackForgotPassword")
  public ForgotPasswordResponse forgotPassword(ForgotPasswordRequest request) {
    return authServiceBlockingStub.forgotPassword(request);
  }

  private ResetPasswordResponse fallbackResetPassword(ResetPasswordRequest request, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in auth service"
            : "Auth service is currently unavailable. Please try again later.";
    return ResetPasswordResponse.newBuilder()
            .setStatus(500)
            .setMessage(message)
            .build();
  }
  @CircuitBreaker(name = "authService", fallbackMethod = "fallbackResetPassword")
  public ResetPasswordResponse resetPassword(ResetPasswordRequest request) {
    return authServiceBlockingStub.resetPassword(request);
  }

  private VerifyEmailResponse fallbackVerifyEmail(VerifyEmailRequest request, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in auth service"
            : "Auth service is currently unavailable. Please try again later.";
    return VerifyEmailResponse.newBuilder()
            .setStatus(500)
            .setMessage(message)
            .build();
  }
  @CircuitBreaker(name = "authService", fallbackMethod = "fallbackVerifyEmail")
  public VerifyEmailResponse verifyEmail(VerifyEmailRequest request) {
    return authServiceBlockingStub.verifyEmail(request);
  }

  private RefreshTokenResponse fallbackRefreshToken(RefreshTokenRequest request, Throwable throwable) {
    String message = throwable instanceof CallNotPermittedException
            ? "Circuit breaker is open: Too many failures in auth service"
            : "Auth service is currently unavailable. Please try again later.";
    return RefreshTokenResponse.newBuilder()
            .setStatus(500)
            .setMessage(message)
            .build();
  }
  @CircuitBreaker(name = "authService", fallbackMethod = "fallbackRefreshToken")
  public RefreshTokenResponse refreshToken(RefreshTokenRequest request) {
    return authServiceBlockingStub.refreshToken(request);
  }
}
