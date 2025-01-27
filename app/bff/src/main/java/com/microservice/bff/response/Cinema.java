package com.microservice.bff.response;

import lombok.*;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Cinema {
  private int id;
  private String name;
  private String address;
  private Province province;
  private List<String> photos;
}
