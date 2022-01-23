package fit.biktjv.cinemas.integration.jpa;

import fit.biktjv.cinemas.domain.Movie;
import fit.biktjv.cinemas.domain.Play;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public interface PlayJPARep extends JpaRepository<Play, Long> {

    @Query("select p from Play p where p.id in :ids" )
    Optional<Play> findByIds(@Param("ids") List<Long> playIdsList);

//    @Query(value = "FROM Movie WHERE Movie.id IN (SELECT Movie.id FROM Play)")
//    @Query(nativeQuery = true,
//            value = "select * from MOVIE\n" +
//                    "where M_ID in (select distinct m_id from Play)")
//    List<Movie> findAllMoviesPlayed();
}
//"SELECT a FROM Table1 a RIGHT JOIN a.table2Obj b " +
//        "WHERE b.column = :id" +
//        "AND a.id NOT IN (SELECT c.columnFromA from a.table3Obj c where state = :state)";