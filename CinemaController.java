package co2103.hw1.controller;

import co2103.hw1.Hw1Application;
import co2103.hw1.domain.Cinema;
import co2103.hw1.domain.Film;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@Controller
public class CinemaController {
    @InitBinder
    protected void initBinder(WebDataBinder binder) {

        binder.addValidators(new CinemaValidator());
    }



    @GetMapping("/cinemas")
    public String cinemas(Model model){
        model.addAttribute("cinemas", Hw1Application.cinemas);
        return "cinemas/list";
    }

    @RequestMapping("/newCinema")
    public String newCinema(Model model){
        model.addAttribute("cinema", new Cinema());
        return "cinemas/form";
    }

    @PostMapping("/addCinema")
    public String addCinema(@Valid @ModelAttribute Cinema cinema, BindingResult results) {
        if(results.hasErrors()){
            return "cinemas/form";
        }
        Hw1Application.cinemas.add(cinema);
        return "redirect:/cinemas";
    }

    @GetMapping("/films")
    public String films(@RequestParam int cinema, Model model){
        for (Cinema c: Hw1Application.cinemas){
            if(c.getId() == cinema){
                model.addAttribute("films", c.getFilms());
            }
        }
        return "films/list";
    }

    @RequestMapping("/newFilm")
    public String newFilm(@RequestParam int cinema, Model model){
        model.addAttribute("film", new Film());
        return "films/form";
    }



}
