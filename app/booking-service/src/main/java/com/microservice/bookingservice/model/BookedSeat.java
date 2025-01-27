package com.microservice.bookingservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "booked_seats")
public class BookedSeat {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "seat_id", referencedColumnName = "id")
  private Seat seat;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "booking_id", referencedColumnName = "id")
  private Booking booking;
}
