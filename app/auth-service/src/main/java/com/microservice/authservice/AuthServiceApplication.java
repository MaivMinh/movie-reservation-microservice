package com.microservice.authservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EnableJpaRepositories("com.microservice.authservice.repository")
@EntityScan("com.microservice.authservice.model")
@EnableDiscoveryClient
public class AuthServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(AuthServiceApplication.class, args);
  }

}
