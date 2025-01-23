package com.microservice.movieservice.service;

import com.microservice.movieservice.exceptions.ResourceNotFoundException;
import com.microservice.movieservice.model.Genre;
import com.microservice.movieservice.repository.GenreRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@AllArgsConstructor
public class GenreService {
  private final GenreRepo genreRepo;

  public Genre findGenreByIdOrElseThrow(Integer id) {
    return genreRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Genre not found", Map.of("id", String.valueOf(id))));
  }
}
