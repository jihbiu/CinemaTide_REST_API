package com.example.cinema_tide.Email;

import com.example.cinema_tide.reservation.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailSenderService {

    private final JavaMailSender mailSender;
    private String emailFrom = "";
    @Autowired
    public EmailSenderService(JavaMailSender mailSender) {
        this.mailSender = mailSender;
    }

    public void sendEmail(List<Reservation> reservationList){
        String seats = "";
        String toEmail = "";
        String forMovie = "";
        String movieHall = "";
        String time = "";

        for(Reservation reservation : reservationList){
            toEmail = reservation.getUser_id().getEmail();
            seats += "Rząd -> " + reservation.getSeat_id().getSeatColumn() +
                    " Miejsce -> " + reservation.getSeat_id().getSeatRow() + " \n";
            forMovie = reservation.getScreening_id().getMovie_id().getTitle();
            movieHall = reservation.getScreening_id().getMovie_hall_id().getId().toString();
            time = reservation.getScreening_id().getTime();
        }

        if(!toEmail.isBlank() || !seats.isBlank() || !forMovie.isBlank()){
            String body = "Rezerwacja dokonana na film -> " + forMovie + "\n" +
                    "Na miejsca: \n" + seats +
                    "Zapraszamy do sali numer: " + movieHall +
                    "\n Dnia: " + time +"\n"+
                    "\nPozdrawiamy Cinema Tide!";

            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(emailFrom);
            message.setTo(toEmail);
            message.setText(body);
            message.setSubject("Rezerwacja biletu na film -> " + forMovie);

            this.mailSender.send(message);
        }
    }
}
