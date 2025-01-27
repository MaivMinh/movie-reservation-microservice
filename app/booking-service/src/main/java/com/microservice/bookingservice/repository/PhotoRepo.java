package com.microservice.bookingservice.repository;

import com.microservice.bookingservice.model.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PhotoRepo extends JpaRepository<Photo, Integer> {
  Optional<Photo> findById(int photoId);
}
