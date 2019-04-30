package com.example.exosSpringBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.exosSpringBoot.entities.Laboratoire;

import com.example.exosSpringBoot.service.IserviceCRUD;

@RestController
public class LaboratoireController {
	

		
		@Autowired
		private IserviceCRUD<Laboratoire> dao;


		@GetMapping("/laboratoire/get/{id}")
		public Laboratoire findOneById(@PathVariable Long id) {
			return dao.findOneById(id);
		}

		@PostMapping("/laboratoire/save")
		public Laboratoire save(@RequestBody Laboratoire t) {
			return dao.save(t);
		}

		@DeleteMapping("/laboratoire/delete")
		public void delete(@RequestBody Laboratoire t) {
			dao.delete(t);
			
		}

		@GetMapping("/laboratoire/getall")
		public List<Laboratoire> getAll() {
			return dao.getAll();
		}

}
