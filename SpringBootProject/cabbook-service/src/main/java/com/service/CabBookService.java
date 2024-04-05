package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.entity.CabBook;
import com.repository.CabBookRepository;

@Service
public class CabBookService {

	@Autowired
	CabBookRepository cabbookRepository;
	
	@Autowired
	RestTemplate restTemplate;
	
	public String createCabBook(CabBook cabbook) {
		cabbookRepository.save(cabbook);
		return "Cab Booking created successfully";
	}
	
	public List<CabBook> findAllCabBook(){
		return cabbookRepository.findAll();
	}
	
	public String findAmount(int cbid) {
		Optional<CabBook> op = cabbookRepository.findById(cbid);
		if(op.isPresent()) {
			CabBook cb = op.get();
			String tripid = cb.getTripid();
			String res = restTemplate.getForObject("http://localhost:8484/cabfare/findAmountbyTripid/"+tripid, String.class);
			return res;
		}else {
			return "CabBook Amount do not exist";
		}
	}
}
