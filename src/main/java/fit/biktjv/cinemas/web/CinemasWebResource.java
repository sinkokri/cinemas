package fit.biktjv.cinemas.web;


import fit.biktjv.cinemas.integration.CinemaDAO;
import fit.biktjv.cinemas.integration.PlayDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cinemas")
public class CinemasWebResource {

    @Autowired
    CinemaDAO cinemaDAO;


    @GetMapping
    public String allCinemas(Model model){
        model.addAttribute("cinemas", cinemaDAO.allCinemas());
        return "playsTemplate";
    }

}
