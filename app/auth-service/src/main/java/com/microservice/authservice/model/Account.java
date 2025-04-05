package com.microservice.authservice.model;

import jakarta.persistence.*;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity
@Getter
@Setter
@Table(name = "accounts")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Account {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  private String username;
  private String password;
  private String email;

  @OneToOne(targetEntity = Role.class)
  @JoinColumn(name = "role_id", referencedColumnName = "id")
  private Role role;

  private Boolean active;
}
