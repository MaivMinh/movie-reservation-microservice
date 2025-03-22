package com.microservice.bookingservice.grpc;

import com.microservice.websocket_proto.*;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class WebSocketServiceGrpcClient {
  @GrpcClient("webSocketService")
  private WebSocketServiceGrpc.WebSocketServiceBlockingStub webSocketServiceBlockingStub;

  public CreatePreSeatReservationResponse createPreSeatReservation(CreatePreSeatReservationRequest request) {
    return webSocketServiceBlockingStub.createPreSeatReservation(request);
  }

  public DeclareQueueResponse declareQueue(DeclareQueueRequest req) {
    return webSocketServiceBlockingStub.declareQueue(req);
  }

  public RemoveQueueResponse removeQueue(RemoveQueueRequest req) {
    return webSocketServiceBlockingStub.removeQueue(req);
  }
}
