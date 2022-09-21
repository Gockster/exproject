package com.gdim.qualco.controllers;

import com.gdim.qualco.dao.*;
import com.gdim.qualco.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
//@RequestMapping("/home")
public class TheController {

    @Autowired
    CountriesRepository cre;

    @Autowired
    ContinentsRepository con;

    @Autowired
    GuestsRepository gue;

    @Autowired
    RegionsRepository reg;

    @Autowired
    CountryStatsRepository cor;

    @Autowired
    CountryLanguagesRepository cla;

    @Autowired
    LanguagesRepository lar;

    @Autowired
    RegionAreasRepository rr;

    @Autowired
    SecondScreenRepository sc;

    @Autowired
    ExpertRepository expertRepository;

//    @GetMapping("/region/{region}")
//    public List<Expert> getCountryByRegionId(@PathVariable Long region) {
//        return expertRepository.findByRegionId(region);
//    }

    @GetMapping("/region/{region}")
    public List<Expert> getCountryByRegionName(@PathVariable String region) {
        return expertRepository.findByRegionName(region);
    }

    @GetMapping("/between/{yearStart}/{yearEnd}")
    public List<Expert> getBetween(@PathVariable int yearStart, @PathVariable int yearEnd) {
        return expertRepository.findByYearBetween(yearStart, yearEnd);
    }

    @GetMapping("/search/{search}")
    public List<Expert> getSearch(@PathVariable Optional search) {
        return expertRepository.findBySearch(search);
    }

    @GetMapping("/expert")
    public List<Expert> getTotal() {
        return expertRepository.findAll();
    }

    @GetMapping("/countries/{id}")
    public Optional<Countries> getCountry(@PathVariable Integer id) {
        return cre.findById(id);
    }

    @GetMapping("/countries")
    public List<Countries> getCountries() {
        return cre.findAll();
    }

    @GetMapping("/countries/name/{name}")
    public List<Countries> getCountryByName(@PathVariable String name) {
        return cre.findByName(name);
    }

    @GetMapping("/countries/area/{area}")
    public Countries getCountryByArea(@PathVariable int area) {
        return cre.findByArea(area);
    }


    //Languages by country id
    @GetMapping("/countries/languages/{countryId}")
    public List<Languages> getLanguagesByCountry(@PathVariable int countryId) {
        return lar.findByCountries_CountryId(countryId);
    }

    @GetMapping("/second")
    public List<SecondScreen> getScreen() {
        return sc.findAll();
    }


    @GetMapping("/continents")
    public List<Continents> getContinents() {
        return con.findAll();
    }

    @GetMapping("/guests")
    public List<Guests> getGuests() {
        return gue.findAll();
    }

    @GetMapping("/regions")
    public List<Regions> getRegions() {
        return reg.findAll();
    }

    @GetMapping("/stats")
    public List<CountryStats> getStats() {
        return cor.findAll();
    }

    @GetMapping("/country-languages")
    public List<CountryLanguages> getLans() {
        return cla.findAll();
    }

    @GetMapping("/languages")
    public List<Languages> getLanguages() {
        return lar.findAll();
    }

    @GetMapping("/areas")
    public List<RegionAreas> getAreas() {
        return rr.findAll();
    }


}
