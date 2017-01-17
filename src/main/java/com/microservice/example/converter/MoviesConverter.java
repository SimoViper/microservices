package com.microservice.example.converter;

import com.microservice.example.dto.FilmDetails;
import com.microservice.example.model.Actor;
import com.microservice.example.model.Film;


public class MoviesConverter {

    public static FilmDetails convertFilmToFilmDetails(Film film){
        FilmDetails fd = new FilmDetails();
        fd.setFilmId(film.getFilmId());
        fd.setTitle(film.getTitle());
        fd.setDescription(film.getDescription());
        fd.setLanguage(film.getLanguage().getName());


        if(film.getActors() != null && !film.getActors().isEmpty()){
            for(Actor a : film.getActors()){
                fd.getActors().add(a.getFirstName() + " " + a.getLastName());
            }
        }

        return fd;
    }
}
