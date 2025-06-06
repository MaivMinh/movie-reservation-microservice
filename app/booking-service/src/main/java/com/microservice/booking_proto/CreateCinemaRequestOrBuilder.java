// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: booking.proto

package com.microservice.booking_proto;

public interface CreateCinemaRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:net.devh.boot.grpc.example.CreateCinemaRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string address = 2;</code>
   * @return The address.
   */
  java.lang.String getAddress();
  /**
   * <code>string address = 2;</code>
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString
      getAddressBytes();

  /**
   * <code>int32 provinceId = 3;</code>
   * @return The provinceId.
   */
  int getProvinceId();

  /**
   * <code>repeated string photos = 4;</code>
   * @return A list containing the photos.
   */
  java.util.List<java.lang.String>
      getPhotosList();
  /**
   * <code>repeated string photos = 4;</code>
   * @return The count of photos.
   */
  int getPhotosCount();
  /**
   * <code>repeated string photos = 4;</code>
   * @param index The index of the element to return.
   * @return The photos at the given index.
   */
  java.lang.String getPhotos(int index);
  /**
   * <code>repeated string photos = 4;</code>
   * @param index The index of the value to return.
   * @return The bytes of the photos at the given index.
   */
  com.google.protobuf.ByteString
      getPhotosBytes(int index);
}
