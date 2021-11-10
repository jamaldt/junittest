package com.curso.testing.movies.data;


import com.curso.testing.movies.model.Movie;

import java.util.Collection;
/**
 * System:                 CleanBnB
 * Name:                   MovieRepository
 * Description:            Class that represents a MovieRepository's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/9/21
 */
public interface MovieRepository {

    Movie findById(long id);
    Collection<Movie> findAll();
    void saveOrUpdate(Movie movie);
}
