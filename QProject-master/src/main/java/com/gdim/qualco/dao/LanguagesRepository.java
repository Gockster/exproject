package com.gdim.qualco.dao;

import com.gdim.qualco.entity.Languages;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LanguagesRepository extends JpaRepository<Languages, Integer> {


    List<Languages> findByCountries_CountryId(int countryId);

//    @Query("select u from Languages u where u.language=:tr")
//    List<Languages> findByCountriesLan(@Param("tr") String language);




}