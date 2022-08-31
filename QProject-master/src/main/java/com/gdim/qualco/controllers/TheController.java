package com.gdim.qualco.controllers;

import com.gdim.qualco.dao.*;
import com.gdim.qualco.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/home")
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

    @GetMapping("/countries")
    public List<Countries> getCountries() {
        return cre.findAll();
    }

//    @GetMapping("/countries/{id}")
//    public String getCountriesId(@PathVariable String id) {
//        return id;
//    }

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
