package com.example.cinema_tide.reservation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(path="/api/reservations")
public class ReservationController {

    private final ReservationService reservationService;

    @Autowired
    public ReservationController(ReservationService reservationService) {this.reservationService = reservationService;}

    @GetMapping(path="/all")
    public List<Reservation> getReservations(){
        return reservationService.getAllReservations();
    }

    @PostMapping(path="/addReservation", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addReservation(
            @RequestBody Reservation reservation){
        reservationService.addNewReservation(reservation);
    }
}

