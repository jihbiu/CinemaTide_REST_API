package com.example.cinema_tide.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5500")
@RestController
@RequestMapping(path="/api/movies")
public class MovieController {

    private final MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService){this.movieService = movieService;}

    @GetMapping(path="/all")
    public List<Movie> getAllMovies(){
        return movieService.getAllMovies();
    }

    @RequestMapping(value = "/title/{title}", method = RequestMethod.GET)
    @ResponseBody
    public Movie getMovie(@PathVariable String title){
        return movieService.getMovieByTitle(title);
    }

    @PostMapping(path="/add")
    public void addNewMovie(@RequestBody Movie movie) { movieService.addNewMovie(movie);}
}
