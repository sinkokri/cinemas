package fit.biktjv.cinemas.integration.jpa;

import fit.biktjv.cinemas.domain.Movie;
import fit.biktjv.cinemas.domain.Play;
import fit.biktjv.cinemas.domain.PlayKey;
import fit.biktjv.cinemas.integration.PlayDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class PlayDAOJPA implements PlayDAO {

    @Autowired
    PlayJPARep playJPARep;


    @Override
    @Transactional
    public PlayKey createPlay(Play play) {
        return playJPARep.save(play).getId();
    }

//    @Override
//    @Transactional
//    public List<Movie> allMoviesPlayed() {
//        return playJPARep.findAllMoviesPlayed();
//    }

    @Override
    @Transactional
    public Optional<Play> findById(Long movieId, Long cinemaId) {
        return playJPARep.findByIds(Arrays.asList(movieId, cinemaId));
    }
}
