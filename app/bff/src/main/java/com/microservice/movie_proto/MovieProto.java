// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: movie.proto

package com.microservice.movie_proto;

public final class MovieProto {
  private MovieProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_devh_boot_grpc_example_IsMoviePlayingNowRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_devh_boot_grpc_example_IsMoviePlayingNowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_devh_boot_grpc_example_IsMoviePlayingNowResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_devh_boot_grpc_example_IsMoviePlayingNowResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_devh_boot_grpc_example_UpdateMovie_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_devh_boot_grpc_example_UpdateMovie_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_devh_boot_grpc_example_UpdateMovieRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_devh_boot_grpc_example_UpdateMovieRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_devh_boot_grpc_example_UpdateMovieResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_devh_boot_grpc_example_UpdateMovieResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_devh_boot_grpc_example_SearchMoviesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_devh_boot_grpc_example_SearchMoviesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_devh_boot_grpc_example_SearchMoviesRequest_CriteriaEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_devh_boot_grpc_example_SearchMoviesRequest_CriteriaEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_devh_boot_grpc_example_SearchMoviesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_devh_boot_grpc_example_SearchMoviesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_devh_boot_grpc_example_GetMovieRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_devh_boot_grpc_example_GetMovieRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_devh_boot_grpc_example_GetMovieResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_devh_boot_grpc_example_GetMovieResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_devh_boot_grpc_example_GetMoviesRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_devh_boot_grpc_example_GetMoviesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_devh_boot_grpc_example_GetMoviesResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_devh_boot_grpc_example_GetMoviesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_devh_boot_grpc_example_Genre_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_devh_boot_grpc_example_Genre_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_devh_boot_grpc_example_Movie_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_devh_boot_grpc_example_Movie_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_devh_boot_grpc_example_NewMovie_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_devh_boot_grpc_example_NewMovie_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_devh_boot_grpc_example_CreateMovieRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_devh_boot_grpc_example_CreateMovieRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_net_devh_boot_grpc_example_CreateMovieResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_net_devh_boot_grpc_example_CreateMovieResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013movie.proto\022\032net.devh.boot.grpc.exampl" +
      "e\032\036google/protobuf/wrappers.proto\"&\n\030IsM" +
      "oviePlayingNowRequest\022\n\n\002id\030\001 \001(\005\"R\n\031IsM" +
      "oviePlayingNowResponse\022\016\n\006status\030\001 \001(\005\022\017" +
      "\n\007message\030\002 \001(\t\022\024\n\014isNowPlaying\030\003 \001(\010\"\345\002" +
      "\n\013UpdateMovie\022\n\n\002id\030\001 \001(\005\022*\n\004name\030\002 \001(\0132" +
      "\034.google.protobuf.StringValue\022,\n\006poster\030" +
      "\003 \001(\0132\034.google.protobuf.StringValue\022.\n\010b" +
      "ackdrop\030\004 \001(\0132\034.google.protobuf.StringVa" +
      "lue\0221\n\013description\030\005 \001(\0132\034.google.protob" +
      "uf.StringValue\022-\n\007trailer\030\006 \001(\0132\034.google" +
      ".protobuf.StringValue\0220\n\013releaseDate\030\007 \001" +
      "(\0132\033.google.protobuf.Int64Value\022,\n\006statu" +
      "s\030\010 \001(\0132\034.google.protobuf.StringValue\"L\n" +
      "\022UpdateMovieRequest\0226\n\005movie\030\001 \001(\0132\'.net" +
      ".devh.boot.grpc.example.UpdateMovie\"6\n\023U" +
      "pdateMovieResponse\022\016\n\006status\030\001 \001(\005\022\017\n\007me" +
      "ssage\030\002 \001(\t\"\301\001\n\023SearchMoviesRequest\022O\n\010c" +
      "riteria\030\001 \003(\0132=.net.devh.boot.grpc.examp" +
      "le.SearchMoviesRequest.CriteriaEntry\022\014\n\004" +
      "page\030\002 \001(\005\022\014\n\004size\030\003 \001(\005\022\014\n\004sort\030\004 \001(\t\032/" +
      "\n\rCriteriaEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 " +
      "\001(\t:\0028\001\"\223\001\n\024SearchMoviesResponse\022\016\n\006stat" +
      "us\030\001 \001(\005\022\017\n\007message\030\002 \001(\t\0221\n\006movies\030\003 \003(" +
      "\0132!.net.devh.boot.grpc.example.Movie\022\021\n\t" +
      "totalPage\030\004 \001(\003\022\024\n\014totalElement\030\005 \001(\003\"\035\n" +
      "\017GetMovieRequest\022\n\n\002id\030\001 \001(\005\"e\n\020GetMovie" +
      "Response\022\016\n\006status\030\001 \001(\005\022\017\n\007message\030\002 \001(" +
      "\t\0220\n\005movie\030\003 \001(\0132!.net.devh.boot.grpc.ex" +
      "ample.Movie\"<\n\020GetMoviesRequest\022\014\n\004page\030" +
      "\001 \001(\005\022\014\n\004size\030\002 \001(\005\022\014\n\004sort\030\003 \001(\t\"\220\001\n\021Ge" +
      "tMoviesResponse\022\016\n\006status\030\001 \001(\005\022\017\n\007messa" +
      "ge\030\002 \001(\t\0221\n\006movies\030\003 \003(\0132!.net.devh.boot" +
      ".grpc.example.Movie\022\021\n\ttotalPage\030\004 \001(\003\022\024" +
      "\n\014totalElement\030\005 \001(\003\"!\n\005Genre\022\n\n\002id\030\001 \001(" +
      "\005\022\014\n\004name\030\002 \001(\t\"\350\001\n\005Movie\022\n\n\002id\030\001 \001(\005\022\014\n" +
      "\004name\030\002 \001(\t\022\016\n\006poster\030\003 \001(\t\022\020\n\010backdrop\030" +
      "\004 \001(\t\022\023\n\013description\030\005 \001(\t\022\017\n\007trailer\030\006 " +
      "\001(\t\022\023\n\013releaseDate\030\007 \001(\003\022\023\n\013voteAverage\030" +
      "\010 \001(\001\022\021\n\tvoteCount\030\t \001(\005\0220\n\005genre\030\n \003(\0132" +
      "!.net.devh.boot.grpc.example.Genre\022\016\n\006st" +
      "atus\030\013 \001(\t\"\204\001\n\010NewMovie\022\014\n\004name\030\001 \001(\t\022\016\n" +
      "\006poster\030\002 \001(\t\022\020\n\010backdrop\030\003 \001(\t\022\023\n\013descr" +
      "iption\030\004 \001(\t\022\017\n\007trailer\030\005 \001(\t\022\023\n\013release" +
      "Date\030\006 \001(\003\022\r\n\005genre\030\007 \003(\005\"I\n\022CreateMovie" +
      "Request\0223\n\005movie\030\001 \001(\0132$.net.devh.boot.g" +
      "rpc.example.NewMovie\"6\n\023CreateMovieRespo" +
      "nse\022\016\n\006status\030\001 \001(\005\022\017\n\007message\030\002 \001(\t2\265\005\n" +
      "\014MovieService\022n\n\013createMovie\022..net.devh." +
      "boot.grpc.example.CreateMovieRequest\032/.n" +
      "et.devh.boot.grpc.example.CreateMovieRes" +
      "ponse\022h\n\tgetMovies\022,.net.devh.boot.grpc." +
      "example.GetMoviesRequest\032-.net.devh.boot" +
      ".grpc.example.GetMoviesResponse\022e\n\010getMo" +
      "vie\022+.net.devh.boot.grpc.example.GetMovi" +
      "eRequest\032,.net.devh.boot.grpc.example.Ge" +
      "tMovieResponse\022q\n\014searchMovies\022/.net.dev" +
      "h.boot.grpc.example.SearchMoviesRequest\032" +
      "0.net.devh.boot.grpc.example.SearchMovie" +
      "sResponse\022n\n\013updateMovie\022..net.devh.boot" +
      ".grpc.example.UpdateMovieRequest\032/.net.d" +
      "evh.boot.grpc.example.UpdateMovieRespons" +
      "e\022\200\001\n\021isMoviePlayingNow\0224.net.devh.boot." +
      "grpc.example.IsMoviePlayingNowRequest\0325." +
      "net.devh.boot.grpc.example.IsMoviePlayin" +
      "gNowResponseB,\n\034com.microservice.movie_p" +
      "rotoB\nMovieProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.WrappersProto.getDescriptor(),
        });
    internal_static_net_devh_boot_grpc_example_IsMoviePlayingNowRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_net_devh_boot_grpc_example_IsMoviePlayingNowRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_devh_boot_grpc_example_IsMoviePlayingNowRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_net_devh_boot_grpc_example_IsMoviePlayingNowResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_net_devh_boot_grpc_example_IsMoviePlayingNowResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_devh_boot_grpc_example_IsMoviePlayingNowResponse_descriptor,
        new java.lang.String[] { "Status", "Message", "IsNowPlaying", });
    internal_static_net_devh_boot_grpc_example_UpdateMovie_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_net_devh_boot_grpc_example_UpdateMovie_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_devh_boot_grpc_example_UpdateMovie_descriptor,
        new java.lang.String[] { "Id", "Name", "Poster", "Backdrop", "Description", "Trailer", "ReleaseDate", "Status", });
    internal_static_net_devh_boot_grpc_example_UpdateMovieRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_net_devh_boot_grpc_example_UpdateMovieRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_devh_boot_grpc_example_UpdateMovieRequest_descriptor,
        new java.lang.String[] { "Movie", });
    internal_static_net_devh_boot_grpc_example_UpdateMovieResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_net_devh_boot_grpc_example_UpdateMovieResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_devh_boot_grpc_example_UpdateMovieResponse_descriptor,
        new java.lang.String[] { "Status", "Message", });
    internal_static_net_devh_boot_grpc_example_SearchMoviesRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_net_devh_boot_grpc_example_SearchMoviesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_devh_boot_grpc_example_SearchMoviesRequest_descriptor,
        new java.lang.String[] { "Criteria", "Page", "Size", "Sort", });
    internal_static_net_devh_boot_grpc_example_SearchMoviesRequest_CriteriaEntry_descriptor =
      internal_static_net_devh_boot_grpc_example_SearchMoviesRequest_descriptor.getNestedTypes().get(0);
    internal_static_net_devh_boot_grpc_example_SearchMoviesRequest_CriteriaEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_devh_boot_grpc_example_SearchMoviesRequest_CriteriaEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_net_devh_boot_grpc_example_SearchMoviesResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_net_devh_boot_grpc_example_SearchMoviesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_devh_boot_grpc_example_SearchMoviesResponse_descriptor,
        new java.lang.String[] { "Status", "Message", "Movies", "TotalPage", "TotalElement", });
    internal_static_net_devh_boot_grpc_example_GetMovieRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_net_devh_boot_grpc_example_GetMovieRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_devh_boot_grpc_example_GetMovieRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_net_devh_boot_grpc_example_GetMovieResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_net_devh_boot_grpc_example_GetMovieResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_devh_boot_grpc_example_GetMovieResponse_descriptor,
        new java.lang.String[] { "Status", "Message", "Movie", });
    internal_static_net_devh_boot_grpc_example_GetMoviesRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_net_devh_boot_grpc_example_GetMoviesRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_devh_boot_grpc_example_GetMoviesRequest_descriptor,
        new java.lang.String[] { "Page", "Size", "Sort", });
    internal_static_net_devh_boot_grpc_example_GetMoviesResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_net_devh_boot_grpc_example_GetMoviesResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_devh_boot_grpc_example_GetMoviesResponse_descriptor,
        new java.lang.String[] { "Status", "Message", "Movies", "TotalPage", "TotalElement", });
    internal_static_net_devh_boot_grpc_example_Genre_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_net_devh_boot_grpc_example_Genre_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_devh_boot_grpc_example_Genre_descriptor,
        new java.lang.String[] { "Id", "Name", });
    internal_static_net_devh_boot_grpc_example_Movie_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_net_devh_boot_grpc_example_Movie_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_devh_boot_grpc_example_Movie_descriptor,
        new java.lang.String[] { "Id", "Name", "Poster", "Backdrop", "Description", "Trailer", "ReleaseDate", "VoteAverage", "VoteCount", "Genre", "Status", });
    internal_static_net_devh_boot_grpc_example_NewMovie_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_net_devh_boot_grpc_example_NewMovie_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_devh_boot_grpc_example_NewMovie_descriptor,
        new java.lang.String[] { "Name", "Poster", "Backdrop", "Description", "Trailer", "ReleaseDate", "Genre", });
    internal_static_net_devh_boot_grpc_example_CreateMovieRequest_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_net_devh_boot_grpc_example_CreateMovieRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_devh_boot_grpc_example_CreateMovieRequest_descriptor,
        new java.lang.String[] { "Movie", });
    internal_static_net_devh_boot_grpc_example_CreateMovieResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_net_devh_boot_grpc_example_CreateMovieResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_net_devh_boot_grpc_example_CreateMovieResponse_descriptor,
        new java.lang.String[] { "Status", "Message", });
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
