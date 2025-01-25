package com.microservice.bff.response;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfileResponse {
  private String username;
  private String email;
  private String roles;
}
