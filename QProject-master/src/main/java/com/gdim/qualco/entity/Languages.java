package com.gdim.qualco.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "languages")
public class Languages {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "language_id")
	private int language_id;
	
	@Column(name = "language")
	private String language;

	public int getLanguage_id() {
		return language_id;
	}
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "language")
	private Set<CountryLanguages> countryLanguages;
	
//	@OneToMany(cascade = CascadeType.ALL, mappedBy = "continent")
//	private Set<Regions> regions;

	public void setLanguage_id(int language_id) {
		this.language_id = language_id;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}
	
	

}
