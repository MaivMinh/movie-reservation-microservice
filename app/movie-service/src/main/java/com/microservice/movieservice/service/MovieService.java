package com.microservice.movieservice.service;

import com.microservice.movie_proto.*;
import com.microservice.movieservice.exceptions.ResourceNotFoundException;
import com.microservice.movieservice.model.Genre;
import com.microservice.movieservice.model.Movie;
import com.microservice.movieservice.model.MovieGenre;
import com.microservice.movieservice.model.MovieStatus;
import com.microservice.movieservice.repository.MovieRepo;
import com.microservice.movieservice.response.ContactInfo;
import com.microservice.movieservice.response.ResponseData;
import com.microservice.movieservice.response.ResponseError;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static com.microservice.movieservice.specifications.MovieSpecs.*;
import static org.springframework.data.jpa.domain.Specification.where;

@Slf4j
@Service
@RequiredArgsConstructor
public class MovieService {
  private final MovieRepo movieRepo;
  private final S3Service s3Service;
  private final GenreService genreService;
  @Autowired
  private ContactInfo contactInfo;

  public Movie findMovieByPoster(String combine) {
    return movieRepo.findByPoster(combine);
  }

  public Movie save(Movie movie) {
    return movieRepo.save(movie);
  }

  public Movie findMovieByIdOrElseThrow(Integer id) {
    return movieRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Movie not found", Map.of("id", String.valueOf(id))));
  }

  public Page<Movie> findMovies(Pageable pageable) {
    return movieRepo.findAll(pageable);
  }

  public Page<Movie> findByCriteria(Map<String, String> criteria, Pageable pageable) throws ParseException {
    Specification<Movie> specification = where(null);
    if (StringUtils.hasText(criteria.get("name"))) {
      specification = specification.and(containsName(criteria.get("name")));
    }
    if (StringUtils.hasText(criteria.get("description"))) {
      specification = specification.and(containsDescription(criteria.get("description")));
    }
    if (StringUtils.hasText(criteria.get("release_date"))) {
      String value = String.valueOf(criteria.get("release_date"));
      char c = value.charAt(0);
      if (c == '+') {
        String day = value.substring(1);
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(day);
        specification = specification.and(where(releaseDateAfter(date).or(releaseDateEqualTo(date))));
      } else if (c == '-') {
        String day = value.substring(1);
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(day);
        specification = specification.and(where(releaseDateBefore(date).or(releaseDateEqualTo(date))));
      } else {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(value);
        specification = specification.and(releaseDateEqualTo(date));
      }
    }

    if (StringUtils.hasText(criteria.get("rating"))) {
      String value = String.valueOf(criteria.get("rating"));
      char c = value.charAt(0);
      if (c == '+') {
        double given = Double.parseDouble(value.substring(1));
        specification = specification.and(where(voteAverageGreaterThan(given).or(voteAverageEqualTo(given))));
      } else if (c == '-') {
        double given = Double.parseDouble(value.substring(1));
        specification = specification.and(where(voteAverageLessThan(given).or(voteAverageEqualTo(given))));
      } else {
        double given = Double.parseDouble(value);
        specification = specification.and(where(voteAverageEqualTo(given)));
      }
    }
    if (StringUtils.hasText(criteria.get("vote_count"))) {
      String value = String.valueOf(criteria.get("vote_count"));
      char c = value.charAt(0);
      if (c == '+') {
        int given = Integer.parseInt(value.substring(1));
        specification = specification.and(where(voteCountGreaterThan(given).or(voteCountEqualTo(given))));
      } else if (c == '-') {
        int given = Integer.parseInt(value.substring(1));
        specification = specification.and(where(voteCountLessThan(given).or(voteCountEqualTo(given))));
      } else {
        int given = Integer.parseInt(value);
        specification = specification.and(where(voteCountEqualTo(given)));
      }
    }
    return movieRepo.findAll(specification, pageable);
  }

  public void delete(Movie movie) {
    movieRepo.delete(movie);
  }

  /// Hàm lưu ảnh lên S3.
  public String uploadFile(MultipartFile file) {
    try {
      return s3Service.putObject(file);
    } catch (RuntimeException e) {
      log.error("Error: ", e);
      return null;
    }
  }

