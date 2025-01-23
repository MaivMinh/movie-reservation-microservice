package com.foolish.bookingservice.mapper;

import com.foolish.bookingservice.model.Movie;
import com.foolish.bookingservice.model.MovieDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MovieMapper {
  MovieDTO toDTO(Movie movie);
}
