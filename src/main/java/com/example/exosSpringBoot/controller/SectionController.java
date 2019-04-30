package com.example.exosSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.exosSpringBoot.entities.Section;
import com.example.exosSpringBoot.service.IserviceCRUD;

@RestController
public class SectionController {
	
	@Autowired
	private IserviceCRUD<Section> dao;


	@GetMapping("/section/get/{id}")
	public Section findOneById(@PathVariable Long id) {
		return dao.findOneById(id);
	}

	@PostMapping("/section/save")
	public Section save(@RequestBody Section t) {
		return dao.save(t);
	}

	@DeleteMapping("/section/delete")
	public void delete(@RequestBody Section t) {
		dao.delete(t);
		
	}

	@GetMapping("/section/getall")
	public List<Section> getAll() {
		return dao.getAll();
	}

}
