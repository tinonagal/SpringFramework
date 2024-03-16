package com;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

	@RequestMapping(value = "/checkLogin",method = RequestMethod.POST)
	public String CheckLoginDetails(HttpServletRequest req) {
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		if(email.equals("tino@gmail.com")&& password.equals("123")) {
			return "success";
		}else {
			return "failure";
		}
		
	}
}
