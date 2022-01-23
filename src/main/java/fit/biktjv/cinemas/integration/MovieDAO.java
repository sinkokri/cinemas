package fit.biktjv.cinemas.integration;

import fit.biktjv.cinemas.domain.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieDAO {
    Long createMovie(Movie movie);

    List<Movie> allMovies();

    Optional<Movie> findById(Long movieId);

}
