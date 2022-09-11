package com.gdim.qualco.entity;


import org.hibernate.annotations.Immutable;

import javax.persistence.*;

@Entity
@Table(name="sec_screen")
@Immutable
public class SecondScreen {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "country_id")
    private int countryId;

    @Column(name = "name")
    private String name;

    @Column(name = "country_code3")
    private String country_code3;

    @Column(name = "year")
    private String year;

    @Column(name = "population")
    private String population;

    @Column(name = "gdp")
    private String gdp;


    public int getCountryId() {
        return countryId;
    }

    public String getName() {
        return name;
    }

    public String getCountry_code3() {
        return country_code3;
    }

    public String getYear() {
        return year;
    }

    public String getPopulation() {
        return population;
    }

    public String getGdp() {
        return gdp;
    }
}
