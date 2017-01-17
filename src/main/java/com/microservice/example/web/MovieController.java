package com.microservice.example.web;

import com.microservice.example.dto.FilmDetails;
import com.microservice.example.model.Film;
import com.microservice.example.service.MovieService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @RequestMapping(method = RequestMethod.GET, value = "/movie-details/{title}")
    public @ResponseBody
    FilmDetails getMovieDetails(@PathVariable("title") String title){
        return movieService.getMoviebyTitle(title);
    }

}
