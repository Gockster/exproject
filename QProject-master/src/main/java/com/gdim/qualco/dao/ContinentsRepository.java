package com.gdim.qualco.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gdim.qualco.entity.Continents;

//@RepositoryRestResource(collectionResourceRel = "continents", path = "continents")
public interface ContinentsRepository extends  JpaRepository<Continents, Integer>{
	

}
