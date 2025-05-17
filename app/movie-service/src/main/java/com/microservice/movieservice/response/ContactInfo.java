package com.microservice.movieservice.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "movie-service")
@Getter
@Setter
public class ContactInfo {
  private String message;
}