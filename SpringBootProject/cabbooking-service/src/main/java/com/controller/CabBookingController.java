package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.CabBooking;
import com.service.CabBookingService;

@Controller
public class CabBookingController {

	@Autowired
	CabBookingService cabbookingService;
	
	@RequestMapping(value = "addCabBooking",method = RequestMethod.GET)
	public String openIndexPage(CabBooking cabbooking,Model model) {
		model.addAttribute("cabbooking", cabbooking);
		return "addCabBooking";
	}
	
	@RequestMapping(value = "storeCabBooking",method = RequestMethod.POST)
	public String storeCabBooking(CabBooking cabbooking, Model model) {
		String result = cabbookingService.storeCabBooking(cabbooking);
		model.addAttribute("cabbooking",cabbooking);
		model.addAttribute("msg",result);
		return "index";
	}
}
