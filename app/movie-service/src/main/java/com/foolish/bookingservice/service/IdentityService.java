package com.foolish.bookingservice.service;

import com.foolish.bookingservice.constants.HEADER;
import com.foolish.bookingservice.constants.ROLE;
import com.foolish.bookingservice.grpcClients.IdentityServiceGrpcClient;
import jakarta.servlet.http.HttpServletRequest;
import lombok.AllArgsConstructor;
import net.devh.boot.grpc.examples.lib.IdentityResponse;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class IdentityService {
  private final IdentityServiceGrpcClient identityServiceGrpcClient;

  public IdentityResponse doIdentify(String userId) {
    return identityServiceGrpcClient.doIdentity(userId);
  }

  public boolean isAdmin(HttpServletRequest request) {
    String userId = request.getHeader(HEADER.X_USER_ID);
    if (userId == null || userId.isEmpty()) {
      return false;
    }
    IdentityResponse response = doIdentify(userId);
    return response.getActive() && response.getRoles().equals(ROLE.ADMIN);
  }
}
