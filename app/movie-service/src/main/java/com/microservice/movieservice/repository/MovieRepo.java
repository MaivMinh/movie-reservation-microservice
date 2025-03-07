package com.microservice.movieservice.repository;

import com.microservice.movieservice.model.Movie;
import com.microservice.movieservice.model.MovieStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepo extends JpaRepository<Movie, Integer> {
  Movie findByPoster(String poster);
  Page<Movie> findAll(Specification<Movie> specification, Pageable pageable);
  Movie findMovieById(Integer id);

  Page<Movie> findByStatus(MovieStatus movieStatus, Pageable pageable);
}
