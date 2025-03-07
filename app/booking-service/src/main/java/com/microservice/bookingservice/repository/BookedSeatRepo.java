package com.microservice.bookingservice.repository;

import com.microservice.bookingservice.model.BookedSeat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public interface BookedSeatRepo extends JpaRepository<BookedSeat, Integer> {
  Optional<BookedSeatRepo> findById(int id);

  @Query(value = "SELECT * FROM booked_seats WHERE booked_seats.booking_id = :id", nativeQuery = true)
  Collection<? extends BookedSeat> findAllByBookingId(Integer id);
}
