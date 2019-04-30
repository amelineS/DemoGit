package com.example.exosSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.exosSpringBoot.entities.Matiere;
import com.example.exosSpringBoot.service.IserviceCRUD;

@RestController
public class MatiereController {
	@Autowired
	private IserviceCRUD<Matiere> dao;


	@GetMapping("/matiere/get/{id}")
	public Matiere findOneById(@PathVariable Long id) {
		return dao.findOneById(id);
	}

	@PostMapping("/matiere/save")
	public Matiere save(@RequestBody Matiere t) {
		return dao.save(t);
	}

	@DeleteMapping("/matiere/delete")
	public void delete(@RequestBody Matiere t) {
		dao.delete(t);
		
	}

	@GetMapping("/matiere/getall")
	public List<Matiere> getAll() {
		return dao.getAll();
	}
	
}
