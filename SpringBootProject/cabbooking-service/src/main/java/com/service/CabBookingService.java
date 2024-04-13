package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.CabBooking;
import com.repository.CabBookingRepository;

@Service
public class CabBookingService {

	@Autowired
	CabBookingRepository cabbookingRepository;
	
	public String storeCabBooking(CabBooking cabbooking) {
		cabbookingRepository.save(cabbooking);
		return "New Cab Booking saved";
	}
	
	public List<CabBooking> findAllCabBooking(){
		return cabbookingRepository.findAll();
	}
}
