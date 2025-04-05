package com.microservice.bff.controller;

import com.microservice.bff.request.CreateShowtime;
import com.microservice.bff.request.UpdateShowtime;
import com.microservice.bff.response.ResponseData;
import com.microservice.bff.response.ResponseError;
import com.microservice.bff.service.AuthService;
import com.microservice.bff.service.ShowtimeService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/showtimes")
public class ShowtimeController {
  private final ShowtimeService showtimeService;

  /// Hàm lấy thông tin 1 suất chiếu.
  /// Done.
  @GetMapping(value = "/{id}")
  public ResponseEntity<ResponseData> getShowtime(@PathVariable(name = "id") int id, HttpServletRequest servletRequest) {
    /// Kiểm tra xem là anonymous user hay authenticated user
    if (!StringUtils.hasText(servletRequest.getHeader("X-ACCOUNT-ID"))) {
      return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseError(HttpStatus.UNAUTHORIZED.value(), "Unauthenticated user"));
    }

    ResponseData response = showtimeService.getShowtime(id);
    return ResponseEntity.status(response.getStatus()).body(response);
  }


  /// Hàm lấy danh sách suất chiếu.
  /// Done.
  @GetMapping(value = "")
  public ResponseEntity<ResponseData> getShowtimes(@RequestParam(name = "page", defaultValue = "1", required = false) int page,
                                                   @RequestParam(name = "size", defaultValue = "10", required = false) int size,
                                                   @RequestParam(name = "sort", defaultValue = "", required = false) String sort,
                                                   HttpServletRequest servletRequest) {

    /// Kiểm tra xem là anonymous user hay authenticated user
    if (!StringUtils.hasText(servletRequest.getHeader("X-ACCOUNT-ID"))) {
      return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseError(HttpStatus.UNAUTHORIZED.value(), "Unauthenticated user"));
    }


    page = page < 0 ? 0 : page - 1;
    size = size < 1 ? 10 : size;

    ResponseData response = showtimeService.getShowtimes(page, size, sort);
    return ResponseEntity.status(response.getStatus()).body(response);
  }

  /// Hàm thực hiện tạo mới một suất chiếu
  /// Done
  @PostMapping(value = "")
  public ResponseEntity<ResponseData> createShowtime(@RequestBody CreateShowtime createShowtime) {

    ResponseData response = showtimeService.createShowtime(createShowtime);
    return ResponseEntity.status(response.getStatus()).body(response);
  }


  /// Hàm cập nhật thông tin của một suất chiếu
  /// Done
  @PatchMapping(value = "/{id}")
  public ResponseEntity<ResponseData> updateShowtime(@PathVariable(name = "id") int id, @RequestBody UpdateShowtime updateShowtime) {
    ResponseData response = showtimeService.updateShowtime(id, updateShowtime);
    return ResponseEntity.status(response.getStatus()).body(response);
  }

  /// Hàm xoá một suất chiếu
  /// Done
  @DeleteMapping(value = "/{id}")
  public ResponseEntity<ResponseData> deleteShowtime(@PathVariable(name = "id") int id) {
    ResponseData response = showtimeService.deleteShowtime(id);
    return ResponseEntity.status(response.getStatus()).body(response);
  }

  /// Hàm tìm kiếm suất chiếu theo điều kiện
  /// Done
  @PostMapping(value = "/search")
  public ResponseEntity<ResponseData> searchShowtimes(@RequestBody Map<String, String> criteria,
                                                      @RequestParam(name = "page", defaultValue = "1", required = false) int page,
                                                      @RequestParam(name = "size", defaultValue = "10", required = false) int size,
                                                      @RequestParam(name = "sort", defaultValue = "", required = false) String sort) {
    page = page < 0 ? 0 : page - 1;
    size = size < 1 ? 10 : size;

    ResponseData response = showtimeService.searchShowtimes(criteria, page, size, sort);
    return ResponseEntity.status(response.getStatus()).body(response);
  }
}
