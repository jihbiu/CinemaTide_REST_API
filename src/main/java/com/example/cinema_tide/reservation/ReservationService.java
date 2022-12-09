package com.example.cinema_tide.reservation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }


    public void addNewReservation(Reservation reservation) {
        if (reservation.getScreening_id() == null
                || reservation.getUser_id() == null
                || reservation.getSeat_id() == null) {
            throw new IllegalStateException("Wypełnij wszystkie pola!");
        }
        reservationRepository.save(reservation);
    }
}
