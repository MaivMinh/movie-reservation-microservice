package com.microservice.commentservice.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class SeatLockEvent {
  private Integer showtimeId;
  private List<Integer> seats;
  private Integer accountId;
  private boolean locked;
  private long exp;
}
