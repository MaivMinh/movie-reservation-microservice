package com.microservice.bff.request;

import lombok.*;
import java.sql.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class NewMovie {
  private String name;
  private String poster;
  private String backdrop;
  private String description;
  private String trailer;
  private Date releaseDate;
  private Integer[] genres;
}
