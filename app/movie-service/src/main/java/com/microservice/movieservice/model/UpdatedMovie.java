package com.microservice.movieservice.model;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class UpdatedMovie {
  private String name;
  private String description;
  private String trailer;
  private Date releaseDate;
  private Boolean isExpired;
}
