package com.microservice.bookingservice.repository;

import com.microservice.bookingservice.model.BookedSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookedSeatRepo extends JpaRepository<BookedSeat, Integer> {
  Optional<BookedSeatRepo> findById(int id);
}
