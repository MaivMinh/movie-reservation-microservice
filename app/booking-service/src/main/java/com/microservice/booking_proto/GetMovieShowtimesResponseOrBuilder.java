// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: booking.proto

package com.microservice.booking_proto;

public interface GetMovieShowtimesResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:net.devh.boot.grpc.example.GetMovieShowtimesResponse)
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
   * <code>repeated .net.devh.boot.grpc.example.Showtime showtimes = 3;</code>
   */
  java.util.List<com.microservice.booking_proto.Showtime> 
      getShowtimesList();
  /**
   * <code>repeated .net.devh.boot.grpc.example.Showtime showtimes = 3;</code>
   */
  com.microservice.booking_proto.Showtime getShowtimes(int index);
  /**
   * <code>repeated .net.devh.boot.grpc.example.Showtime showtimes = 3;</code>
   */
  int getShowtimesCount();
  /**
   * <code>repeated .net.devh.boot.grpc.example.Showtime showtimes = 3;</code>
   */
  java.util.List<? extends com.microservice.booking_proto.ShowtimeOrBuilder> 
      getShowtimesOrBuilderList();
  /**
   * <code>repeated .net.devh.boot.grpc.example.Showtime showtimes = 3;</code>
   */
  com.microservice.booking_proto.ShowtimeOrBuilder getShowtimesOrBuilder(
      int index);
}
