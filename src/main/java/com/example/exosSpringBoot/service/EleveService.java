package com.example.exosSpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.exosSpringBoot.dao.IeleveDao;
import com.example.exosSpringBoot.entities.Eleve;

@Service
public class EleveService implements IserviceCRUD<Eleve>{
	
	
	@Autowired
	private IeleveDao dao;

	@Override
	public Eleve findOneById(Long id) {
		return dao.getOne(id);
	}

	@Override
	public Eleve save(Eleve t) {
		return dao.save(t);
	}

	@Override
	public void delete(Eleve t) {
		dao.delete(t);
		
	}

	@Override
	public List<Eleve> getAll() {
		return dao.findAll();
	}

}
