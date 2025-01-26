// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: movie.proto

package com.microservice.movie_proto;

/**
 * Protobuf type {@code net.devh.boot.grpc.example.GetMoviesResponse}
 */
public final class GetMoviesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:net.devh.boot.grpc.example.GetMoviesResponse)
    GetMoviesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetMoviesResponse.newBuilder() to construct.
  private GetMoviesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetMoviesResponse() {
    message_ = "";
    movies_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetMoviesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.microservice.movie_proto.MovieProto.internal_static_net_devh_boot_grpc_example_GetMoviesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.microservice.movie_proto.MovieProto.internal_static_net_devh_boot_grpc_example_GetMoviesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.microservice.movie_proto.GetMoviesResponse.class, com.microservice.movie_proto.GetMoviesResponse.Builder.class);
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

  public static final int MOVIES_FIELD_NUMBER = 3;
  private java.util.List<com.microservice.movie_proto.Movie> movies_;
  /**
   * <code>repeated .net.devh.boot.grpc.example.Movie movies = 3;</code>
   */
  @java.lang.Override
  public java.util.List<com.microservice.movie_proto.Movie> getMoviesList() {
    return movies_;
  }
  /**
   * <code>repeated .net.devh.boot.grpc.example.Movie movies = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.microservice.movie_proto.MovieOrBuilder> 
      getMoviesOrBuilderList() {
    return movies_;
  }
  /**
   * <code>repeated .net.devh.boot.grpc.example.Movie movies = 3;</code>
   */
  @java.lang.Override
  public int getMoviesCount() {
    return movies_.size();
  }
  /**
   * <code>repeated .net.devh.boot.grpc.example.Movie movies = 3;</code>
   */
  @java.lang.Override
  public com.microservice.movie_proto.Movie getMovies(int index) {
    return movies_.get(index);
  }
  /**
   * <code>repeated .net.devh.boot.grpc.example.Movie movies = 3;</code>
   */
  @java.lang.Override
  public com.microservice.movie_proto.MovieOrBuilder getMoviesOrBuilder(
      int index) {
    return movies_.get(index);
  }

  public static final int TOTALPAGE_FIELD_NUMBER = 4;
  private long totalPage_;
  /**
   * <code>int64 totalPage = 4;</code>
   * @return The totalPage.
   */
  @java.lang.Override
  public long getTotalPage() {
    return totalPage_;
  }

  public static final int TOTALELEMENT_FIELD_NUMBER = 5;
  private long totalElement_;
  /**
   * <code>int64 totalElement = 5;</code>
   * @return The totalElement.
   */
  @java.lang.Override
  public long getTotalElement() {
    return totalElement_;
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
    for (int i = 0; i < movies_.size(); i++) {
      output.writeMessage(3, movies_.get(i));
    }
    if (totalPage_ != 0L) {
      output.writeInt64(4, totalPage_);
    }
    if (totalElement_ != 0L) {
      output.writeInt64(5, totalElement_);
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
    for (int i = 0; i < movies_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, movies_.get(i));
    }
    if (totalPage_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, totalPage_);
    }
    if (totalElement_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(5, totalElement_);
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
    if (!(obj instanceof com.microservice.movie_proto.GetMoviesResponse)) {
      return super.equals(obj);
    }
    com.microservice.movie_proto.GetMoviesResponse other = (com.microservice.movie_proto.GetMoviesResponse) obj;

    if (getStatus()
        != other.getStatus()) return false;
    if (!getMessage()
        .equals(other.getMessage())) return false;
    if (!getMoviesList()
        .equals(other.getMoviesList())) return false;
    if (getTotalPage()
        != other.getTotalPage()) return false;
    if (getTotalElement()
        != other.getTotalElement()) return false;
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
    if (getMoviesCount() > 0) {
      hash = (37 * hash) + MOVIES_FIELD_NUMBER;
      hash = (53 * hash) + getMoviesList().hashCode();
    }
    hash = (37 * hash) + TOTALPAGE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalPage());
    hash = (37 * hash) + TOTALELEMENT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTotalElement());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.microservice.movie_proto.GetMoviesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.microservice.movie_proto.GetMoviesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.microservice.movie_proto.GetMoviesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.microservice.movie_proto.GetMoviesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.microservice.movie_proto.GetMoviesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.microservice.movie_proto.GetMoviesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.microservice.movie_proto.GetMoviesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.microservice.movie_proto.GetMoviesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.microservice.movie_proto.GetMoviesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.microservice.movie_proto.GetMoviesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.microservice.movie_proto.GetMoviesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.microservice.movie_proto.GetMoviesResponse parseFrom(
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
  public static Builder newBuilder(com.microservice.movie_proto.GetMoviesResponse prototype) {
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
   * Protobuf type {@code net.devh.boot.grpc.example.GetMoviesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:net.devh.boot.grpc.example.GetMoviesResponse)
      com.microservice.movie_proto.GetMoviesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.microservice.movie_proto.MovieProto.internal_static_net_devh_boot_grpc_example_GetMoviesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.microservice.movie_proto.MovieProto.internal_static_net_devh_boot_grpc_example_GetMoviesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.microservice.movie_proto.GetMoviesResponse.class, com.microservice.movie_proto.GetMoviesResponse.Builder.class);
    }

    // Construct using com.microservice.movie_proto.GetMoviesResponse.newBuilder()
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

      if (moviesBuilder_ == null) {
        movies_ = java.util.Collections.emptyList();
      } else {
        movies_ = null;
        moviesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      totalPage_ = 0L;

      totalElement_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.microservice.movie_proto.MovieProto.internal_static_net_devh_boot_grpc_example_GetMoviesResponse_descriptor;
    }

    @java.lang.Override
    public com.microservice.movie_proto.GetMoviesResponse getDefaultInstanceForType() {
      return com.microservice.movie_proto.GetMoviesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.microservice.movie_proto.GetMoviesResponse build() {
      com.microservice.movie_proto.GetMoviesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.microservice.movie_proto.GetMoviesResponse buildPartial() {
      com.microservice.movie_proto.GetMoviesResponse result = new com.microservice.movie_proto.GetMoviesResponse(this);
      int from_bitField0_ = bitField0_;
      result.status_ = status_;
      result.message_ = message_;
      if (moviesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          movies_ = java.util.Collections.unmodifiableList(movies_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.movies_ = movies_;
      } else {
        result.movies_ = moviesBuilder_.build();
      }
      result.totalPage_ = totalPage_;
      result.totalElement_ = totalElement_;
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
      if (other instanceof com.microservice.movie_proto.GetMoviesResponse) {
        return mergeFrom((com.microservice.movie_proto.GetMoviesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.microservice.movie_proto.GetMoviesResponse other) {
      if (other == com.microservice.movie_proto.GetMoviesResponse.getDefaultInstance()) return this;
      if (other.getStatus() != 0) {
        setStatus(other.getStatus());
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (moviesBuilder_ == null) {
        if (!other.movies_.isEmpty()) {
          if (movies_.isEmpty()) {
            movies_ = other.movies_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMoviesIsMutable();
            movies_.addAll(other.movies_);
          }
          onChanged();
        }
      } else {
        if (!other.movies_.isEmpty()) {
          if (moviesBuilder_.isEmpty()) {
            moviesBuilder_.dispose();
            moviesBuilder_ = null;
            movies_ = other.movies_;
            bitField0_ = (bitField0_ & ~0x00000001);
            moviesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMoviesFieldBuilder() : null;
          } else {
            moviesBuilder_.addAllMessages(other.movies_);
          }
        }
      }
      if (other.getTotalPage() != 0L) {
        setTotalPage(other.getTotalPage());
      }
      if (other.getTotalElement() != 0L) {
        setTotalElement(other.getTotalElement());
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
              com.microservice.movie_proto.Movie m =
                  input.readMessage(
                      com.microservice.movie_proto.Movie.parser(),
                      extensionRegistry);
              if (moviesBuilder_ == null) {
                ensureMoviesIsMutable();
                movies_.add(m);
              } else {
                moviesBuilder_.addMessage(m);
              }
              break;
            } // case 26
            case 32: {
              totalPage_ = input.readInt64();

              break;
            } // case 32
            case 40: {
              totalElement_ = input.readInt64();

              break;
            } // case 40
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
    private int bitField0_;

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

    private java.util.List<com.microservice.movie_proto.Movie> movies_ =
      java.util.Collections.emptyList();
    private void ensureMoviesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        movies_ = new java.util.ArrayList<com.microservice.movie_proto.Movie>(movies_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.microservice.movie_proto.Movie, com.microservice.movie_proto.Movie.Builder, com.microservice.movie_proto.MovieOrBuilder> moviesBuilder_;

    /**
     * <code>repeated .net.devh.boot.grpc.example.Movie movies = 3;</code>
     */
    public java.util.List<com.microservice.movie_proto.Movie> getMoviesList() {
      if (moviesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(movies_);
      } else {
        return moviesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.Movie movies = 3;</code>
     */
    public int getMoviesCount() {
      if (moviesBuilder_ == null) {
        return movies_.size();
      } else {
        return moviesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.Movie movies = 3;</code>
     */
    public com.microservice.movie_proto.Movie getMovies(int index) {
      if (moviesBuilder_ == null) {
        return movies_.get(index);
      } else {
        return moviesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.Movie movies = 3;</code>
     */
    public Builder setMovies(
        int index, com.microservice.movie_proto.Movie value) {
      if (moviesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMoviesIsMutable();
        movies_.set(index, value);
        onChanged();
      } else {
        moviesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.Movie movies = 3;</code>
     */
    public Builder setMovies(
        int index, com.microservice.movie_proto.Movie.Builder builderForValue) {
      if (moviesBuilder_ == null) {
        ensureMoviesIsMutable();
        movies_.set(index, builderForValue.build());
        onChanged();
      } else {
        moviesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.Movie movies = 3;</code>
     */
    public Builder addMovies(com.microservice.movie_proto.Movie value) {
      if (moviesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMoviesIsMutable();
        movies_.add(value);
        onChanged();
      } else {
        moviesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.Movie movies = 3;</code>
     */
    public Builder addMovies(
        int index, com.microservice.movie_proto.Movie value) {
      if (moviesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMoviesIsMutable();
        movies_.add(index, value);
        onChanged();
      } else {
        moviesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.Movie movies = 3;</code>
     */
    public Builder addMovies(
        com.microservice.movie_proto.Movie.Builder builderForValue) {
      if (moviesBuilder_ == null) {
        ensureMoviesIsMutable();
        movies_.add(builderForValue.build());
        onChanged();
      } else {
        moviesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.Movie movies = 3;</code>
     */
    public Builder addMovies(
        int index, com.microservice.movie_proto.Movie.Builder builderForValue) {
      if (moviesBuilder_ == null) {
        ensureMoviesIsMutable();
        movies_.add(index, builderForValue.build());
        onChanged();
      } else {
        moviesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.Movie movies = 3;</code>
     */
    public Builder addAllMovies(
        java.lang.Iterable<? extends com.microservice.movie_proto.Movie> values) {
      if (moviesBuilder_ == null) {
        ensureMoviesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, movies_);
        onChanged();
      } else {
        moviesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.Movie movies = 3;</code>
     */
    public Builder clearMovies() {
      if (moviesBuilder_ == null) {
        movies_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        moviesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.Movie movies = 3;</code>
     */
    public Builder removeMovies(int index) {
      if (moviesBuilder_ == null) {
        ensureMoviesIsMutable();
        movies_.remove(index);
        onChanged();
      } else {
        moviesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.Movie movies = 3;</code>
     */
    public com.microservice.movie_proto.Movie.Builder getMoviesBuilder(
        int index) {
      return getMoviesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.Movie movies = 3;</code>
     */
    public com.microservice.movie_proto.MovieOrBuilder getMoviesOrBuilder(
        int index) {
      if (moviesBuilder_ == null) {
        return movies_.get(index);  } else {
        return moviesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.Movie movies = 3;</code>
     */
    public java.util.List<? extends com.microservice.movie_proto.MovieOrBuilder> 
         getMoviesOrBuilderList() {
      if (moviesBuilder_ != null) {
        return moviesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(movies_);
      }
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.Movie movies = 3;</code>
     */
    public com.microservice.movie_proto.Movie.Builder addMoviesBuilder() {
      return getMoviesFieldBuilder().addBuilder(
          com.microservice.movie_proto.Movie.getDefaultInstance());
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.Movie movies = 3;</code>
     */
    public com.microservice.movie_proto.Movie.Builder addMoviesBuilder(
        int index) {
      return getMoviesFieldBuilder().addBuilder(
          index, com.microservice.movie_proto.Movie.getDefaultInstance());
    }
    /**
     * <code>repeated .net.devh.boot.grpc.example.Movie movies = 3;</code>
     */
    public java.util.List<com.microservice.movie_proto.Movie.Builder> 
         getMoviesBuilderList() {
      return getMoviesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.microservice.movie_proto.Movie, com.microservice.movie_proto.Movie.Builder, com.microservice.movie_proto.MovieOrBuilder> 
        getMoviesFieldBuilder() {
      if (moviesBuilder_ == null) {
        moviesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.microservice.movie_proto.Movie, com.microservice.movie_proto.Movie.Builder, com.microservice.movie_proto.MovieOrBuilder>(
                movies_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        movies_ = null;
      }
      return moviesBuilder_;
    }

    private long totalPage_ ;
    /**
     * <code>int64 totalPage = 4;</code>
     * @return The totalPage.
     */
    @java.lang.Override
    public long getTotalPage() {
      return totalPage_;
    }
    /**
     * <code>int64 totalPage = 4;</code>
     * @param value The totalPage to set.
     * @return This builder for chaining.
     */
    public Builder setTotalPage(long value) {
      
      totalPage_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 totalPage = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalPage() {
      
      totalPage_ = 0L;
      onChanged();
      return this;
    }

    private long totalElement_ ;
    /**
     * <code>int64 totalElement = 5;</code>
     * @return The totalElement.
     */
    @java.lang.Override
    public long getTotalElement() {
      return totalElement_;
    }
    /**
     * <code>int64 totalElement = 5;</code>
     * @param value The totalElement to set.
     * @return This builder for chaining.
     */
    public Builder setTotalElement(long value) {
      
      totalElement_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 totalElement = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalElement() {
      
      totalElement_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:net.devh.boot.grpc.example.GetMoviesResponse)
  }

  // @@protoc_insertion_point(class_scope:net.devh.boot.grpc.example.GetMoviesResponse)
  private static final com.microservice.movie_proto.GetMoviesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.microservice.movie_proto.GetMoviesResponse();
  }

  public static com.microservice.movie_proto.GetMoviesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetMoviesResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetMoviesResponse>() {
    @java.lang.Override
    public GetMoviesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetMoviesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetMoviesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.microservice.movie_proto.GetMoviesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

