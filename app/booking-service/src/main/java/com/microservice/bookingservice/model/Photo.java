package com.microservice.bookingservice.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Table(name = "photos")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Photo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String url;
  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "cinema_id", referencedColumnName = "id")
  private Cinema cinema;
}
