package com.microservice.authservice.repository;

import com.microservice.authservice.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountRepo extends JpaRepository<Account, Integer> {
  Account findByUsername(String username);
  Optional<Account> findByEmail(String email);
  Optional<Account> findAccountById(Integer id);

  Optional<Account> findAccountByUsername(String username);
}
