package com.example.exosSpringBoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.exosSpringBoot.entities.Section;

@Repository
public interface ISectionDAO  extends JpaRepository<Section, Long>{

}
