package com.microservice.bff.controller;

import com.microservice.bff.response.ResponseData;
import com.microservice.bff.response.ResponseError;
import com.microservice.bff.service.BuyTicketService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/buy-ticket")
public class BuyTicketController {
  private final BuyTicketService buyTicketService;

  @GetMapping(value = "/{movieId}")
  public ResponseEntity<ResponseData> getBuyTicket(@PathVariable int movieId, HttpServletRequest servletRequest) {
    /// Hàm thực hiện lấy thông tin về phim - suất chiếu.

    /// Kiểm tra xem là anonymous user hay authenticated user
    if (!StringUtils.hasText(servletRequest.getHeader("X-ACCOUNT-ID"))) {
      return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(new ResponseError(HttpStatus.UNAUTHORIZED.value(), "Unauthenticated user"));
    }

    ResponseData response = buyTicketService.getBuyTicket(movieId);
    return ResponseEntity.status(response.getStatus()).body(response);
  }
}