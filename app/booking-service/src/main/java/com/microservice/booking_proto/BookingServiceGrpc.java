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

  private static volatile io.grpc.MethodDescriptor<com.microservice.booking_proto.CreateShowtimeRequest,
      com.microservice.booking_proto.CreateShowtimeResponse> getCreateShowtimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createShowtime",
      requestType = com.microservice.booking_proto.CreateShowtimeRequest.class,
      responseType = com.microservice.booking_proto.CreateShowtimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.booking_proto.CreateShowtimeRequest,
      com.microservice.booking_proto.CreateShowtimeResponse> getCreateShowtimeMethod() {
    io.grpc.MethodDescriptor<com.microservice.booking_proto.CreateShowtimeRequest, com.microservice.booking_proto.CreateShowtimeResponse> getCreateShowtimeMethod;
    if ((getCreateShowtimeMethod = BookingServiceGrpc.getCreateShowtimeMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getCreateShowtimeMethod = BookingServiceGrpc.getCreateShowtimeMethod) == null) {
          BookingServiceGrpc.getCreateShowtimeMethod = getCreateShowtimeMethod =
              io.grpc.MethodDescriptor.<com.microservice.booking_proto.CreateShowtimeRequest, com.microservice.booking_proto.CreateShowtimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createShowtime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.CreateShowtimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.CreateShowtimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("createShowtime"))
              .build();
        }
      }
    }
    return getCreateShowtimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservice.booking_proto.GetShowtimeRequest,
      com.microservice.booking_proto.GetShowtimeResponse> getGetShowtimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getShowtime",
      requestType = com.microservice.booking_proto.GetShowtimeRequest.class,
      responseType = com.microservice.booking_proto.GetShowtimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.booking_proto.GetShowtimeRequest,
      com.microservice.booking_proto.GetShowtimeResponse> getGetShowtimeMethod() {
    io.grpc.MethodDescriptor<com.microservice.booking_proto.GetShowtimeRequest, com.microservice.booking_proto.GetShowtimeResponse> getGetShowtimeMethod;
    if ((getGetShowtimeMethod = BookingServiceGrpc.getGetShowtimeMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getGetShowtimeMethod = BookingServiceGrpc.getGetShowtimeMethod) == null) {
          BookingServiceGrpc.getGetShowtimeMethod = getGetShowtimeMethod =
              io.grpc.MethodDescriptor.<com.microservice.booking_proto.GetShowtimeRequest, com.microservice.booking_proto.GetShowtimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getShowtime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.GetShowtimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.GetShowtimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("getShowtime"))
              .build();
        }
      }
    }
    return getGetShowtimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservice.booking_proto.GetShowtimesRequest,
      com.microservice.booking_proto.GetShowtimesResponse> getGetShowtimesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getShowtimes",
      requestType = com.microservice.booking_proto.GetShowtimesRequest.class,
      responseType = com.microservice.booking_proto.GetShowtimesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.booking_proto.GetShowtimesRequest,
      com.microservice.booking_proto.GetShowtimesResponse> getGetShowtimesMethod() {
    io.grpc.MethodDescriptor<com.microservice.booking_proto.GetShowtimesRequest, com.microservice.booking_proto.GetShowtimesResponse> getGetShowtimesMethod;
    if ((getGetShowtimesMethod = BookingServiceGrpc.getGetShowtimesMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getGetShowtimesMethod = BookingServiceGrpc.getGetShowtimesMethod) == null) {
          BookingServiceGrpc.getGetShowtimesMethod = getGetShowtimesMethod =
              io.grpc.MethodDescriptor.<com.microservice.booking_proto.GetShowtimesRequest, com.microservice.booking_proto.GetShowtimesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getShowtimes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.GetShowtimesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.GetShowtimesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("getShowtimes"))
              .build();
        }
      }
    }
    return getGetShowtimesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservice.booking_proto.UpdateShowtimeRequest,
      com.microservice.booking_proto.UpdateShowtimeResponse> getUpdateShowtimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "updateShowtime",
      requestType = com.microservice.booking_proto.UpdateShowtimeRequest.class,
      responseType = com.microservice.booking_proto.UpdateShowtimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.booking_proto.UpdateShowtimeRequest,
      com.microservice.booking_proto.UpdateShowtimeResponse> getUpdateShowtimeMethod() {
    io.grpc.MethodDescriptor<com.microservice.booking_proto.UpdateShowtimeRequest, com.microservice.booking_proto.UpdateShowtimeResponse> getUpdateShowtimeMethod;
    if ((getUpdateShowtimeMethod = BookingServiceGrpc.getUpdateShowtimeMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getUpdateShowtimeMethod = BookingServiceGrpc.getUpdateShowtimeMethod) == null) {
          BookingServiceGrpc.getUpdateShowtimeMethod = getUpdateShowtimeMethod =
              io.grpc.MethodDescriptor.<com.microservice.booking_proto.UpdateShowtimeRequest, com.microservice.booking_proto.UpdateShowtimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "updateShowtime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.UpdateShowtimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.UpdateShowtimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("updateShowtime"))
              .build();
        }
      }
    }
    return getUpdateShowtimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservice.booking_proto.DeleteShowtimeRequest,
      com.microservice.booking_proto.DeleteShowtimeResponse> getDeleteShowtimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteShowtime",
      requestType = com.microservice.booking_proto.DeleteShowtimeRequest.class,
      responseType = com.microservice.booking_proto.DeleteShowtimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.booking_proto.DeleteShowtimeRequest,
      com.microservice.booking_proto.DeleteShowtimeResponse> getDeleteShowtimeMethod() {
    io.grpc.MethodDescriptor<com.microservice.booking_proto.DeleteShowtimeRequest, com.microservice.booking_proto.DeleteShowtimeResponse> getDeleteShowtimeMethod;
    if ((getDeleteShowtimeMethod = BookingServiceGrpc.getDeleteShowtimeMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getDeleteShowtimeMethod = BookingServiceGrpc.getDeleteShowtimeMethod) == null) {
          BookingServiceGrpc.getDeleteShowtimeMethod = getDeleteShowtimeMethod =
              io.grpc.MethodDescriptor.<com.microservice.booking_proto.DeleteShowtimeRequest, com.microservice.booking_proto.DeleteShowtimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteShowtime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.DeleteShowtimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.DeleteShowtimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("deleteShowtime"))
              .build();
        }
      }
    }
    return getDeleteShowtimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservice.booking_proto.SearchShowtimesRequest,
      com.microservice.booking_proto.SearchShowtimesResponse> getSearchShowtimesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "searchShowtimes",
      requestType = com.microservice.booking_proto.SearchShowtimesRequest.class,
      responseType = com.microservice.booking_proto.SearchShowtimesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.booking_proto.SearchShowtimesRequest,
      com.microservice.booking_proto.SearchShowtimesResponse> getSearchShowtimesMethod() {
    io.grpc.MethodDescriptor<com.microservice.booking_proto.SearchShowtimesRequest, com.microservice.booking_proto.SearchShowtimesResponse> getSearchShowtimesMethod;
    if ((getSearchShowtimesMethod = BookingServiceGrpc.getSearchShowtimesMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getSearchShowtimesMethod = BookingServiceGrpc.getSearchShowtimesMethod) == null) {
          BookingServiceGrpc.getSearchShowtimesMethod = getSearchShowtimesMethod =
              io.grpc.MethodDescriptor.<com.microservice.booking_proto.SearchShowtimesRequest, com.microservice.booking_proto.SearchShowtimesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "searchShowtimes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.SearchShowtimesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.SearchShowtimesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("searchShowtimes"))
              .build();
        }
      }
    }
    return getSearchShowtimesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservice.booking_proto.GetMovieShowtimesRequest,
      com.microservice.booking_proto.GetMovieShowtimesResponse> getGetMovieShowtimesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getMovieShowtimes",
      requestType = com.microservice.booking_proto.GetMovieShowtimesRequest.class,
      responseType = com.microservice.booking_proto.GetMovieShowtimesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.booking_proto.GetMovieShowtimesRequest,
      com.microservice.booking_proto.GetMovieShowtimesResponse> getGetMovieShowtimesMethod() {
    io.grpc.MethodDescriptor<com.microservice.booking_proto.GetMovieShowtimesRequest, com.microservice.booking_proto.GetMovieShowtimesResponse> getGetMovieShowtimesMethod;
    if ((getGetMovieShowtimesMethod = BookingServiceGrpc.getGetMovieShowtimesMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getGetMovieShowtimesMethod = BookingServiceGrpc.getGetMovieShowtimesMethod) == null) {
          BookingServiceGrpc.getGetMovieShowtimesMethod = getGetMovieShowtimesMethod =
              io.grpc.MethodDescriptor.<com.microservice.booking_proto.GetMovieShowtimesRequest, com.microservice.booking_proto.GetMovieShowtimesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getMovieShowtimes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.GetMovieShowtimesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.GetMovieShowtimesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("getMovieShowtimes"))
              .build();
        }
      }
    }
    return getGetMovieShowtimesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservice.booking_proto.GetBookingByShowtimeRequest,
      com.microservice.booking_proto.GetBookingByShowtimeResponse> getGetBookingByShowtimeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBookingByShowtime",
      requestType = com.microservice.booking_proto.GetBookingByShowtimeRequest.class,
      responseType = com.microservice.booking_proto.GetBookingByShowtimeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.booking_proto.GetBookingByShowtimeRequest,
      com.microservice.booking_proto.GetBookingByShowtimeResponse> getGetBookingByShowtimeMethod() {
    io.grpc.MethodDescriptor<com.microservice.booking_proto.GetBookingByShowtimeRequest, com.microservice.booking_proto.GetBookingByShowtimeResponse> getGetBookingByShowtimeMethod;
    if ((getGetBookingByShowtimeMethod = BookingServiceGrpc.getGetBookingByShowtimeMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getGetBookingByShowtimeMethod = BookingServiceGrpc.getGetBookingByShowtimeMethod) == null) {
          BookingServiceGrpc.getGetBookingByShowtimeMethod = getGetBookingByShowtimeMethod =
              io.grpc.MethodDescriptor.<com.microservice.booking_proto.GetBookingByShowtimeRequest, com.microservice.booking_proto.GetBookingByShowtimeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getBookingByShowtime"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.GetBookingByShowtimeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.GetBookingByShowtimeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("getBookingByShowtime"))
              .build();
        }
      }
    }
    return getGetBookingByShowtimeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservice.booking_proto.HandlePreSeatReservationRequest,
      com.microservice.booking_proto.HandlePreSeatReservationResponse> getHandlePreSeatReservationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "handlePreSeatReservation",
      requestType = com.microservice.booking_proto.HandlePreSeatReservationRequest.class,
      responseType = com.microservice.booking_proto.HandlePreSeatReservationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.booking_proto.HandlePreSeatReservationRequest,
      com.microservice.booking_proto.HandlePreSeatReservationResponse> getHandlePreSeatReservationMethod() {
    io.grpc.MethodDescriptor<com.microservice.booking_proto.HandlePreSeatReservationRequest, com.microservice.booking_proto.HandlePreSeatReservationResponse> getHandlePreSeatReservationMethod;
    if ((getHandlePreSeatReservationMethod = BookingServiceGrpc.getHandlePreSeatReservationMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getHandlePreSeatReservationMethod = BookingServiceGrpc.getHandlePreSeatReservationMethod) == null) {
          BookingServiceGrpc.getHandlePreSeatReservationMethod = getHandlePreSeatReservationMethod =
              io.grpc.MethodDescriptor.<com.microservice.booking_proto.HandlePreSeatReservationRequest, com.microservice.booking_proto.HandlePreSeatReservationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "handlePreSeatReservation"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.HandlePreSeatReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.HandlePreSeatReservationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("handlePreSeatReservation"))
              .build();
        }
      }
    }
    return getHandlePreSeatReservationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservice.booking_proto.HandleDeclareQueueRequest,
      com.microservice.booking_proto.HandleDeclareQueueResponse> getHandleDeclareQueueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "handleDeclareQueue",
      requestType = com.microservice.booking_proto.HandleDeclareQueueRequest.class,
      responseType = com.microservice.booking_proto.HandleDeclareQueueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.booking_proto.HandleDeclareQueueRequest,
      com.microservice.booking_proto.HandleDeclareQueueResponse> getHandleDeclareQueueMethod() {
    io.grpc.MethodDescriptor<com.microservice.booking_proto.HandleDeclareQueueRequest, com.microservice.booking_proto.HandleDeclareQueueResponse> getHandleDeclareQueueMethod;
    if ((getHandleDeclareQueueMethod = BookingServiceGrpc.getHandleDeclareQueueMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getHandleDeclareQueueMethod = BookingServiceGrpc.getHandleDeclareQueueMethod) == null) {
          BookingServiceGrpc.getHandleDeclareQueueMethod = getHandleDeclareQueueMethod =
              io.grpc.MethodDescriptor.<com.microservice.booking_proto.HandleDeclareQueueRequest, com.microservice.booking_proto.HandleDeclareQueueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "handleDeclareQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.HandleDeclareQueueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.HandleDeclareQueueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("handleDeclareQueue"))
              .build();
        }
      }
    }
    return getHandleDeclareQueueMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.microservice.booking_proto.HandleRemoveQueueRequest,
      com.microservice.booking_proto.HandleRemoveQueueResponse> getHandleRemoveQueueMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "handleRemoveQueue",
      requestType = com.microservice.booking_proto.HandleRemoveQueueRequest.class,
      responseType = com.microservice.booking_proto.HandleRemoveQueueResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.microservice.booking_proto.HandleRemoveQueueRequest,
      com.microservice.booking_proto.HandleRemoveQueueResponse> getHandleRemoveQueueMethod() {
    io.grpc.MethodDescriptor<com.microservice.booking_proto.HandleRemoveQueueRequest, com.microservice.booking_proto.HandleRemoveQueueResponse> getHandleRemoveQueueMethod;
    if ((getHandleRemoveQueueMethod = BookingServiceGrpc.getHandleRemoveQueueMethod) == null) {
      synchronized (BookingServiceGrpc.class) {
        if ((getHandleRemoveQueueMethod = BookingServiceGrpc.getHandleRemoveQueueMethod) == null) {
          BookingServiceGrpc.getHandleRemoveQueueMethod = getHandleRemoveQueueMethod =
              io.grpc.MethodDescriptor.<com.microservice.booking_proto.HandleRemoveQueueRequest, com.microservice.booking_proto.HandleRemoveQueueResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "handleRemoveQueue"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.HandleRemoveQueueRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.microservice.booking_proto.HandleRemoveQueueResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BookingServiceMethodDescriptorSupplier("handleRemoveQueue"))
              .build();
        }
      }
    }
    return getHandleRemoveQueueMethod;
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

    /**
     */
    default void createShowtime(com.microservice.booking_proto.CreateShowtimeRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.CreateShowtimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateShowtimeMethod(), responseObserver);
    }

    /**
     */
    default void getShowtime(com.microservice.booking_proto.GetShowtimeRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.GetShowtimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetShowtimeMethod(), responseObserver);
    }

    /**
     */
    default void getShowtimes(com.microservice.booking_proto.GetShowtimesRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.GetShowtimesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetShowtimesMethod(), responseObserver);
    }

    /**
     */
    default void updateShowtime(com.microservice.booking_proto.UpdateShowtimeRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.UpdateShowtimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateShowtimeMethod(), responseObserver);
    }

    /**
     */
    default void deleteShowtime(com.microservice.booking_proto.DeleteShowtimeRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.DeleteShowtimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteShowtimeMethod(), responseObserver);
    }

    /**
     */
    default void searchShowtimes(com.microservice.booking_proto.SearchShowtimesRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.SearchShowtimesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSearchShowtimesMethod(), responseObserver);
    }

    /**
     */
    default void getMovieShowtimes(com.microservice.booking_proto.GetMovieShowtimesRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.GetMovieShowtimesResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetMovieShowtimesMethod(), responseObserver);
    }

    /**
     */
    default void getBookingByShowtime(com.microservice.booking_proto.GetBookingByShowtimeRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.GetBookingByShowtimeResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBookingByShowtimeMethod(), responseObserver);
    }

    /**
     */
    default void handlePreSeatReservation(com.microservice.booking_proto.HandlePreSeatReservationRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.HandlePreSeatReservationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHandlePreSeatReservationMethod(), responseObserver);
    }

    /**
     */
    default void handleDeclareQueue(com.microservice.booking_proto.HandleDeclareQueueRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.HandleDeclareQueueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHandleDeclareQueueMethod(), responseObserver);
    }

    /**
     */
    default void handleRemoveQueue(com.microservice.booking_proto.HandleRemoveQueueRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.HandleRemoveQueueResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHandleRemoveQueueMethod(), responseObserver);
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

    /**
     */
    public void createShowtime(com.microservice.booking_proto.CreateShowtimeRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.CreateShowtimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateShowtimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getShowtime(com.microservice.booking_proto.GetShowtimeRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.GetShowtimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetShowtimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getShowtimes(com.microservice.booking_proto.GetShowtimesRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.GetShowtimesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetShowtimesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateShowtime(com.microservice.booking_proto.UpdateShowtimeRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.UpdateShowtimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateShowtimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteShowtime(com.microservice.booking_proto.DeleteShowtimeRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.DeleteShowtimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteShowtimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void searchShowtimes(com.microservice.booking_proto.SearchShowtimesRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.SearchShowtimesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSearchShowtimesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getMovieShowtimes(com.microservice.booking_proto.GetMovieShowtimesRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.GetMovieShowtimesResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetMovieShowtimesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBookingByShowtime(com.microservice.booking_proto.GetBookingByShowtimeRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.GetBookingByShowtimeResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBookingByShowtimeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void handlePreSeatReservation(com.microservice.booking_proto.HandlePreSeatReservationRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.HandlePreSeatReservationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHandlePreSeatReservationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void handleDeclareQueue(com.microservice.booking_proto.HandleDeclareQueueRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.HandleDeclareQueueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHandleDeclareQueueMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void handleRemoveQueue(com.microservice.booking_proto.HandleRemoveQueueRequest request,
        io.grpc.stub.StreamObserver<com.microservice.booking_proto.HandleRemoveQueueResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHandleRemoveQueueMethod(), getCallOptions()), request, responseObserver);
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

    /**
     */
    public com.microservice.booking_proto.CreateShowtimeResponse createShowtime(com.microservice.booking_proto.CreateShowtimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateShowtimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservice.booking_proto.GetShowtimeResponse getShowtime(com.microservice.booking_proto.GetShowtimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetShowtimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservice.booking_proto.GetShowtimesResponse getShowtimes(com.microservice.booking_proto.GetShowtimesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetShowtimesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservice.booking_proto.UpdateShowtimeResponse updateShowtime(com.microservice.booking_proto.UpdateShowtimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateShowtimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservice.booking_proto.DeleteShowtimeResponse deleteShowtime(com.microservice.booking_proto.DeleteShowtimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteShowtimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservice.booking_proto.SearchShowtimesResponse searchShowtimes(com.microservice.booking_proto.SearchShowtimesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSearchShowtimesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservice.booking_proto.GetMovieShowtimesResponse getMovieShowtimes(com.microservice.booking_proto.GetMovieShowtimesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetMovieShowtimesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservice.booking_proto.GetBookingByShowtimeResponse getBookingByShowtime(com.microservice.booking_proto.GetBookingByShowtimeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBookingByShowtimeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservice.booking_proto.HandlePreSeatReservationResponse handlePreSeatReservation(com.microservice.booking_proto.HandlePreSeatReservationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHandlePreSeatReservationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservice.booking_proto.HandleDeclareQueueResponse handleDeclareQueue(com.microservice.booking_proto.HandleDeclareQueueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHandleDeclareQueueMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.microservice.booking_proto.HandleRemoveQueueResponse handleRemoveQueue(com.microservice.booking_proto.HandleRemoveQueueRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHandleRemoveQueueMethod(), getCallOptions(), request);
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

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.booking_proto.CreateShowtimeResponse> createShowtime(
        com.microservice.booking_proto.CreateShowtimeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateShowtimeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.booking_proto.GetShowtimeResponse> getShowtime(
        com.microservice.booking_proto.GetShowtimeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetShowtimeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.booking_proto.GetShowtimesResponse> getShowtimes(
        com.microservice.booking_proto.GetShowtimesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetShowtimesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.booking_proto.UpdateShowtimeResponse> updateShowtime(
        com.microservice.booking_proto.UpdateShowtimeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateShowtimeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.booking_proto.DeleteShowtimeResponse> deleteShowtime(
        com.microservice.booking_proto.DeleteShowtimeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteShowtimeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.booking_proto.SearchShowtimesResponse> searchShowtimes(
        com.microservice.booking_proto.SearchShowtimesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSearchShowtimesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.booking_proto.GetMovieShowtimesResponse> getMovieShowtimes(
        com.microservice.booking_proto.GetMovieShowtimesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetMovieShowtimesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.booking_proto.GetBookingByShowtimeResponse> getBookingByShowtime(
        com.microservice.booking_proto.GetBookingByShowtimeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBookingByShowtimeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.booking_proto.HandlePreSeatReservationResponse> handlePreSeatReservation(
        com.microservice.booking_proto.HandlePreSeatReservationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHandlePreSeatReservationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.booking_proto.HandleDeclareQueueResponse> handleDeclareQueue(
        com.microservice.booking_proto.HandleDeclareQueueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHandleDeclareQueueMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.microservice.booking_proto.HandleRemoveQueueResponse> handleRemoveQueue(
        com.microservice.booking_proto.HandleRemoveQueueRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHandleRemoveQueueMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CINEMA = 0;
  private static final int METHODID_GET_CINEMAS = 1;
  private static final int METHODID_GET_CINEMA = 2;
  private static final int METHODID_SEARCH_CINEMAS = 3;
  private static final int METHODID_UPDATE_CINEMA = 4;
  private static final int METHODID_CREATE_SHOWTIME = 5;
  private static final int METHODID_GET_SHOWTIME = 6;
  private static final int METHODID_GET_SHOWTIMES = 7;
  private static final int METHODID_UPDATE_SHOWTIME = 8;
  private static final int METHODID_DELETE_SHOWTIME = 9;
  private static final int METHODID_SEARCH_SHOWTIMES = 10;
  private static final int METHODID_GET_MOVIE_SHOWTIMES = 11;
  private static final int METHODID_GET_BOOKING_BY_SHOWTIME = 12;
  private static final int METHODID_HANDLE_PRE_SEAT_RESERVATION = 13;
  private static final int METHODID_HANDLE_DECLARE_QUEUE = 14;
  private static final int METHODID_HANDLE_REMOVE_QUEUE = 15;

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
        case METHODID_CREATE_SHOWTIME:
          serviceImpl.createShowtime((com.microservice.booking_proto.CreateShowtimeRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.booking_proto.CreateShowtimeResponse>) responseObserver);
          break;
        case METHODID_GET_SHOWTIME:
          serviceImpl.getShowtime((com.microservice.booking_proto.GetShowtimeRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.booking_proto.GetShowtimeResponse>) responseObserver);
          break;
        case METHODID_GET_SHOWTIMES:
          serviceImpl.getShowtimes((com.microservice.booking_proto.GetShowtimesRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.booking_proto.GetShowtimesResponse>) responseObserver);
          break;
        case METHODID_UPDATE_SHOWTIME:
          serviceImpl.updateShowtime((com.microservice.booking_proto.UpdateShowtimeRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.booking_proto.UpdateShowtimeResponse>) responseObserver);
          break;
        case METHODID_DELETE_SHOWTIME:
          serviceImpl.deleteShowtime((com.microservice.booking_proto.DeleteShowtimeRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.booking_proto.DeleteShowtimeResponse>) responseObserver);
          break;
        case METHODID_SEARCH_SHOWTIMES:
          serviceImpl.searchShowtimes((com.microservice.booking_proto.SearchShowtimesRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.booking_proto.SearchShowtimesResponse>) responseObserver);
          break;
        case METHODID_GET_MOVIE_SHOWTIMES:
          serviceImpl.getMovieShowtimes((com.microservice.booking_proto.GetMovieShowtimesRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.booking_proto.GetMovieShowtimesResponse>) responseObserver);
          break;
        case METHODID_GET_BOOKING_BY_SHOWTIME:
          serviceImpl.getBookingByShowtime((com.microservice.booking_proto.GetBookingByShowtimeRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.booking_proto.GetBookingByShowtimeResponse>) responseObserver);
          break;
        case METHODID_HANDLE_PRE_SEAT_RESERVATION:
          serviceImpl.handlePreSeatReservation((com.microservice.booking_proto.HandlePreSeatReservationRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.booking_proto.HandlePreSeatReservationResponse>) responseObserver);
          break;
        case METHODID_HANDLE_DECLARE_QUEUE:
          serviceImpl.handleDeclareQueue((com.microservice.booking_proto.HandleDeclareQueueRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.booking_proto.HandleDeclareQueueResponse>) responseObserver);
          break;
        case METHODID_HANDLE_REMOVE_QUEUE:
          serviceImpl.handleRemoveQueue((com.microservice.booking_proto.HandleRemoveQueueRequest) request,
              (io.grpc.stub.StreamObserver<com.microservice.booking_proto.HandleRemoveQueueResponse>) responseObserver);
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
        .addMethod(
          getCreateShowtimeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.booking_proto.CreateShowtimeRequest,
              com.microservice.booking_proto.CreateShowtimeResponse>(
                service, METHODID_CREATE_SHOWTIME)))
        .addMethod(
          getGetShowtimeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.booking_proto.GetShowtimeRequest,
              com.microservice.booking_proto.GetShowtimeResponse>(
                service, METHODID_GET_SHOWTIME)))
        .addMethod(
          getGetShowtimesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.booking_proto.GetShowtimesRequest,
              com.microservice.booking_proto.GetShowtimesResponse>(
                service, METHODID_GET_SHOWTIMES)))
        .addMethod(
          getUpdateShowtimeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.booking_proto.UpdateShowtimeRequest,
              com.microservice.booking_proto.UpdateShowtimeResponse>(
                service, METHODID_UPDATE_SHOWTIME)))
        .addMethod(
          getDeleteShowtimeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.booking_proto.DeleteShowtimeRequest,
              com.microservice.booking_proto.DeleteShowtimeResponse>(
                service, METHODID_DELETE_SHOWTIME)))
        .addMethod(
          getSearchShowtimesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.booking_proto.SearchShowtimesRequest,
              com.microservice.booking_proto.SearchShowtimesResponse>(
                service, METHODID_SEARCH_SHOWTIMES)))
        .addMethod(
          getGetMovieShowtimesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.booking_proto.GetMovieShowtimesRequest,
              com.microservice.booking_proto.GetMovieShowtimesResponse>(
                service, METHODID_GET_MOVIE_SHOWTIMES)))
        .addMethod(
          getGetBookingByShowtimeMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.booking_proto.GetBookingByShowtimeRequest,
              com.microservice.booking_proto.GetBookingByShowtimeResponse>(
                service, METHODID_GET_BOOKING_BY_SHOWTIME)))
        .addMethod(
          getHandlePreSeatReservationMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.booking_proto.HandlePreSeatReservationRequest,
              com.microservice.booking_proto.HandlePreSeatReservationResponse>(
                service, METHODID_HANDLE_PRE_SEAT_RESERVATION)))
        .addMethod(
          getHandleDeclareQueueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.booking_proto.HandleDeclareQueueRequest,
              com.microservice.booking_proto.HandleDeclareQueueResponse>(
                service, METHODID_HANDLE_DECLARE_QUEUE)))
        .addMethod(
          getHandleRemoveQueueMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.microservice.booking_proto.HandleRemoveQueueRequest,
              com.microservice.booking_proto.HandleRemoveQueueResponse>(
                service, METHODID_HANDLE_REMOVE_QUEUE)))
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
              .addMethod(getCreateShowtimeMethod())
              .addMethod(getGetShowtimeMethod())
              .addMethod(getGetShowtimesMethod())
              .addMethod(getUpdateShowtimeMethod())
              .addMethod(getDeleteShowtimeMethod())
              .addMethod(getSearchShowtimesMethod())
              .addMethod(getGetMovieShowtimesMethod())
              .addMethod(getGetBookingByShowtimeMethod())
              .addMethod(getHandlePreSeatReservationMethod())
              .addMethod(getHandleDeclareQueueMethod())
              .addMethod(getHandleRemoveQueueMethod())
              .build();
        }
      }
    }
    return result;
  }
}
