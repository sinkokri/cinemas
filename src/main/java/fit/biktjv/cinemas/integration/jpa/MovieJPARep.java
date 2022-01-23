package fit.biktjv.cinemas.integration.jpa;

import fit.biktjv.cinemas.domain.Cinema;
import fit.biktjv.cinemas.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieJPARep extends JpaRepository<Movie, Long> {
    @Query(nativeQuery = true,
            value = "select * from MOVIE\n" +
                    "where M_ID in (select distinct M_ID from PLAY)")
    List<Movie> findAllMoviesPlayed();
}
