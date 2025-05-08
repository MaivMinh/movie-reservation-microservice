package com.microservice.bff.controller;

import com.microservice.bff.response.ResponseData;
import com.microservice.bff.service.AuthService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/profile")
@AllArgsConstructor
public class ProfileController {
  private final AuthService authService;

  @GetMapping(value = "")
  public ResponseEntity<ResponseData> getProfile(HttpServletRequest request) {
    String accountId = request.getHeader("X-ACCOUNT-ID");
    if (!StringUtils.hasText(accountId)) {
      return ResponseEntity.status(401).body(new ResponseData(HttpStatus.UNAUTHORIZED.value(), "Unauthorized"));
    }
    int id = Integer.parseInt(accountId);
    ResponseData response = authService.getProfile(id);
    return ResponseEntity.status(response.getStatus()).body(response);
  }


  @GetMapping(value = "/contact-info")
  public ResponseEntity<ResponseData> getContactInfo(HttpServletRequest request) {
    return ResponseEntity.status(HttpStatus.OK.value()).body(new ResponseData(HttpStatus.OK.value(), "OK", Map.of("email", "maivanminh.se@gmail.com", "name", "Mai Van Minh", "phone", "0987654321")));
  }
}
