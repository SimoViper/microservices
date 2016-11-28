package com.microservice.example.service;

import org.springframework.stereotype.Service;

@Service
public class MovieServiceImpl implements MovieService{
    @Override
    public String getMovieTitleById(Long movieId) {
        return "Delitto al ristorante cinese";
    }
}
