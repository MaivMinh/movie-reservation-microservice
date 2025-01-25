package com.microservice.bff.response;

import lombok.*;

import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LoginResponse {
  private String accessToken;
  private Timestamp expiresIn;
  private String tokenType;
}
