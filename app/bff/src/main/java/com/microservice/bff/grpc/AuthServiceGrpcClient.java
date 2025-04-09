package com.microservice.bff.grpc;

import com.microservice.auth_proto.*;
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

  public RegisterResponse register(RegisterRequest registerRequest) {
    return authServiceBlockingStub.postRegister(registerRequest);
  }

  public LoginResponse login(LoginRequest request) {
    return authServiceBlockingStub.postLogin(request);
  }

  public ProfileResponse getProfile(ProfileRequest request) {
    return authServiceBlockingStub.getProfile(request);
  }

  public IsAdminResponse isAdmin(IsAdminRequest request) {
    return authServiceBlockingStub.isAdmin(request);
  }

  public ForgotPasswordResponse forgotPassword(ForgotPasswordRequest request) {
    return authServiceBlockingStub.forgotPassword(request);
  }

  public ResetPasswordResponse resetPassword(ResetPasswordRequest request) {
    return authServiceBlockingStub.resetPassword(request);
  }

  public VerifyEmailResponse verifyEmail(VerifyEmailRequest request) {
    return authServiceBlockingStub.verifyEmail(request);
  }

  public RefreshTokenResponse refreshToken(RefreshTokenRequest request) {
    return authServiceBlockingStub.refreshToken(request);
  }
}
