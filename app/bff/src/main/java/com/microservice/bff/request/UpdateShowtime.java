package com.microservice.bff.request;

import lombok.Getter;
import lombok.Setter;

import java.sql.Time;
import java.util.Date;

@Getter
@Setter
public class UpdateShowtime {
  private Integer roomId;
  private Integer movieId;
  private Date date;
  private Time startTime;
  private Time endTime;
}
