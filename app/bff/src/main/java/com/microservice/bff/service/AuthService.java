package com.microservice.bff.service;

import com.microservice.auth_proto.*;
import com.microservice.bff.grpc.AuthServiceGrpcClient;
import com.microservice.bff.request.Register;
import com.microservice.bff.request.ResetRequest;
import com.microservice.bff.response.ResponseData;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

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
    com.microservice.bff.response.LoginResponse loginResponse = null;
    if (response.hasLoginSuccessInfo()) {
      LoginSuccessInfo loginSuccessInfo = response.getLoginSuccessInfo();
      loginResponse = com.microservice.bff.response.LoginResponse.builder()
              .accessToken(loginSuccessInfo.getAccessToken())
              .tokenType(loginSuccessInfo.getTokenType())
              .expiresIn(new Timestamp(loginSuccessInfo.getExpiresIn()))
              .build();
    }
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

  public ResponseData logout(String token) {
    LogoutRequest request = LogoutRequest.newBuilder()
            .setAccessToken(token)
            .build();
    LogoutResponse response = grpcClient.logout(request);
    return ResponseData.builder()
            .status(response.getStatus())
            .message(response.getMessage())
            .build();
  }


  public boolean isAdmin(Integer id)  {
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
}
