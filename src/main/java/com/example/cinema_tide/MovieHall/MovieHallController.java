package com.example.cinema_tide.MovieHall;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5500")
@RestController
@RequestMapping(path="/api/moviehalls")
public class MovieHallController {

    private final MovieHallService movieHallService;

    @Autowired
    public MovieHallController(MovieHallService movieHallService){this.movieHallService = movieHallService;}

    @GetMapping(path="/all")
    public List<MovieHall> getMovieHalls(){
        return movieHallService.getAllMovieHalls();
    }
}
