// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: movie.proto

package com.microservice.movie_proto;

public interface MovieOrBuilder extends
    // @@protoc_insertion_point(interface_extends:net.devh.boot.grpc.example.Movie)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 id = 1;</code>
   * @return The id.
   */
  int getId();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>string poster = 3;</code>
   * @return The poster.
   */
  java.lang.String getPoster();
  /**
   * <code>string poster = 3;</code>
   * @return The bytes for poster.
   */
  com.google.protobuf.ByteString
      getPosterBytes();

  /**
   * <code>string backdrop = 4;</code>
   * @return The backdrop.
   */
  java.lang.String getBackdrop();
  /**
   * <code>string backdrop = 4;</code>
   * @return The bytes for backdrop.
   */
  com.google.protobuf.ByteString
      getBackdropBytes();

  /**
   * <code>string description = 5;</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 5;</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>string trailer = 6;</code>
   * @return The trailer.
   */
  java.lang.String getTrailer();
  /**
   * <code>string trailer = 6;</code>
   * @return The bytes for trailer.
   */
  com.google.protobuf.ByteString
      getTrailerBytes();

  /**
   * <code>int64 releaseDate = 7;</code>
   * @return The releaseDate.
   */
  long getReleaseDate();

  /**
   * <code>double voteAverage = 8;</code>
   * @return The voteAverage.
   */
  double getVoteAverage();

  /**
   * <code>int32 voteCount = 9;</code>
   * @return The voteCount.
   */
  int getVoteCount();

  /**
   * <code>repeated .net.devh.boot.grpc.example.Genre genre = 10;</code>
   */
  java.util.List<com.microservice.movie_proto.Genre> 
      getGenreList();
  /**
   * <code>repeated .net.devh.boot.grpc.example.Genre genre = 10;</code>
   */
  com.microservice.movie_proto.Genre getGenre(int index);
  /**
   * <code>repeated .net.devh.boot.grpc.example.Genre genre = 10;</code>
   */
  int getGenreCount();
  /**
   * <code>repeated .net.devh.boot.grpc.example.Genre genre = 10;</code>
   */
  java.util.List<? extends com.microservice.movie_proto.GenreOrBuilder> 
      getGenreOrBuilderList();
  /**
   * <code>repeated .net.devh.boot.grpc.example.Genre genre = 10;</code>
   */
  com.microservice.movie_proto.GenreOrBuilder getGenreOrBuilder(
      int index);

  /**
   * <code>string status = 11;</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <code>string status = 11;</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();
}
