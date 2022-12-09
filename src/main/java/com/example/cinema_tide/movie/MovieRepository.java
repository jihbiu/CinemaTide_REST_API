package com.example.cinema_tide.movie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

    @Query("SELECT s FROM Movie s WHERE s.title = ?1")
    Optional<Movie> findByTitle(String title);


}
