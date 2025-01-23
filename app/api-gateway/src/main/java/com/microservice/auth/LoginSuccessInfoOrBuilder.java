// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth.proto

package com.microservice.auth;

public interface LoginSuccessInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:net.devh.boot.grpc.example.LoginSuccessInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string accessToken = 1;</code>
   * @return The accessToken.
   */
  java.lang.String getAccessToken();
  /**
   * <code>string accessToken = 1;</code>
   * @return The bytes for accessToken.
   */
  com.google.protobuf.ByteString
      getAccessTokenBytes();

  /**
   * <code>string refreshToken = 2;</code>
   * @return The refreshToken.
   */
  java.lang.String getRefreshToken();
  /**
   * <code>string refreshToken = 2;</code>
   * @return The bytes for refreshToken.
   */
  com.google.protobuf.ByteString
      getRefreshTokenBytes();

  /**
   * <code>int64 expiresIn = 3;</code>
   * @return The expiresIn.
   */
  long getExpiresIn();

  /**
   * <code>string tokenType = 4;</code>
   * @return The tokenType.
   */
  java.lang.String getTokenType();
  /**
   * <code>string tokenType = 4;</code>
   * @return The bytes for tokenType.
   */
  com.google.protobuf.ByteString
      getTokenTypeBytes();
}
