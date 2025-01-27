package com.microservice.bff.request;

import com.microservice.bff.response.Province;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateCinema {
    private String name;
    private String address;
    private Province province;
    private String[] photos;
}
