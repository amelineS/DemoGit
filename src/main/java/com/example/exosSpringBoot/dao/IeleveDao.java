package com.example.exosSpringBoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.exosSpringBoot.entities.Eleve;

@Repository
public interface IeleveDao  extends JpaRepository<Eleve, Long>{

}
