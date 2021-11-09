package com.curso.testing.movies.data;

import com.curso.testing.movies.model.Genre;
import com.curso.testing.movies.model.Movie;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.Collection;

/**
 * System:                 CleanBnB
 * Name:                   MovieRepositoryJdbc
 * Description:            Class that represents a MovieRepositoryJdbc's Entity in the application
 *
 * @author carlosdeltoro
 * @version 1.0
 * @since 11/9/21
 */
public class MovieRepositoryJdbc implements MovieRepository {

    private JdbcTemplate jdbcTemplate;

    public MovieRepositoryJdbc(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Movie findById(long id) {
        return null;
    }

    @Override
    public Collection<Movie> findAll() {
        return jdbcTemplate.query("select * from movies", movieMapper);
    }

    @Override
    public void saveOrUpdate(Movie movie) {

    }

    private static RowMapper<Movie> movieMapper = (rs, rowNum) ->
        new Movie(
            rs.getInt("id"),
            rs.getString("name"),
            rs.getInt("minutes"),
            Genre.valueOf(rs.getString("genre")));
}