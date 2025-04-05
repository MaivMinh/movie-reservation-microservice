package com.microservice.bff.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ResetRequest {
  private String token;
  private String password;
}
