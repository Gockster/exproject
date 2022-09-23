package com.gdim.qualco.dao;

import com.gdim.qualco.entity.Expert;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;


public interface ExpertRepository extends JpaRepository<Expert, Integer> {

    List<Expert> findByCountryNameContains(String countryName);

    @Query("select e from Expert e " +
            "where e.year like concat('%', ?1, '%') or e.population like concat('%', ?1, '%') or e.gdp = ?1 or e.continentName like concat('%', ?1, '%') or e.countryName like concat('%', ?1, '%') or e.regionName like concat('%', ?1, '%')")
    List<Expert> findBySearch(@Param("searchAttribute") Optional searchAttribute);

    List<Expert> findByYearBetween(int yearStart, int yearEnd);

    @Query("select e from Expert e where e.regionName = ?1")
    List<Expert> findByRegionName(String regionName);

    @Query("select e from Expert e where e.regionId = ?1")
    List<Expert> findByRegionId(Long regionId);









}
