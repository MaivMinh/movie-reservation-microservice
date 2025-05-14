package com.microservice.bff.response;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties(prefix = "bff")
@Getter
@Setter
public class ContactInfo {
  /**
   * bff:
   *   message: "Welcome to the BFF Service related production configuration!"
   *   contactDetails:
   *     name: "Mai Van Minh"
   *     email: "maivanminh.se@gmail.com"
   */
  private String message;
  private Map<String, String> contactDetails;
  private List<String> onCallSupport;
}
