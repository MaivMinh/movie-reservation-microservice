package com.microservice.commentservice.grpc;

import com.microservice.commentservice.service.SeatReservationService;
import com.microservice.websocket_proto.*;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;

@GrpcService
@RequiredArgsConstructor
public class WebSocketServiceGrpcServer extends WebSocketServiceGrpc.WebSocketServiceImplBase {
  private final SeatReservationService seatReservationService;

  @Override
  public void declareQueue(DeclareQueueRequest request, StreamObserver<DeclareQueueResponse> responseObserver) {
    DeclareQueueResponse response = seatReservationService.declareQueue(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void createPreSeatReservation(CreatePreSeatReservationRequest request, StreamObserver<CreatePreSeatReservationResponse> responseObserver) {
    CreatePreSeatReservationResponse response = seatReservationService.createPreSeatReservation(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }

  @Override
  public void removeQueue(RemoveQueueRequest request, StreamObserver<RemoveQueueResponse> responseObserver) {
    RemoveQueueResponse response = seatReservationService.removeQueue(request);
    responseObserver.onNext(response);
    responseObserver.onCompleted();
  }
}
