package com.main;

import org.hibernate.cfg.Configuration;

public class DemoTest {

	public static void main(String[] args) {
		// Hibernate API
		
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		System.out.println("file loaded successfully");
	}

}
