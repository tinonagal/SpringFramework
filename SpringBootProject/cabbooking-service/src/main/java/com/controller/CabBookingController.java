package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bean.CabBooking;
import com.service.CabBookingService;

@Controller
//@RestController
public class CabBookingController {

	@Autowired
	CabBookingService cabbookingService;
	
	@RequestMapping(value = "addCabBooking",method = RequestMethod.GET)
	public String openAddCabBookingPage(CabBooking cabbooking,Model model) {
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
	
	@RequestMapping(value = "findAllCabBooking",method = RequestMethod.GET)
	public String findAllCabBookingInfo(Model model) {
		List<CabBooking> listofCabBookings = cabbookingService.findAllCabBooking();
		model.addAttribute("cabbookings", listofCabBookings);
		return "findAllCabBooking";
	}
	
//	@GetMapping(value = "findAmount/{cbid}")
//	public String findAmount(@PathVariable("cbid") int cbid) {
//		return cabbookingService.findAmount(cbid);
//	}
}
