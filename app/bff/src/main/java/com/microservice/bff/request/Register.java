package com.microservice.bff.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Register {
  private String username;
  private String password;
  private String email;
}
