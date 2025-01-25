package com.microservice.bff.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Logout {
  private String token;
}
