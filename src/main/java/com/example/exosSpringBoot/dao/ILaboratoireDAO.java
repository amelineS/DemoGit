package com.example.exosSpringBoot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.exosSpringBoot.entities.Laboratoire;

@Repository
public interface ILaboratoireDAO  extends JpaRepository<Laboratoire, Long>{

}
