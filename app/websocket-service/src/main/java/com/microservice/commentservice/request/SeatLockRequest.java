package com.microservice.commentservice.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class SeatLockRequest {
  private Integer showtimeId;
  private Integer accountId;
  List<Integer> seats;
}
