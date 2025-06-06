// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: booking.proto

package com.microservice.booking_proto;

/**
 * Protobuf type {@code net.devh.boot.grpc.example.HandleRemoveQueueRequest}
 */
public final class HandleRemoveQueueRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:net.devh.boot.grpc.example.HandleRemoveQueueRequest)
    HandleRemoveQueueRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HandleRemoveQueueRequest.newBuilder() to construct.
  private HandleRemoveQueueRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HandleRemoveQueueRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HandleRemoveQueueRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.microservice.booking_proto.BookingProto.internal_static_net_devh_boot_grpc_example_HandleRemoveQueueRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.microservice.booking_proto.BookingProto.internal_static_net_devh_boot_grpc_example_HandleRemoveQueueRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.microservice.booking_proto.HandleRemoveQueueRequest.class, com.microservice.booking_proto.HandleRemoveQueueRequest.Builder.class);
  }

  public static final int ACCOUNTID_FIELD_NUMBER = 1;
  private int accountId_;
  /**
   * <code>int32 accountId = 1;</code>
   * @return The accountId.
   */
  @java.lang.Override
  public int getAccountId() {
    return accountId_;
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
    if (accountId_ != 0) {
      output.writeInt32(1, accountId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (accountId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, accountId_);
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
    if (!(obj instanceof com.microservice.booking_proto.HandleRemoveQueueRequest)) {
      return super.equals(obj);
    }
    com.microservice.booking_proto.HandleRemoveQueueRequest other = (com.microservice.booking_proto.HandleRemoveQueueRequest) obj;

    if (getAccountId()
        != other.getAccountId()) return false;
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
    hash = (37 * hash) + ACCOUNTID_FIELD_NUMBER;
    hash = (53 * hash) + getAccountId();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.microservice.booking_proto.HandleRemoveQueueRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.microservice.booking_proto.HandleRemoveQueueRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.microservice.booking_proto.HandleRemoveQueueRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.microservice.booking_proto.HandleRemoveQueueRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.microservice.booking_proto.HandleRemoveQueueRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.microservice.booking_proto.HandleRemoveQueueRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.microservice.booking_proto.HandleRemoveQueueRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.microservice.booking_proto.HandleRemoveQueueRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.microservice.booking_proto.HandleRemoveQueueRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.microservice.booking_proto.HandleRemoveQueueRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.microservice.booking_proto.HandleRemoveQueueRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.microservice.booking_proto.HandleRemoveQueueRequest parseFrom(
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
  public static Builder newBuilder(com.microservice.booking_proto.HandleRemoveQueueRequest prototype) {
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
   * Protobuf type {@code net.devh.boot.grpc.example.HandleRemoveQueueRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:net.devh.boot.grpc.example.HandleRemoveQueueRequest)
      com.microservice.booking_proto.HandleRemoveQueueRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.microservice.booking_proto.BookingProto.internal_static_net_devh_boot_grpc_example_HandleRemoveQueueRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.microservice.booking_proto.BookingProto.internal_static_net_devh_boot_grpc_example_HandleRemoveQueueRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.microservice.booking_proto.HandleRemoveQueueRequest.class, com.microservice.booking_proto.HandleRemoveQueueRequest.Builder.class);
    }

    // Construct using com.microservice.booking_proto.HandleRemoveQueueRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      accountId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.microservice.booking_proto.BookingProto.internal_static_net_devh_boot_grpc_example_HandleRemoveQueueRequest_descriptor;
    }

    @java.lang.Override
    public com.microservice.booking_proto.HandleRemoveQueueRequest getDefaultInstanceForType() {
      return com.microservice.booking_proto.HandleRemoveQueueRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.microservice.booking_proto.HandleRemoveQueueRequest build() {
      com.microservice.booking_proto.HandleRemoveQueueRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.microservice.booking_proto.HandleRemoveQueueRequest buildPartial() {
      com.microservice.booking_proto.HandleRemoveQueueRequest result = new com.microservice.booking_proto.HandleRemoveQueueRequest(this);
      result.accountId_ = accountId_;
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
      if (other instanceof com.microservice.booking_proto.HandleRemoveQueueRequest) {
        return mergeFrom((com.microservice.booking_proto.HandleRemoveQueueRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.microservice.booking_proto.HandleRemoveQueueRequest other) {
      if (other == com.microservice.booking_proto.HandleRemoveQueueRequest.getDefaultInstance()) return this;
      if (other.getAccountId() != 0) {
        setAccountId(other.getAccountId());
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
              accountId_ = input.readInt32();

              break;
            } // case 8
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

    private int accountId_ ;
    /**
     * <code>int32 accountId = 1;</code>
     * @return The accountId.
     */
    @java.lang.Override
    public int getAccountId() {
      return accountId_;
    }
    /**
     * <code>int32 accountId = 1;</code>
     * @param value The accountId to set.
     * @return This builder for chaining.
     */
    public Builder setAccountId(int value) {
      
      accountId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 accountId = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearAccountId() {
      
      accountId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:net.devh.boot.grpc.example.HandleRemoveQueueRequest)
  }

  // @@protoc_insertion_point(class_scope:net.devh.boot.grpc.example.HandleRemoveQueueRequest)
  private static final com.microservice.booking_proto.HandleRemoveQueueRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.microservice.booking_proto.HandleRemoveQueueRequest();
  }

  public static com.microservice.booking_proto.HandleRemoveQueueRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HandleRemoveQueueRequest>
      PARSER = new com.google.protobuf.AbstractParser<HandleRemoveQueueRequest>() {
    @java.lang.Override
    public HandleRemoveQueueRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<HandleRemoveQueueRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HandleRemoveQueueRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.microservice.booking_proto.HandleRemoveQueueRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

