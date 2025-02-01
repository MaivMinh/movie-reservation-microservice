package com.microservice.bookingservice.specifications;

import com.microservice.bookingservice.model.Showtime;
import jakarta.persistence.criteria.*;
import org.springframework.data.jpa.domain.Specification;

import java.util.Date;

public class ShowtimeSpecs {
  public static Specification<Showtime> hasMovieId(Integer movieId) {
    return new Specification<Showtime>() {
      @Override
      public Predicate toPredicate(Root<Showtime> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
        /// return cb.like(cb.lower(root.get("name")), "%" + name.toLowerCase() + "%");
        return cb.equal(root.get("movieId"), movieId);
      }
    };
  }

  public static Specification<Showtime> hasRoom(Integer roomId) {
    return new Specification<Showtime>() {
      @Override
      public Predicate toPredicate(Root<Showtime> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
        return cb.equal(root.get("room").get("id"), roomId);
      }
    };
  }
}
