package fit.biktjv.cinemas.web;


import fit.biktjv.cinemas.integration.PlayDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/plays")
public class PlaysWebResource {

    @Autowired
    PlayDAO playDAO;


    @GetMapping
    public String allPlays(Model model){
        model.addAttribute("plays", playDAO.allMoviesPlayed());
        return "playsTemplate";
    }

}
