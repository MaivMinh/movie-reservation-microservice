// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth.proto

package com.microservice.auth_proto;

public interface IdentityResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:net.devh.boot.grpc.example.IdentityResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool active = 1;</code>
   * @return The active.
   */
  boolean getActive();

  /**
   * <code>string roles = 2;</code>
   * @return The roles.
   */
  java.lang.String getRoles();
  /**
   * <code>string roles = 2;</code>
   * @return The bytes for roles.
   */
  com.google.protobuf.ByteString
      getRolesBytes();
}
