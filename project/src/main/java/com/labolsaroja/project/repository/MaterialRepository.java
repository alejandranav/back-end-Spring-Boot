package com.labolsaroja.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.labolsaroja.project.entities.Material;

@Repository
public interface MaterialRepository extends JpaRepository<Material, Long>{

}
