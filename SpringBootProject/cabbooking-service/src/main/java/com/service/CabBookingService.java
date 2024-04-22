package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

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
	
//	public String findAmount(int cbid) {
//		Optional<CabBooking> op = cabbookingRepository.findById(cbid);
//		if(op.isPresent()) {
//			CabBooking cb = op.get();
//			String tripid = cb.getTripid();
//			String res = RestTemplate.getForObject("http://localhost:8484/cabfare/findAmountbyTripid/"+tripid, String.class);
//			//String res = restTemplate.getForObject("CABFARE-SERVICE/cabfare/findAmountbyTripid/"+tripid, String.class);
//			return res;
//		}else {
//			return "CabBook Amount do not exist";
//		}
//	}
}
