package fit.biktjv.cinemas.integration;

import fit.biktjv.cinemas.domain.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieDAO {
    Long createMovie(Movie movie);

    List<Movie> allMovies();

    List<Movie> findAllMoviesPlayed();

    Optional<Movie> findById(Long movieId);

}
