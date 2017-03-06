package com.microservice.example.service;

//import com.hazelcast.core.HazelcastInstance;
import com.microservice.example.converter.MoviesConverter;
import com.microservice.example.dto.FilmDetails;
import com.microservice.example.model.Film;
import com.microservice.example.model.Language;
import com.microservice.example.repository.FilmRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class MovieServiceImpl implements MovieService{

    private Logger LOG = LoggerFactory.getLogger(MovieServiceImpl.class);

    @Autowired
    private FilmRepository filmRepository;


//    @Autowired
//    private HazelcastInstance instance;


    @Override
    public FilmDetails getMoviebyTitle(String movieTitle) {

        FilmDetails result = null;

        List<Film> movies = filmRepository.findByTitle(movieTitle);

        if(movies != null && !movies.isEmpty()){
//            LOG.info("Microservice Cluster: " + instance.getCluster());
//            Map<String, String> hazelcastMap = instance.getMap("movie");
//            hazelcastMap.put("id", ""+ movies.get(0).getFilmId());
//            hazelcastMap.put("Language", movies.get(0).getLanguage().getName());
//            hazelcastMap.put("Year", "" + movies.get(0));

            result = MoviesConverter.convertFilmToFilmDetails(movies.get(0));

        }

        return result;
    }


    private List<Film> generateFakeMovie(){
        List<Film>  movies = new ArrayList<Film>();

        Film film = new Film();
        film.setFilmId(2L);
        film.setTitle("Delitto al ristorante cinese");
        film.setDescription("Gioiello del cinema trash italiano anni '70");

        Language language = new Language();
        language.setLanguageId(22L);
        language.setName("Italiano");

        film.setLanguage(language);

        movies.add(film);

        return movies;
    }


}

