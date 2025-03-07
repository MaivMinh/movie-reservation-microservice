package com.microservice.bookingservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "seats")
public class Seat {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Enumerated(EnumType.STRING)
  private SeatType type;
  private Integer price;
  private String seatRow;
  private Integer seatNumber;
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "room_id", referencedColumnName = "id")
  private Room room;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "seat")
  private List<BookedSeat> bookedSeats;
}
