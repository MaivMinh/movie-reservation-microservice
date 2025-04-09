package com.microservice.bff.controller;

import com.microservice.bff.request.CreateCinema;
import com.microservice.bff.request.UpdateCinema;
import com.microservice.bff.response.ResponseData;
import com.microservice.bff.response.ResponseError;
import com.microservice.bff.service.AuthService;
import com.microservice.bff.service.CinemaService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/cinemas")
@RequiredArgsConstructor
public class CinemaController {

  private final AuthService authService;
  private final CinemaService bookingService;

  /// Hàm thực hiện lấy danh sách Cinema.
  /// Done.
  @GetMapping("")
  public ResponseEntity<ResponseData> getCinemas(@RequestParam(value = "page", defaultValue = "1", required = false) int page,
                                                 @RequestParam(value = "size", defaultValue = "10", required = false) int size,
                                                 @RequestParam(value = "sort", defaultValue = "", required = false) String sort) {
    page = page < 1 ? 0 : page - 1;
    size = size < 1 ? 10 : size;
    ResponseData response = bookingService.getCinemas(page, size, sort);
    return ResponseEntity.status(response.getStatus()).body(response);
  }

  /// Hàm thực hiện lấy thông tin rạp cụ thể.
  /// Done.
  @GetMapping(value = "/{id}")
  public ResponseEntity<ResponseData> getCinema(@PathVariable("id") int id) {
    ResponseData response = bookingService.getCinema(id);
    return ResponseEntity.status(response.getStatus()).body(response);
  }

  /// Hàm thực hiện tìm kiếm theo tiêu chí.
  @PostMapping(value = "/search")
  public ResponseEntity<ResponseData> searchCinemas(@RequestBody Map<String, String> criteria,
                                                    @RequestParam(value = "page", defaultValue = "1", required = false) int page,
                                                    @RequestParam(value = "size", defaultValue = "10", required = false) int size,
                                                    @RequestParam(value = "sort", defaultValue = "", required = false) String sort) {

    page = page < 1 ? 0 : page - 1;
    size = size < 1 ? 10 : size;
    ResponseData response = bookingService.searchCinemas(criteria, page, size, sort);
    return ResponseEntity.status(response.getStatus()).body(response);
  }

  /// Hàm thực hiện tạo mới Cinema.
  /// Done.
  @PostMapping("")
  public ResponseEntity<ResponseData> createCinema(@RequestBody CreateCinema createCinema, HttpServletRequest request) {

    /// Kiểm tra xem account có phải là ADMIN không.
    String token = request.getHeader("X-ACCOUNT-ID");
    if (!StringUtils.hasText(token)) {
      return ResponseEntity.status(HttpStatus.UNAUTHORIZED.value()).body(new ResponseError(401, "Unauthorized"));
    }

    try {
      int id = Integer.parseInt(token);
      if (!authService.isAdmin(id)) {
        return ResponseEntity.status(403).body(new ResponseData(403, "Forbidden"));
      }
    } catch (Exception e) {
      return ResponseEntity.status(403).body(new ResponseData(403, "Forbidden"));
    }


    ResponseData response = bookingService.createCinema(createCinema);
    return ResponseEntity.status(response.getStatus()).body(response);
  }

  @PatchMapping(value = "/{id}")
  public ResponseEntity<ResponseData> updateCinema(@PathVariable(value = "id") int id, @RequestBody UpdateCinema updateCinema, HttpServletRequest request) {
    String token = request.getHeader("X-ACCOUNT-ID");
    if (!StringUtils.hasText(token)) {
      return ResponseEntity.status(401).body(new ResponseData(401, "Unauthorized"));
    }

    try {
      int accountId = Integer.parseInt(token);
      if (!authService.isAdmin(accountId)) {
        return ResponseEntity.status(403).body(new ResponseData(403, "Forbidden"));
      }
    } catch (Exception e) {
      return ResponseEntity.status(403).body(new ResponseData(403, "Forbidden"));
    }

    ResponseData response = bookingService.updateCinema(id, updateCinema);
    return ResponseEntity.status(response.getStatus()).body(response);
  }
}
