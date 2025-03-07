package com.microservice.bookingservice.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class SeatDTO {
  int id;
  String type;
  int price;
  String seatRow;
  int seatNumber;
  boolean isBooked;
}
