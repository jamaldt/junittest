package com.curso.testing.movies.service;

import com.curso.testing.movies.data.MovieRepository;
import com.curso.testing.movies.model.Genre;
import com.curso.testing.movies.model.Movie;

import java.util.Collection;
import java.util.stream.Collectors;

/**
 * System:                 CleanBnB
 * Name:                   MovieService
 * Description:            Class that represents a MovieService's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/9/21
 */

public class MovieService {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Collection<Movie> findMoviesByGenre(Genre genre) {

        return movieRepository.findAll().stream()
            .filter(movie -> movie.getGenre() == genre).collect(Collectors.toList());
    }

    public Collection<Movie> findMoviesByLength(int length) {

        return movieRepository.findAll().stream()
            .filter(movie -> movie.getMinutes() <= length).collect(Collectors.toList());
    }
}
