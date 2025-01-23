package com.microservice.authservice.repository;

import com.microservice.authservice.model.Role;
import com.microservice.authservice.records.ROLE;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Integer> {
  Role findByName(ROLE name);
}
