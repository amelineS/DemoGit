package com.example.exosSpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exosSpringBoot.dao.IEpreuveDAO;
import com.example.exosSpringBoot.entities.Epreuve;

@Service
public class EpreuveService implements IserviceCRUD<Epreuve>{

	@Autowired
	private IEpreuveDAO dao;
	
	@Override
	public Epreuve findOneById(Long id) {
		return dao.getOne(id);
	}

	@Override
	public Epreuve save(Epreuve t) {
		return dao.save(t);
	}

	@Override
	public void delete(Epreuve t) {
		dao.delete(t);
	}

	@Override
	public List<Epreuve> getAll() {
		return dao.findAll();
	}

}
