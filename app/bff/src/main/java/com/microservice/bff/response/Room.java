package com.microservice.bff.response;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class Room {
  private Integer id;
  private String name;
  private Cinema cinema;
  private String location;
}
