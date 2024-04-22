package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.entity.CabBook;
import com.service.CabBookService;

@Controller
//@RestController
//@RequestMapping("cabbook")
public class CabBookController {

	@Autowired
	CabBookService cabbookService;
	
	// http://localhost:8585/cabbook/createCabBook
	// {"cname":"John","tripid":"Home>Work"}
//	@PostMapping(value = "createCabBook", consumes = MediaType.APPLICATION_JSON_VALUE)
//	public String createCabBook(@RequestBody CabBook cabbook) {
//		return cabbookService.createCabBook(cabbook);
//	}
	//http://localhost:8585/cabbook/createCabBook
	@RequestMapping(value = "createCabBook",method = RequestMethod.GET)
	public String openAddCabBookingPage(CabBook cabbook,Model model) {
		model.addAttribute("cabbook", cabbook);
		return "createCabBook";
	}
//	@GetMapping(value = "storeCabBook", produces = MediaType.APPLICATION_JSON_VALUE)
//	public String storeCabBooking(CabBook cabbook, Model model) {
//		String result = cabbookService.createCabBook(cabbook);
//		model.addAttribute("cabbook",cabbook);
//		model.addAttribute("msg",result);
//		return "index.html";
//		//return cabbookService.createCabBook(cabbook);
//	}
	
	@RequestMapping(value = "storeCabBook",method = RequestMethod.POST)
	public String storeCabBook(CabBook cabbook, Model model) {
		String result = cabbookService.createCabBook(cabbook);
		model.addAttribute("cabbook",cabbook);
		model.addAttribute("msg",result);
		return "index";
	}
	
	//http://localhost:8585/cabbook/findAllCabBook
	@RequestMapping(value = "findAllCabBook",method = RequestMethod.GET)
	public String findAllCabBookingInfo(Model model) {
		List<CabBook> listofCabBook = cabbookService.findAllCabBook();
		model.addAttribute("cabbooks", listofCabBook);
		return "findAllCabBook";
	}
	
	// http://localhost:8585/cabbook/findAllCabBook
	@GetMapping(value = "findAllCabBook", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CabBook> findAllCabBook(){
		return cabbookService.findAllCabBook();
	}
	
	// http://localhost:8585/cabbook/findAmount/1
	@GetMapping(value = "findAmount/{cbid}")
	public String findAmount(@PathVariable("cbid") int cbid) {
		return cabbookService.findAmount(cbid);
	}
}
