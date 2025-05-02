package com.microservice.bff.service;

import com.google.protobuf.StringValue;
import com.microservice.bff.exceptions.ResourceNotFoundException;
import com.microservice.bff.grpc.BookingServiceGrpcClient;
import com.microservice.bff.request.CreateCinema;
import com.microservice.bff.request.UpdateCinema;
import com.microservice.bff.response.Cinema;
import com.microservice.bff.response.Province;
import com.microservice.bff.response.ResponseData;
import com.microservice.booking_proto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
@Service
public class CinemaService {
  private final BookingServiceGrpcClient bookingServiceGrpcClient;

  public ResponseData createCinema(CreateCinema createCinema) {
    CreateCinemaRequest request = CreateCinemaRequest.newBuilder()
            .setName(createCinema.getName())
            .setAddress(createCinema.getAddress())
            .setProvinceId(createCinema.getProvince().getId())
            .addAllPhotos(Arrays.stream(createCinema.getPhotos()).toList())
            .build();

    CreateCinemaResponse response = bookingServiceGrpcClient.createCinema(request);
    if (response.getStatus() == HttpStatus.NOT_FOUND.value()) {
      throw new ResourceNotFoundException(response.getMessage());
    }
    if (response.getStatus() == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
      throw new RuntimeException(response.getMessage());
    }
    return ResponseData.builder()
            .status(response.getStatus())
            .message(response.getMessage())
            .build();
  }

  public ResponseData getCinemas(int page, int size, String sort) {
    GetCinemasRequest request = GetCinemasRequest.newBuilder()
            .setPage(page)
            .setSize(size)
            .setSort(sort)
            .build();

    GetCinemasResponse response = bookingServiceGrpcClient.getCinemas(request);
    if (response.getStatus() == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
      throw new RuntimeException(response.getMessage());
    }
    List<Cinema> cinemas = response.getCinemasList().stream().map(
            cinema -> {
              return Cinema.builder()
                      .id(cinema.getId())
                      .name(cinema.getName())
                      .address(cinema.getAddress())
                      .province(Province.builder()
                              .id(cinema.getProvince().getId())
                              .name(cinema.getProvince().getName())
                              .build())
                      .photos(cinema.getPhotosList().stream().toList())
                      .build();
            }
    ).toList();
    return ResponseData.builder()
            .status(200)
            .message("Success")
            .data(Map.of(
                    "cinemas", cinemas,
                    "totalElement", response.getTotalElement(),
                    "totalPage", response.getTotalPage(),
                    "page", page + 1,
                    "size", size
            ))
            .build();
  }

  public ResponseData getCinema(int id) {
    GetCinemaRequest request = GetCinemaRequest.newBuilder()
            .setId(id)
            .build();

    GetCinemaResponse response = bookingServiceGrpcClient.getCinema(request);
    if (response.getStatus() == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
      throw new RuntimeException(response.getMessage());
    }
    if (response.getStatus() == HttpStatus.NOT_FOUND.value()) {
      throw new ResourceNotFoundException(response.getMessage());
    }

    Cinema cinema = Cinema.builder()
            .id(response.getCinema().getId())
            .name(response.getCinema().getName())
            .address(response.getCinema().getAddress())
            .province(Province.builder()
                    .id(response.getCinema().getProvince().getId())
                    .name(response.getCinema().getProvince().getName())
                    .build())
            .photos(response.getCinema().getPhotosList().stream().toList())
            .build();

    return ResponseData.builder()
            .status(response.getStatus())
            .message(response.getMessage())
            .data(cinema)
            .build();
  }

  public ResponseData searchCinemas(Map<String, String> criteria, int page, int size, String sort) {
    if (criteria == null || criteria.isEmpty()) {
      criteria = new HashMap<>();
    }
    SearchCinemasRequest request = SearchCinemasRequest.newBuilder()
            .putAllCriteria(criteria)
            .setPage(page)
            .setSize(size)
            .setSort(sort)
            .build();

    SearchCinemasResponse response = bookingServiceGrpcClient.searchCinemas(request);
    if (response.getStatus() == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
      throw new RuntimeException(response.getMessage());
    }
    List<Cinema> cinemas = response.getCinemasList().stream().map(
            cinema -> {
              return Cinema.builder()
                      .id(cinema.getId())
                      .name(cinema.getName())
                      .address(cinema.getAddress())
                      .province(Province.builder()
                              .id(cinema.getProvince().getId())
                              .name(cinema.getProvince().getName())
                              .build())
                      .photos(cinema.getPhotosList().stream().toList())
                      .build();
            }
    ).toList();

    return ResponseData.builder()
            .status(response.getStatus())
            .message(response.getMessage())
            .data(Map.of(
                    "cinemas", cinemas,
                    "totalElement", response.getTotalElement(),
                    "totalPage", response.getTotalPage(),
                    "page", page + 1,
                    "size", size
            ))
            .build();
  }

  public ResponseData updateCinema(int id, UpdateCinema updateCinema) {
    UpdateCinemaRequest.Builder builder = UpdateCinemaRequest.newBuilder();
    builder.setId(id);
    if (StringUtils.hasText(updateCinema.getName())) {
      builder.setName(StringValue.of(updateCinema.getName()));
    }
    if (StringUtils.hasText(updateCinema.getAddress())) {
      builder.setAddress(StringValue.of(updateCinema.getAddress()));
    }
    if (updateCinema.getProvince() != null) {
      builder.setProvince(com.microservice.booking_proto.Province.newBuilder()
              .setId(updateCinema.getProvince().getId())
              .build());
    }
    UpdateCinemaRequest request = builder.build();
    UpdateCinemaResponse response = bookingServiceGrpcClient.updateCinema(request);
    if (response.getStatus() == HttpStatus.NOT_FOUND.value()) {
      throw new ResourceNotFoundException(response.getMessage());
    }
    if (response.getStatus() == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
      throw new RuntimeException(response.getMessage());
    }
    return ResponseData.builder()
            .status(response.getStatus())
            .message(response.getMessage())
            .build();
  }
}
