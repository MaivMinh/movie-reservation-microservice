// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: booking.proto

package com.microservice.booking_proto;

/**
 * Protobuf type {@code net.devh.boot.grpc.example.SearchCinemasRequest}
 */
public final class SearchCinemasRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:net.devh.boot.grpc.example.SearchCinemasRequest)
    SearchCinemasRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SearchCinemasRequest.newBuilder() to construct.
  private SearchCinemasRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SearchCinemasRequest() {
    sort_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SearchCinemasRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.microservice.booking_proto.BookingProto.internal_static_net_devh_boot_grpc_example_SearchCinemasRequest_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetCriteria();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.microservice.booking_proto.BookingProto.internal_static_net_devh_boot_grpc_example_SearchCinemasRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.microservice.booking_proto.SearchCinemasRequest.class, com.microservice.booking_proto.SearchCinemasRequest.Builder.class);
  }

  public static final int CRITERIA_FIELD_NUMBER = 1;
  private static final class CriteriaDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                com.microservice.booking_proto.BookingProto.internal_static_net_devh_boot_grpc_example_SearchCinemasRequest_CriteriaEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> criteria_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetCriteria() {
    if (criteria_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          CriteriaDefaultEntryHolder.defaultEntry);
    }
    return criteria_;
  }

  public int getCriteriaCount() {
    return internalGetCriteria().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; criteria = 1;</code>
   */

  @java.lang.Override
  public boolean containsCriteria(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    return internalGetCriteria().getMap().containsKey(key);
  }
  /**
   * Use {@link #getCriteriaMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getCriteria() {
    return getCriteriaMap();
  }
  /**
   * <code>map&lt;string, string&gt; criteria = 1;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, java.lang.String> getCriteriaMap() {
    return internalGetCriteria().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; criteria = 1;</code>
   */
  @java.lang.Override

  public java.lang.String getCriteriaOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetCriteria().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; criteria = 1;</code>
   */
  @java.lang.Override

  public java.lang.String getCriteriaOrThrow(
      java.lang.String key) {
    if (key == null) { throw new NullPointerException("map key"); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetCriteria().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int PAGE_FIELD_NUMBER = 2;
  private int page_;
  /**
   * <code>int32 page = 2;</code>
   * @return The page.
   */
  @java.lang.Override
  public int getPage() {
    return page_;
  }

  public static final int SIZE_FIELD_NUMBER = 3;
  private int size_;
  /**
   * <code>int32 size = 3;</code>
   * @return The size.
   */
  @java.lang.Override
  public int getSize() {
    return size_;
  }

  public static final int SORT_FIELD_NUMBER = 4;
  private volatile java.lang.Object sort_;
  /**
   * <code>string sort = 4;</code>
   * @return The sort.
   */
  @java.lang.Override
  public java.lang.String getSort() {
    java.lang.Object ref = sort_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sort_ = s;
      return s;
    }
  }
  /**
   * <code>string sort = 4;</code>
   * @return The bytes for sort.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSortBytes() {
    java.lang.Object ref = sort_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sort_ = b;
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetCriteria(),
        CriteriaDefaultEntryHolder.defaultEntry,
        1);
    if (page_ != 0) {
      output.writeInt32(2, page_);
    }
    if (size_ != 0) {
      output.writeInt32(3, size_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sort_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, sort_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetCriteria().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      criteria__ = CriteriaDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, criteria__);
    }
    if (page_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, page_);
    }
    if (size_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, size_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sort_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, sort_);
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
    if (!(obj instanceof com.microservice.booking_proto.SearchCinemasRequest)) {
      return super.equals(obj);
    }
    com.microservice.booking_proto.SearchCinemasRequest other = (com.microservice.booking_proto.SearchCinemasRequest) obj;

    if (!internalGetCriteria().equals(
        other.internalGetCriteria())) return false;
    if (getPage()
        != other.getPage()) return false;
    if (getSize()
        != other.getSize()) return false;
    if (!getSort()
        .equals(other.getSort())) return false;
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
    if (!internalGetCriteria().getMap().isEmpty()) {
      hash = (37 * hash) + CRITERIA_FIELD_NUMBER;
      hash = (53 * hash) + internalGetCriteria().hashCode();
    }
    hash = (37 * hash) + PAGE_FIELD_NUMBER;
    hash = (53 * hash) + getPage();
    hash = (37 * hash) + SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getSize();
    hash = (37 * hash) + SORT_FIELD_NUMBER;
    hash = (53 * hash) + getSort().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.microservice.booking_proto.SearchCinemasRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.microservice.booking_proto.SearchCinemasRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.microservice.booking_proto.SearchCinemasRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.microservice.booking_proto.SearchCinemasRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.microservice.booking_proto.SearchCinemasRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.microservice.booking_proto.SearchCinemasRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.microservice.booking_proto.SearchCinemasRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.microservice.booking_proto.SearchCinemasRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.microservice.booking_proto.SearchCinemasRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.microservice.booking_proto.SearchCinemasRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.microservice.booking_proto.SearchCinemasRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.microservice.booking_proto.SearchCinemasRequest parseFrom(
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
  public static Builder newBuilder(com.microservice.booking_proto.SearchCinemasRequest prototype) {
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
   * Protobuf type {@code net.devh.boot.grpc.example.SearchCinemasRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:net.devh.boot.grpc.example.SearchCinemasRequest)
      com.microservice.booking_proto.SearchCinemasRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.microservice.booking_proto.BookingProto.internal_static_net_devh_boot_grpc_example_SearchCinemasRequest_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetCriteria();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableCriteria();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.microservice.booking_proto.BookingProto.internal_static_net_devh_boot_grpc_example_SearchCinemasRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.microservice.booking_proto.SearchCinemasRequest.class, com.microservice.booking_proto.SearchCinemasRequest.Builder.class);
    }

    // Construct using com.microservice.booking_proto.SearchCinemasRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      internalGetMutableCriteria().clear();
      page_ = 0;

      size_ = 0;

      sort_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.microservice.booking_proto.BookingProto.internal_static_net_devh_boot_grpc_example_SearchCinemasRequest_descriptor;
    }

    @java.lang.Override
    public com.microservice.booking_proto.SearchCinemasRequest getDefaultInstanceForType() {
      return com.microservice.booking_proto.SearchCinemasRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.microservice.booking_proto.SearchCinemasRequest build() {
      com.microservice.booking_proto.SearchCinemasRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.microservice.booking_proto.SearchCinemasRequest buildPartial() {
      com.microservice.booking_proto.SearchCinemasRequest result = new com.microservice.booking_proto.SearchCinemasRequest(this);
      int from_bitField0_ = bitField0_;
      result.criteria_ = internalGetCriteria();
      result.criteria_.makeImmutable();
      result.page_ = page_;
      result.size_ = size_;
      result.sort_ = sort_;
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
      if (other instanceof com.microservice.booking_proto.SearchCinemasRequest) {
        return mergeFrom((com.microservice.booking_proto.SearchCinemasRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.microservice.booking_proto.SearchCinemasRequest other) {
      if (other == com.microservice.booking_proto.SearchCinemasRequest.getDefaultInstance()) return this;
      internalGetMutableCriteria().mergeFrom(
          other.internalGetCriteria());
      if (other.getPage() != 0) {
        setPage(other.getPage());
      }
      if (other.getSize() != 0) {
        setSize(other.getSize());
      }
      if (!other.getSort().isEmpty()) {
        sort_ = other.sort_;
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
            case 10: {
              com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
              criteria__ = input.readMessage(
                  CriteriaDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableCriteria().getMutableMap().put(
                  criteria__.getKey(), criteria__.getValue());
              break;
            } // case 10
            case 16: {
              page_ = input.readInt32();

              break;
            } // case 16
            case 24: {
              size_ = input.readInt32();

              break;
            } // case 24
            case 34: {
              sort_ = input.readStringRequireUtf8();

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
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> criteria_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetCriteria() {
      if (criteria_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            CriteriaDefaultEntryHolder.defaultEntry);
      }
      return criteria_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableCriteria() {
      onChanged();;
      if (criteria_ == null) {
        criteria_ = com.google.protobuf.MapField.newMapField(
            CriteriaDefaultEntryHolder.defaultEntry);
      }
      if (!criteria_.isMutable()) {
        criteria_ = criteria_.copy();
      }
      return criteria_;
    }

    public int getCriteriaCount() {
      return internalGetCriteria().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; criteria = 1;</code>
     */

    @java.lang.Override
    public boolean containsCriteria(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      return internalGetCriteria().getMap().containsKey(key);
    }
    /**
     * Use {@link #getCriteriaMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getCriteria() {
      return getCriteriaMap();
    }
    /**
     * <code>map&lt;string, string&gt; criteria = 1;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.String> getCriteriaMap() {
      return internalGetCriteria().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; criteria = 1;</code>
     */
    @java.lang.Override

    public java.lang.String getCriteriaOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetCriteria().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; criteria = 1;</code>
     */
    @java.lang.Override

    public java.lang.String getCriteriaOrThrow(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetCriteria().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearCriteria() {
      internalGetMutableCriteria().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; criteria = 1;</code>
     */

    public Builder removeCriteria(
        java.lang.String key) {
      if (key == null) { throw new NullPointerException("map key"); }
      internalGetMutableCriteria().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableCriteria() {
      return internalGetMutableCriteria().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; criteria = 1;</code>
     */
    public Builder putCriteria(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new NullPointerException("map key"); }
      if (value == null) {
  throw new NullPointerException("map value");
}

      internalGetMutableCriteria().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; criteria = 1;</code>
     */

    public Builder putAllCriteria(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableCriteria().getMutableMap()
          .putAll(values);
      return this;
    }

    private int page_ ;
    /**
     * <code>int32 page = 2;</code>
     * @return The page.
     */
    @java.lang.Override
    public int getPage() {
      return page_;
    }
    /**
     * <code>int32 page = 2;</code>
     * @param value The page to set.
     * @return This builder for chaining.
     */
    public Builder setPage(int value) {
      
      page_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 page = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearPage() {
      
      page_ = 0;
      onChanged();
      return this;
    }

    private int size_ ;
    /**
     * <code>int32 size = 3;</code>
     * @return The size.
     */
    @java.lang.Override
    public int getSize() {
      return size_;
    }
    /**
     * <code>int32 size = 3;</code>
     * @param value The size to set.
     * @return This builder for chaining.
     */
    public Builder setSize(int value) {
      
      size_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 size = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSize() {
      
      size_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object sort_ = "";
    /**
     * <code>string sort = 4;</code>
     * @return The sort.
     */
    public java.lang.String getSort() {
      java.lang.Object ref = sort_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sort_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sort = 4;</code>
     * @return The bytes for sort.
     */
    public com.google.protobuf.ByteString
        getSortBytes() {
      java.lang.Object ref = sort_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sort_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sort = 4;</code>
     * @param value The sort to set.
     * @return This builder for chaining.
     */
    public Builder setSort(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sort_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sort = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSort() {
      
      sort_ = getDefaultInstance().getSort();
      onChanged();
      return this;
    }
    /**
     * <code>string sort = 4;</code>
     * @param value The bytes for sort to set.
     * @return This builder for chaining.
     */
    public Builder setSortBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sort_ = value;
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


    // @@protoc_insertion_point(builder_scope:net.devh.boot.grpc.example.SearchCinemasRequest)
  }

  // @@protoc_insertion_point(class_scope:net.devh.boot.grpc.example.SearchCinemasRequest)
  private static final com.microservice.booking_proto.SearchCinemasRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.microservice.booking_proto.SearchCinemasRequest();
  }

  public static com.microservice.booking_proto.SearchCinemasRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchCinemasRequest>
      PARSER = new com.google.protobuf.AbstractParser<SearchCinemasRequest>() {
    @java.lang.Override
    public SearchCinemasRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchCinemasRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchCinemasRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.microservice.booking_proto.SearchCinemasRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

