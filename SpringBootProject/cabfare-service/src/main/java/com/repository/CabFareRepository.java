package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.entity.CabFare;

@Repository
public interface CabFareRepository extends JpaRepository<CabFare, Integer>{

	@Query("select cb.amount from CabFare cb where cb.tripid = :tripid")
	public float findAmountbyTripid(@Param("tripid") String tripid);
}
