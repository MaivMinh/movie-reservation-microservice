package com.microservice.bff.controller;

import com.microservice.bff.response.ResponseData;
import com.microservice.bff.service.BuyTicketService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
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
  public ResponseEntity<ResponseData> getBuyTicket(@PathVariable int movieId) {
    /// Hàm thực hiện lấy thông tin về phim - suất chiếu.
    ResponseData response = buyTicketService.getBuyTicket(movieId);
    return ResponseEntity.ok(response);
  }
}