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
  private SeatType type;
  private Integer price;
  private String seatRow;
  private Integer seatNumber;
  private Boolean available;
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "room_id", referencedColumnName = "id")
  private Room room;

  @OneToMany(fetch = FetchType.EAGER, mappedBy = "seat")
  private List<BookedSeat> bookedSeats;
}
