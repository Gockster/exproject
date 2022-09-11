package com.gdim.qualco.entity;


import org.hibernate.annotations.Immutable;

import javax.persistence.*;

@Entity
@Table(name="expert")
@Immutable
public class Expert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "population")
    private Long population;

    @Column(name = "continent_name")
    private String continentName;

    @Column(name = "region_name")
    private String regionName;

    @Column(name = "country_name")
    private String countryName;

    @Column(name = "year")
    private int year;

    @Column(name = "gdp")
    private Long gdp;

    public Long getPopulation() {
        return population;
    }

    public String getContinentName() {
        return continentName;
    }

    public String getRegionName() {
        return regionName;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getYear() {
        return year;
    }

    public Long getGdp() {
        return gdp;
    }
}
