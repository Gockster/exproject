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

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="continents")
public class Continents {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "continent_id")
	private int continent_id;
	
	@Column(name = "name")
	private String name;


	@OneToMany(cascade = CascadeType.ALL, mappedBy = "continent")
	private Set<Regions> regions;


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	

}