  /// Hàm thực hiện tạo mới movie.
  public CreateMovieResponse createMovie(CreateMovieRequest request) {
    if (!request.hasMovie()) {
      return CreateMovieResponse.newBuilder()
              .setStatus(400)
              .setMessage("Invalid request")
              .build();
    }

    NewMovie newMovie = request.getMovie();
    Movie movie = Movie.builder()
            .name(newMovie.getName())
            .poster(newMovie.getPoster())
            .backdrop(newMovie.getBackdrop())
            .description(newMovie.getDescription())
            .trailer(newMovie.getTrailer())
            .releaseDate(new java.sql.Date(newMovie.getReleaseDate()))
            .build();

    List<MovieGenre> movieGenres = newMovie.getGenreList().stream().map(genreId -> {
      MovieGenre movieGenre = new MovieGenre();
      Genre genre = genreService.findGenreById(genreId);
      if (genre == null) {
        return null;
      }
      movieGenre.setGenre(genre);
      movieGenre.setMovie(movie);
      genre.getMovieGenres().add(movieGenre);
      try {
        genreService.save(genre);
      } catch (RuntimeException e) {
        log.error("Error: ", e);
        return null;
      }
      return movieGenre;
    }).toList();
    movie.setMovieGenres(movieGenres);
    try {
      Movie saved = movieRepo.save(movie);
      System.out.println(saved.getId());
      System.out.println(saved.getName());
    } catch (Exception e) {
      log.error("Error: ", e);
      return CreateMovieResponse.newBuilder()
              .setStatus(500)
              .setMessage("Can't create movie")
              .build();
    }
    return CreateMovieResponse.newBuilder()
            .setStatus(200)
            .setMessage("Create movie successfully")
            .build();
  }

  public GetMoviesResponse getMovies(GetMoviesRequest request) {
    int size = request.getSize();
    int page = request.getPage();
    String sort = request.getSort();

    Pageable pageable = null;
    if (StringUtils.hasText(sort)) {
      /// sort=id:desc,releaseDate:asc
      List<Sort.Order> orders = new ArrayList<>();
      String[] list = sort.split(",");
      for (String element : list) {
        orders.add(new Sort.Order(Sort.Direction.fromString(element.split(":")[1].toUpperCase()), element.split(":")[0]));
      }
      pageable = PageRequest.of(page, size, Sort.by(orders));
    } else pageable = org.springframework.data.domain.PageRequest.of(page, size);

    Page<Movie> pageMovie = movieRepo.findAll(pageable);
    List<Movie> movies = pageMovie.getContent();

    return GetMoviesResponse.newBuilder()
            .setStatus(200)
            .setMessage("Success")
            .addAllMovies(movies.stream().map(movie -> com.microservice.movie_proto.Movie.newBuilder()
                    .setId(movie.getId())
                    .setName(movie.getName())
                    .setPoster(movie.getPoster())
                    .setBackdrop(movie.getBackdrop())
                    .setDescription(movie.getDescription())
                    .setTrailer(movie.getTrailer())
                    .setReleaseDate(movie.getReleaseDate().getTime())
                    .setVoteAverage(movie.getVoteAverage())
                    .setVoteCount(movie.getVoteCount())
                    .setStatus(movie.getStatus().toString())
                    .addAllGenre(movie.getMovieGenres().stream().map(element -> com.microservice.movie_proto.Genre.newBuilder()
                            .setId(element.getGenre().getId())
                            .setName(element.getGenre().getName())
                            .build()).toList())
                    .build()).toList())
            .setTotalElement(pageMovie.getTotalElements())
            .setTotalPage(pageMovie.getTotalPages())
            .build();
  }

