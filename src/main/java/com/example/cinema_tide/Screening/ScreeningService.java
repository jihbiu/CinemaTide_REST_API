package com.example.cinema_tide.Screening;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ScreeningService {

    private final ScreeningRepository screeningRepository;

    @Autowired
    public ScreeningService(ScreeningRepository screeningRepository){this.screeningRepository = screeningRepository;}

    public List<Screening> getAllScreenings(){return screeningRepository.findAll();}

}
