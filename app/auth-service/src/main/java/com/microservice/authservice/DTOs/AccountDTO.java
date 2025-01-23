package com.microservice.authservice.DTOs;

import com.microservice.authservice.model.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountDTO {
  private Integer id;
  private String username;
  private Role role;
}