  public GetMovieResponse getMovie(GetMovieRequest request) {
    int id = request.getId();
    Movie movie = movieRepo.findById(id).orElse(null);
    if (movie == null || movie.getId() <= 0) {
      return GetMovieResponse.newBuilder()
              .setStatus(404)
              .setMessage("Movie not found")
              .build();
    }

    return GetMovieResponse.newBuilder()
            .setStatus(200)
            .setMessage("Success")
            .setMovie(com.microservice.movie_proto.Movie.newBuilder()
                    .setId(movie.getId())
                    .setName(movie.getName())
                    .setPoster(movie.getPoster())
                    .setBackdrop(movie.getBackdrop())
                    .setDescription(movie.getDescription())
                    .setTrailer(movie.getTrailer())
                    .setReleaseDate(movie.getReleaseDate().getTime())
                    .setVoteAverage(movie.getVoteAverage())
                    .setVoteCount(movie.getVoteCount())
                    .setStatus(movie.getStatus().toString())
                    .addAllGenre(movie.getMovieGenres().stream().map(element -> com.microservice.movie_proto.Genre.newBuilder()
                            .setId(element.getGenre().getId())
                            .setName(element.getGenre().getName())
                            .build()).toList())
                    .build())
            .build();
  }

  public SearchMoviesResponse searchMovies(SearchMoviesRequest request) {
    /*
     Map<>: {
       name: String,
       description: String,
       release_date: +2024-10-10,
       rating: +4.5,
       vote_count: +100,
     }
     */

    int page = request.getPage();
    int size = request.getSize();
    String sort = request.getSort();
    Map<String, String> criteria = request.getCriteriaMap();

    Pageable pageable = null;

    if (StringUtils.hasText(sort)) {
      /// sort=id:desc,releaseDate:asc
      List<Sort.Order> orders = new ArrayList<>();
      String[] list = sort.split(",");
      for (String element : list) {
        orders.add(new Sort.Order(Sort.Direction.fromString(element.split(":")[1].toUpperCase()), element.split(":")[0]));
      }
      pageable = PageRequest.of(page, size, Sort.by(orders));
    } else pageable = org.springframework.data.domain.PageRequest.of(page, size);

    try {
      Page<Movie> pageMovie = this.findByCriteria(criteria, pageable);
      List<Movie> movies = pageMovie.getContent();

      return SearchMoviesResponse.newBuilder()
              .setStatus(200)
              .setMessage("Success")
              .addAllMovies(movies.stream().map(movie -> com.microservice.movie_proto.Movie.newBuilder()
                      .setId(movie.getId())
                      .setName(movie.getName())
                      .setPoster(movie.getPoster())
                      .setBackdrop(movie.getBackdrop())
                      .setDescription(movie.getDescription())
                      .setTrailer(movie.getTrailer())
                      .setReleaseDate(movie.getReleaseDate().getTime())
                      .setVoteAverage(movie.getVoteAverage())
                      .setVoteCount(movie.getVoteCount())
                      .setStatus(movie.getStatus().toString())
                      .addAllGenre(movie.getMovieGenres().stream().map(element -> com.microservice.movie_proto.Genre.newBuilder()
                              .setId(element.getGenre().getId())
                              .setName(element.getGenre().getName())
                              .build()).toList())
                      .build()).toList())
              .setTotalElement(pageMovie.getTotalElements())
              .setTotalPage(pageMovie.getTotalPages())
              .build();
    } catch (Exception e) {
      log.error("Error: ", e);
      return SearchMoviesResponse.newBuilder()
              .setStatus(400)
              .setMessage("Invalid request")
              .build();
    }
  }

  public UpdateMovieResponse updateMovie(UpdateMovieRequest request) {
    /// Hàm thực hiện cập nhật thông tin phim.
    if (!request.hasMovie()) {
      return UpdateMovieResponse.newBuilder()
              .setStatus(400)
              .setMessage("Invalid request")
              .build();
    }

    com.microservice.movie_proto.UpdateMovie updateMovie = request.getMovie();
    int movieId = updateMovie.getId();
    Movie movie = movieRepo.findById(movieId).orElse(null);
    if (movie == null || movie.getId() <= 0) {
      return UpdateMovieResponse.newBuilder()
              .setStatus(404)
              .setMessage("Movie not found")
              .build();
    }

    if (updateMovie.hasName()) {
      movie.setName(updateMovie.getName().getValue());
    }
    if (updateMovie.hasDescription()) {
      movie.setDescription(updateMovie.getDescription().getValue());
    }
    if (updateMovie.hasTrailer()) {
      movie.setTrailer(updateMovie.getTrailer().getValue());
    }
    if (updateMovie.hasReleaseDate()) {
      movie.setReleaseDate(new java.sql.Date(updateMovie.getReleaseDate().getValue()));
    }
    if (updateMovie.hasPoster()) {
      movie.setPoster(updateMovie.getPoster().getValue());
    }
    if (updateMovie.hasBackdrop()) {
      movie.setBackdrop(updateMovie.getBackdrop().getValue());
    }
    if (updateMovie.hasStatus()) {
      movie.setStatus(MovieStatus.valueOf(updateMovie.getStatus().getValue()));
    }

    try {
      movieRepo.save(movie);
    } catch (Exception e) {
      log.error("Error: ", e);
      return UpdateMovieResponse.newBuilder()
              .setStatus(500)
              .setMessage("Can't update movie")
              .build();
    }
    return UpdateMovieResponse.newBuilder()
            .setStatus(200)
            .setMessage("Update movie successfully")
            .build();
  }

