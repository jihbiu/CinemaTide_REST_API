package com.example.cinema_tide.MovieHall;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "movie_halls")
public class MovieHall {

    @NotNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    @Column(name = "hall_rows", nullable = false)
    private Integer hallRows;

    @NotNull
    @Column(name = "hall_columns", nullable = false)
    private Integer hallColumns;

    // @ Constructors segment
    public MovieHall() {
    }

    public MovieHall(Integer hallRows, Integer hallColumns) {
        this.hallRows = hallRows;
        this.hallColumns = hallColumns;
    }

    public MovieHall(Integer id, Integer hallRows, Integer hallColumns) {
        this.id = id;
        this.hallRows = hallRows;
        this.hallColumns = hallColumns;
    }


    // @ Getter and Setter segment

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHallRows() {
        return hallRows;
    }

    public void setHallRows(Integer hallRows) {
        this.hallRows = hallRows;
    }

    public Integer getHallColumns() {
        return hallColumns;
    }

    public void setHallColumns(Integer hallColumns) {
        this.hallColumns = hallColumns;
    }

    @Override
    public String toString() {
        return "MovieHall{" +
                "id=" + id +
                ", hallRows=" + hallRows +
                ", hallColumns=" + hallColumns +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovieHall movieHall = (MovieHall) o;
        return Objects.equals(id, movieHall.id)
                && Objects.equals(hallRows, movieHall.hallRows)
                && Objects.equals(hallColumns, movieHall.hallColumns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, hallRows, hallColumns);
    }
}
