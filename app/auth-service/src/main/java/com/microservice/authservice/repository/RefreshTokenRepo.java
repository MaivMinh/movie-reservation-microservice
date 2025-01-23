package com.microservice.authservice.repository;

import com.microservice.authservice.model.RefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefreshTokenRepo extends JpaRepository<RefreshToken, Integer> {
  RefreshToken findByContent(String refreshToken);
  RefreshToken findByAccessToken(String accessToken);
  void deleteByContent(String content);
}
