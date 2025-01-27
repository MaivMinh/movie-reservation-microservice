package com.microservice.bff.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateCinema {
  private String name;
  private String address;
  private ProvinceRequest province;
  private String[] photos;
}
