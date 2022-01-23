package fit.biktjv.cinemas.integration.jpa;

import fit.biktjv.cinemas.domain.Cinema;
import fit.biktjv.cinemas.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieJPARep extends JpaRepository<Movie, Long> {
}
