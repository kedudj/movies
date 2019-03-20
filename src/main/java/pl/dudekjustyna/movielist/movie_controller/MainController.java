package pl.dudekjustyna.movielist.movie_controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.dudekjustyna.movielist.models.MovieRepository;
import pl.dudekjustyna.movielist.models.MovieService;

@Controller
public class MainController {

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    MovieService movieService;

    @RequestMapping (value = "/admin/add", method = RequestMethod.GET)
        public String movieAdd (Model model){

        model.addAttribute("movie", movieService.findAll());
        return "add-movie";
    }


}
