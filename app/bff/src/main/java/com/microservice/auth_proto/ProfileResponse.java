// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: auth.proto

package com.microservice.auth_proto;

/**
 * Protobuf type {@code net.devh.boot.grpc.example.ProfileResponse}
 */
public final class ProfileResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:net.devh.boot.grpc.example.ProfileResponse)
    ProfileResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ProfileResponse.newBuilder() to construct.
  private ProfileResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ProfileResponse() {
    message_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ProfileResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.microservice.auth_proto.AuthProto.internal_static_net_devh_boot_grpc_example_ProfileResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.microservice.auth_proto.AuthProto.internal_static_net_devh_boot_grpc_example_ProfileResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.microservice.auth_proto.ProfileResponse.class, com.microservice.auth_proto.ProfileResponse.Builder.class);
  }

  public static final int STATUS_FIELD_NUMBER = 1;
  private int status_;
  /**
   * <code>int32 status = 1;</code>
   * @return The status.
   */
  @java.lang.Override
  public int getStatus() {
    return status_;
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object message_;
  /**
   * <code>string message = 2;</code>
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>string message = 2;</code>
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROFILE_FIELD_NUMBER = 3;
  private com.microservice.auth_proto.Profile profile_;
  /**
   * <code>.net.devh.boot.grpc.example.Profile profile = 3;</code>
   * @return Whether the profile field is set.
   */
  @java.lang.Override
  public boolean hasProfile() {
    return profile_ != null;
  }
  /**
   * <code>.net.devh.boot.grpc.example.Profile profile = 3;</code>
   * @return The profile.
   */
  @java.lang.Override
  public com.microservice.auth_proto.Profile getProfile() {
    return profile_ == null ? com.microservice.auth_proto.Profile.getDefaultInstance() : profile_;
  }
  /**
   * <code>.net.devh.boot.grpc.example.Profile profile = 3;</code>
   */
  @java.lang.Override
  public com.microservice.auth_proto.ProfileOrBuilder getProfileOrBuilder() {
    return getProfile();
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
    if (status_ != 0) {
      output.writeInt32(1, status_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, message_);
    }
    if (profile_ != null) {
      output.writeMessage(3, getProfile());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (status_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, status_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, message_);
    }
    if (profile_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getProfile());
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
    if (!(obj instanceof com.microservice.auth_proto.ProfileResponse)) {
      return super.equals(obj);
    }
    com.microservice.auth_proto.ProfileResponse other = (com.microservice.auth_proto.ProfileResponse) obj;

    if (getStatus()
        != other.getStatus()) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (hasProfile() != other.hasProfile()) return false;
    if (hasProfile()) {
      if (!getProfile()
          .equals(other.getProfile())) return false;
    }
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + getStatus();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    if (hasProfile()) {
      hash = (37 * hash) + PROFILE_FIELD_NUMBER;
      hash = (53 * hash) + getProfile().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.microservice.auth_proto.ProfileResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.microservice.auth_proto.ProfileResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.microservice.auth_proto.ProfileResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.microservice.auth_proto.ProfileResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.microservice.auth_proto.ProfileResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.microservice.auth_proto.ProfileResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.microservice.auth_proto.ProfileResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.microservice.auth_proto.ProfileResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.microservice.auth_proto.ProfileResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.microservice.auth_proto.ProfileResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.microservice.auth_proto.ProfileResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.microservice.auth_proto.ProfileResponse parseFrom(
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
  public static Builder newBuilder(com.microservice.auth_proto.ProfileResponse prototype) {
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
   * Protobuf type {@code net.devh.boot.grpc.example.ProfileResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:net.devh.boot.grpc.example.ProfileResponse)
      com.microservice.auth_proto.ProfileResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.microservice.auth_proto.AuthProto.internal_static_net_devh_boot_grpc_example_ProfileResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.microservice.auth_proto.AuthProto.internal_static_net_devh_boot_grpc_example_ProfileResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.microservice.auth_proto.ProfileResponse.class, com.microservice.auth_proto.ProfileResponse.Builder.class);
    }

    // Construct using com.microservice.auth_proto.ProfileResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      status_ = 0;

      message_ = "";

      if (profileBuilder_ == null) {
        profile_ = null;
      } else {
        profile_ = null;
        profileBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.microservice.auth_proto.AuthProto.internal_static_net_devh_boot_grpc_example_ProfileResponse_descriptor;
    }

    @java.lang.Override
    public com.microservice.auth_proto.ProfileResponse getDefaultInstanceForType() {
      return com.microservice.auth_proto.ProfileResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.microservice.auth_proto.ProfileResponse build() {
      com.microservice.auth_proto.ProfileResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.microservice.auth_proto.ProfileResponse buildPartial() {
      com.microservice.auth_proto.ProfileResponse result = new com.microservice.auth_proto.ProfileResponse(this);
      result.status_ = status_;
      result.message_ = message_;
      if (profileBuilder_ == null) {
        result.profile_ = profile_;
      } else {
        result.profile_ = profileBuilder_.build();
      }
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
      if (other instanceof com.microservice.auth_proto.ProfileResponse) {
        return mergeFrom((com.microservice.auth_proto.ProfileResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.microservice.auth_proto.ProfileResponse other) {
      if (other == com.microservice.auth_proto.ProfileResponse.getDefaultInstance()) return this;
      if (other.getStatus() != 0) {
        setStatus(other.getStatus());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (other.hasProfile()) {
        mergeProfile(other.getProfile());
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
              status_ = input.readInt32();

              break;
            } // case 8
            case 18: {
              message_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getProfileFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 26
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

    private int status_ ;
    /**
     * <code>int32 status = 1;</code>
     * @return The status.
     */
    @java.lang.Override
    public int getStatus() {
      return status_;
    }
    /**
     * <code>int32 status = 1;</code>
     * @param value The status to set.
     * @return This builder for chaining.
     */
    public Builder setStatus(int value) {
      
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 status = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>string message = 2;</code>
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string message = 2;</code>
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>string message = 2;</code>
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private com.microservice.auth_proto.Profile profile_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.microservice.auth_proto.Profile, com.microservice.auth_proto.Profile.Builder, com.microservice.auth_proto.ProfileOrBuilder> profileBuilder_;
    /**
     * <code>.net.devh.boot.grpc.example.Profile profile = 3;</code>
     * @return Whether the profile field is set.
     */
    public boolean hasProfile() {
      return profileBuilder_ != null || profile_ != null;
    }
    /**
     * <code>.net.devh.boot.grpc.example.Profile profile = 3;</code>
     * @return The profile.
     */
    public com.microservice.auth_proto.Profile getProfile() {
      if (profileBuilder_ == null) {
        return profile_ == null ? com.microservice.auth_proto.Profile.getDefaultInstance() : profile_;
      } else {
        return profileBuilder_.getMessage();
      }
    }
    /**
     * <code>.net.devh.boot.grpc.example.Profile profile = 3;</code>
     */
    public Builder setProfile(com.microservice.auth_proto.Profile value) {
      if (profileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        profile_ = value;
        onChanged();
      } else {
        profileBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.net.devh.boot.grpc.example.Profile profile = 3;</code>
     */
    public Builder setProfile(
        com.microservice.auth_proto.Profile.Builder builderForValue) {
      if (profileBuilder_ == null) {
        profile_ = builderForValue.build();
        onChanged();
      } else {
        profileBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.net.devh.boot.grpc.example.Profile profile = 3;</code>
     */
    public Builder mergeProfile(com.microservice.auth_proto.Profile value) {
      if (profileBuilder_ == null) {
        if (profile_ != null) {
          profile_ =
            com.microservice.auth_proto.Profile.newBuilder(profile_).mergeFrom(value).buildPartial();
        } else {
          profile_ = value;
        }
        onChanged();
      } else {
        profileBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.net.devh.boot.grpc.example.Profile profile = 3;</code>
     */
    public Builder clearProfile() {
      if (profileBuilder_ == null) {
        profile_ = null;
        onChanged();
      } else {
        profile_ = null;
        profileBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.net.devh.boot.grpc.example.Profile profile = 3;</code>
     */
    public com.microservice.auth_proto.Profile.Builder getProfileBuilder() {
      
      onChanged();
      return getProfileFieldBuilder().getBuilder();
    }
    /**
     * <code>.net.devh.boot.grpc.example.Profile profile = 3;</code>
     */
    public com.microservice.auth_proto.ProfileOrBuilder getProfileOrBuilder() {
      if (profileBuilder_ != null) {
        return profileBuilder_.getMessageOrBuilder();
      } else {
        return profile_ == null ?
            com.microservice.auth_proto.Profile.getDefaultInstance() : profile_;
      }
    }
    /**
     * <code>.net.devh.boot.grpc.example.Profile profile = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.microservice.auth_proto.Profile, com.microservice.auth_proto.Profile.Builder, com.microservice.auth_proto.ProfileOrBuilder> 
        getProfileFieldBuilder() {
      if (profileBuilder_ == null) {
        profileBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.microservice.auth_proto.Profile, com.microservice.auth_proto.Profile.Builder, com.microservice.auth_proto.ProfileOrBuilder>(
                getProfile(),
                getParentForChildren(),
                isClean());
        profile_ = null;
      }
      return profileBuilder_;
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


    // @@protoc_insertion_point(builder_scope:net.devh.boot.grpc.example.ProfileResponse)
  }

  // @@protoc_insertion_point(class_scope:net.devh.boot.grpc.example.ProfileResponse)
  private static final com.microservice.auth_proto.ProfileResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.microservice.auth_proto.ProfileResponse();
  }

  public static com.microservice.auth_proto.ProfileResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ProfileResponse>
      PARSER = new com.google.protobuf.AbstractParser<ProfileResponse>() {
    @java.lang.Override
    public ProfileResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ProfileResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ProfileResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.microservice.auth_proto.ProfileResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

