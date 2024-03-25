package com.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@RequestMapping(value = "say")
	public String sayHello() {
		return "Welcome to Spring Boot rest api";
	}
	
	@RequestMapping(value = "plain",method = RequestMethod.GET, produces = MediaType.TEXT_PLAIN_VALUE)
	public String sayPlain() {
		return "<h2>Welcome to Spring Boot rest api</h2>";
	}
	
	@RequestMapping(value = "html",method = RequestMethod.GET, produces = MediaType.TEXT_HTML_VALUE)
	public String sayHtml() {
		return "<h2>Welcome to Spring Boot rest api</h2>";
	}
	
	@RequestMapping(value = "xml",method = RequestMethod.GET, produces = MediaType.TEXT_XML_VALUE)
	public String sayXml() {
		return "<h2>Welcome to Spring Boot rest api</h2>";
	}
}
