package fit.biktjv.cinemas.integration.jpa;

import fit.biktjv.cinemas.domain.Cinema;
import fit.biktjv.cinemas.domain.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CinemaJPARep extends JpaRepository<Cinema, Long> {
    @Query(nativeQuery = true,
            value = "select * from CINEMA\n" +
                    "where C_ID in (select distinct C_ID from CINEMA)")
    List<Cinema> findAllUniqueCinemasPerName();

    @Query(nativeQuery = true,
            value = "select * from CINEMA\n" +
                    "where C_ID in (select C_ID from PLAY where M_ID=?1)")
    List<Cinema> cinemaPerMovie(String movieId);


}
