package fit.biktjv.cinemas.web;


import fit.biktjv.cinemas.integration.MovieDAO;
import fit.biktjv.cinemas.integration.PlayDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
@RequestMapping("/movies")
public class PlaysWebResource {

    @Autowired
    MovieDAO movieDAO;


    @GetMapping
    public String allPlays(Model model){
        model.addAttribute("movies", movieDAO.findAllMoviesPlayed());
        model.addAttribute("localDate", LocalDate.now());
        return "playsTemplate";
    }

}
