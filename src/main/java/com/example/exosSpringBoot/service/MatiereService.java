package com.example.exosSpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exosSpringBoot.dao.IMatiereDAO;

import com.example.exosSpringBoot.entities.Matiere;

@Service
public class MatiereService implements IserviceCRUD<Matiere>{

	
	@Autowired
	private IMatiereDAO dao;
	
	@Override
	public Matiere findOneById(Long id) {
		return dao.getOne(id);
	}

	@Override
	public Matiere save(Matiere t) {
		return dao.save(t);
	}

	@Override
	public void delete(Matiere t) {
		dao.delete(t);
	}

	@Override
	public List<Matiere> getAll() {
		return dao.findAll();
	}

}
