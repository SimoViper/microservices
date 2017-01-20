package com.microservice.example.service;

import com.microservice.example.converter.MoviesConverter;
import com.microservice.example.dto.FilmDetails;
import com.microservice.example.model.Film;
import com.microservice.example.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    private FilmRepository filmRepository;


    @Override
    public FilmDetails getMoviebyTitle(String movieTitle) {

        FilmDetails result = null;

        List<Film> movies = filmRepository.findByTitle(movieTitle);

        if(movies != null && !movies.isEmpty()){
            result = MoviesConverter.convertFilmToFilmDetails(movies.get(0));
        }

        return result;
    }
}
