package com.microservice.bookingservice.specifications;

import com.microservice.bookingservice.model.Cinema;
import jakarta.persistence.criteria.*;
import org.springframework.data.jpa.domain.Specification;

public class CinemaSpecs {
  public static Specification<Cinema> containsName(String name) {
    return new Specification<Cinema>() {
      @Override
      public Predicate toPredicate(Root<Cinema> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
        return cb.like(cb.lower(root.get("name")), "%" + name.toLowerCase() + "%");
      }
    };
  }


}
