// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: booking.proto

package com.microservice.booking_proto;

/**
 * Protobuf type {@code net.devh.boot.grpc.example.Room}
 */
public final class Room extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:net.devh.boot.grpc.example.Room)
    RoomOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Room.newBuilder() to construct.
  private Room(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Room() {
    name_ = "";
    location_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Room();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.microservice.booking_proto.BookingProto.internal_static_net_devh_boot_grpc_example_Room_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.microservice.booking_proto.BookingProto.internal_static_net_devh_boot_grpc_example_Room_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.microservice.booking_proto.Room.class, com.microservice.booking_proto.Room.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private int id_;
  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  @java.lang.Override
  public int getId() {
    return id_;
  }

  public static final int NAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object name_;
  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CINEMA_FIELD_NUMBER = 3;
  private com.microservice.booking_proto.Cinema cinema_;
  /**
   * <code>.net.devh.boot.grpc.example.Cinema cinema = 3;</code>
   * @return Whether the cinema field is set.
   */
  @java.lang.Override
  public boolean hasCinema() {
    return cinema_ != null;
  }
  /**
   * <code>.net.devh.boot.grpc.example.Cinema cinema = 3;</code>
   * @return The cinema.
   */
  @java.lang.Override
  public com.microservice.booking_proto.Cinema getCinema() {
    return cinema_ == null ? com.microservice.booking_proto.Cinema.getDefaultInstance() : cinema_;
  }
  /**
   * <code>.net.devh.boot.grpc.example.Cinema cinema = 3;</code>
   */
  @java.lang.Override
  public com.microservice.booking_proto.CinemaOrBuilder getCinemaOrBuilder() {
    return getCinema();
  }

  public static final int LOCATION_FIELD_NUMBER = 4;
  private volatile java.lang.Object location_;
  /**
   * <code>string location = 4;</code>
   * @return The location.
   */
  @java.lang.Override
  public java.lang.String getLocation() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      location_ = s;
      return s;
    }
  }
  /**
   * <code>string location = 4;</code>
   * @return The bytes for location.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLocationBytes() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      location_ = b;
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
    if (id_ != 0) {
      output.writeInt32(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (cinema_ != null) {
      output.writeMessage(3, getCinema());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, location_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (cinema_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getCinema());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, location_);
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
    if (!(obj instanceof com.microservice.booking_proto.Room)) {
      return super.equals(obj);
    }
    com.microservice.booking_proto.Room other = (com.microservice.booking_proto.Room) obj;

    if (getId()
        != other.getId()) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (hasCinema() != other.hasCinema()) return false;
    if (hasCinema()) {
      if (!getCinema()
          .equals(other.getCinema())) return false;
    }
    if (!getLocation()
        .equals(other.getLocation())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasCinema()) {
      hash = (37 * hash) + CINEMA_FIELD_NUMBER;
      hash = (53 * hash) + getCinema().hashCode();
    }
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.microservice.booking_proto.Room parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.microservice.booking_proto.Room parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.microservice.booking_proto.Room parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.microservice.booking_proto.Room parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.microservice.booking_proto.Room parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.microservice.booking_proto.Room parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.microservice.booking_proto.Room parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.microservice.booking_proto.Room parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.microservice.booking_proto.Room parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.microservice.booking_proto.Room parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.microservice.booking_proto.Room parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.microservice.booking_proto.Room parseFrom(
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
  public static Builder newBuilder(com.microservice.booking_proto.Room prototype) {
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
   * Protobuf type {@code net.devh.boot.grpc.example.Room}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:net.devh.boot.grpc.example.Room)
      com.microservice.booking_proto.RoomOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.microservice.booking_proto.BookingProto.internal_static_net_devh_boot_grpc_example_Room_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.microservice.booking_proto.BookingProto.internal_static_net_devh_boot_grpc_example_Room_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.microservice.booking_proto.Room.class, com.microservice.booking_proto.Room.Builder.class);
    }

    // Construct using com.microservice.booking_proto.Room.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      id_ = 0;

      name_ = "";

      if (cinemaBuilder_ == null) {
        cinema_ = null;
      } else {
        cinema_ = null;
        cinemaBuilder_ = null;
      }
      location_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.microservice.booking_proto.BookingProto.internal_static_net_devh_boot_grpc_example_Room_descriptor;
    }

    @java.lang.Override
    public com.microservice.booking_proto.Room getDefaultInstanceForType() {
      return com.microservice.booking_proto.Room.getDefaultInstance();
    }

    @java.lang.Override
    public com.microservice.booking_proto.Room build() {
      com.microservice.booking_proto.Room result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.microservice.booking_proto.Room buildPartial() {
      com.microservice.booking_proto.Room result = new com.microservice.booking_proto.Room(this);
      result.id_ = id_;
      result.name_ = name_;
      if (cinemaBuilder_ == null) {
        result.cinema_ = cinema_;
      } else {
        result.cinema_ = cinemaBuilder_.build();
      }
      result.location_ = location_;
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
      if (other instanceof com.microservice.booking_proto.Room) {
        return mergeFrom((com.microservice.booking_proto.Room)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.microservice.booking_proto.Room other) {
      if (other == com.microservice.booking_proto.Room.getDefaultInstance()) return this;
      if (other.getId() != 0) {
        setId(other.getId());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasCinema()) {
        mergeCinema(other.getCinema());
      }
      if (!other.getLocation().isEmpty()) {
        location_ = other.location_;
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
              id_ = input.readInt32();

              break;
            } // case 8
            case 18: {
              name_ = input.readStringRequireUtf8();

              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getCinemaFieldBuilder().getBuilder(),
                  extensionRegistry);

              break;
            } // case 26
            case 34: {
              location_ = input.readStringRequireUtf8();

              break;
            } // case 34
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

    private int id_ ;
    /**
     * <code>int32 id = 1;</code>
     * @return The id.
     */
    @java.lang.Override
    public int getId() {
      return id_;
    }
    /**
     * <code>int32 id = 1;</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(int value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2;</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2;</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      name_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      
      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2;</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      name_ = value;
      onChanged();
      return this;
    }

    private com.microservice.booking_proto.Cinema cinema_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.microservice.booking_proto.Cinema, com.microservice.booking_proto.Cinema.Builder, com.microservice.booking_proto.CinemaOrBuilder> cinemaBuilder_;
    /**
     * <code>.net.devh.boot.grpc.example.Cinema cinema = 3;</code>
     * @return Whether the cinema field is set.
     */
    public boolean hasCinema() {
      return cinemaBuilder_ != null || cinema_ != null;
    }
    /**
     * <code>.net.devh.boot.grpc.example.Cinema cinema = 3;</code>
     * @return The cinema.
     */
    public com.microservice.booking_proto.Cinema getCinema() {
      if (cinemaBuilder_ == null) {
        return cinema_ == null ? com.microservice.booking_proto.Cinema.getDefaultInstance() : cinema_;
      } else {
        return cinemaBuilder_.getMessage();
      }
    }
    /**
     * <code>.net.devh.boot.grpc.example.Cinema cinema = 3;</code>
     */
    public Builder setCinema(com.microservice.booking_proto.Cinema value) {
      if (cinemaBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        cinema_ = value;
        onChanged();
      } else {
        cinemaBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.net.devh.boot.grpc.example.Cinema cinema = 3;</code>
     */
    public Builder setCinema(
        com.microservice.booking_proto.Cinema.Builder builderForValue) {
      if (cinemaBuilder_ == null) {
        cinema_ = builderForValue.build();
        onChanged();
      } else {
        cinemaBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.net.devh.boot.grpc.example.Cinema cinema = 3;</code>
     */
    public Builder mergeCinema(com.microservice.booking_proto.Cinema value) {
      if (cinemaBuilder_ == null) {
        if (cinema_ != null) {
          cinema_ =
            com.microservice.booking_proto.Cinema.newBuilder(cinema_).mergeFrom(value).buildPartial();
        } else {
          cinema_ = value;
        }
        onChanged();
      } else {
        cinemaBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.net.devh.boot.grpc.example.Cinema cinema = 3;</code>
     */
    public Builder clearCinema() {
      if (cinemaBuilder_ == null) {
        cinema_ = null;
        onChanged();
      } else {
        cinema_ = null;
        cinemaBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.net.devh.boot.grpc.example.Cinema cinema = 3;</code>
     */
    public com.microservice.booking_proto.Cinema.Builder getCinemaBuilder() {
      
      onChanged();
      return getCinemaFieldBuilder().getBuilder();
    }
    /**
     * <code>.net.devh.boot.grpc.example.Cinema cinema = 3;</code>
     */
    public com.microservice.booking_proto.CinemaOrBuilder getCinemaOrBuilder() {
      if (cinemaBuilder_ != null) {
        return cinemaBuilder_.getMessageOrBuilder();
      } else {
        return cinema_ == null ?
            com.microservice.booking_proto.Cinema.getDefaultInstance() : cinema_;
      }
    }
    /**
     * <code>.net.devh.boot.grpc.example.Cinema cinema = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.microservice.booking_proto.Cinema, com.microservice.booking_proto.Cinema.Builder, com.microservice.booking_proto.CinemaOrBuilder> 
        getCinemaFieldBuilder() {
      if (cinemaBuilder_ == null) {
        cinemaBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.microservice.booking_proto.Cinema, com.microservice.booking_proto.Cinema.Builder, com.microservice.booking_proto.CinemaOrBuilder>(
                getCinema(),
                getParentForChildren(),
                isClean());
        cinema_ = null;
      }
      return cinemaBuilder_;
    }

    private java.lang.Object location_ = "";
    /**
     * <code>string location = 4;</code>
     * @return The location.
     */
    public java.lang.String getLocation() {
      java.lang.Object ref = location_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        location_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string location = 4;</code>
     * @return The bytes for location.
     */
    public com.google.protobuf.ByteString
        getLocationBytes() {
      java.lang.Object ref = location_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        location_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string location = 4;</code>
     * @param value The location to set.
     * @return This builder for chaining.
     */
    public Builder setLocation(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      location_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string location = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearLocation() {
      
      location_ = getDefaultInstance().getLocation();
      onChanged();
      return this;
    }
    /**
     * <code>string location = 4;</code>
     * @param value The bytes for location to set.
     * @return This builder for chaining.
     */
    public Builder setLocationBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      location_ = value;
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


    // @@protoc_insertion_point(builder_scope:net.devh.boot.grpc.example.Room)
  }

  // @@protoc_insertion_point(class_scope:net.devh.boot.grpc.example.Room)
  private static final com.microservice.booking_proto.Room DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.microservice.booking_proto.Room();
  }

  public static com.microservice.booking_proto.Room getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Room>
      PARSER = new com.google.protobuf.AbstractParser<Room>() {
    @java.lang.Override
    public Room parsePartialFrom(
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

  public static com.google.protobuf.Parser<Room> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Room> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.microservice.booking_proto.Room getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

