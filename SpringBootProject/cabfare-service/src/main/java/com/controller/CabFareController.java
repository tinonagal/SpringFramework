package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entity.CabFare;
import com.service.CabFareService;

@RestController
@RequestMapping("cabfare")
public class CabFareController {

	@Autowired
	CabFareService cabfareService;
	
	// http://localhost:8484/cabfare/createCabFare
	// {"cfid":1,"cabtype":"A-5seater","tripid":"Home>Work","amount":1000"}
	@PostMapping(value = "createCabFare", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createCabFare(@RequestBody CabFare cabfare) {
		return cabfareService.createCabFare(cabfare);
	}
	
	// http://localhost:8484/cabfare/findAmountbyCfid/1
	@GetMapping(value = "findAmountbyCfid/{cfid}")
	public String findAmountbyCfid(@PathVariable("cfid") int cfid) {
		return cabfareService.findAmountbyCfid(cfid);
	}
	
	// http://localhost:8484/cabfare/findAmountbyTripid/Home>Work
	@GetMapping(value = "findAmountbyTripid/{tripid}")
	public String findAmountbyTripid(@PathVariable("tripid") String tripid) {
		return cabfareService.findAmountbyTripid(tripid);
	}
	
	// http://localhost:8484/cabfare/findAllCabFare
	@GetMapping(value = "findAllCabFare", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<CabFare> findAllCabFare(){
		return cabfareService.findAllCabFare();
	}
}


