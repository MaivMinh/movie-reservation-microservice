// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: booking.proto

package com.microservice.booking_proto;

public interface GetCinemasResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:net.devh.boot.grpc.example.GetCinemasResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 status = 1;</code>
   * @return The status.
   */
  int getStatus();

  /**
   * <code>string message = 2;</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>repeated .net.devh.boot.grpc.example.Cinema cinemas = 3;</code>
   */
  java.util.List<com.microservice.booking_proto.Cinema> 
      getCinemasList();
  /**
   * <code>repeated .net.devh.boot.grpc.example.Cinema cinemas = 3;</code>
   */
  com.microservice.booking_proto.Cinema getCinemas(int index);
  /**
   * <code>repeated .net.devh.boot.grpc.example.Cinema cinemas = 3;</code>
   */
  int getCinemasCount();
  /**
   * <code>repeated .net.devh.boot.grpc.example.Cinema cinemas = 3;</code>
   */
  java.util.List<? extends com.microservice.booking_proto.CinemaOrBuilder> 
      getCinemasOrBuilderList();
  /**
   * <code>repeated .net.devh.boot.grpc.example.Cinema cinemas = 3;</code>
   */
  com.microservice.booking_proto.CinemaOrBuilder getCinemasOrBuilder(
      int index);

  /**
   * <code>int64 totalElement = 4;</code>
   * @return The totalElement.
   */
  long getTotalElement();

  /**
   * <code>int64 totalPage = 5;</code>
   * @return The totalPage.
   */
  long getTotalPage();
}
