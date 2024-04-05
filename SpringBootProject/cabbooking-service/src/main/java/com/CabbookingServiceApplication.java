package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CabbookingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CabbookingServiceApplication.class, args);
		System.err.println("CabBooking is up on port 8585");
	}

}
