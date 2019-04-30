package com.example.exosSpringBoot.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Matiere implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long code;
	private String libelle;
	private float duree;
	private float coefficient;
	
	@ManyToOne
	@JoinColumn(name="id")
	private Section section;

	@OneToMany(mappedBy="matiere",cascade=CascadeType.ALL)
	private List<Epreuve> epreuves;

	public Matiere(long code, String libelle, float duree, float coefficient, Section section) {
		this.code = code;
		this.libelle = libelle;
		this.duree = duree;
		this.coefficient = coefficient;
		this.section = section;
	}

	public Matiere() {
	}

	public Long getCode() {
		return code;
	}

	public void setCode(Long code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public float getDuree() {
		return duree;
	}

	public void setDuree(float duree) {
		this.duree = duree;
	}

	public float getCoefficient() {
		return coefficient;
	}

	public void setCoefficient(float coefficient) {
		this.coefficient = coefficient;
	}

	public Section getSection() {
		return section;
	}

	public void setSection(Section section) {
		this.section = section;
	}

	public List<Epreuve> getEpreuves() {
		return epreuves;
	}

	public void setEpreuves(List<Epreuve> epreuves) {
		this.epreuves = epreuves;
	}

	@Override
	public String toString() {
		return "Matiere [code=" + code + ", libelle=" + libelle + ", duree=" + duree + ", coefficient=" + coefficient
				+ ", section=" + section + ", epreuves=" + epreuves + "]";
	}
	
	
	
	
	
}
