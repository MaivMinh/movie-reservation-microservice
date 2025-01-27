// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: booking.proto

package com.microservice.booking_proto;

public interface SearchCinemasRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:net.devh.boot.grpc.example.SearchCinemasRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, string&gt; criteria = 1;</code>
   */
  int getCriteriaCount();
  /**
   * <code>map&lt;string, string&gt; criteria = 1;</code>
   */
  boolean containsCriteria(
      java.lang.String key);
  /**
   * Use {@link #getCriteriaMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getCriteria();
  /**
   * <code>map&lt;string, string&gt; criteria = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getCriteriaMap();
  /**
   * <code>map&lt;string, string&gt; criteria = 1;</code>
   */

  /* nullable */
java.lang.String getCriteriaOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; criteria = 1;</code>
   */

  java.lang.String getCriteriaOrThrow(
      java.lang.String key);

  /**
   * <code>int32 page = 2;</code>
   * @return The page.
   */
  int getPage();

  /**
   * <code>int32 size = 3;</code>
   * @return The size.
   */
  int getSize();

  /**
   * <code>string sort = 4;</code>
   * @return The sort.
   */
  java.lang.String getSort();
  /**
   * <code>string sort = 4;</code>
   * @return The bytes for sort.
   */
  com.google.protobuf.ByteString
      getSortBytes();
}
