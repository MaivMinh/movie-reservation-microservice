package com.microservice.bff.controller;

import com.microservice.bff.request.NewMovie;
import com.microservice.bff.request.UpdateMovie;
import com.microservice.bff.response.ContactInfo;
import com.microservice.bff.response.ResponseData;
import com.microservice.bff.service.AuthService;
import com.microservice.bff.service.MovieService;
import com.microservice.bff.service.ShowtimeService;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/movies")
public class MovieController {
  private final MovieService movieService;
  private final AuthService authService;
  private final ShowtimeService showtimeService;
  /// ================== ADMIN ROLE ================== ///

  /// Phương thức tạo ra 1 phim mới.
  /// Done
  @PostMapping(value = "")
  public ResponseEntity<ResponseData> createMovie(@RequestBody NewMovie newMovie, HttpServletRequest request) {
    /*
    "movie": {
          "name": String,
          "description": String,
          "trailer": String,
          "releaseDate": Date
          "poster": String,
          "backdrop": String,
          "genres": int[]
      },
    * */
    ResponseEntity<ResponseData> result = authService.isAdmin(request);
    if (result != null) return result;
    ResponseData response = movieService.createMovie(newMovie);
    return ResponseEntity.status(response.getStatus()).body(response);
  }

  @PatchMapping(value = "/{movieId}")
  public ResponseEntity<ResponseData> updateMovie(@PathVariable("movieId") int movieId, @RequestBody UpdateMovie updateMovie, HttpServletRequest request) {
    /*
    {
      "name": String,
      "description": String,
      "trailer": String,
      "releaseDate": Date
      "poster": String,
      "backdrop": String,
      "genres": int[]
    }
    */

    ResponseEntity<ResponseData> result = authService.isAdmin(request);
    if (result != null) return result;
    ResponseData response = movieService.updateMovie(movieId, updateMovie);
    return ResponseEntity.status(response.getStatus()).body(response);
  }

  /// ================== /ADMIN ROLE ================== ///

  /// ================== USER ROLE ================== ///

  /// Phương thức lấy danh sách phim.
  /// Done.
  @GetMapping(value = "")
  public ResponseEntity<ResponseData> getMovies(@RequestParam(value = "page", defaultValue = "1", required = false) int page, @RequestParam(value = "size", defaultValue = "10", required = false) int size, @RequestParam(value = "sort", defaultValue = "", required = false) String sort) {
    page = (page > 0) ? (page - 1) : 0;
    size = (size > 0) ? size : 10;
    ResponseData response = movieService.getMovies(page, size, sort);
    return ResponseEntity.status(response.getStatus()).body(response);
  }


  /// Phương thức lấy thông tin phim theo id.
  /// Done.
  @GetMapping(value = "/{id}")
  public ResponseEntity<ResponseData> getMovie(@PathVariable("id") int id) {
    ResponseData response = movieService.getMovie(id);
    return ResponseEntity.status(response.getStatus()).body(response);
  }


  /// Phương thức thực hiện tìm kiểm theo các tiêu chí.
  /// Done.
  @PostMapping(value = "/search")
  public ResponseEntity<ResponseData> searchMoviesByCriteria(@RequestBody Map<String, String> criteria, @RequestParam(value = "sort", defaultValue = "", required = false) String sort, @RequestParam(value = "page", defaultValue = "1", required = false) Integer page, @RequestParam(value = "size", defaultValue = "10", required = false) Integer size) {

    /*
       {
         name: String,
         description: String,
         release_date: +2024-10-10,
         rating: +4.5,
         vote_count: +100,
       }
     */


    page = (page > 0) ? (page - 1) : 0;
    size = (size > 0) ? size : 10;
    if (criteria == null) {
      criteria = new HashMap<>();
    }
    ResponseData response = movieService.searchMovies(criteria, page, size, sort);
    return ResponseEntity.status(response.getStatus()).body(response);
  }

  /// Phương thức lấy danh sách suất chiếu của phim.
  /// Done.
  @GetMapping(value = "/{id}/showtimes")
  public ResponseEntity<ResponseData> getMovieShowtimes(@PathVariable("id") int id, @RequestParam(value = "page", defaultValue = "1", required = false) int page, @RequestParam(value = "size", defaultValue = "10", required = false) int size, @RequestParam(value = "sort", defaultValue = "", required = false) String sort) {
    page = (page > 0) ? (page - 1) : 0;
    size = (size > 0) ? size : 10;
    ResponseData response = showtimeService.getMovieShowtimes(id, page, size, sort);
    return ResponseEntity.status(response.getStatus()).body(response);
  }


  /// Phương thức lấy danh sách phim đang chiếu.
  @GetMapping(value = "/now-playing")
  public ResponseEntity<ResponseData> getNowPlayingMovies(@RequestParam(value = "page", defaultValue = "1", required = false) int page,
                                                          @RequestParam(value = "size", defaultValue = "10", required = false) int size,
                                                          @RequestParam(value = "sort", defaultValue = "", required = false) String sort) {
    page = (page > 0) ? (page - 1) : 0;
    size = (size > 0) ? size : 10;
    ResponseData response = movieService.getNowPlayingMovies(page, size, sort);
    return ResponseEntity.status(response.getStatus()).body(response);
  }

  /// Phương thức thực hiện lấy thông tin của movie-service.
  @GetMapping(value = "/contact-info")
  public ResponseEntity<ResponseData> getContactInfo() {
    ResponseData response = movieService.getContactInfo();
    return ResponseEntity.status(200).body(response);
  }
}