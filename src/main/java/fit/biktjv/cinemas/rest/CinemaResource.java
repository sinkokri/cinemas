package fit.biktjv.cinemas.rest;


import fit.biktjv.cinemas.domain.Cinema;
import fit.biktjv.cinemas.integration.CinemaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rest/cinemas")
public class CinemaResource {

    @Autowired
    CinemaDAO cinemaDAO;

    @GetMapping
    public List<Cinema> allCinemas() {
        return cinemaDAO.allCinemas();
    }

    @GetMapping("{id}")
    public Cinema cinema (@PathVariable("id") Long id) {
        return cinemaDAO.findById(id).get();
    }

}
