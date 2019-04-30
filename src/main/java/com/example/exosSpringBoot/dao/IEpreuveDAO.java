package com.example.exosSpringBoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.exosSpringBoot.entities.Epreuve;

@Repository
public interface IEpreuveDAO  extends JpaRepository<Epreuve, Long>{

}
