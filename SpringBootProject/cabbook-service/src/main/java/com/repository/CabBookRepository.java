package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.CabBook;

@Repository
public interface CabBookRepository extends JpaRepository<CabBook, Integer>{

}
