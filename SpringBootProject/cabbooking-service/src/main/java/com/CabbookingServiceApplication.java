package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")
@EntityScan(basePackages = "com.bean")
@EnableJpaRepositories(basePackages = "com.repository")
@EnableDiscoveryClient
public class CabbookingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CabbookingServiceApplication.class, args);
		System.err.println("CabBooking is up on port 8585");
	}

}
