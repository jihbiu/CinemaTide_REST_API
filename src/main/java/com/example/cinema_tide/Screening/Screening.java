package com.example.cinema_tide.Screening;

import com.example.cinema_tide.MovieHall.MovieHall;
import com.example.cinema_tide.movie.Movie;
import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "screenings")
public class Screening {

    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @OneToOne
    @JoinColumn(name = "movie_id", nullable = false)
    private Movie movie_id;

    @NotNull
    @OneToOne
    @JoinColumn(name = "movie_hall_id", nullable = false)
    private MovieHall movie_hall_id;

    @NotNull
    @Column(name = "time", nullable = false)
    private String time_str;

    public Screening() {}

    public Screening(Movie movie_id, MovieHall movie_hall_id, String time) {
        this.movie_id = movie_id;
        this.movie_hall_id = movie_hall_id;
        this.time_str = time;
    }

    public Screening(Integer id, Movie movie_id, MovieHall movie_hall_id, String time) {
        this.id = id;
        this.movie_id = movie_id;
        this.movie_hall_id = movie_hall_id;
        this.time_str = time;
    }

    public Integer getId() {
        return id;
    }

    public Movie getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(Movie movie_id) {
        this.movie_id = movie_id;
    }

    public MovieHall getMovie_hall_id() {
        return movie_hall_id;
    }

    public void setMovie_hall_id(MovieHall movie_hall_id) {
        this.movie_hall_id = movie_hall_id;
    }

    public String getTime() {
        return time_str;
    }

    public void setTime(String time) {
        this.time_str = time;
    }

    @Override
    public String toString() {
        return "Screening{" +
                "id=" + id +
                ", movie_id=" + movie_id +
                ", movie_hall_id=" + movie_hall_id +
                ", time='" + time_str + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Screening screening = (Screening) o;
        return Objects.equals(id, screening.id)
                && Objects.equals(movie_id, screening.movie_id)
                && Objects.equals(movie_hall_id, screening.movie_hall_id)
                && Objects.equals(time_str, screening.time_str);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, movie_id, movie_hall_id, time_str);
    }
}
