package com.microservice.bookingservice.repository;

import com.microservice.bookingservice.model.Showtime;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ShowtimeRepo extends JpaRepository<Showtime, Integer> {
  Optional<Showtime> findById(int showtimeId);
  Page<Showtime> findAll(Specification<Showtime> specification, Pageable pageable);


  @Query(value = "SELECT * FROM showtimes WHERE showtimes.movie_id = :movieId and showtimes.date > CURDATE() OR (showtimes.date = CURDATE() and showtimes.start_time >= CURTIME())", nativeQuery = true)
  List<Showtime> findCurrentAndFutureShowtimesByMovieId(int movieId);


}
