package com.microservice.bff.config;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
@EnableMethodSecurity
@AllArgsConstructor
public class ProjectConfigSecurity {

  @Bean
  SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http.sessionManagement(config -> config.sessionCreationPolicy(SessionCreationPolicy.STATELESS));
    http.csrf(AbstractHttpConfigurer::disable);
    http.authorizeHttpRequests(config ->
            config.anyRequest().permitAll());
    return http.build();
  }

  @Bean
  public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurer() {
      @Override
      public void addCorsMappings(CorsRegistry registry) {
        ///registry.addMapping("/greeting-javaconfig").allowedOrigins("http://localhost:9000");
        registry
                .addMapping("/**")
                .allowedOrigins(
                        "https://movie-reservation-frontend.vercel.app/",
                        "http://localhost:8888",
                        "https://moviereservation.software")
                .allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS")
                .allowCredentials(false)
                .exposedHeaders("*");
      }
    };
  }

  @Bean
  PasswordEncoder passwordEncoder() {
    return PasswordEncoderFactories.createDelegatingPasswordEncoder();
  }
}