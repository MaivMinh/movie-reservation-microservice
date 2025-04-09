package com.microservice.bff.service;

import com.microservice.auth_proto.*;
import com.microservice.bff.grpc.AuthServiceGrpcClient;
import com.microservice.bff.request.RefreshTokenRequest;
import com.microservice.bff.request.Register;
import com.microservice.bff.request.ResetRequest;
import com.microservice.bff.response.ResponseData;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.sql.Timestamp;

@Service
@AllArgsConstructor
public class AuthService {
  private final AuthServiceGrpcClient grpcClient;

  public ResponseData register(Register register) {
    RegisterRequest request = RegisterRequest.newBuilder()
            .setUsername(register.getUsername())
            .setPassword(register.getPassword())
            .setEmail(register.getEmail())
            .build();
    RegisterResponse response = grpcClient.register(request);
    return ResponseData.builder()
            .status(response.getStatus())
            .message(response.getMessage())
            .build();
  }

  public ResponseData login(com.microservice.bff.request.LoginRequest loginRequest) {
    LoginRequest request = LoginRequest.newBuilder()
            .setUsername(loginRequest.getUsername())
            .setPassword(loginRequest.getPassword())
            .build();
    LoginResponse response = grpcClient.login(request);
    if (!response.hasLoginSuccessInfo()) {
      return ResponseData.builder()
              .status(response.getStatus())
              .message(response.getMessage())
              .build();
    }

    LoginSuccessInfo loginSuccessInfo = response.getLoginSuccessInfo();
    AccessToken accessToken = loginSuccessInfo.getAccessToken();
    RefreshToken refreshToken = loginSuccessInfo.getRefreshToken();
    com.microservice.bff.response.LoginResponse loginResponse = com.microservice.bff.response.LoginResponse.builder()
            .accessToken(accessToken.getToken())
            .refreshToken(refreshToken.getToken())
            .tokenType(accessToken.getTokenType())
            .expiresIn(new Timestamp(accessToken.getExpiresIn()))
            .build();

    return ResponseData.builder()
            .status(response.getStatus())
            .message(response.getMessage())
            .data(loginResponse)
            .build();
  }

  public ResponseData getProfile(int id) {
    ProfileRequest request = ProfileRequest.newBuilder()
            .setAccountId(id)
            .build();
    ProfileResponse response = grpcClient.getProfile(request);
    com.microservice.bff.response.ProfileResponse profileResponse = null;
    if (response.hasProfile()) {
      Profile profile = response.getProfile();
      profileResponse = com.microservice.bff.response.ProfileResponse.builder()
              .username(profile.getUsername())
              .email(profile.getEmail())
              .roles(profile.getRoles())
              .build();
    }
    return ResponseData.builder()
            .status(response.getStatus())
            .message(response.getMessage())
            .data(profileResponse)
            .build();
  }


  public boolean isAdmin(Integer id) {
    /// Hàm thực hiện kiểm tra xem account có ROLE là ADMIN không.
    IsAdminRequest request = IsAdminRequest.newBuilder()
            .setAccountId(id)
            .build();
    IsAdminResponse response = grpcClient.isAdmin(request);
    return response.getIsAdmin();
  }

  public ResponseData forgotPassword(String email, String host) {
    ForgotPasswordRequest request = ForgotPasswordRequest.newBuilder()
            .setEmail(email)
            .setHost(host)
            .build();
    ForgotPasswordResponse response = grpcClient.forgotPassword(request);
    return ResponseData.builder()
            .status(response.getStatus())
            .message(response.getMessage())
            .build();
  }

  public ResponseData resetPassword(ResetRequest resetRequest) {
    ResetPasswordRequest request = ResetPasswordRequest.newBuilder()
            .setToken(resetRequest.getToken())
            .setPassword(resetRequest.getPassword())
            .build();

    ResetPasswordResponse response = grpcClient.resetPassword(request);
    return ResponseData.builder()
            .status(response.getStatus())
            .message(response.getMessage())
            .build();
  }

  public ResponseData verifyEmail(String token) {
    VerifyEmailRequest request = VerifyEmailRequest.newBuilder()
            .setToken(token)
            .build();
    VerifyEmailResponse response = grpcClient.verifyEmail(request);
    return ResponseData.builder()
            .status(response.getStatus())
            .message(response.getMessage())
            .build();
  }

  public ResponseData refreshToken(RefreshTokenRequest refreshTokenRequest) {
    com.microservice.auth_proto.RefreshTokenRequest request = com.microservice.auth_proto.RefreshTokenRequest.newBuilder()
            .setToken(refreshTokenRequest.getRefreshToken())
            .build();
    RefreshTokenResponse response = grpcClient.refreshToken(request);
    if (!response.hasAccessToken()) {
      return ResponseData.builder()
              .status(response.getStatus())
              .message(response.getMessage())
              .build();
    }

    AccessToken accessToken = response.getAccessToken();
    com.microservice.bff.response.RefreshTokenResponse refreshTokenResponse = com.microservice.bff.response.RefreshTokenResponse.builder()
            .accessToken(accessToken.getToken())
            .tokenType(accessToken.getTokenType())
            .expiresIn(new Timestamp(accessToken.getExpiresIn()))
            .build();

    return ResponseData.builder()
            .status(response.getStatus())
            .message(response.getMessage())
            .data(refreshTokenResponse)
            .build();
  }
}
