package com.microservice.bff.controller;

import com.microservice.bff.response.ResponseData;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping(value = "/api/app")
@RequiredArgsConstructor
public class AppController {

  @Value(value = "${bff.message}")
  private String message;
  @Value(value = "${bff.contactDetails.name}")
  private String name;
  @Value(value = "${bff.contactDetails.email}")
  private String email;


  /// Phương thức lấy thông tin của BFF.
  @GetMapping(value = "/contact-info")
  public ResponseEntity<ResponseData> getContactInfo() {
    /**
     * bff:
     *   message: "Welcome to the BFF Service related production configuration!"
     *   contactDetails:
     *     name: "Mai Van Minh"
     *     email: "maivanminh.se@gmail.com"
     *   onCallSupport:
     *     - (666) 265-3765
     *     - (666) 734-8371
     *
     */
    return ResponseEntity.ok(new ResponseData(HttpStatus.OK.value(), "SUCCESS", Map.of("message", message, "contactDetails", Map.of("name", name, "email", email))));
  }
}
