package com.microservice.bff.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class ReserveRequest {
  private Integer showtimeId;
  private List<Integer> seats;
}
