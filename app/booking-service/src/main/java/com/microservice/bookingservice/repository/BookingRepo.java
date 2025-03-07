package com.microservice.bookingservice.repository;

import com.microservice.bookingservice.model.Booking;
import com.microservice.bookingservice.model.Showtime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookingRepo  extends JpaRepository<Booking, Integer> {
  Optional<Booking> findById(int bookingId);

  List<Booking> findAllByShowtime(Showtime showtime);
}
