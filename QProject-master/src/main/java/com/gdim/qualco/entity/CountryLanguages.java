package com.gdim.qualco.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="country_languages")
public class CountryLanguages {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "country_id")
	private int country_id;
	
	@Column(name = "language_id")
	private int language_id;
	
	@Column(name = "official")
	private int official;
	
	@ManyToOne(optional=false)
	@JoinColumn(name = "language_id", insertable=false, updatable=false)
	private Languages language;
	
	@ManyToOne(optional=false)
	@JoinColumn(name = "country_id", insertable=false, updatable=false)
	private Countries country;

	public int getCountry_id() {
		return country_id;
	}

	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}

	public int getLanguage_id() {
		return language_id;
	}

	public void setLanguage_id(int language_id) {
		this.language_id = language_id;
	}

	public int getOfficial() {
		return official;
	}

	public void setOfficial(int official) {
		this.official = official;
	}

	public Languages getLanguage() {
		return language;
	}

	public void setLanguage(Languages language) {
		this.language = language;
	}

	public Countries getCountry() {
		return country;
	}

	public void setCountry(Countries countries) {
		this.country = countries;
	}
	
	
	

}
