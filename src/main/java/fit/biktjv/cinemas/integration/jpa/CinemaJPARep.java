package fit.biktjv.cinemas.integration.jpa;

import fit.biktjv.cinemas.domain.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaJPARep extends JpaRepository<Cinema, Long> {
}
