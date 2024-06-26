package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com")  //enable @Controller, @Service @Repository annotation
@EntityScan(basePackages = "com.bean")			  // enable @Entity annotation
@EnableJpaRepositories(basePackages = "com.Repository")  // To enable Spring JPA data features
public class SpringBootJpaDataApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaDataApplication.class, args);
		System.err.println("Spring Boot up!");
	}

}
