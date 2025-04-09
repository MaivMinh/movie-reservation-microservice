package com.microservice.bff.controller;

import com.microservice.bff.request.*;
import com.microservice.bff.response.ResponseData;
import com.microservice.bff.service.AuthService;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/auth")
@RestController
@AllArgsConstructor
public class AuthController {
  private final AuthService authService;

  @PostMapping(value = "/register")
  public ResponseEntity<ResponseData> register(@RequestBody Register register) {
    ResponseData response = authService.register(register);
    return ResponseEntity.status(response.getStatus()).body(response);
  }

  @PostMapping(value = "/login")
  public ResponseEntity<ResponseData> login(@RequestBody LoginRequest request) {
    ResponseData response = authService.login(request);
    return ResponseEntity.status(response.getStatus()).body(response);
  }

  @GetMapping(value = "/forgot-password")
  public ResponseEntity<ResponseData> forgotPassword(@RequestParam String email, @RequestParam String host) {
    ResponseData response = authService.forgotPassword(email, host);
    return ResponseEntity.status(response.getStatus()).body(response);
  }

  @PostMapping(value = "/reset-password")
  public ResponseEntity<ResponseData> resetPassword(@RequestBody ResetRequest resetRequest) {
    ResponseData response = authService.resetPassword(resetRequest);
    return ResponseEntity.status(response.getStatus()).body(response);
  }

  @GetMapping(value = "/verify-email")
  public ResponseEntity<ResponseData> verifyEmail(@RequestParam String token) {
    ResponseData response = authService.verifyEmail(token);
    return ResponseEntity.status(response.getStatus()).body(response);
  }

  @PostMapping(value = "/refresh-token")
  public ResponseEntity<ResponseData> refreshToken(@RequestBody RefreshTokenRequest refreshTokenRequest) {
    ResponseData response = authService.refreshToken(refreshTokenRequest);
    return ResponseEntity.status(response.getStatus()).body(response);
  }
}
