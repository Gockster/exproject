package com.gdim.qualco.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "country_stats")
public class CountryStats {
	
	@Id
	@Column(name = "year")
	private int year;
	
	@Column(name = "population")
	private int population;
	
	@Column(name = "gdp")
	private long gdp;
	
	@Column(name = "country_id")
	private int country_id;
	
	@ManyToOne(optional=false)
	@JoinColumn(name = "country_id", insertable=false, updatable=false)
	private Countries countrys;

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public long getGdp() {
		return gdp;
	}

	public void setGdp(long gdp) {
		this.gdp = gdp;
	}

	public int getCountry_id() {
		return country_id;
	}

	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}

	public Countries getCountry() {
		return countrys;
	}

	public void setCountry(Countries countries) {
		this.countrys = countries;
	}
	
	

}
