package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bean.CabBooking;

@Repository
public interface CabBookingRepository extends JpaRepository<CabBooking, Integer>{
	
}
