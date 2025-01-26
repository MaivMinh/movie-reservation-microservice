package com.microservice.movie_proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: movie.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MovieServiceGrpc {

  private MovieServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "net.devh.boot.grpc.example.MovieService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.microservice.movie_proto.CreateMovieRequest,
      com.microservice.movie_proto.CreateMovieResponse> getCreateMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createMovie",
      requestType = com.microservice.movie_proto.CreateMovieRequest.class,
      responseType = com.microservice.movie_proto.CreateMovieResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.movie_proto.CreateMovieRequest,
      com.microservice.movie_proto.CreateMovieResponse> getCreateMovieMethod() {
    io.grpc.MethodDescriptor<com.microservice.movie_proto.CreateMovieRequest, com.microservice.movie_proto.CreateMovieResponse> getCreateMovieMethod;
    if ((getCreateMovieMethod = MovieServiceGrpc.getCreateMovieMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getCreateMovieMethod = MovieServiceGrpc.getCreateMovieMethod) == null) {
          MovieServiceGrpc.getCreateMovieMethod = getCreateMovieMethod =
              io.grpc.MethodDescriptor.<com.microservice.movie_proto.CreateMovieRequest, com.microservice.movie_proto.CreateMovieResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.movie_proto.CreateMovieRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.movie_proto.CreateMovieResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("createMovie"))
              .build();
        }
      }
    }
    return getCreateMovieMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservice.movie_proto.GetMoviesRequest,
      com.microservice.movie_proto.GetMoviesResponse> getGetMoviesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMovies",
      requestType = com.microservice.movie_proto.GetMoviesRequest.class,
      responseType = com.microservice.movie_proto.GetMoviesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.movie_proto.GetMoviesRequest,
      com.microservice.movie_proto.GetMoviesResponse> getGetMoviesMethod() {
    io.grpc.MethodDescriptor<com.microservice.movie_proto.GetMoviesRequest, com.microservice.movie_proto.GetMoviesResponse> getGetMoviesMethod;
    if ((getGetMoviesMethod = MovieServiceGrpc.getGetMoviesMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getGetMoviesMethod = MovieServiceGrpc.getGetMoviesMethod) == null) {
          MovieServiceGrpc.getGetMoviesMethod = getGetMoviesMethod =
              io.grpc.MethodDescriptor.<com.microservice.movie_proto.GetMoviesRequest, com.microservice.movie_proto.GetMoviesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMovies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.movie_proto.GetMoviesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.movie_proto.GetMoviesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("getMovies"))
              .build();
        }
      }
    }
    return getGetMoviesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservice.movie_proto.GetMovieRequest,
      com.microservice.movie_proto.GetMovieResponse> getGetMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMovie",
      requestType = com.microservice.movie_proto.GetMovieRequest.class,
      responseType = com.microservice.movie_proto.GetMovieResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.movie_proto.GetMovieRequest,
      com.microservice.movie_proto.GetMovieResponse> getGetMovieMethod() {
    io.grpc.MethodDescriptor<com.microservice.movie_proto.GetMovieRequest, com.microservice.movie_proto.GetMovieResponse> getGetMovieMethod;
    if ((getGetMovieMethod = MovieServiceGrpc.getGetMovieMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getGetMovieMethod = MovieServiceGrpc.getGetMovieMethod) == null) {
          MovieServiceGrpc.getGetMovieMethod = getGetMovieMethod =
              io.grpc.MethodDescriptor.<com.microservice.movie_proto.GetMovieRequest, com.microservice.movie_proto.GetMovieResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.movie_proto.GetMovieRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.movie_proto.GetMovieResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("getMovie"))
              .build();
        }
      }
    }
    return getGetMovieMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservice.movie_proto.SearchMoviesRequest,
      com.microservice.movie_proto.SearchMoviesResponse> getSearchMoviesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchMovies",
      requestType = com.microservice.movie_proto.SearchMoviesRequest.class,
      responseType = com.microservice.movie_proto.SearchMoviesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.movie_proto.SearchMoviesRequest,
      com.microservice.movie_proto.SearchMoviesResponse> getSearchMoviesMethod() {
    io.grpc.MethodDescriptor<com.microservice.movie_proto.SearchMoviesRequest, com.microservice.movie_proto.SearchMoviesResponse> getSearchMoviesMethod;
    if ((getSearchMoviesMethod = MovieServiceGrpc.getSearchMoviesMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getSearchMoviesMethod = MovieServiceGrpc.getSearchMoviesMethod) == null) {
          MovieServiceGrpc.getSearchMoviesMethod = getSearchMoviesMethod =
              io.grpc.MethodDescriptor.<com.microservice.movie_proto.SearchMoviesRequest, com.microservice.movie_proto.SearchMoviesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "searchMovies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.movie_proto.SearchMoviesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.movie_proto.SearchMoviesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("searchMovies"))
              .build();
        }
      }
    }
    return getSearchMoviesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservice.movie_proto.UpdateMovieRequest,
      com.microservice.movie_proto.UpdateMovieResponse> getUpdateMovieMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateMovie",
      requestType = com.microservice.movie_proto.UpdateMovieRequest.class,
      responseType = com.microservice.movie_proto.UpdateMovieResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.movie_proto.UpdateMovieRequest,
      com.microservice.movie_proto.UpdateMovieResponse> getUpdateMovieMethod() {
    io.grpc.MethodDescriptor<com.microservice.movie_proto.UpdateMovieRequest, com.microservice.movie_proto.UpdateMovieResponse> getUpdateMovieMethod;
    if ((getUpdateMovieMethod = MovieServiceGrpc.getUpdateMovieMethod) == null) {
      synchronized (MovieServiceGrpc.class) {
        if ((getUpdateMovieMethod = MovieServiceGrpc.getUpdateMovieMethod) == null) {
          MovieServiceGrpc.getUpdateMovieMethod = getUpdateMovieMethod =
              io.grpc.MethodDescriptor.<com.microservice.movie_proto.UpdateMovieRequest, com.microservice.movie_proto.UpdateMovieResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateMovie"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.movie_proto.UpdateMovieRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.movie_proto.UpdateMovieResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MovieServiceMethodDescriptorSupplier("updateMovie"))
              .build();
        }
      }
    }
    return getUpdateMovieMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MovieServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MovieServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MovieServiceStub>() {
        @java.lang.Override
        public MovieServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MovieServiceStub(channel, callOptions);
        }
      };
    return MovieServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MovieServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MovieServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MovieServiceBlockingStub>() {
        @java.lang.Override
        public MovieServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MovieServiceBlockingStub(channel, callOptions);
        }
      };
    return MovieServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MovieServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MovieServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MovieServiceFutureStub>() {
        @java.lang.Override
        public MovieServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MovieServiceFutureStub(channel, callOptions);
        }
      };
    return MovieServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void createMovie(com.microservice.movie_proto.CreateMovieRequest request,
        io.grpc.stub.StreamObserver<com.microservice.movie_proto.CreateMovieResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMovieMethod(), responseObserver);
    }

    /**
     */
    default void getMovies(com.microservice.movie_proto.GetMoviesRequest request,
        io.grpc.stub.StreamObserver<com.microservice.movie_proto.GetMoviesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMoviesMethod(), responseObserver);
    }

    /**
     */
    default void getMovie(com.microservice.movie_proto.GetMovieRequest request,
        io.grpc.stub.StreamObserver<com.microservice.movie_proto.GetMovieResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMovieMethod(), responseObserver);
    }

    /**
     */
    default void searchMovies(com.microservice.movie_proto.SearchMoviesRequest request,
        io.grpc.stub.StreamObserver<com.microservice.movie_proto.SearchMoviesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchMoviesMethod(), responseObserver);
    }

    /**
     */
    default void updateMovie(com.microservice.movie_proto.UpdateMovieRequest request,
        io.grpc.stub.StreamObserver<com.microservice.movie_proto.UpdateMovieResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMovieMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MovieService.
   */
  public static abstract class MovieServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return MovieServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MovieService.
   */
  public static final class MovieServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MovieServiceStub> {
    private MovieServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MovieServiceStub(channel, callOptions);
    }

    /**
     */
    public void createMovie(com.microservice.movie_proto.CreateMovieRequest request,
        io.grpc.stub.StreamObserver<com.microservice.movie_proto.CreateMovieResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMovieMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMovies(com.microservice.movie_proto.GetMoviesRequest request,
        io.grpc.stub.StreamObserver<com.microservice.movie_proto.GetMoviesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMoviesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMovie(com.microservice.movie_proto.GetMovieRequest request,
        io.grpc.stub.StreamObserver<com.microservice.movie_proto.GetMovieResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMovieMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchMovies(com.microservice.movie_proto.SearchMoviesRequest request,
        io.grpc.stub.StreamObserver<com.microservice.movie_proto.SearchMoviesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchMoviesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMovie(com.microservice.movie_proto.UpdateMovieRequest request,
        io.grpc.stub.StreamObserver<com.microservice.movie_proto.UpdateMovieResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMovieMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MovieService.
   */
  public static final class MovieServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MovieServiceBlockingStub> {
    private MovieServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MovieServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.microservice.movie_proto.CreateMovieResponse createMovie(com.microservice.movie_proto.CreateMovieRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMovieMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservice.movie_proto.GetMoviesResponse getMovies(com.microservice.movie_proto.GetMoviesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMoviesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservice.movie_proto.GetMovieResponse getMovie(com.microservice.movie_proto.GetMovieRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMovieMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservice.movie_proto.SearchMoviesResponse searchMovies(com.microservice.movie_proto.SearchMoviesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchMoviesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservice.movie_proto.UpdateMovieResponse updateMovie(com.microservice.movie_proto.UpdateMovieRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMovieMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MovieService.
   */
  public static final class MovieServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MovieServiceFutureStub> {
    private MovieServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MovieServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MovieServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.movie_proto.CreateMovieResponse> createMovie(
        com.microservice.movie_proto.CreateMovieRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMovieMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.movie_proto.GetMoviesResponse> getMovies(
        com.microservice.movie_proto.GetMoviesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMoviesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.movie_proto.GetMovieResponse> getMovie(
        com.microservice.movie_proto.GetMovieRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMovieMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.movie_proto.SearchMoviesResponse> searchMovies(
        com.microservice.movie_proto.SearchMoviesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchMoviesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.movie_proto.UpdateMovieResponse> updateMovie(
        com.microservice.movie_proto.UpdateMovieRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMovieMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_MOVIE = 0;
  private static final int METHODID_GET_MOVIES = 1;
  private static final int METHODID_GET_MOVIE = 2;
  private static final int METHODID_SEARCH_MOVIES = 3;
  private static final int METHODID_UPDATE_MOVIE = 4;

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
        case METHODID_CREATE_MOVIE:
          serviceImpl.createMovie((com.microservice.movie_proto.CreateMovieRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.movie_proto.CreateMovieResponse>) responseObserver);
          break;
        case METHODID_GET_MOVIES:
          serviceImpl.getMovies((com.microservice.movie_proto.GetMoviesRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.movie_proto.GetMoviesResponse>) responseObserver);
          break;
        case METHODID_GET_MOVIE:
          serviceImpl.getMovie((com.microservice.movie_proto.GetMovieRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.movie_proto.GetMovieResponse>) responseObserver);
          break;
        case METHODID_SEARCH_MOVIES:
          serviceImpl.searchMovies((com.microservice.movie_proto.SearchMoviesRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.movie_proto.SearchMoviesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_MOVIE:
          serviceImpl.updateMovie((com.microservice.movie_proto.UpdateMovieRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.movie_proto.UpdateMovieResponse>) responseObserver);
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
          getCreateMovieMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.movie_proto.CreateMovieRequest,
              com.microservice.movie_proto.CreateMovieResponse>(
                service, METHODID_CREATE_MOVIE)))
        .addMethod(
          getGetMoviesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.movie_proto.GetMoviesRequest,
              com.microservice.movie_proto.GetMoviesResponse>(
                service, METHODID_GET_MOVIES)))
        .addMethod(
          getGetMovieMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.movie_proto.GetMovieRequest,
              com.microservice.movie_proto.GetMovieResponse>(
                service, METHODID_GET_MOVIE)))
        .addMethod(
          getSearchMoviesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.movie_proto.SearchMoviesRequest,
              com.microservice.movie_proto.SearchMoviesResponse>(
                service, METHODID_SEARCH_MOVIES)))
        .addMethod(
          getUpdateMovieMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.movie_proto.UpdateMovieRequest,
              com.microservice.movie_proto.UpdateMovieResponse>(
                service, METHODID_UPDATE_MOVIE)))
        .build();
  }

  private static abstract class MovieServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MovieServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.microservice.movie_proto.MovieProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MovieService");
    }
  }

  private static final class MovieServiceFileDescriptorSupplier
      extends MovieServiceBaseDescriptorSupplier {
    MovieServiceFileDescriptorSupplier() {}
  }

  private static final class MovieServiceMethodDescriptorSupplier
      extends MovieServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    MovieServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (MovieServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MovieServiceFileDescriptorSupplier())
              .addMethod(getCreateMovieMethod())
              .addMethod(getGetMoviesMethod())
              .addMethod(getGetMovieMethod())
              .addMethod(getSearchMoviesMethod())
              .addMethod(getUpdateMovieMethod())
              .build();
        }
      }
    }
    return result;
  }
}
