package com.example.cinema_tide.MovieHall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieHallService {

    private final MovieHallRepository movieHallRepository;

    @Autowired MovieHallService(MovieHallRepository movieHallRepository){this.movieHallRepository = movieHallRepository;}

    public List<MovieHall> getAllMovieHalls() {return movieHallRepository.findAll();}
}
