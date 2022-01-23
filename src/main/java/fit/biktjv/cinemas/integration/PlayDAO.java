package fit.biktjv.cinemas.integration;

import fit.biktjv.cinemas.domain.Movie;
import fit.biktjv.cinemas.domain.Play;
import fit.biktjv.cinemas.domain.PlayKey;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface PlayDAO {

    PlayKey createPlay(Play play);

//    List<Movie> allMoviesPlayed();

    Optional<Play> findById(Long movieId, Long cinemaId);
}
