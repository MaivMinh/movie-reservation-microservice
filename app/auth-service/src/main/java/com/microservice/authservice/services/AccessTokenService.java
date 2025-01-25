package com.microservice.authservice.services;

import com.microservice.authservice.model.AccessToken;
import com.microservice.authservice.model.Account;
import com.microservice.authservice.repository.AccessTokenRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccessTokenService {
  private final AccessTokenRepo accessTokenRepo;

  public AccessToken findAccessTokenByToken(String token) {
    return accessTokenRepo.findAccessTokenByToken(token).orElse(null);
  }

  public void revoke(AccessToken saved) {
    try {
      saved.setIsRevoked(true);
      accessTokenRepo.save(saved);
    } catch (Exception e) {
      throw new RuntimeException("Failed to revoke token");
    }
  }

  public void revokeAll(Account account) {
    accessTokenRepo.revokeAll(account.getId());
  }

  public void save(AccessToken accessToken) {
    try {
      accessTokenRepo.save(accessToken);
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
