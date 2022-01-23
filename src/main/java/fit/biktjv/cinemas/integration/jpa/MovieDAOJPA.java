package fit.biktjv.cinemas.integration.jpa;

import fit.biktjv.cinemas.domain.Movie;
import fit.biktjv.cinemas.integration.MovieDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class MovieDAOJPA implements MovieDAO {

    @Autowired
    MovieJPARep movieJPARep;

    @Override
    @Transactional
    public Long createMovie(Movie movie) {
        return movieJPARep.save(movie).getId();
    }

    @Override
    @Transactional
    public List<Movie> allMovies() {
        return movieJPARep.findAll();
    }

    @Override
    @Transactional
    public Optional<Movie> findById(Long movieId) {
        return movieJPARep.findById(movieId);
    }

    @Override
    @Transactional
    public List<Movie> findAllMoviesPlayed() {
        return movieJPARep.findAllMoviesPlayed();
    }
}
