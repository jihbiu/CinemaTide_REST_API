package com.example.cinema_tide.movie;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "movies")
public class Movie {

    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(nullable = false)
    private String title;

    @NotNull
    @Column(nullable = false)
    private String genre;

    @NotNull
    @Column(nullable = false)
    private String premiere;

    @NotNull
    @Column(nullable = false)
    private String text;

    @NotNull
    @Column(nullable = false)
    private Integer duration;

    @NotNull
    @Column(nullable = false)
    private String language;

    @NotNull
    @Column(nullable = false)
    private String movieImgName;

    public Movie() {
    }

    public Movie(Integer id, String title, String genre, String premiere, String text, Integer duration, String language, String movieImgName) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.premiere = premiere;
        this.text = text;
        this.duration = duration;
        this.language = language;
        this.movieImgName = movieImgName;
    }

    public Movie(String title, String genre, String premiere, String text, Integer duration, String language, String movieImgName) {
        this.title = title;
        this.genre = genre;
        this.premiere = premiere;
        this.text = text;
        this.duration = duration;
        this.language = language;
        this.movieImgName = movieImgName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPremiere() {
        return premiere;
    }

    public void setPremiere(String premiere) {
        this.premiere = premiere;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getMovieImgName() {
        return movieImgName;
    }

    public void setMovieImgName(String movieImgName) {
        this.movieImgName = movieImgName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Objects.equals(id, movie.id)
                && Objects.equals(title, movie.title)
                && Objects.equals(genre, movie.genre)
                && Objects.equals(premiere, movie.premiere)
                && Objects.equals(text, movie.text)
                && Objects.equals(duration, movie.duration)
                && Objects.equals(language, movie.language)
                && Objects.equals(movieImgName, movie.movieImgName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, genre, premiere, text, duration, language, movieImgName);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", premiere='" + premiere + '\'' +
                ", text='" + text + '\'' +
                ", duration=" + duration +
                ", language='" + language + '\'' +
                ", movieImgName='" + movieImgName + '\'' +
                '}';
    }
}