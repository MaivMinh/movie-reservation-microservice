package com.microservice.bookingservice.model;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;
import java.sql.Time;

@Getter
@Setter
@Table(name = "showtimes")
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Showtime {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private Integer movieId;
  private Date date;
  private Time startTime;
  private Time endTime;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "room_id", referencedColumnName = "id")
  private Room room;
}
