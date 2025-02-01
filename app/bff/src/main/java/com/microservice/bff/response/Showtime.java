package com.microservice.bff.response;

import lombok.*;

import java.sql.Time;
import java.util.Date;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Showtime {
  private Integer id;
  private Room room;
  private Integer movieId;
  private Date date;
  private Time startTime;
  private Time endTime;
}
