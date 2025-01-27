package com.microservice.booking_proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: booking.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BookingServiceGrpc {

  private BookingServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "net.devh.boot.grpc.example.BookingService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.microservice.booking_proto.CreateCinemaRequest,
      com.microservice.booking_proto.CreateCinemaResponse> getCreateCinemaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createCinema",
      requestType = com.microservice.booking_proto.CreateCinemaRequest.class,
      responseType = com.microservice.booking_proto.CreateCinemaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.booking_proto.CreateCinemaRequest,
      com.microservice.booking_proto.CreateCinemaResponse> getCreateCinemaMethod() {
    io.grpc.MethodDescriptor<com.microservice.booking_proto.CreateCinemaRequest, com.microservice.booking_proto.CreateCinemaResponse> getCreateCinemaMethod;
    if ((getCreateCinemaMethod = BookingServiceGrpc.getCreateCinemaMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getCreateCinemaMethod = BookingServiceGrpc.getCreateCinemaMethod) == null) {
          BookingServiceGrpc.getCreateCinemaMethod = getCreateCinemaMethod =
              io.grpc.MethodDescriptor.<com.microservice.booking_proto.CreateCinemaRequest, com.microservice.booking_proto.CreateCinemaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createCinema"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.CreateCinemaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.CreateCinemaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("createCinema"))
              .build();
        }
      }
    }
    return getCreateCinemaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservice.booking_proto.GetCinemasRequest,
      com.microservice.booking_proto.GetCinemasResponse> getGetCinemasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCinemas",
      requestType = com.microservice.booking_proto.GetCinemasRequest.class,
      responseType = com.microservice.booking_proto.GetCinemasResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.booking_proto.GetCinemasRequest,
      com.microservice.booking_proto.GetCinemasResponse> getGetCinemasMethod() {
    io.grpc.MethodDescriptor<com.microservice.booking_proto.GetCinemasRequest, com.microservice.booking_proto.GetCinemasResponse> getGetCinemasMethod;
    if ((getGetCinemasMethod = BookingServiceGrpc.getGetCinemasMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getGetCinemasMethod = BookingServiceGrpc.getGetCinemasMethod) == null) {
          BookingServiceGrpc.getGetCinemasMethod = getGetCinemasMethod =
              io.grpc.MethodDescriptor.<com.microservice.booking_proto.GetCinemasRequest, com.microservice.booking_proto.GetCinemasResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCinemas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.GetCinemasRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.GetCinemasResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("getCinemas"))
              .build();
        }
      }
    }
    return getGetCinemasMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservice.booking_proto.GetCinemaRequest,
      com.microservice.booking_proto.GetCinemaResponse> getGetCinemaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCinema",
      requestType = com.microservice.booking_proto.GetCinemaRequest.class,
      responseType = com.microservice.booking_proto.GetCinemaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.booking_proto.GetCinemaRequest,
      com.microservice.booking_proto.GetCinemaResponse> getGetCinemaMethod() {
    io.grpc.MethodDescriptor<com.microservice.booking_proto.GetCinemaRequest, com.microservice.booking_proto.GetCinemaResponse> getGetCinemaMethod;
    if ((getGetCinemaMethod = BookingServiceGrpc.getGetCinemaMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getGetCinemaMethod = BookingServiceGrpc.getGetCinemaMethod) == null) {
          BookingServiceGrpc.getGetCinemaMethod = getGetCinemaMethod =
              io.grpc.MethodDescriptor.<com.microservice.booking_proto.GetCinemaRequest, com.microservice.booking_proto.GetCinemaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCinema"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.GetCinemaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.GetCinemaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("getCinema"))
              .build();
        }
      }
    }
    return getGetCinemaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservice.booking_proto.SearchCinemasRequest,
      com.microservice.booking_proto.SearchCinemasResponse> getSearchCinemasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchCinemas",
      requestType = com.microservice.booking_proto.SearchCinemasRequest.class,
      responseType = com.microservice.booking_proto.SearchCinemasResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.booking_proto.SearchCinemasRequest,
      com.microservice.booking_proto.SearchCinemasResponse> getSearchCinemasMethod() {
    io.grpc.MethodDescriptor<com.microservice.booking_proto.SearchCinemasRequest, com.microservice.booking_proto.SearchCinemasResponse> getSearchCinemasMethod;
    if ((getSearchCinemasMethod = BookingServiceGrpc.getSearchCinemasMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getSearchCinemasMethod = BookingServiceGrpc.getSearchCinemasMethod) == null) {
          BookingServiceGrpc.getSearchCinemasMethod = getSearchCinemasMethod =
              io.grpc.MethodDescriptor.<com.microservice.booking_proto.SearchCinemasRequest, com.microservice.booking_proto.SearchCinemasResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "searchCinemas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.SearchCinemasRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.SearchCinemasResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("searchCinemas"))
              .build();
        }
      }
    }
    return getSearchCinemasMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservice.booking_proto.UpdateCinemaRequest,
      com.microservice.booking_proto.UpdateCinemaResponse> getUpdateCinemaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateCinema",
      requestType = com.microservice.booking_proto.UpdateCinemaRequest.class,
      responseType = com.microservice.booking_proto.UpdateCinemaResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.booking_proto.UpdateCinemaRequest,
      com.microservice.booking_proto.UpdateCinemaResponse> getUpdateCinemaMethod() {
    io.grpc.MethodDescriptor<com.microservice.booking_proto.UpdateCinemaRequest, com.microservice.booking_proto.UpdateCinemaResponse> getUpdateCinemaMethod;
    if ((getUpdateCinemaMethod = BookingServiceGrpc.getUpdateCinemaMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getUpdateCinemaMethod = BookingServiceGrpc.getUpdateCinemaMethod) == null) {
          BookingServiceGrpc.getUpdateCinemaMethod = getUpdateCinemaMethod =
              io.grpc.MethodDescriptor.<com.microservice.booking_proto.UpdateCinemaRequest, com.microservice.booking_proto.UpdateCinemaResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateCinema"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.UpdateCinemaRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.UpdateCinemaResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("updateCinema"))
              .build();
        }
      }
    }
    return getUpdateCinemaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BookingServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookingServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookingServiceStub>() {
        @java.lang.Override
        public BookingServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookingServiceStub(channel, callOptions);
        }
      };
    return BookingServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BookingServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookingServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookingServiceBlockingStub>() {
        @java.lang.Override
        public BookingServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookingServiceBlockingStub(channel, callOptions);
        }
      };
    return BookingServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BookingServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BookingServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BookingServiceFutureStub>() {
        @java.lang.Override
        public BookingServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BookingServiceFutureStub(channel, callOptions);
        }
      };
    return BookingServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createCinema(com.microservice.booking_proto.CreateCinemaRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.CreateCinemaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCinemaMethod(), responseObserver);
    }

    /**
     */
    default void getCinemas(com.microservice.booking_proto.GetCinemasRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.GetCinemasResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCinemasMethod(), responseObserver);
    }

    /**
     */
    default void getCinema(com.microservice.booking_proto.GetCinemaRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.GetCinemaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCinemaMethod(), responseObserver);
    }

    /**
     */
    default void searchCinemas(com.microservice.booking_proto.SearchCinemasRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.SearchCinemasResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchCinemasMethod(), responseObserver);
    }

    /**
     */
    default void updateCinema(com.microservice.booking_proto.UpdateCinemaRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.UpdateCinemaResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateCinemaMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service BookingService.
   */
  public static abstract class BookingServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return BookingServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service BookingService.
   */
  public static final class BookingServiceStub
      extends io.grpc.stub.AbstractAsyncStub<BookingServiceStub> {
    private BookingServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookingServiceStub(channel, callOptions);
    }

    /**
     */
    public void createCinema(com.microservice.booking_proto.CreateCinemaRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.CreateCinemaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCinemaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCinemas(com.microservice.booking_proto.GetCinemasRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.GetCinemasResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCinemasMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCinema(com.microservice.booking_proto.GetCinemaRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.GetCinemaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCinemaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchCinemas(com.microservice.booking_proto.SearchCinemasRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.SearchCinemasResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchCinemasMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateCinema(com.microservice.booking_proto.UpdateCinemaRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.UpdateCinemaResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateCinemaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service BookingService.
   */
  public static final class BookingServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<BookingServiceBlockingStub> {
    private BookingServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookingServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.microservice.booking_proto.CreateCinemaResponse createCinema(com.microservice.booking_proto.CreateCinemaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCinemaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservice.booking_proto.GetCinemasResponse getCinemas(com.microservice.booking_proto.GetCinemasRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCinemasMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservice.booking_proto.GetCinemaResponse getCinema(com.microservice.booking_proto.GetCinemaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCinemaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservice.booking_proto.SearchCinemasResponse searchCinemas(com.microservice.booking_proto.SearchCinemasRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchCinemasMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservice.booking_proto.UpdateCinemaResponse updateCinema(com.microservice.booking_proto.UpdateCinemaRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateCinemaMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service BookingService.
   */
  public static final class BookingServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<BookingServiceFutureStub> {
    private BookingServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BookingServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BookingServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.booking_proto.CreateCinemaResponse> createCinema(
        com.microservice.booking_proto.CreateCinemaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCinemaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.booking_proto.GetCinemasResponse> getCinemas(
        com.microservice.booking_proto.GetCinemasRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCinemasMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.booking_proto.GetCinemaResponse> getCinema(
        com.microservice.booking_proto.GetCinemaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCinemaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.booking_proto.SearchCinemasResponse> searchCinemas(
        com.microservice.booking_proto.SearchCinemasRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchCinemasMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.booking_proto.UpdateCinemaResponse> updateCinema(
        com.microservice.booking_proto.UpdateCinemaRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateCinemaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CINEMA = 0;
  private static final int METHODID_GET_CINEMAS = 1;
  private static final int METHODID_GET_CINEMA = 2;
  private static final int METHODID_SEARCH_CINEMAS = 3;
  private static final int METHODID_UPDATE_CINEMA = 4;

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
        case METHODID_CREATE_CINEMA:
          serviceImpl.createCinema((com.microservice.booking_proto.CreateCinemaRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.booking_proto.CreateCinemaResponse>) responseObserver);
          break;
        case METHODID_GET_CINEMAS:
          serviceImpl.getCinemas((com.microservice.booking_proto.GetCinemasRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.booking_proto.GetCinemasResponse>) responseObserver);
          break;
        case METHODID_GET_CINEMA:
          serviceImpl.getCinema((com.microservice.booking_proto.GetCinemaRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.booking_proto.GetCinemaResponse>) responseObserver);
          break;
        case METHODID_SEARCH_CINEMAS:
          serviceImpl.searchCinemas((com.microservice.booking_proto.SearchCinemasRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.booking_proto.SearchCinemasResponse>) responseObserver);
          break;
        case METHODID_UPDATE_CINEMA:
          serviceImpl.updateCinema((com.microservice.booking_proto.UpdateCinemaRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.booking_proto.UpdateCinemaResponse>) responseObserver);
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
          getCreateCinemaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.booking_proto.CreateCinemaRequest,
              com.microservice.booking_proto.CreateCinemaResponse>(
                service, METHODID_CREATE_CINEMA)))
        .addMethod(
          getGetCinemasMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.booking_proto.GetCinemasRequest,
              com.microservice.booking_proto.GetCinemasResponse>(
                service, METHODID_GET_CINEMAS)))
        .addMethod(
          getGetCinemaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.booking_proto.GetCinemaRequest,
              com.microservice.booking_proto.GetCinemaResponse>(
                service, METHODID_GET_CINEMA)))
        .addMethod(
          getSearchCinemasMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.booking_proto.SearchCinemasRequest,
              com.microservice.booking_proto.SearchCinemasResponse>(
                service, METHODID_SEARCH_CINEMAS)))
        .addMethod(
          getUpdateCinemaMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.booking_proto.UpdateCinemaRequest,
              com.microservice.booking_proto.UpdateCinemaResponse>(
                service, METHODID_UPDATE_CINEMA)))
        .build();
  }

  private static abstract class BookingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BookingServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.microservice.booking_proto.BookingProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BookingService");
    }
  }

  private static final class BookingServiceFileDescriptorSupplier
      extends BookingServiceBaseDescriptorSupplier {
    BookingServiceFileDescriptorSupplier() {}
  }

  private static final class BookingServiceMethodDescriptorSupplier
      extends BookingServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    BookingServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (BookingServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BookingServiceFileDescriptorSupplier())
              .addMethod(getCreateCinemaMethod())
              .addMethod(getGetCinemasMethod())
              .addMethod(getGetCinemaMethod())
              .addMethod(getSearchCinemasMethod())
              .addMethod(getUpdateCinemaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
