package com.microservice.apigateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/bff")
public class BffServiceFallbackController {
  @RequestMapping(value = "/contact-support")
  public Mono<String> contactSupport() {
    return Mono.just("BFF Service is currently unavailable. Please contact support team!");
  }
}
