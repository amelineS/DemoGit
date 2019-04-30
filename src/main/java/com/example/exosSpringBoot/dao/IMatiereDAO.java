package com.example.exosSpringBoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.exosSpringBoot.entities.Matiere;

@Repository
public interface IMatiereDAO  extends JpaRepository<Matiere, Long>{

}
