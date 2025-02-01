package com.microservice.bff.response;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Movie {
  private Integer id;
  private String name;
  private String poster;
  private String backdrop;
  private String description;
  private String trailer;
  private String releaseDate;
  private Double voteAverage;
  private Integer voteCount;
  private String status;
}
