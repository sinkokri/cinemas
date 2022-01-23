package fit.biktjv.cinemas.rest;


import fit.biktjv.cinemas.domain.Cinema;
import fit.biktjv.cinemas.domain.Movie;
import fit.biktjv.cinemas.domain.Play;
import fit.biktjv.cinemas.integration.CinemaDAO;
import fit.biktjv.cinemas.integration.PlayDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping("rest/plays")
public class PlayResource {

    @Autowired
    PlayDAO playDAO;

//    @GetMapping
//    public Collection<Movie> allMoviesPlayed() {
//        return playDAO.allMoviesPlayed();
//    }

//    @GetMapping("{cinema_id, movie_id}")
//    public Play play (@PathVariable("cinema_id") Long id) {
//        return playDAO.findById(findById(id).get());
//    }

}
