package com.microservice.bookingservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "rooms")
public class Room {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private String location;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "cinema_id", referencedColumnName = "id")
  private Cinema cinema;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "room")
  private List<Seat> seats;
}
