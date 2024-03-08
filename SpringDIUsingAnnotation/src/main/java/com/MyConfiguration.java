package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="com")
public class MyConfiguration {
	
	@Bean(name ="pp")
	public Project getProject() {
		Project p = new Project();
		return p;
	}

}
