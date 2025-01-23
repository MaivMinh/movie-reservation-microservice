package com.microservice.authservice.services;

import com.microservice.authservice.model.Role;
import com.microservice.authservice.records.ROLE;
import com.microservice.authservice.repository.RoleRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RoleService {
  private final RoleRepo roleRepo;

  public Role findByRoleName(ROLE name) {
    return roleRepo.findByName(name);
  }
}
