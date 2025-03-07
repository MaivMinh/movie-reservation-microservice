package com.microservice.bff.response;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Seat {
  int id;
  String type;
  Integer price;
  String seatRow;
  Integer seatNumber;
  Integer roomId;
  Boolean isBooked;
}
