package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {

	@RequestMapping(value = "/",method = RequestMethod.GET)
	public String OpenPage() {
		System.out.println("I came here");
		return "index";
	}
}
