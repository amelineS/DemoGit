package com.example.exosSpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exosSpringBoot.dao.ILaboratoireDAO;
import com.example.exosSpringBoot.entities.Laboratoire;

@Service
public class LaboratoireService implements IserviceCRUD<Laboratoire>{

	
	@Autowired
	private ILaboratoireDAO dao;
	
	@Override
	public Laboratoire findOneById(Long id) {
		return dao.getOne(id);
	}

	@Override
	public Laboratoire save(Laboratoire t) {
		return dao.save(t);
	}

	@Override
	public void delete(Laboratoire t) {
		dao.delete(t);
	}

	@Override
	public List<Laboratoire> getAll() {
		return dao.findAll();
	}

}
