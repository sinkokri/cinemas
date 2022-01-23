package fit.biktjv.cinemas.integration.jpa;

import fit.biktjv.cinemas.domain.Movie;
import fit.biktjv.cinemas.domain.Play;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface PlayJPARep extends JpaRepository<Play, Long> {

    @Query("select p from Play p where p.id in :ids" )
    Optional<Play> findByIds(@Param("ids") List<Long> playIdsList);

    @Query(value = "select distinct new Movie(m.name, m.year) from Movie m")
    Collection<Movie> findAllMoviesPlayed();
}
