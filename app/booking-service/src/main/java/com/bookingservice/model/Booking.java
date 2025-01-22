package com.bookingservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Entity
@Getter
@Setter
@Table(name = "bookings")
public class Booking {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Integer userId;
  private Integer showtimeId;
  private Double totalPrice;
  private Timestamp bookingTime;
  private Boolean status;
}
