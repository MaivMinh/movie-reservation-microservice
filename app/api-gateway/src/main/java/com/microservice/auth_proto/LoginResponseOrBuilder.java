// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth.proto

package com.microservice.auth_proto;

public interface LoginResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:net.devh.boot.grpc.example.LoginResponse)
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
   * <code>.net.devh.boot.grpc.example.LoginSuccessInfo loginSuccessInfo = 3;</code>
   * @return Whether the loginSuccessInfo field is set.
   */
  boolean hasLoginSuccessInfo();
  /**
   * <code>.net.devh.boot.grpc.example.LoginSuccessInfo loginSuccessInfo = 3;</code>
   * @return The loginSuccessInfo.
   */
  com.microservice.auth_proto.LoginSuccessInfo getLoginSuccessInfo();
  /**
   * <code>.net.devh.boot.grpc.example.LoginSuccessInfo loginSuccessInfo = 3;</code>
   */
  com.microservice.auth_proto.LoginSuccessInfoOrBuilder getLoginSuccessInfoOrBuilder();
}
