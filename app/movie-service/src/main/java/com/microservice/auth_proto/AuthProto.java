// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth.proto

package com.microservice.auth_proto;

public final class AuthProto {
  private AuthProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_devh_boot_grpc_example_IdentityRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_devh_boot_grpc_example_IdentityRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_devh_boot_grpc_example_IdentityResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_devh_boot_grpc_example_IdentityResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nauth.proto\022\032net.devh.boot.grpc.example" +
      "\"!\n\017IdentityRequest\022\016\n\006userId\030\001 \001(\005\"1\n\020I" +
      "dentityResponse\022\016\n\006active\030\001 \001(\010\022\r\n\005roles" +
      "\030\002 \001(\t2v\n\013AuthService\022g\n\ndoIdentity\022+.ne" +
      "t.devh.boot.grpc.example.IdentityRequest" +
      "\032,.net.devh.boot.grpc.example.IdentityRe" +
      "sponseB*\n\033com.microservice.auth_protoB\tA" +
      "uthProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_net_devh_boot_grpc_example_IdentityRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_net_devh_boot_grpc_example_IdentityRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_devh_boot_grpc_example_IdentityRequest_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_net_devh_boot_grpc_example_IdentityResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_net_devh_boot_grpc_example_IdentityResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_devh_boot_grpc_example_IdentityResponse_descriptor,
        new java.lang.String[] { "Active", "Roles", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
