package com.microservice.bff.response;

import lombok.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Province {
  private int id;
  private String name;
}
