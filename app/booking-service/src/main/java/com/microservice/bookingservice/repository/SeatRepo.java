package com.microservice.bookingservice.repository;

import com.microservice.bookingservice.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SeatRepo extends JpaRepository<Seat, Integer> {
  Optional<Seat> findById(int id);
}
