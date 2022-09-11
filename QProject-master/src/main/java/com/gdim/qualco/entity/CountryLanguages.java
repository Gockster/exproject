package com.gdim.qualco.entity;

import javax.persistence.*;

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

}
