package com.example.cinema_tide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class CinemaTide {

	public static void main(String[] args) {
		SpringApplication.run(CinemaTide.class, args
		);
	}

}
