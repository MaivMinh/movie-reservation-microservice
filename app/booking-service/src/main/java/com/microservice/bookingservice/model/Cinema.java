package com.microservice.bookingservice.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "cinemas")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cinema {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private String address;

  @OneToMany(fetch = FetchType.EAGER, mappedBy = "cinema")
  private List<Photo> photos;

  @OneToMany(fetch = FetchType.EAGER, mappedBy = "cinema")
  private List<Room> rooms;

  @ManyToOne(fetch = FetchType.EAGER, targetEntity = Province.class)
  @JoinColumn(name = "province_id", referencedColumnName = "id")
  private Province province;
}
