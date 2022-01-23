package fit.biktjv.cinemas.integration;

import fit.biktjv.cinemas.domain.Cinema;

import java.util.List;
import java.util.Optional;

public interface CinemaDAO {

    Long createCinema(Cinema cinema);

    List<Cinema> allCinemas();

    Optional<Cinema> findById(Long cinemaId);
}
