package fit.biktjv.cinemas.integration.jpa;

import fit.biktjv.cinemas.domain.Cinema;
import fit.biktjv.cinemas.domain.Movie;
import fit.biktjv.cinemas.integration.CinemaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class CinemaDAOJPA implements CinemaDAO {

    @Autowired
    CinemaJPARep cinemaJPARep;

    @Transactional
    @Override
    public Long createCinema(Cinema cinema) {
        return cinemaJPARep.save(cinema).getId();
    }

    @Override
    @Transactional
    public List<Cinema> allCinemas() {
        return cinemaJPARep.findAll();
    }

    @Override
    @Transactional
    public Optional<Cinema> findById(Long cinemaId) {
        return cinemaJPARep.findById(cinemaId);
    }

    @Override
    @Transactional
    public List<Cinema> findAllUniqueCinemasPerName() {
        return cinemaJPARep.findAllUniqueCinemasPerName();
    }

    @Override
    @Transactional
    public List<Cinema> cinemaPerMovie(Long movieId) {
        return cinemaJPARep.cinemaPerMovie(movieId.toString());
    }

}


