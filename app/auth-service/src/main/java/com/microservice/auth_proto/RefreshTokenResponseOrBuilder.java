// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth.proto

package com.microservice.auth_proto;

public interface RefreshTokenResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:net.devh.boot.grpc.example.RefreshTokenResponse)
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
   * <code>.net.devh.boot.grpc.example.AccessToken accessToken = 3;</code>
   * @return Whether the accessToken field is set.
   */
  boolean hasAccessToken();
  /**
   * <code>.net.devh.boot.grpc.example.AccessToken accessToken = 3;</code>
   * @return The accessToken.
   */
  com.microservice.auth_proto.AccessToken getAccessToken();
  /**
   * <code>.net.devh.boot.grpc.example.AccessToken accessToken = 3;</code>
   */
  com.microservice.auth_proto.AccessTokenOrBuilder getAccessTokenOrBuilder();
}
