package com.microservice.bookingservice.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "provinces")
@Getter
@Setter
public class Province {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;

  @OneToMany(mappedBy = "province", fetch = FetchType.LAZY)
  private List<Cinema> cinemas;
}
