package com.example.exosSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.exosSpringBoot.entities.Epreuve;
import com.example.exosSpringBoot.service.IserviceCRUD;

@RestController
public class EpreuveController {
	
	@Autowired
	private IserviceCRUD<Epreuve> dao;


	@GetMapping("/epreuve/get/{id}")
	public Epreuve findOneById(@PathVariable Long id) {
		return dao.findOneById(id);
	}

	@PostMapping("/epreuve/save")
	public Epreuve save(@RequestBody Epreuve t) {
		return dao.save(t);
	}

	@DeleteMapping("/epreuve/delete")
	public void delete(@RequestBody Epreuve t) {
		dao.delete(t);
		
	}

	@GetMapping("/epreuve/getall")
	public List<Epreuve> getAll() {
		return dao.getAll();
	}

}
