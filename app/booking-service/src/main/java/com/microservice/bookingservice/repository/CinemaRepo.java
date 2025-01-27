package com.microservice.bookingservice.repository;

import com.microservice.bookingservice.model.Cinema;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CinemaRepo extends JpaRepository<Cinema, Integer> {
  Optional<Cinema> findById(int cinemaId);

  Page<Cinema> findAll(Specification<Cinema> specification, Pageable pageable);
}
