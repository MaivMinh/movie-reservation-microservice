package com.microservice.commentservice.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
public class Seat {
  private Integer seatId;
  private boolean isReserved;
  private Long exp;
}
