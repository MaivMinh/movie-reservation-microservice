// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: booking.proto

package com.microservice.booking_proto;

public interface CreateShowtimeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:net.devh.boot.grpc.example.CreateShowtimeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 roomId = 1;</code>
   * @return The roomId.
   */
  int getRoomId();

  /**
   * <code>int32 movieId = 2;</code>
   * @return The movieId.
   */
  int getMovieId();

  /**
   * <code>string startTime = 3;</code>
   * @return The startTime.
   */
  java.lang.String getStartTime();
  /**
   * <code>string startTime = 3;</code>
   * @return The bytes for startTime.
   */
  com.google.protobuf.ByteString
      getStartTimeBytes();

  /**
   * <code>string endTime = 4;</code>
   * @return The endTime.
   */
  java.lang.String getEndTime();
  /**
   * <code>string endTime = 4;</code>
   * @return The bytes for endTime.
   */
  com.google.protobuf.ByteString
      getEndTimeBytes();

  /**
   * <code>int64 date = 5;</code>
   * @return The date.
   */
  long getDate();
}
