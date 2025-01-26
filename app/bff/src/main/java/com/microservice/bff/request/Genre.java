package com.microservice.bff.request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Genre {
  private Integer id;
  private String name;
}
