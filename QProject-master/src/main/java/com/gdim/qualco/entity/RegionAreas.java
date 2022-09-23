package com.gdim.qualco.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "region_areas")
public class RegionAreas {
	
	@Id
	@Column(name = "region_name")
	private String region_name;
	
	@Column(name = "region_area")
	private Long region_area;

	public String getRegion_name() {
		return region_name;
	}

	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}

	public Long getRegion_area() {
		return region_area;
	}

	public void setRegion_area(Long region_area) {
		this.region_area = region_area;
	}
	
	

}
