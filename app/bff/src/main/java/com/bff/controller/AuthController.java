package com.bff.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/auth")
@RestController
@AllArgsConstructor
public class AuthController {
  @RequestMapping("/status")
  public String checkStatus() {
    return "OK";
  }
}
