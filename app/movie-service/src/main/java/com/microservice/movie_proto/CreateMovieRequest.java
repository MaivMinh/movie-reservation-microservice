// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: movie.proto

package com.microservice.movie_proto;

/**
 * Protobuf type {@code net.devh.boot.grpc.example.CreateMovieRequest}
 */
public final class CreateMovieRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:net.devh.boot.grpc.example.CreateMovieRequest)
    CreateMovieRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateMovieRequest.newBuilder() to construct.
  private CreateMovieRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateMovieRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateMovieRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.microservice.movie_proto.MovieProto.internal_static_net_devh_boot_grpc_example_CreateMovieRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.microservice.movie_proto.MovieProto.internal_static_net_devh_boot_grpc_example_CreateMovieRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.microservice.movie_proto.CreateMovieRequest.class, com.microservice.movie_proto.CreateMovieRequest.Builder.class);
  }

  public static final int MOVIE_FIELD_NUMBER = 1;
  private com.microservice.movie_proto.NewMovie movie_;
  /**
   * <code>.net.devh.boot.grpc.example.NewMovie movie = 1;</code>
   * @return Whether the movie field is set.
   */
  @java.lang.Override
  public boolean hasMovie() {
    return movie_ != null;
  }
  /**
   * <code>.net.devh.boot.grpc.example.NewMovie movie = 1;</code>
   * @return The movie.
   */
  @java.lang.Override
  public com.microservice.movie_proto.NewMovie getMovie() {
    return movie_ == null ? com.microservice.movie_proto.NewMovie.getDefaultInstance() : movie_;
  }
  /**
   * <code>.net.devh.boot.grpc.example.NewMovie movie = 1;</code>
   */
  @java.lang.Override
  public com.microservice.movie_proto.NewMovieOrBuilder getMovieOrBuilder() {
    return getMovie();
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
    if (movie_ != null) {
      output.writeMessage(1, getMovie());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (movie_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMovie());
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
    if (!(obj instanceof com.microservice.movie_proto.CreateMovieRequest)) {
      return super.equals(obj);
    }
    com.microservice.movie_proto.CreateMovieRequest other = (com.microservice.movie_proto.CreateMovieRequest) obj;

    if (hasMovie() != other.hasMovie()) return false;
    if (hasMovie()) {
      if (!getMovie()
          .equals(other.getMovie())) return false;
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
    if (hasMovie()) {
      hash = (37 * hash) + MOVIE_FIELD_NUMBER;
      hash = (53 * hash) + getMovie().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.microservice.movie_proto.CreateMovieRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.microservice.movie_proto.CreateMovieRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.microservice.movie_proto.CreateMovieRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.microservice.movie_proto.CreateMovieRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.microservice.movie_proto.CreateMovieRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.microservice.movie_proto.CreateMovieRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.microservice.movie_proto.CreateMovieRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.microservice.movie_proto.CreateMovieRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.microservice.movie_proto.CreateMovieRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.microservice.movie_proto.CreateMovieRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.microservice.movie_proto.CreateMovieRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.microservice.movie_proto.CreateMovieRequest parseFrom(
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
  public static Builder newBuilder(com.microservice.movie_proto.CreateMovieRequest prototype) {
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
   * Protobuf type {@code net.devh.boot.grpc.example.CreateMovieRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:net.devh.boot.grpc.example.CreateMovieRequest)
      com.microservice.movie_proto.CreateMovieRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.microservice.movie_proto.MovieProto.internal_static_net_devh_boot_grpc_example_CreateMovieRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.microservice.movie_proto.MovieProto.internal_static_net_devh_boot_grpc_example_CreateMovieRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.microservice.movie_proto.CreateMovieRequest.class, com.microservice.movie_proto.CreateMovieRequest.Builder.class);
    }

    // Construct using com.microservice.movie_proto.CreateMovieRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (movieBuilder_ == null) {
        movie_ = null;
      } else {
        movie_ = null;
        movieBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.microservice.movie_proto.MovieProto.internal_static_net_devh_boot_grpc_example_CreateMovieRequest_descriptor;
    }

    @java.lang.Override
    public com.microservice.movie_proto.CreateMovieRequest getDefaultInstanceForType() {
      return com.microservice.movie_proto.CreateMovieRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.microservice.movie_proto.CreateMovieRequest build() {
      com.microservice.movie_proto.CreateMovieRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.microservice.movie_proto.CreateMovieRequest buildPartial() {
      com.microservice.movie_proto.CreateMovieRequest result = new com.microservice.movie_proto.CreateMovieRequest(this);
      if (movieBuilder_ == null) {
        result.movie_ = movie_;
      } else {
        result.movie_ = movieBuilder_.build();
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
      if (other instanceof com.microservice.movie_proto.CreateMovieRequest) {
        return mergeFrom((com.microservice.movie_proto.CreateMovieRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.microservice.movie_proto.CreateMovieRequest other) {
      if (other == com.microservice.movie_proto.CreateMovieRequest.getDefaultInstance()) return this;
      if (other.hasMovie()) {
        mergeMovie(other.getMovie());
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
            case 10: {
              input.readMessage(
                  getMovieFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 10
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

    private com.microservice.movie_proto.NewMovie movie_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.microservice.movie_proto.NewMovie, com.microservice.movie_proto.NewMovie.Builder, com.microservice.movie_proto.NewMovieOrBuilder> movieBuilder_;
    /**
     * <code>.net.devh.boot.grpc.example.NewMovie movie = 1;</code>
     * @return Whether the movie field is set.
     */
    public boolean hasMovie() {
      return movieBuilder_ != null || movie_ != null;
    }
    /**
     * <code>.net.devh.boot.grpc.example.NewMovie movie = 1;</code>
     * @return The movie.
     */
    public com.microservice.movie_proto.NewMovie getMovie() {
      if (movieBuilder_ == null) {
        return movie_ == null ? com.microservice.movie_proto.NewMovie.getDefaultInstance() : movie_;
      } else {
        return movieBuilder_.getMessage();
      }
    }
    /**
     * <code>.net.devh.boot.grpc.example.NewMovie movie = 1;</code>
     */
    public Builder setMovie(com.microservice.movie_proto.NewMovie value) {
      if (movieBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        movie_ = value;
        onChanged();
      } else {
        movieBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.net.devh.boot.grpc.example.NewMovie movie = 1;</code>
     */
    public Builder setMovie(
        com.microservice.movie_proto.NewMovie.Builder builderForValue) {
      if (movieBuilder_ == null) {
        movie_ = builderForValue.build();
        onChanged();
      } else {
        movieBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.net.devh.boot.grpc.example.NewMovie movie = 1;</code>
     */
    public Builder mergeMovie(com.microservice.movie_proto.NewMovie value) {
      if (movieBuilder_ == null) {
        if (movie_ != null) {
          movie_ =
            com.microservice.movie_proto.NewMovie.newBuilder(movie_).mergeFrom(value).buildPartial();
        } else {
          movie_ = value;
        }
        onChanged();
      } else {
        movieBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.net.devh.boot.grpc.example.NewMovie movie = 1;</code>
     */
    public Builder clearMovie() {
      if (movieBuilder_ == null) {
        movie_ = null;
        onChanged();
      } else {
        movie_ = null;
        movieBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.net.devh.boot.grpc.example.NewMovie movie = 1;</code>
     */
    public com.microservice.movie_proto.NewMovie.Builder getMovieBuilder() {
      
      onChanged();
      return getMovieFieldBuilder().getBuilder();
    }
    /**
     * <code>.net.devh.boot.grpc.example.NewMovie movie = 1;</code>
     */
    public com.microservice.movie_proto.NewMovieOrBuilder getMovieOrBuilder() {
      if (movieBuilder_ != null) {
        return movieBuilder_.getMessageOrBuilder();
      } else {
        return movie_ == null ?
            com.microservice.movie_proto.NewMovie.getDefaultInstance() : movie_;
      }
    }
    /**
     * <code>.net.devh.boot.grpc.example.NewMovie movie = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.microservice.movie_proto.NewMovie, com.microservice.movie_proto.NewMovie.Builder, com.microservice.movie_proto.NewMovieOrBuilder> 
        getMovieFieldBuilder() {
      if (movieBuilder_ == null) {
        movieBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.microservice.movie_proto.NewMovie, com.microservice.movie_proto.NewMovie.Builder, com.microservice.movie_proto.NewMovieOrBuilder>(
                getMovie(),
                getParentForChildren(),
                isClean());
        movie_ = null;
      }
      return movieBuilder_;
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


    // @@protoc_insertion_point(builder_scope:net.devh.boot.grpc.example.CreateMovieRequest)
  }

  // @@protoc_insertion_point(class_scope:net.devh.boot.grpc.example.CreateMovieRequest)
  private static final com.microservice.movie_proto.CreateMovieRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.microservice.movie_proto.CreateMovieRequest();
  }

  public static com.microservice.movie_proto.CreateMovieRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateMovieRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateMovieRequest>() {
    @java.lang.Override
    public CreateMovieRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateMovieRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateMovieRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.microservice.movie_proto.CreateMovieRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

