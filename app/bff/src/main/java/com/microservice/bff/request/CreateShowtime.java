package com.microservice.bff.request;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.sql.Time;

@Getter
@Setter
public class CreateShowtime {
  private Integer roomId;
  private Integer movieId;
  private Time startTime;
  private Time endTime;
  private Date date;
}
