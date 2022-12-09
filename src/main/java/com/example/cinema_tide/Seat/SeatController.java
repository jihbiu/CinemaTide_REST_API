package com.example.cinema_tide.Seat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//Website was hosted localy
@CrossOrigin("http://localhost:5500")
@RestController
@RequestMapping(path="/api/seats")
public class SeatController {

    private final SeatService seatService;

    @Autowired
    public SeatController(SeatService seatService){this.seatService = seatService;}

    @GetMapping(path="/all")
    public List<Seat> getSeats() {return seatService.getAllSeats();}

    @PostMapping(path="/addSeat", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addReservation(
            @RequestBody Seat seat){
        seatService.addNewSeat(seat);
    }
}
