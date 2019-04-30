package com.example.exosSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.exosSpringBoot.entities.Eleve;
import com.example.exosSpringBoot.service.IserviceCRUD;

@RestController
public class EleveController {
	
	
	@Autowired
	private IserviceCRUD<Eleve> eleveS;

	@GetMapping("/eleve/get/{id}")
	public Eleve findOneById(@PathVariable Long id) {
		return eleveS.findOneById(id);
	}

	@PostMapping("/eleve/save")
	public Eleve save(@RequestBody Eleve t) {
		return eleveS.save(t);
	}

	@DeleteMapping("/eleve/delete")
	public void delete(@RequestBody Eleve t) {
		eleveS.delete(t);
		
	}

	@GetMapping("/eleve/getall")
	public List<Eleve> getAll() {
		return eleveS.getAll();
	}
	



}
