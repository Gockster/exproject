package com.gdim.qualco.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

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

	@JsonIgnore
	@ManyToMany(cascade={CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.LAZY)
	@JoinTable(name="CountryLanguages",
			joinColumns = @JoinColumn(name = "language_id"),
			inverseJoinColumns = @JoinColumn(name = "country_id")
	)
	private List<Countries> countries;

	public void setLanguage_id(int language_id) {
		this.language_id = language_id;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public List<Countries> getCountries() {
		return countries;
	}

	public void setCountries(List<Countries> countries) {
		this.countries = countries;
	}
}
