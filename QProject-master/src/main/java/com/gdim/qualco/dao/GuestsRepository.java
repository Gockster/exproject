package com.gdim.qualco.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gdim.qualco.entity.Guests;

public interface GuestsRepository extends JpaRepository<Guests, Integer>{
	
	

}
