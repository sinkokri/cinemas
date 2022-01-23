package fit.biktjv.cinemas.web;


import fit.biktjv.cinemas.domain.Cinema;
import fit.biktjv.cinemas.domain.Movie;
import fit.biktjv.cinemas.integration.CinemaDAO;
import fit.biktjv.cinemas.integration.MovieDAO;
import fit.biktjv.cinemas.integration.PlayDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

@Controller
@RequestMapping("/cinemas")
public class CinemasWebResource {

    @Autowired
    CinemaDAO cinemaDAO;

    @Autowired
    MovieDAO movieDAO;

    @GetMapping
    public String cinemas(Model model, @RequestParam("movieId") Optional<Long> optMovieId) {
        if (optMovieId.isPresent()) {
            Optional<Movie> movie = movieDAO.findById(optMovieId.get());
            List<Cinema> cinemas = cinemaDAO.cinemaPerMovie(optMovieId.get());
            Set<String> uniqueCinemaNames = new HashSet<>();
            for (Cinema cinema: cinemas){
                uniqueCinemaNames.add(cinema.getName());
            }
            model.addAttribute("cinemas", uniqueCinemaNames);
            model.addAttribute("movie", movie.get());
        } else {
            List<Cinema> cinemas = cinemaDAO.findAllUniqueCinemasPerName();
            Set<String> cinemaNames = new HashSet<>();
            for (Cinema cinema: cinemas){
                cinemaNames.add(cinema.getName());
            }
            model.addAttribute("cinemas", cinemaNames);
        }
        return "cinemasTemplate";
    }

}
