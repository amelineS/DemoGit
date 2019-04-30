package com.example.exosSpringBoot.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Epreuve implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name="id_epreuve")
	private Long id;
	private Date dateHeure;
	
	
	
	@ManyToOne
	@JoinColumn(name="code")
	private Matiere matiere;
	
	@ManyToOne
	@JoinColumn(name="numero")
	private Laboratoire laboratoire;
	
	@ManyToMany (mappedBy="epreuves")
	private List<Eleve> eleves;
	
	
	
	

	public Epreuve() {

	}

	public Epreuve(Date dateHeure, Matiere matiere, Laboratoire laboratoire) {
		this.dateHeure = dateHeure;
		this.matiere = matiere;
		this.laboratoire = laboratoire;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDateHeure() {
		return dateHeure;
	}

	public void setDateHeure(Date dateHeure) {
		this.dateHeure = dateHeure;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}

	public Laboratoire getLaboratoire() {
		return laboratoire;
	}

	public void setLaboratoire(Laboratoire laboratoire) {
		this.laboratoire = laboratoire;
	}

	public List<Eleve> getEleves() {
		return eleves;
	}

	public void setEleves(List<Eleve> eleves) {
		this.eleves = eleves;
	}

	@Override
	public String toString() {
		return "Epreuve [id=" + id + ", dateHeure=" + dateHeure + ", matiere=" + matiere + ", laboratoire="
				+ laboratoire + ", eleves=" + eleves + "]";
	}
	
	

}
