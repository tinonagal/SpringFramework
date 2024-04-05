package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.CabFare;
import com.repository.CabFareRepository;

@Service
public class CabFareService {

	@Autowired
	CabFareRepository cabfareRepository;
	
	public String createCabFare(CabFare cabfare) {
		Optional<CabFare> op = cabfareRepository.findById(cabfare.getCfid());
			if(op.isPresent()) {
				return "CabFare ID must be unique";
			}else {
				cabfareRepository.save(cabfare);
				return "CabFare has been created successfully";
			}
		}
	
	public String findAmountbyCfid(int cfid) {
		Optional<CabFare> op = cabfareRepository.findById(cfid);
			if(op.isPresent()) {
				CabFare cb = op.get();
				return "CabFare Amount is: " + cb.getAmount();
			}else {
				
				return "CabFare is not present";
			}
		}
	
	public String findAmountbyTripid(String tripid) {
		try {
			return "CabFare amount is: " + cabfareRepository.findAmountbyTripid(tripid);
		}catch (Exception e) {
			System.err.println(e);
			return "CabFare is not present";
		}
	}
	
	public List<CabFare> findAllCabFare(){
		return cabfareRepository.findAll() ;
	}
	
//	if(acc.getAmount()>amount) {
//		acc.setAmount(acc.getAmount()-amount);		// 1000 -200
//		accountRepository.saveAndFlush(acc);
//		return "Amount withdrawn successfully";
//		}else {
//			return "Insufficient amount you can't withdraw";
//		}
//		
//	}else {
//		return "Account didn't exits";
//	} USE this logic to enter separate from and to locations
}

