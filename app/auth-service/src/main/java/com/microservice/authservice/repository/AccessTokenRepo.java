package com.microservice.authservice.repository;

import com.microservice.authservice.model.AccessToken;
import com.microservice.authservice.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface AccessTokenRepo extends JpaRepository<AccessToken, Integer> {
  Optional<AccessToken> findAccessTokenByToken(String token);

  @Modifying
  @Transactional
  @Query(value = "UPDATE access_tokens a SET a.is_revoked = true WHERE a.account_id = :accountId", nativeQuery = true)
  void revokeAll(int accountId);
}
