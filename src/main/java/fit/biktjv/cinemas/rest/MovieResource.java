package fit.biktjv.cinemas.rest;


import fit.biktjv.cinemas.domain.Cinema;
import fit.biktjv.cinemas.domain.Movie;
import fit.biktjv.cinemas.integration.MovieDAO;
import fit.biktjv.cinemas.integration.jpa.MovieDAOJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rest/movies")
public class MovieResource {

    @Autowired
    MovieDAO movieDAO;

    @GetMapping
    public List<Movie> allMovies() {
        return movieDAO.allMovies();
    }


    @GetMapping("{id}")
    public Movie movie (@PathVariable("id") Long id) {
        return movieDAO.findById(id).get();
    }

}
