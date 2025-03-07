package com.microservice.bff.controller;

import com.microservice.bff.response.ResponseData;
import com.microservice.bff.response.ResponseError;
import com.microservice.bff.service.AuthService;
import com.microservice.bff.service.BookingService;
import com.microservice.bff.service.MovieService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/bookings")
@RequiredArgsConstructor
public class BookingController {
  private final BookingService bookingService;
  private final MovieService movieService;

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
    if (request.getHeader("X-ACCOUNT-ID") == null || request.getHeader("X-ACCOUNT-ID").isEmpty()) {
      System.out.println("Người dùng hiện chưa xác thực");
      //return ResponseEntity.ok(new ResponseError(HttpStatus.UNAUTHORIZED.value(), "Unauthenticated user"));
    }

    /// Gọi gRPC xuống booking module.
    ResponseData response = bookingService.getBookingByShowtime(showtimeId);
    return ResponseEntity.ok(response);
  }


}
