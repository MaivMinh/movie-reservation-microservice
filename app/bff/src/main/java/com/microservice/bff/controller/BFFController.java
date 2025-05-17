package com.microservice.bff.controller;

import com.microservice.bff.response.ContactInfo;
import com.microservice.bff.response.ResponseData;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/app")
@RequiredArgsConstructor
public class BFFController {
  @Autowired
  private ContactInfo contactInfo;

  /// Phương thức lấy thông tin của BFF.
  @GetMapping(value = "/contact-info", produces = {"application/json"})
  public ResponseEntity<ResponseData> getContactInfo() {
    /**
     * bff:
     *   message: "Welcome to the BFF Service related production configuration!"
     *   contactDetails:
     *     name: "Mai Van Minh"
     *     email: "maivanminh.se@gmail.com"
     */
    return ResponseEntity.ok(new ResponseData(HttpStatus.OK.value(), "SUCCESS", contactInfo.getMessage()));
  }
}
