package com.gdim.qualco.dao;

import com.gdim.qualco.entity.Countries;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

//@RepositoryRestResource(collectionResourceRel = "countries", path="countries")
public interface CountriesRepository extends JpaRepository<Countries, Integer>{

 Page<Countries> findByCountryId(@Param("id") Integer id, Pageable pageiable);

}
