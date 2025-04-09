package com.microservice.bff.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@Builder
public class RefreshTokenResponse {
  private String accessToken;
  private String tokenType;
  private Timestamp expiresIn;
}
