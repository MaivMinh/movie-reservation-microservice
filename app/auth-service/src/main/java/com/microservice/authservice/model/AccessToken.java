package com.microservice.authservice.model;


import jakarta.persistence.*;
import lombok.*;

import java.sql.Timestamp;

@Entity(name = "access_tokens")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccessToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String token;
    private String tokenType;
    private Timestamp expiresIn;
    private Boolean isRevoked;

    @OneToOne(targetEntity = Account.class)
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    private Account account;
}
