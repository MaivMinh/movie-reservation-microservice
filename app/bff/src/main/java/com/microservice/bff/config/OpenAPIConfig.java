package com.microservice.bff.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.List;

@Configuration
public class OpenAPIConfig {
  @Bean
  public OpenAPI customOpenAPI() {
    return new OpenAPI()
            .servers(
                    List.of(
                            new Server().url("http://localhost:8080")
                                    .description("Local server"),
                            new Server().url("https://moviereservation.software")
                                    .description("Production server")
                    )
            );
  }
}
