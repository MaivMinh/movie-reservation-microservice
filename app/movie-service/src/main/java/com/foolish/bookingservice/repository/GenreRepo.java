package com.foolish.bookingservice.repository;

import com.foolish.bookingservice.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepo extends JpaRepository<Genre, Integer> {
}
