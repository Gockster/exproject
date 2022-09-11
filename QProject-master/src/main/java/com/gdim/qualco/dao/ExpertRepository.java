package com.gdim.qualco.dao;

import com.gdim.qualco.entity.Expert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpertRepository extends JpaRepository<Expert, Integer> {
}
