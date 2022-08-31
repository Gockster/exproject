package com.gdim.qualco.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "countries")
public class Countries {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "country_id")
	private int countryId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "area")
	private int area;
	
	@Column(name = "national_day")
	private Date national_day;
	
	@Column(name = "country_code2")
	private String country_code2;
	
	@Column(name = "country_code3")
	private String country_code3;
	
	@Column(name = "region_id")
	private int region_id;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "country")
	private Set<CountryLanguages> countryLanguages;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "countrys")
	private Set<CountryStats> countryStats;
	
	@ManyToOne(optional=false)
	@JoinColumn(name = "region_id", insertable=false, updatable=false)
	private Regions regions;

	public int getCountry_id() {
		return countryId;
	}

	public void setCountry_id(int country_id) {
		this.countryId = country_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public Date getNational_day() {
		return national_day;
	}

	public void setNational_day(Date national_day) {
		this.national_day = national_day;
	}

	public String getCountry_code2() {
		return country_code2;
	}

	public void setCountry_code2(String country_code2) {
		this.country_code2 = country_code2;
	}

	public String getCountry_code3() {
		return country_code3;
	}

	public void setCountry_code3(String country_code3) {
		this.country_code3 = country_code3;
	}

	public int getRegion_id() {
		return region_id;
	}

	public void setRegion_id(int region_id) {
		this.region_id = region_id;
	}

//	public Set<CountryLanguages> getCountryLanguages() {
//		return countryLanguages;
//	}
//
//	public void setCountryLanguages(Set<CountryLanguages> countryLanguages) {
//		this.countryLanguages = countryLanguages;
//	}

//	public Set<CountryStats> getCountryStats() {
//		return countryStats;
//	}
//
//	public void setCountryStats(Set<CountryStats> countryStats) {
//		this.countryStats = countryStats;
//	}
//
//	public Regions getRegions() {
//		return regions;
//	}
//
//	public void setRegions(Regions regions) {
//		this.regions = regions;
//	}
	
	

	
	
	

}
