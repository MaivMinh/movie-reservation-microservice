package com.microservice.bookingservice.repository;

import com.microservice.bookingservice.model.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProvinceRepo extends JpaRepository<Province, Integer> {
  Optional<Province> findById(int id);
}
