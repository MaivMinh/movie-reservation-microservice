package com.microservice.movieservice.controller;

import com.microservice.movieservice.model.*;
import com.microservice.movieservice.response.ResponseData;
import com.microservice.movieservice.response.ResponseError;
import com.microservice.movieservice.service.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.*;

@AllArgsConstructor
public class MovieController {
  private final GenreService genreService;
  private final MovieService movieService;
  private final S3Service s3Service;
  private final Environment env;


  // Hàm thực hiện chức năng tìm kiếm theo tiêu chí, sắp xếp và phân trang.
  @PostMapping(value = "/search")
  public ResponseEntity<ResponseData> searchMoviesByCriteria(@RequestBody @NotNull Map<String, String> criteria, @RequestParam(value = "sort", required = false) String sort, @RequestParam(value = "pageNumber", required = false) Integer pageNumber, @RequestParam(value = "pageSize", required = false) Integer pageSize) {
    /*
     Map<>: {
       name: String,
       description: String,
       release_date: +2024-10-10,
       rating: +4.5,
       vote_count: +100,
     }
     */

    int pageNum = (pageNumber != null ? pageNumber : 1) - 1;
    int size = pageSize != null ? pageSize : 10;
    Pageable pageable = null;

    if (StringUtils.hasText(sort))  {
      // sort=id:desc,releaseDate:asc
      List<Sort.Order> orders  = new ArrayList<>();
      String[] list = sort.split("");
      for (String element : list) {
        orders.add(new Sort.Order(Sort.Direction.fromString(element.split(":")[1].toUpperCase()), element.split(":")[0]));
      }
      pageable = PageRequest.of(pageNum, size, Sort.by(orders));
    } else pageable = PageRequest.of(pageNum, size);

    try {
      Page<Movie> page = movieService.findByCriteria(criteria, pageable);
      return ResponseEntity.ok(new ResponseData(HttpStatus.OK.value(), "Success", page));
    } catch (ParseException e) {
      return ResponseEntity.status(HttpStatus.OK).body(new ResponseError(HttpStatus.BAD_REQUEST.value(), "Invalid date format"));
    }
  }
}
