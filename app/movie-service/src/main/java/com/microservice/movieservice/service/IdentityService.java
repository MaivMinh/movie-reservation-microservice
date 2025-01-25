package com.microservice.movieservice.service;

import com.microservice.auth_proto.AuthServiceGrpc;
import com.microservice.auth_proto.IdentityRequest;
import com.microservice.auth_proto.IdentityResponse;
import com.microservice.movieservice.constants.HEADER;
import com.microservice.movieservice.constants.ROLE;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class IdentityService {
  @GrpcClient("identityService")
  private AuthServiceGrpc.AuthServiceBlockingStub authServiceBlockingStub;

  public IdentityResponse doIdentify(int userId) {
    IdentityRequest request = IdentityRequest.newBuilder()
            .setUserId(userId)
            .build();
    return authServiceBlockingStub.doIdentity(request);
  }


  public boolean isAdmin(HttpServletRequest request) {
    String userId = request.getHeader(HEADER.X_USER_ID);
    if (userId == null || userId.isEmpty()) {
      return false;
    }
    int id = Integer.parseInt(userId);

    IdentityResponse response = doIdentify(id);
    return response.getActive() && response.getRoles().equals(ROLE.ADMIN);
  }
}
