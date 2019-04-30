package com.example.exosSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


import com.example.exosSpringBoot.dao.IeleveDao;
import com.example.exosSpringBoot.entities.Eleve;


@SpringBootApplication
public class ExosSpringBootApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(ExosSpringBootApplication.class, args);
		IeleveDao edao = ctx.getBean(com.example.exosSpringBoot.dao.IeleveDao.class);
		Eleve p = new Eleve("nom","prenom", null, null);
		edao.save(p);
	}

}
