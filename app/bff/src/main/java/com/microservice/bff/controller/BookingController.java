package com.microservice.bff.controller;

import com.microservice.bff.request.DeclareQueueRequest;
import com.microservice.bff.request.ReserveRequest;
import com.microservice.bff.response.ResponseData;
import com.microservice.bff.response.ResponseError;
import com.microservice.bff.service.BookingService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookings")
@RequiredArgsConstructor
public class BookingController {
  private final BookingService bookingService;

  @GetMapping(value = "/{showtimeId}")
  public ResponseEntity<ResponseData> getBookingByShowtime(@PathVariable Integer showtimeId, HttpServletRequest request) {

    /// Hàm thực hiện lấy thông tin booking theo showtime.
    /*
      response: {
        movie:{},
        room:{},
        cinema:{},
        seats: SeatDTO{id, type, price, seatRow, seatNumber, roomId, isBooked=(TRUE, FALSE)}[]
      }
    */

    /// Kiểm tra xem là anonymous user hay authenticated user
    if (StringUtils.hasText(request.getHeader("X-ACCOUNT-ID"))) {
      return ResponseEntity.ok(new ResponseError(HttpStatus.UNAUTHORIZED.value(), "Unauthenticated user"));
    }

    /// Gọi gRPC xuống booking module.
    ResponseData response = bookingService.getBookingByShowtime(showtimeId);
    return ResponseEntity.ok(response);
  }

  /// Hàm thực hiện tạo ra một queue tương ứng mới dựa vào session-id.
  @PostMapping("/queues/declare")
  public ResponseEntity<ResponseData> declareQueue(@RequestBody DeclareQueueRequest request, HttpServletRequest servletRequest) {
    /*
      request: {
        accountId:
      }
      response: {
        status: ,
        message: ,
      }
    */

    /// Kiểm tra xem là anonymous user hay authenticated user
    if (StringUtils.hasText(servletRequest.getHeader("X-ACCOUNT-ID"))) {
      return ResponseEntity.ok(new ResponseError(HttpStatus.UNAUTHORIZED.value(), "Unauthenticated user"));
    }

    ResponseData data = bookingService.declareQueue(request);
    return ResponseEntity.ok(data);
  }

  @PostMapping("/queues/remove")
  public ResponseEntity<ResponseData> removeQueue(@RequestBody DeclareQueueRequest request, HttpServletRequest servletRequest) {
    /*
      request: {
        accountId:
      }
      response: {
        status: ,
        message: ,
      }
    */

    /// Kiểm tra xem là anonymous user hay authenticated user
    if (StringUtils.hasText(servletRequest.getHeader("X-ACCOUNT-ID"))) {
      return ResponseEntity.ok(new ResponseError(HttpStatus.UNAUTHORIZED.value(), "Unauthenticated user"));
    }

    ResponseData data = bookingService.removeQueue(request);
    return ResponseEntity.ok(data);
  }

  /// Hàm thực hiện giữ chỗ các ghế đã chọn cho Client.
  @PostMapping(value = "/seats/hold")
  public ResponseEntity<ResponseData> handlePreSeatReservation(@RequestBody ReserveRequest reserve, HttpServletRequest request) {
    /*
      request: {
        accountId: ,
        showtimeId: ,
        seats: [seatId1, seatId2, ...]
      }
      response: {
        status: ,
        message: ,
      }
    */

    /// Kiểm tra xem là anonymous user hay authenticated user
    if (StringUtils.hasText(request.getHeader("X-ACCOUNT-ID"))) {
      return ResponseEntity.ok(new ResponseError(HttpStatus.UNAUTHORIZED.value(), "Unauthenticated user"));
    }

    /// Gọi gRPC xuống booking module.
    ResponseData response = bookingService.handlePreSeatReservation(reserve);
    return ResponseEntity.ok(response);
  }

  /// Hàm thực hiện giải phóng các ghế đã giữ chỗ.
  @PostMapping(value = "/seats/release")
  public ResponseEntity<ResponseData> handleReleaseSeat(@RequestBody ReserveRequest reserve, HttpServletRequest servletRequest) {
    /*
      request: {
        accountId: ,
        showtimeId: ,
        seats: [seatId1, seatId2, ...]
      }
      response: {
        status: ,
        message: ,
      }
    */

    /// Kiểm tra xem là anonymous user hay authenticated user
    if (StringUtils.hasText(servletRequest.getHeader("X-ACCOUNT-ID"))) {
      return ResponseEntity.ok(new ResponseError(HttpStatus.UNAUTHORIZED.value(), "Unauthenticated user"));
    }

    /// Gọi gRPC xuống booking module.
    ResponseData response = bookingService.handleReleaseSeat(reserve);
    return ResponseEntity.ok(response);
  }
}
