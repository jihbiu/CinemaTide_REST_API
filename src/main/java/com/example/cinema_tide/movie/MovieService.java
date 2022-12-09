package com.example.cinema_tide.movie;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    @Autowired
    public MovieService(MovieRepository movieRepository) {this.movieRepository = movieRepository;}

    public List<Movie> getAllMovies() {return movieRepository.findAll();}

    public Movie getMovieByTitle(String title) {
        Optional<Movie> movieByTitle = movieRepository.findByTitle(title);
        if(!movieByTitle.isPresent()){
            throw new IllegalStateException("Brak takiego filmu");
        }
        return movieByTitle.get();
    }

    public void addNewMovie(Movie movie) {
        Optional<Movie> movieByTitle = movieRepository.findByTitle(movie.getTitle());
        if(movieByTitle.isPresent()){
            throw new IllegalStateException("Tytuł już jest zajęty!");
        }

        movieRepository.save(movie);
    }
}
