// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth.proto

package com.microservice.auth_proto;

/**
 * Protobuf type {@code net.devh.boot.grpc.example.IdentityResponse}
 */
public final class IdentityResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:net.devh.boot.grpc.example.IdentityResponse)
    IdentityResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IdentityResponse.newBuilder() to construct.
  private IdentityResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IdentityResponse() {
    roles_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IdentityResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.microservice.auth_proto.AuthProto.internal_static_net_devh_boot_grpc_example_IdentityResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.microservice.auth_proto.AuthProto.internal_static_net_devh_boot_grpc_example_IdentityResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.microservice.auth_proto.IdentityResponse.class, com.microservice.auth_proto.IdentityResponse.Builder.class);
  }

  public static final int ACTIVE_FIELD_NUMBER = 1;
  private boolean active_;
  /**
   * <code>bool active = 1;</code>
   * @return The active.
   */
  @java.lang.Override
  public boolean getActive() {
    return active_;
  }

  public static final int ROLES_FIELD_NUMBER = 2;
  private volatile java.lang.Object roles_;
  /**
   * <code>string roles = 2;</code>
   * @return The roles.
   */
  @java.lang.Override
  public java.lang.String getRoles() {
    java.lang.Object ref = roles_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      roles_ = s;
      return s;
    }
  }
  /**
   * <code>string roles = 2;</code>
   * @return The bytes for roles.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRolesBytes() {
    java.lang.Object ref = roles_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      roles_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (active_ != false) {
      output.writeBool(1, active_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(roles_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, roles_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (active_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, active_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(roles_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, roles_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.microservice.auth_proto.IdentityResponse)) {
      return super.equals(obj);
    }
    com.microservice.auth_proto.IdentityResponse other = (com.microservice.auth_proto.IdentityResponse) obj;

    if (getActive()
        != other.getActive()) return false;
    if (!getRoles()
        .equals(other.getRoles())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ACTIVE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getActive());
    hash = (37 * hash) + ROLES_FIELD_NUMBER;
    hash = (53 * hash) + getRoles().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.microservice.auth_proto.IdentityResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.microservice.auth_proto.IdentityResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.microservice.auth_proto.IdentityResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.microservice.auth_proto.IdentityResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.microservice.auth_proto.IdentityResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.microservice.auth_proto.IdentityResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.microservice.auth_proto.IdentityResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.microservice.auth_proto.IdentityResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.microservice.auth_proto.IdentityResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.microservice.auth_proto.IdentityResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.microservice.auth_proto.IdentityResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.microservice.auth_proto.IdentityResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.microservice.auth_proto.IdentityResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code net.devh.boot.grpc.example.IdentityResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:net.devh.boot.grpc.example.IdentityResponse)
      com.microservice.auth_proto.IdentityResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.microservice.auth_proto.AuthProto.internal_static_net_devh_boot_grpc_example_IdentityResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.microservice.auth_proto.AuthProto.internal_static_net_devh_boot_grpc_example_IdentityResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.microservice.auth_proto.IdentityResponse.class, com.microservice.auth_proto.IdentityResponse.Builder.class);
    }

    // Construct using com.microservice.auth_proto.IdentityResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      active_ = false;

      roles_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.microservice.auth_proto.AuthProto.internal_static_net_devh_boot_grpc_example_IdentityResponse_descriptor;
    }

    @java.lang.Override
    public com.microservice.auth_proto.IdentityResponse getDefaultInstanceForType() {
      return com.microservice.auth_proto.IdentityResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.microservice.auth_proto.IdentityResponse build() {
      com.microservice.auth_proto.IdentityResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.microservice.auth_proto.IdentityResponse buildPartial() {
      com.microservice.auth_proto.IdentityResponse result = new com.microservice.auth_proto.IdentityResponse(this);
      result.active_ = active_;
      result.roles_ = roles_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.microservice.auth_proto.IdentityResponse) {
        return mergeFrom((com.microservice.auth_proto.IdentityResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.microservice.auth_proto.IdentityResponse other) {
      if (other == com.microservice.auth_proto.IdentityResponse.getDefaultInstance()) return this;
      if (other.getActive() != false) {
        setActive(other.getActive());
      }
      if (!other.getRoles().isEmpty()) {
        roles_ = other.roles_;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              active_ = input.readBool();

              break;
            } // case 8
            case 18: {
              roles_ = input.readStringRequireUtf8();

              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private boolean active_ ;
    /**
     * <code>bool active = 1;</code>
     * @return The active.
     */
    @java.lang.Override
    public boolean getActive() {
      return active_;
    }
    /**
     * <code>bool active = 1;</code>
     * @param value The active to set.
     * @return This builder for chaining.
     */
    public Builder setActive(boolean value) {
      
      active_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool active = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearActive() {
      
      active_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object roles_ = "";
    /**
     * <code>string roles = 2;</code>
     * @return The roles.
     */
    public java.lang.String getRoles() {
      java.lang.Object ref = roles_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        roles_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string roles = 2;</code>
     * @return The bytes for roles.
     */
    public com.google.protobuf.ByteString
        getRolesBytes() {
      java.lang.Object ref = roles_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        roles_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string roles = 2;</code>
     * @param value The roles to set.
     * @return This builder for chaining.
     */
    public Builder setRoles(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      roles_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string roles = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearRoles() {
      
      roles_ = getDefaultInstance().getRoles();
      onChanged();
      return this;
    }
    /**
     * <code>string roles = 2;</code>
     * @param value The bytes for roles to set.
     * @return This builder for chaining.
     */
    public Builder setRolesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      roles_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:net.devh.boot.grpc.example.IdentityResponse)
  }

  // @@protoc_insertion_point(class_scope:net.devh.boot.grpc.example.IdentityResponse)
  private static final com.microservice.auth_proto.IdentityResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.microservice.auth_proto.IdentityResponse();
  }

  public static com.microservice.auth_proto.IdentityResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IdentityResponse>
      PARSER = new com.google.protobuf.AbstractParser<IdentityResponse>() {
    @java.lang.Override
    public IdentityResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<IdentityResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IdentityResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.microservice.auth_proto.IdentityResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

