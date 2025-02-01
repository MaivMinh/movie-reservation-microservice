package com.microservice.bookingservice.repository;

import com.microservice.bookingservice.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface RoomRepo extends JpaRepository<Room, Integer> {

  @Query(value = "select * from rooms as R where R.id = :roomId", nativeQuery = true)
  @Transactional(readOnly = true)
  Optional<Room> findById(int roomId);
}
