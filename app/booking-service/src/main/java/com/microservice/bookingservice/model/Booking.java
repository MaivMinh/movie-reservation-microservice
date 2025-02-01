package com.microservice.bookingservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "bookings")
public class Booking {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Integer accountId;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "showtime_id", referencedColumnName = "id")
  private Showtime showtime;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "booking")
  private List<BookedSeat> bookedSeats;
}
