package com.microservice.bff.request;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
public class UpdateMovie {
    private String name;
    private String description;
    private String trailer;
    private Date releaseDate;
    private String poster;
    private String backdrop;
}
