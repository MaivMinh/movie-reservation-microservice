package com.microservice.bookingservice.repository;

import com.microservice.bookingservice.model.Showtime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ShowtimeRepo extends JpaRepository<Showtime, Integer> {
  Optional<Showtime> findById(int showtimeId);
}
