package com.example.exosSpringBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.exosSpringBoot.dao.ISectionDAO;
import com.example.exosSpringBoot.entities.Section;

@Service
public class SectionService implements IserviceCRUD<Section> {
	
	@Autowired
	private ISectionDAO dao;

	@Override
	public Section findOneById(Long id) {
		return dao.getOne(id);
	}

	@Override
	public Section save(Section t) {
		return dao.save(t);
	}

	@Override
	public void delete(Section t) {
		dao.delete(t);
	}

	@Override
	public List<Section> getAll() {
		return dao.findAll();
	}

}
