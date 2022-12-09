package com.example.cinema_tide.Seat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatService {

    private final SeatRepository seatRepository;

    @Autowired
    public SeatService(SeatRepository seatRepository){this.seatRepository = seatRepository;}

    public List<Seat> getAllSeats() {return seatRepository.findAll();}


    public void addNewSeat(Seat seat){
        seatRepository.save(seat);
    }
}
