package com.microservice.bookingservice.repository;

import com.microservice.bookingservice.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SeatRepo extends JpaRepository<Seat, Integer> {
  Optional<Seat> findById(int id);

  @Query(value = "SELECT * FROM seats WHERE seats.room_id = :roomId", nativeQuery = true)
  List<Seat> findAllByRoomId(int roomId);
}
