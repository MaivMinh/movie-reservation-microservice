package com.microservice.auth_proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.69.0)",
    comments = "Source: auth.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AuthServiceGrpc {

  private AuthServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "net.devh.boot.grpc.example.AuthService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.microservice.auth_proto.AuthenticateRequest,
      com.microservice.auth_proto.AuthenticateResponse> getDoAuthenticateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "doAuthenticate",
      requestType = com.microservice.auth_proto.AuthenticateRequest.class,
      responseType = com.microservice.auth_proto.AuthenticateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.auth_proto.AuthenticateRequest,
      com.microservice.auth_proto.AuthenticateResponse> getDoAuthenticateMethod() {
    io.grpc.MethodDescriptor<com.microservice.auth_proto.AuthenticateRequest, com.microservice.auth_proto.AuthenticateResponse> getDoAuthenticateMethod;
    if ((getDoAuthenticateMethod = AuthServiceGrpc.getDoAuthenticateMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getDoAuthenticateMethod = AuthServiceGrpc.getDoAuthenticateMethod) == null) {
          AuthServiceGrpc.getDoAuthenticateMethod = getDoAuthenticateMethod =
              io.grpc.MethodDescriptor.<com.microservice.auth_proto.AuthenticateRequest, com.microservice.auth_proto.AuthenticateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "doAuthenticate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.auth_proto.AuthenticateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.auth_proto.AuthenticateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("doAuthenticate"))
              .build();
        }
      }
    }
    return getDoAuthenticateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservice.auth_proto.IdentityRequest,
      com.microservice.auth_proto.IdentityResponse> getDoIdentityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "doIdentity",
      requestType = com.microservice.auth_proto.IdentityRequest.class,
      responseType = com.microservice.auth_proto.IdentityResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.auth_proto.IdentityRequest,
      com.microservice.auth_proto.IdentityResponse> getDoIdentityMethod() {
    io.grpc.MethodDescriptor<com.microservice.auth_proto.IdentityRequest, com.microservice.auth_proto.IdentityResponse> getDoIdentityMethod;
    if ((getDoIdentityMethod = AuthServiceGrpc.getDoIdentityMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getDoIdentityMethod = AuthServiceGrpc.getDoIdentityMethod) == null) {
          AuthServiceGrpc.getDoIdentityMethod = getDoIdentityMethod =
              io.grpc.MethodDescriptor.<com.microservice.auth_proto.IdentityRequest, com.microservice.auth_proto.IdentityResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "doIdentity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.auth_proto.IdentityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.auth_proto.IdentityResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("doIdentity"))
              .build();
        }
      }
    }
    return getDoIdentityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservice.auth_proto.IsAdminRequest,
      com.microservice.auth_proto.IsAdminResponse> getIsAdminMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "isAdmin",
      requestType = com.microservice.auth_proto.IsAdminRequest.class,
      responseType = com.microservice.auth_proto.IsAdminResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.auth_proto.IsAdminRequest,
      com.microservice.auth_proto.IsAdminResponse> getIsAdminMethod() {
    io.grpc.MethodDescriptor<com.microservice.auth_proto.IsAdminRequest, com.microservice.auth_proto.IsAdminResponse> getIsAdminMethod;
    if ((getIsAdminMethod = AuthServiceGrpc.getIsAdminMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getIsAdminMethod = AuthServiceGrpc.getIsAdminMethod) == null) {
          AuthServiceGrpc.getIsAdminMethod = getIsAdminMethod =
              io.grpc.MethodDescriptor.<com.microservice.auth_proto.IsAdminRequest, com.microservice.auth_proto.IsAdminResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "isAdmin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.auth_proto.IsAdminRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.auth_proto.IsAdminResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("isAdmin"))
              .build();
        }
      }
    }
    return getIsAdminMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservice.auth_proto.RegisterRequest,
      com.microservice.auth_proto.RegisterResponse> getPostRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "postRegister",
      requestType = com.microservice.auth_proto.RegisterRequest.class,
      responseType = com.microservice.auth_proto.RegisterResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.auth_proto.RegisterRequest,
      com.microservice.auth_proto.RegisterResponse> getPostRegisterMethod() {
    io.grpc.MethodDescriptor<com.microservice.auth_proto.RegisterRequest, com.microservice.auth_proto.RegisterResponse> getPostRegisterMethod;
    if ((getPostRegisterMethod = AuthServiceGrpc.getPostRegisterMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getPostRegisterMethod = AuthServiceGrpc.getPostRegisterMethod) == null) {
          AuthServiceGrpc.getPostRegisterMethod = getPostRegisterMethod =
              io.grpc.MethodDescriptor.<com.microservice.auth_proto.RegisterRequest, com.microservice.auth_proto.RegisterResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "postRegister"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.auth_proto.RegisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.auth_proto.RegisterResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("postRegister"))
              .build();
        }
      }
    }
    return getPostRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservice.auth_proto.LoginRequest,
      com.microservice.auth_proto.LoginResponse> getPostLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "postLogin",
      requestType = com.microservice.auth_proto.LoginRequest.class,
      responseType = com.microservice.auth_proto.LoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.auth_proto.LoginRequest,
      com.microservice.auth_proto.LoginResponse> getPostLoginMethod() {
    io.grpc.MethodDescriptor<com.microservice.auth_proto.LoginRequest, com.microservice.auth_proto.LoginResponse> getPostLoginMethod;
    if ((getPostLoginMethod = AuthServiceGrpc.getPostLoginMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getPostLoginMethod = AuthServiceGrpc.getPostLoginMethod) == null) {
          AuthServiceGrpc.getPostLoginMethod = getPostLoginMethod =
              io.grpc.MethodDescriptor.<com.microservice.auth_proto.LoginRequest, com.microservice.auth_proto.LoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "postLogin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.auth_proto.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.auth_proto.LoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("postLogin"))
              .build();
        }
      }
    }
    return getPostLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservice.auth_proto.ProfileRequest,
      com.microservice.auth_proto.ProfileResponse> getGetProfileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProfile",
      requestType = com.microservice.auth_proto.ProfileRequest.class,
      responseType = com.microservice.auth_proto.ProfileResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.auth_proto.ProfileRequest,
      com.microservice.auth_proto.ProfileResponse> getGetProfileMethod() {
    io.grpc.MethodDescriptor<com.microservice.auth_proto.ProfileRequest, com.microservice.auth_proto.ProfileResponse> getGetProfileMethod;
    if ((getGetProfileMethod = AuthServiceGrpc.getGetProfileMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getGetProfileMethod = AuthServiceGrpc.getGetProfileMethod) == null) {
          AuthServiceGrpc.getGetProfileMethod = getGetProfileMethod =
              io.grpc.MethodDescriptor.<com.microservice.auth_proto.ProfileRequest, com.microservice.auth_proto.ProfileResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProfile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.auth_proto.ProfileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.auth_proto.ProfileResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("getProfile"))
              .build();
        }
      }
    }
    return getGetProfileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservice.auth_proto.ForgotPasswordRequest,
      com.microservice.auth_proto.ForgotPasswordResponse> getForgotPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "forgotPassword",
      requestType = com.microservice.auth_proto.ForgotPasswordRequest.class,
      responseType = com.microservice.auth_proto.ForgotPasswordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.auth_proto.ForgotPasswordRequest,
      com.microservice.auth_proto.ForgotPasswordResponse> getForgotPasswordMethod() {
    io.grpc.MethodDescriptor<com.microservice.auth_proto.ForgotPasswordRequest, com.microservice.auth_proto.ForgotPasswordResponse> getForgotPasswordMethod;
    if ((getForgotPasswordMethod = AuthServiceGrpc.getForgotPasswordMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getForgotPasswordMethod = AuthServiceGrpc.getForgotPasswordMethod) == null) {
          AuthServiceGrpc.getForgotPasswordMethod = getForgotPasswordMethod =
              io.grpc.MethodDescriptor.<com.microservice.auth_proto.ForgotPasswordRequest, com.microservice.auth_proto.ForgotPasswordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "forgotPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.auth_proto.ForgotPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.auth_proto.ForgotPasswordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("forgotPassword"))
              .build();
        }
      }
    }
    return getForgotPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservice.auth_proto.ResetPasswordRequest,
      com.microservice.auth_proto.ResetPasswordResponse> getResetPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "resetPassword",
      requestType = com.microservice.auth_proto.ResetPasswordRequest.class,
      responseType = com.microservice.auth_proto.ResetPasswordResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.auth_proto.ResetPasswordRequest,
      com.microservice.auth_proto.ResetPasswordResponse> getResetPasswordMethod() {
    io.grpc.MethodDescriptor<com.microservice.auth_proto.ResetPasswordRequest, com.microservice.auth_proto.ResetPasswordResponse> getResetPasswordMethod;
    if ((getResetPasswordMethod = AuthServiceGrpc.getResetPasswordMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getResetPasswordMethod = AuthServiceGrpc.getResetPasswordMethod) == null) {
          AuthServiceGrpc.getResetPasswordMethod = getResetPasswordMethod =
              io.grpc.MethodDescriptor.<com.microservice.auth_proto.ResetPasswordRequest, com.microservice.auth_proto.ResetPasswordResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "resetPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.auth_proto.ResetPasswordRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.auth_proto.ResetPasswordResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("resetPassword"))
              .build();
        }
      }
    }
    return getResetPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservice.auth_proto.VerifyEmailRequest,
      com.microservice.auth_proto.VerifyEmailResponse> getVerifyEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "verifyEmail",
      requestType = com.microservice.auth_proto.VerifyEmailRequest.class,
      responseType = com.microservice.auth_proto.VerifyEmailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.auth_proto.VerifyEmailRequest,
      com.microservice.auth_proto.VerifyEmailResponse> getVerifyEmailMethod() {
    io.grpc.MethodDescriptor<com.microservice.auth_proto.VerifyEmailRequest, com.microservice.auth_proto.VerifyEmailResponse> getVerifyEmailMethod;
    if ((getVerifyEmailMethod = AuthServiceGrpc.getVerifyEmailMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getVerifyEmailMethod = AuthServiceGrpc.getVerifyEmailMethod) == null) {
          AuthServiceGrpc.getVerifyEmailMethod = getVerifyEmailMethod =
              io.grpc.MethodDescriptor.<com.microservice.auth_proto.VerifyEmailRequest, com.microservice.auth_proto.VerifyEmailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "verifyEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.auth_proto.VerifyEmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.auth_proto.VerifyEmailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("verifyEmail"))
              .build();
        }
      }
    }
    return getVerifyEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservice.auth_proto.RefreshTokenRequest,
      com.microservice.auth_proto.RefreshTokenResponse> getRefreshTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "refreshToken",
      requestType = com.microservice.auth_proto.RefreshTokenRequest.class,
      responseType = com.microservice.auth_proto.RefreshTokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.auth_proto.RefreshTokenRequest,
      com.microservice.auth_proto.RefreshTokenResponse> getRefreshTokenMethod() {
    io.grpc.MethodDescriptor<com.microservice.auth_proto.RefreshTokenRequest, com.microservice.auth_proto.RefreshTokenResponse> getRefreshTokenMethod;
    if ((getRefreshTokenMethod = AuthServiceGrpc.getRefreshTokenMethod) == null) {
      synchronized (AuthServiceGrpc.class) {
        if ((getRefreshTokenMethod = AuthServiceGrpc.getRefreshTokenMethod) == null) {
          AuthServiceGrpc.getRefreshTokenMethod = getRefreshTokenMethod =
              io.grpc.MethodDescriptor.<com.microservice.auth_proto.RefreshTokenRequest, com.microservice.auth_proto.RefreshTokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "refreshToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.auth_proto.RefreshTokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.auth_proto.RefreshTokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AuthServiceMethodDescriptorSupplier("refreshToken"))
              .build();
        }
      }
    }
    return getRefreshTokenMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuthServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceStub>() {
        @java.lang.Override
        public AuthServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceStub(channel, callOptions);
        }
      };
    return AuthServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuthServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceBlockingStub>() {
        @java.lang.Override
        public AuthServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceBlockingStub(channel, callOptions);
        }
      };
    return AuthServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuthServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AuthServiceFutureStub>() {
        @java.lang.Override
        public AuthServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AuthServiceFutureStub(channel, callOptions);
        }
      };
    return AuthServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void doAuthenticate(com.microservice.auth_proto.AuthenticateRequest request,
        io.grpc.stub.StreamObserver<com.microservice.auth_proto.AuthenticateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoAuthenticateMethod(), responseObserver);
    }

    /**
     */
    default void doIdentity(com.microservice.auth_proto.IdentityRequest request,
        io.grpc.stub.StreamObserver<com.microservice.auth_proto.IdentityResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoIdentityMethod(), responseObserver);
    }

    /**
     */
    default void isAdmin(com.microservice.auth_proto.IsAdminRequest request,
        io.grpc.stub.StreamObserver<com.microservice.auth_proto.IsAdminResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getIsAdminMethod(), responseObserver);
    }

    /**
     */
    default void postRegister(com.microservice.auth_proto.RegisterRequest request,
        io.grpc.stub.StreamObserver<com.microservice.auth_proto.RegisterResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostRegisterMethod(), responseObserver);
    }

    /**
     */
    default void postLogin(com.microservice.auth_proto.LoginRequest request,
        io.grpc.stub.StreamObserver<com.microservice.auth_proto.LoginResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPostLoginMethod(), responseObserver);
    }

    /**
     */
    default void getProfile(com.microservice.auth_proto.ProfileRequest request,
        io.grpc.stub.StreamObserver<com.microservice.auth_proto.ProfileResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProfileMethod(), responseObserver);
    }

    /**
     */
    default void forgotPassword(com.microservice.auth_proto.ForgotPasswordRequest request,
        io.grpc.stub.StreamObserver<com.microservice.auth_proto.ForgotPasswordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getForgotPasswordMethod(), responseObserver);
    }

    /**
     */
    default void resetPassword(com.microservice.auth_proto.ResetPasswordRequest request,
        io.grpc.stub.StreamObserver<com.microservice.auth_proto.ResetPasswordResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetPasswordMethod(), responseObserver);
    }

    /**
     */
    default void verifyEmail(com.microservice.auth_proto.VerifyEmailRequest request,
        io.grpc.stub.StreamObserver<com.microservice.auth_proto.VerifyEmailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getVerifyEmailMethod(), responseObserver);
    }

    /**
     */
    default void refreshToken(com.microservice.auth_proto.RefreshTokenRequest request,
        io.grpc.stub.StreamObserver<com.microservice.auth_proto.RefreshTokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRefreshTokenMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AuthService.
   */
  public static abstract class AuthServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AuthServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AuthService.
   */
  public static final class AuthServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AuthServiceStub> {
    private AuthServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceStub(channel, callOptions);
    }

    /**
     */
    public void doAuthenticate(com.microservice.auth_proto.AuthenticateRequest request,
        io.grpc.stub.StreamObserver<com.microservice.auth_proto.AuthenticateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDoAuthenticateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void doIdentity(com.microservice.auth_proto.IdentityRequest request,
        io.grpc.stub.StreamObserver<com.microservice.auth_proto.IdentityResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDoIdentityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void isAdmin(com.microservice.auth_proto.IsAdminRequest request,
        io.grpc.stub.StreamObserver<com.microservice.auth_proto.IsAdminResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getIsAdminMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postRegister(com.microservice.auth_proto.RegisterRequest request,
        io.grpc.stub.StreamObserver<com.microservice.auth_proto.RegisterResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void postLogin(com.microservice.auth_proto.LoginRequest request,
        io.grpc.stub.StreamObserver<com.microservice.auth_proto.LoginResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPostLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProfile(com.microservice.auth_proto.ProfileRequest request,
        io.grpc.stub.StreamObserver<com.microservice.auth_proto.ProfileResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProfileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void forgotPassword(com.microservice.auth_proto.ForgotPasswordRequest request,
        io.grpc.stub.StreamObserver<com.microservice.auth_proto.ForgotPasswordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getForgotPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resetPassword(com.microservice.auth_proto.ResetPasswordRequest request,
        io.grpc.stub.StreamObserver<com.microservice.auth_proto.ResetPasswordResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void verifyEmail(com.microservice.auth_proto.VerifyEmailRequest request,
        io.grpc.stub.StreamObserver<com.microservice.auth_proto.VerifyEmailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getVerifyEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void refreshToken(com.microservice.auth_proto.RefreshTokenRequest request,
        io.grpc.stub.StreamObserver<com.microservice.auth_proto.RefreshTokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRefreshTokenMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AuthService.
   */
  public static final class AuthServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AuthServiceBlockingStub> {
    private AuthServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.microservice.auth_proto.AuthenticateResponse doAuthenticate(com.microservice.auth_proto.AuthenticateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDoAuthenticateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservice.auth_proto.IdentityResponse doIdentity(com.microservice.auth_proto.IdentityRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDoIdentityMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservice.auth_proto.IsAdminResponse isAdmin(com.microservice.auth_proto.IsAdminRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getIsAdminMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservice.auth_proto.RegisterResponse postRegister(com.microservice.auth_proto.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservice.auth_proto.LoginResponse postLogin(com.microservice.auth_proto.LoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPostLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservice.auth_proto.ProfileResponse getProfile(com.microservice.auth_proto.ProfileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProfileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservice.auth_proto.ForgotPasswordResponse forgotPassword(com.microservice.auth_proto.ForgotPasswordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getForgotPasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservice.auth_proto.ResetPasswordResponse resetPassword(com.microservice.auth_proto.ResetPasswordRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetPasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservice.auth_proto.VerifyEmailResponse verifyEmail(com.microservice.auth_proto.VerifyEmailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getVerifyEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservice.auth_proto.RefreshTokenResponse refreshToken(com.microservice.auth_proto.RefreshTokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRefreshTokenMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AuthService.
   */
  public static final class AuthServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AuthServiceFutureStub> {
    private AuthServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuthServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AuthServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.auth_proto.AuthenticateResponse> doAuthenticate(
        com.microservice.auth_proto.AuthenticateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDoAuthenticateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.auth_proto.IdentityResponse> doIdentity(
        com.microservice.auth_proto.IdentityRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDoIdentityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.auth_proto.IsAdminResponse> isAdmin(
        com.microservice.auth_proto.IsAdminRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getIsAdminMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.auth_proto.RegisterResponse> postRegister(
        com.microservice.auth_proto.RegisterRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.auth_proto.LoginResponse> postLogin(
        com.microservice.auth_proto.LoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPostLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.auth_proto.ProfileResponse> getProfile(
        com.microservice.auth_proto.ProfileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProfileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.auth_proto.ForgotPasswordResponse> forgotPassword(
        com.microservice.auth_proto.ForgotPasswordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getForgotPasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.auth_proto.ResetPasswordResponse> resetPassword(
        com.microservice.auth_proto.ResetPasswordRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetPasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.auth_proto.VerifyEmailResponse> verifyEmail(
        com.microservice.auth_proto.VerifyEmailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getVerifyEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.auth_proto.RefreshTokenResponse> refreshToken(
        com.microservice.auth_proto.RefreshTokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRefreshTokenMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DO_AUTHENTICATE = 0;
  private static final int METHODID_DO_IDENTITY = 1;
  private static final int METHODID_IS_ADMIN = 2;
  private static final int METHODID_POST_REGISTER = 3;
  private static final int METHODID_POST_LOGIN = 4;
  private static final int METHODID_GET_PROFILE = 5;
  private static final int METHODID_FORGOT_PASSWORD = 6;
  private static final int METHODID_RESET_PASSWORD = 7;
  private static final int METHODID_VERIFY_EMAIL = 8;
  private static final int METHODID_REFRESH_TOKEN = 9;

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
        case METHODID_DO_AUTHENTICATE:
          serviceImpl.doAuthenticate((com.microservice.auth_proto.AuthenticateRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.auth_proto.AuthenticateResponse>) responseObserver);
          break;
        case METHODID_DO_IDENTITY:
          serviceImpl.doIdentity((com.microservice.auth_proto.IdentityRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.auth_proto.IdentityResponse>) responseObserver);
          break;
        case METHODID_IS_ADMIN:
          serviceImpl.isAdmin((com.microservice.auth_proto.IsAdminRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.auth_proto.IsAdminResponse>) responseObserver);
          break;
        case METHODID_POST_REGISTER:
          serviceImpl.postRegister((com.microservice.auth_proto.RegisterRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.auth_proto.RegisterResponse>) responseObserver);
          break;
        case METHODID_POST_LOGIN:
          serviceImpl.postLogin((com.microservice.auth_proto.LoginRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.auth_proto.LoginResponse>) responseObserver);
          break;
        case METHODID_GET_PROFILE:
          serviceImpl.getProfile((com.microservice.auth_proto.ProfileRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.auth_proto.ProfileResponse>) responseObserver);
          break;
        case METHODID_FORGOT_PASSWORD:
          serviceImpl.forgotPassword((com.microservice.auth_proto.ForgotPasswordRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.auth_proto.ForgotPasswordResponse>) responseObserver);
          break;
        case METHODID_RESET_PASSWORD:
          serviceImpl.resetPassword((com.microservice.auth_proto.ResetPasswordRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.auth_proto.ResetPasswordResponse>) responseObserver);
          break;
        case METHODID_VERIFY_EMAIL:
          serviceImpl.verifyEmail((com.microservice.auth_proto.VerifyEmailRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.auth_proto.VerifyEmailResponse>) responseObserver);
          break;
        case METHODID_REFRESH_TOKEN:
          serviceImpl.refreshToken((com.microservice.auth_proto.RefreshTokenRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.auth_proto.RefreshTokenResponse>) responseObserver);
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
          getDoAuthenticateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.auth_proto.AuthenticateRequest,
              com.microservice.auth_proto.AuthenticateResponse>(
                service, METHODID_DO_AUTHENTICATE)))
        .addMethod(
          getDoIdentityMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.auth_proto.IdentityRequest,
              com.microservice.auth_proto.IdentityResponse>(
                service, METHODID_DO_IDENTITY)))
        .addMethod(
          getIsAdminMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.auth_proto.IsAdminRequest,
              com.microservice.auth_proto.IsAdminResponse>(
                service, METHODID_IS_ADMIN)))
        .addMethod(
          getPostRegisterMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.auth_proto.RegisterRequest,
              com.microservice.auth_proto.RegisterResponse>(
                service, METHODID_POST_REGISTER)))
        .addMethod(
          getPostLoginMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.auth_proto.LoginRequest,
              com.microservice.auth_proto.LoginResponse>(
                service, METHODID_POST_LOGIN)))
        .addMethod(
          getGetProfileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.auth_proto.ProfileRequest,
              com.microservice.auth_proto.ProfileResponse>(
                service, METHODID_GET_PROFILE)))
        .addMethod(
          getForgotPasswordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.auth_proto.ForgotPasswordRequest,
              com.microservice.auth_proto.ForgotPasswordResponse>(
                service, METHODID_FORGOT_PASSWORD)))
        .addMethod(
          getResetPasswordMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.auth_proto.ResetPasswordRequest,
              com.microservice.auth_proto.ResetPasswordResponse>(
                service, METHODID_RESET_PASSWORD)))
        .addMethod(
          getVerifyEmailMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.auth_proto.VerifyEmailRequest,
              com.microservice.auth_proto.VerifyEmailResponse>(
                service, METHODID_VERIFY_EMAIL)))
        .addMethod(
          getRefreshTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.auth_proto.RefreshTokenRequest,
              com.microservice.auth_proto.RefreshTokenResponse>(
                service, METHODID_REFRESH_TOKEN)))
        .build();
  }

  private static abstract class AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuthServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.microservice.auth_proto.AuthProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AuthService");
    }
  }

  private static final class AuthServiceFileDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier {
    AuthServiceFileDescriptorSupplier() {}
  }

  private static final class AuthServiceMethodDescriptorSupplier
      extends AuthServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    AuthServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (AuthServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuthServiceFileDescriptorSupplier())
              .addMethod(getDoAuthenticateMethod())
              .addMethod(getDoIdentityMethod())
              .addMethod(getIsAdminMethod())
              .addMethod(getPostRegisterMethod())
              .addMethod(getPostLoginMethod())
              .addMethod(getGetProfileMethod())
              .addMethod(getForgotPasswordMethod())
              .addMethod(getResetPasswordMethod())
              .addMethod(getVerifyEmailMethod())
              .addMethod(getRefreshTokenMethod())
              .build();
        }
      }
    }
    return result;
  }
}
