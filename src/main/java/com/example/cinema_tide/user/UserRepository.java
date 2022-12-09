package com.example.cinema_tide.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//@Transactional(readOnly = true)
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    @Query("SELECT s FROM User s WHERE s.email = ?1")
    Optional<User> findUserByEmail(String email);

    @Query("SELECT s FROM User s WHERE s.forname = ?1 AND s.surname = ?1")
    Optional<User> findUserByFornameAndSurname(String forname, String surname);
}
