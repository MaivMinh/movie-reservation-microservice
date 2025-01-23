package com.microservice.movieservice.repository;

import com.microservice.movieservice.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepo extends JpaRepository<Genre, Integer> {
}
