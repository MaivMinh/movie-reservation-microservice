package com.microservice.bff.controller;

import com.microservice.bff.request.CreateCinema;
import com.microservice.bff.request.UpdateCinema;
import com.microservice.bff.response.ResponseData;
import com.microservice.bff.service.AuthService;
import com.microservice.bff.service.BookingService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.ws.rs.Path;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/bookings")
@RequiredArgsConstructor
public class BookingController {

  private final AuthService authService;
  private final BookingService bookingService;

  /// Hàm thực hiện lấy danh sách Cinema.
  /// Done.
  @GetMapping("/cinemas")
  public ResponseEntity<ResponseData> getCinemas(@RequestParam(value = "page", defaultValue = "1", required = false) int page,
                                                 @RequestParam(value = "size", defaultValue = "10", required = false) int size,
                                                 @RequestParam(value = "sort", defaultValue = "", required = false) String sort) {
    page = page < 1 ? 0 : page - 1;
    size = size < 1 ? 10 : size;
    ResponseData response = bookingService.getCinemas(page, size, sort);
    return ResponseEntity.ok(response);
  }

  /// Hàm thực hiện lấy thông tin rạp cụ thể.
  /// Done.
  @GetMapping(value = "/cinemas/{id}")
  public ResponseEntity<ResponseData> getCinema(@PathVariable("id") int id) {
    ResponseData response = bookingService.getCinema(id);
    return ResponseEntity.ok(response);
  }

  /// Hàm thực hiện tìm kiếm theo tiêu chí.
  @PostMapping(value = "/cinemas/search")
  public ResponseEntity<ResponseData> searchCinemas(@RequestBody Map<String, String> criteria,
                                                   @RequestParam(value = "page", defaultValue = "1", required = false) int page,
                                                   @RequestParam(value = "size", defaultValue = "10", required = false) int size,
                                                   @RequestParam(value = "sort", defaultValue = "", required = false) String sort) {

    page = page < 1 ? 0 : page - 1;
    size = size < 1 ? 10 : size;
    ResponseData response = bookingService.searchCinemas(criteria, page, size, sort);
    return ResponseEntity.ok(response);
  }

  /// Hàm thực hiện tạo mới Cinema.
  /// Done.
  @PostMapping("/cinemas")
  public ResponseEntity<ResponseData> createCinema(@RequestBody CreateCinema createCinema, HttpServletRequest request) {

    /// Kiểm tra xem account có phải là ADMIN không.
    String token = request.getHeader("X-ACCOUNT-ID");
    if (!StringUtils.hasText(token)) {
      return ResponseEntity.ok(new ResponseData(401, "Unauthorized"));
    }

    try {
      int id = Integer.parseInt(token);
      if (!authService.isAdmin(id)) {
        return ResponseEntity.ok(new ResponseData(403, "Forbidden"));
      }
    } catch (Exception e) {
      return ResponseEntity.ok(new ResponseData(401, "Unauthorized"));
    }


    ResponseData response = bookingService.createCinema(createCinema);
    return ResponseEntity.ok(response);
  }

  @PatchMapping(value = "/cinemas/{id}")
  public ResponseEntity<ResponseData> updateCinema(@PathVariable(value = "id") int id, @RequestBody UpdateCinema updateCinema, HttpServletRequest request) {
    String token = request.getHeader("X-ACCOUNT-ID");
    if (!StringUtils.hasText(token)) {
      return ResponseEntity.ok(new ResponseData(401, "Unauthorized"));
    }

    try {
      int accountId = Integer.parseInt(token);
      if (!authService.isAdmin(accountId)) {
        return ResponseEntity.ok(new ResponseData(403, "Forbidden"));
      }
    } catch (Exception e) {
      return ResponseEntity.ok(new ResponseData(401, "Unauthorized"));
    }

    ResponseData response = bookingService.updateCinema(id, updateCinema);
    return ResponseEntity.ok(response);
  }
}
