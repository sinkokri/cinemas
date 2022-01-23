package fit.biktjv.cinemas.integration;

import fit.biktjv.cinemas.domain.Cinema;
import fit.biktjv.cinemas.domain.Movie;

import java.util.List;
import java.util.Optional;

public interface CinemaDAO {

    Long createCinema(Cinema cinema);

    List<Cinema> allCinemas();

    Optional<Cinema> findById(Long cinemaId);

    List<Cinema> findAllUniqueCinemasPerName();

    List<Cinema> cinemaPerMovie(Long movieId);
}
