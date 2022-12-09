package com.example.cinema_tide.Email;

import com.example.cinema_tide.reservation.Reservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@Controller
@RequestMapping(path="/api/email")
public class EmailController {

    private final EmailSenderService emailSenderService;

    @Autowired
    public EmailController(EmailSenderService emailSenderService){
        this.emailSenderService = emailSenderService;
    }

    @PostMapping(path="/send", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void sendEmail(
            @RequestBody List<Reservation> reservationList){
        emailSenderService.sendEmail(reservationList);
    }
}
