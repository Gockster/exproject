package com.gdim.qualco.dao;

import com.gdim.qualco.entity.Countries;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

//@RepositoryRestResource(collectionResourceRel = "countries", path="countries")
public interface CountriesRepository extends JpaRepository<Countries, Integer>{
 List<Countries> findByName(String name);
 Countries findByArea(int area);



// @Query("select name from countries where country_id = (select country_id from country_stats where gdp =:gd) ")
// List<Countries> findByCountryStatsGdp(@Param("gd") long gd);





}
