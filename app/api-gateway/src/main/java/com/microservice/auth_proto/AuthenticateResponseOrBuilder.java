// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth.proto

package com.microservice.auth_proto;

public interface AuthenticateResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:net.devh.boot.grpc.example.AuthenticateResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool isValid = 1;</code>
   * @return The isValid.
   */
  boolean getIsValid();

  /**
   * <code>string userId = 2;</code>
   * @return The userId.
   */
  java.lang.String getUserId();
  /**
   * <code>string userId = 2;</code>
   * @return The bytes for userId.
   */
  com.google.protobuf.ByteString
      getUserIdBytes();

  /**
   * <code>int64 ttl = 3;</code>
   * @return The ttl.
   */
  long getTtl();
}
