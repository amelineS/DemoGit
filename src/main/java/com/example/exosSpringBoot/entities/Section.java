package com.example.exosSpringBoot.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Section implements Serializable{
	
	@Id 
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private Long id;
	private String libelle;
	
	@OneToMany (mappedBy="section",cascade=CascadeType.ALL)
	private List<Eleve> eleves;
	
	@OneToMany (mappedBy="section",cascade=CascadeType.ALL)
	private List<Matiere> matieres;

	public Section(String libelle, List<Eleve> eleves) {
		super();
		this.libelle = libelle;
		this.eleves = eleves;
	}

	public Section() {
	}
	
	
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public List<Eleve> getEleves() {
		return eleves;
	}

	public void setEleves(List<Eleve> eleves) {
		this.eleves = eleves;
	}

	public List<Matiere> getMatieres() {
		return matieres;
	}

	public void setMatieres(List<Matiere> matieres) {
		this.matieres = matieres;
	}

	@Override
	public String toString() {
		return "Section [libelle=" + libelle + ", eleves=" + eleves + ", matieres=" + matieres + "]";
	}

	
	
}
