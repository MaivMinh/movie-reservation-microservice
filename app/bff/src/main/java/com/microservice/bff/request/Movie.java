package com.microservice.bff.request;

import lombok.*;
import java.sql.Date;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
  private Integer id;
  private String name;
  private String poster;
  private String backdrop;
  private String description;
  private String trailer;
  private Date releaseDate;
  private List<Genre> genres;
}
