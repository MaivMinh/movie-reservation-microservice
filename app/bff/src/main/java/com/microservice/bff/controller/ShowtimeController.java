package com.microservice.bff.controller;

import com.microservice.bff.request.CreateShowtime;
import com.microservice.bff.request.UpdateShowtime;
import com.microservice.bff.response.ResponseData;
import com.microservice.bff.service.ShowtimeService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
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
  public ResponseEntity<ResponseData> getShowtime(@PathVariable(name = "id") int id) {
    ResponseData response = showtimeService.getShowtime(id);
    return ResponseEntity.ok(response);
  }


  /// Hàm lấy danh sách suất chiếu.
  /// Done.
  @GetMapping(value = "")
  public ResponseEntity<ResponseData> getShowtimes(@RequestParam(name = "page", defaultValue = "1", required = false) int page,
                                                   @RequestParam(name = "size", defaultValue = "10", required = false) int size,
                                                   @RequestParam(name = "sort", defaultValue = "", required = false) String sort) {
    page = page < 0 ? 0 : page - 1;
    size = size < 1 ? 10 : size;

    ResponseData response = showtimeService.getShowtimes(page, size, sort);
    return ResponseEntity.ok(response);
  }

  /// Hàm thực hiện tạo mới một suất chiếu
  /// Done
  @PostMapping(value = "")
  public ResponseEntity<ResponseData> createShowtime(@RequestBody CreateShowtime createShowtime) {
    ResponseData response = showtimeService.createShowtime(createShowtime);
    return ResponseEntity.ok(response);
  }


  /// Hàm cập nhật thông tin của một suất chiếu
  /// Done
  @PatchMapping(value = "/{id}")
  public ResponseEntity<ResponseData> updateShowtime(@PathVariable(name = "id") int id, @RequestBody UpdateShowtime updateShowtime) {
    ResponseData response = showtimeService.updateShowtime(id, updateShowtime);
    return ResponseEntity.ok(response);
  }

  /// Hàm xoá một suất chiếu
  /// Done
  @DeleteMapping(value = "/{id}")
  public ResponseEntity<ResponseData> deleteShowtime(@PathVariable(name = "id") int id) {
    ResponseData response = showtimeService.deleteShowtime(id);
    return ResponseEntity.ok(response);
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
    return ResponseEntity.ok(response);
  }
}
