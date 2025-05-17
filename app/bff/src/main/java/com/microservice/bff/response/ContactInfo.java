package com.microservice.bff.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "bff")
@Getter
@Setter
public class ContactInfo {
  /**
   * bff:
   *   message: "Welcome to the BFF Service related production configuration!"
   */
  private String message;
}