  public IsMoviePlayingNowResponse isMoviePlayingNow(IsMoviePlayingNowRequest request) {
    /// Hàm kiểm tra xem phim có đang chiếu không.
    /// Nếu phim không tồn tại hoặc đang không chiếu thì trả về false.

    int movieId = request.getId();
    Movie movie = movieRepo.findById(movieId).orElse(null);
    if (movie == null || movie.getId() <= 0 || !movie.getStatus().equals(MovieStatus.NOW_PLAYING)) {
      return IsMoviePlayingNowResponse.newBuilder()
              .setStatus(HttpStatus.OK.value())
              .setMessage("Success")
              .setIsNowPlaying(false)
              .build();
    }
    return IsMoviePlayingNowResponse.newBuilder()
            .setStatus(HttpStatus.OK.value())
            .setMessage("Success")
            .setIsNowPlaying(true)
            .build();
  }

  public GetNowPlayingMoviesResponse getNowPlayingMovies(GetNowPlayingMoviesRequest request) {
    /// Hàm thực hiện lấy các bộ phim đang chiếu - NOW_PLAYING.
    int page = request.getPage();
    int size = request.getSize();
    String sort = request.getSort();

    Pageable pageable = null;
    if (StringUtils.hasText(sort)) {
      /// sort=id:desc,releaseDate:asc
      List<Sort.Order> orders = new ArrayList<>();
      String[] list = sort.split(",");
      for (String element : list) {
        orders.add(new Sort.Order(Sort.Direction.fromString(element.split(":")[1].toUpperCase()), element.split(":")[0]));
      }
      pageable = PageRequest.of(page, size, Sort.by(orders));
    } else pageable = org.springframework.data.domain.PageRequest.of(page, size);

    Page<Movie> pageMovie = movieRepo.findByStatus(MovieStatus.NOW_PLAYING, pageable);
    List<Movie> movies = pageMovie.getContent();

    return GetNowPlayingMoviesResponse.newBuilder()
            .setStatus(200)
            .setMessage("Success")
            .addAllMovies(movies.stream().map(movie -> com.microservice.movie_proto.Movie.newBuilder()
                    .setId(movie.getId())
                    .setName(movie.getName())
                    .setPoster(movie.getPoster())
                    .setBackdrop(movie.getBackdrop())
                    .setDescription(movie.getDescription())
                    .setTrailer(movie.getTrailer())
                    .setReleaseDate(movie.getReleaseDate().getTime())
                    .setVoteAverage(movie.getVoteAverage())
                    .setVoteCount(movie.getVoteCount())
                    .setStatus(movie.getStatus().toString())
                    .addAllGenre(movie.getMovieGenres().stream().map(element -> com.microservice.movie_proto.Genre.newBuilder()
                            .setId(element.getGenre().getId())
                            .setName(element.getGenre().getName())
                            .build()).toList())
                    .build()).toList())
            .setTotalElement(pageMovie.getTotalElements())
            .setTotalPage(pageMovie.getTotalPages())
            .build();
  }

  public GetContactInfoResponse getContactInfo(GetContactInfoRequest request) {
    return GetContactInfoResponse.newBuilder()
            .setMessage(contactInfo.getMessage())
            .build();
  }
}
