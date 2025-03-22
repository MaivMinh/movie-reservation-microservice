package com.microservice.websocket_proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: websocket.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class WebSocketServiceGrpc {

  private WebSocketServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "net.devh.boot.grpc.example.WebSocketService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.microservice.websocket_proto.CreatePreSeatReservationRequest,
      com.microservice.websocket_proto.CreatePreSeatReservationResponse> getCreatePreSeatReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createPreSeatReservation",
      requestType = com.microservice.websocket_proto.CreatePreSeatReservationRequest.class,
      responseType = com.microservice.websocket_proto.CreatePreSeatReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.websocket_proto.CreatePreSeatReservationRequest,
      com.microservice.websocket_proto.CreatePreSeatReservationResponse> getCreatePreSeatReservationMethod() {
    io.grpc.MethodDescriptor<com.microservice.websocket_proto.CreatePreSeatReservationRequest, com.microservice.websocket_proto.CreatePreSeatReservationResponse> getCreatePreSeatReservationMethod;
    if ((getCreatePreSeatReservationMethod = WebSocketServiceGrpc.getCreatePreSeatReservationMethod) == null) {
      synchronized (WebSocketServiceGrpc.class) {
        if ((getCreatePreSeatReservationMethod = WebSocketServiceGrpc.getCreatePreSeatReservationMethod) == null) {
          WebSocketServiceGrpc.getCreatePreSeatReservationMethod = getCreatePreSeatReservationMethod =
              io.grpc.MethodDescriptor.<com.microservice.websocket_proto.CreatePreSeatReservationRequest, com.microservice.websocket_proto.CreatePreSeatReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createPreSeatReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.websocket_proto.CreatePreSeatReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.websocket_proto.CreatePreSeatReservationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WebSocketServiceMethodDescriptorSupplier("createPreSeatReservation"))
              .build();
        }
      }
    }
    return getCreatePreSeatReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservice.websocket_proto.DeclareQueueRequest,
      com.microservice.websocket_proto.DeclareQueueResponse> getDeclareQueueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "declareQueue",
      requestType = com.microservice.websocket_proto.DeclareQueueRequest.class,
      responseType = com.microservice.websocket_proto.DeclareQueueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.websocket_proto.DeclareQueueRequest,
      com.microservice.websocket_proto.DeclareQueueResponse> getDeclareQueueMethod() {
    io.grpc.MethodDescriptor<com.microservice.websocket_proto.DeclareQueueRequest, com.microservice.websocket_proto.DeclareQueueResponse> getDeclareQueueMethod;
    if ((getDeclareQueueMethod = WebSocketServiceGrpc.getDeclareQueueMethod) == null) {
      synchronized (WebSocketServiceGrpc.class) {
        if ((getDeclareQueueMethod = WebSocketServiceGrpc.getDeclareQueueMethod) == null) {
          WebSocketServiceGrpc.getDeclareQueueMethod = getDeclareQueueMethod =
              io.grpc.MethodDescriptor.<com.microservice.websocket_proto.DeclareQueueRequest, com.microservice.websocket_proto.DeclareQueueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "declareQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.websocket_proto.DeclareQueueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.websocket_proto.DeclareQueueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WebSocketServiceMethodDescriptorSupplier("declareQueue"))
              .build();
        }
      }
    }
    return getDeclareQueueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservice.websocket_proto.RemoveQueueRequest,
      com.microservice.websocket_proto.RemoveQueueResponse> getRemoveQueueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "removeQueue",
      requestType = com.microservice.websocket_proto.RemoveQueueRequest.class,
      responseType = com.microservice.websocket_proto.RemoveQueueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.websocket_proto.RemoveQueueRequest,
      com.microservice.websocket_proto.RemoveQueueResponse> getRemoveQueueMethod() {
    io.grpc.MethodDescriptor<com.microservice.websocket_proto.RemoveQueueRequest, com.microservice.websocket_proto.RemoveQueueResponse> getRemoveQueueMethod;
    if ((getRemoveQueueMethod = WebSocketServiceGrpc.getRemoveQueueMethod) == null) {
      synchronized (WebSocketServiceGrpc.class) {
        if ((getRemoveQueueMethod = WebSocketServiceGrpc.getRemoveQueueMethod) == null) {
          WebSocketServiceGrpc.getRemoveQueueMethod = getRemoveQueueMethod =
              io.grpc.MethodDescriptor.<com.microservice.websocket_proto.RemoveQueueRequest, com.microservice.websocket_proto.RemoveQueueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "removeQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.websocket_proto.RemoveQueueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.websocket_proto.RemoveQueueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WebSocketServiceMethodDescriptorSupplier("removeQueue"))
              .build();
        }
      }
    }
    return getRemoveQueueMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WebSocketServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebSocketServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebSocketServiceStub>() {
        @java.lang.Override
        public WebSocketServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebSocketServiceStub(channel, callOptions);
        }
      };
    return WebSocketServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WebSocketServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebSocketServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebSocketServiceBlockingStub>() {
        @java.lang.Override
        public WebSocketServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebSocketServiceBlockingStub(channel, callOptions);
        }
      };
    return WebSocketServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WebSocketServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WebSocketServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WebSocketServiceFutureStub>() {
        @java.lang.Override
        public WebSocketServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WebSocketServiceFutureStub(channel, callOptions);
        }
      };
    return WebSocketServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createPreSeatReservation(com.microservice.websocket_proto.CreatePreSeatReservationRequest request,
        io.grpc.stub.StreamObserver<com.microservice.websocket_proto.CreatePreSeatReservationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreatePreSeatReservationMethod(), responseObserver);
    }

    /**
     */
    default void declareQueue(com.microservice.websocket_proto.DeclareQueueRequest request,
        io.grpc.stub.StreamObserver<com.microservice.websocket_proto.DeclareQueueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeclareQueueMethod(), responseObserver);
    }

    /**
     */
    default void removeQueue(com.microservice.websocket_proto.RemoveQueueRequest request,
        io.grpc.stub.StreamObserver<com.microservice.websocket_proto.RemoveQueueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveQueueMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service WebSocketService.
   */
  public static abstract class WebSocketServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return WebSocketServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service WebSocketService.
   */
  public static final class WebSocketServiceStub
      extends io.grpc.stub.AbstractAsyncStub<WebSocketServiceStub> {
    private WebSocketServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebSocketServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebSocketServiceStub(channel, callOptions);
    }

    /**
     */
    public void createPreSeatReservation(com.microservice.websocket_proto.CreatePreSeatReservationRequest request,
        io.grpc.stub.StreamObserver<com.microservice.websocket_proto.CreatePreSeatReservationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreatePreSeatReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void declareQueue(com.microservice.websocket_proto.DeclareQueueRequest request,
        io.grpc.stub.StreamObserver<com.microservice.websocket_proto.DeclareQueueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeclareQueueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeQueue(com.microservice.websocket_proto.RemoveQueueRequest request,
        io.grpc.stub.StreamObserver<com.microservice.websocket_proto.RemoveQueueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveQueueMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service WebSocketService.
   */
  public static final class WebSocketServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<WebSocketServiceBlockingStub> {
    private WebSocketServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebSocketServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebSocketServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.microservice.websocket_proto.CreatePreSeatReservationResponse createPreSeatReservation(com.microservice.websocket_proto.CreatePreSeatReservationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreatePreSeatReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservice.websocket_proto.DeclareQueueResponse declareQueue(com.microservice.websocket_proto.DeclareQueueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeclareQueueMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservice.websocket_proto.RemoveQueueResponse removeQueue(com.microservice.websocket_proto.RemoveQueueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveQueueMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service WebSocketService.
   */
  public static final class WebSocketServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<WebSocketServiceFutureStub> {
    private WebSocketServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WebSocketServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WebSocketServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.websocket_proto.CreatePreSeatReservationResponse> createPreSeatReservation(
        com.microservice.websocket_proto.CreatePreSeatReservationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreatePreSeatReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.websocket_proto.DeclareQueueResponse> declareQueue(
        com.microservice.websocket_proto.DeclareQueueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeclareQueueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.websocket_proto.RemoveQueueResponse> removeQueue(
        com.microservice.websocket_proto.RemoveQueueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveQueueMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_PRE_SEAT_RESERVATION = 0;
  private static final int METHODID_DECLARE_QUEUE = 1;
  private static final int METHODID_REMOVE_QUEUE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_PRE_SEAT_RESERVATION:
          serviceImpl.createPreSeatReservation((com.microservice.websocket_proto.CreatePreSeatReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.websocket_proto.CreatePreSeatReservationResponse>) responseObserver);
          break;
        case METHODID_DECLARE_QUEUE:
          serviceImpl.declareQueue((com.microservice.websocket_proto.DeclareQueueRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.websocket_proto.DeclareQueueResponse>) responseObserver);
          break;
        case METHODID_REMOVE_QUEUE:
          serviceImpl.removeQueue((com.microservice.websocket_proto.RemoveQueueRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.websocket_proto.RemoveQueueResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCreatePreSeatReservationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.websocket_proto.CreatePreSeatReservationRequest,
              com.microservice.websocket_proto.CreatePreSeatReservationResponse>(
                service, METHODID_CREATE_PRE_SEAT_RESERVATION)))
        .addMethod(
          getDeclareQueueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.websocket_proto.DeclareQueueRequest,
              com.microservice.websocket_proto.DeclareQueueResponse>(
                service, METHODID_DECLARE_QUEUE)))
        .addMethod(
          getRemoveQueueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.websocket_proto.RemoveQueueRequest,
              com.microservice.websocket_proto.RemoveQueueResponse>(
                service, METHODID_REMOVE_QUEUE)))
        .build();
  }

  private static abstract class WebSocketServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WebSocketServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.microservice.websocket_proto.WebSocketProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WebSocketService");
    }
  }

  private static final class WebSocketServiceFileDescriptorSupplier
      extends WebSocketServiceBaseDescriptorSupplier {
    WebSocketServiceFileDescriptorSupplier() {}
  }

  private static final class WebSocketServiceMethodDescriptorSupplier
      extends WebSocketServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    WebSocketServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (WebSocketServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WebSocketServiceFileDescriptorSupplier())
              .addMethod(getCreatePreSeatReservationMethod())
              .addMethod(getDeclareQueueMethod())
              .addMethod(getRemoveQueueMethod())
              .build();
        }
      }
    }
    return result;
  }
}
