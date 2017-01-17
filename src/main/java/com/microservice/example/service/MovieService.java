package com.microservice.example.service;

import com.microservice.example.dto.FilmDetails;
import com.microservice.example.model.Film;

public interface MovieService {

    FilmDetails getMoviebyTitle(String  movieTitle);
}
