package com.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

	//http://localhost:8080/singleQueryParam?emailid=tino@gmail.com
	@RequestMapping(value = "singleQueryParam")
	public String singleQueryParam(@RequestParam("emailid") String email) {
		return "Welcome to Spring Boot with Query Param "+email;
	}
	
	//http://localhost:8080/loginQueryParam?emailid=john@gmail.com&password=123
	@RequestMapping(value = "loginQueryParam")
	public String loginQueryParam(@RequestParam("emailid") String email, @RequestParam("password") String password) {
		if(email.equals("tino@gmail.com") && password.equals("123")) {
			return "Succesfully login with query param";
		}else {
			return "Failure try one again with query param";
		}
	}

	//http://localhost:8080/singlePathParam/tino@gmail.com
	@RequestMapping(value = "singlePathParam/{emailid}")
	public String singlePathParam(@PathVariable("emailid") String email) {
		return "Welcome to Spring Boot with Path Param "+email;
	}
	
	//http://localhost:8080/loginPathParam/tino@gmail.com/123
	@RequestMapping(value = "loginPathParam/{emailid}/{password}")
	public String loginPathParam(@PathVariable("emailid") String email, @PathVariable("password") String password) {
		if(email.equals("tino@gmail.com") && password.equals("123")) {
			return "Succesfully login with query param";
		}else {
			return "Failure try one again with query param";
		}
	}
}
