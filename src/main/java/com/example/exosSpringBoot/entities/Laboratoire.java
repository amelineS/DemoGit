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
public class Laboratoire implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long numero;
	private String nom;
	private int nbOrdinateur;
	
	@OneToMany (mappedBy="laboratoire",cascade=CascadeType.ALL)
	private List<Epreuve> epreuves;

	public Laboratoire(String nom, int nbOrdinateur) {

		this.nom = nom;
		this.nbOrdinateur = nbOrdinateur;

	}

	public Laboratoire() {

	}
	
	
	
	

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getNbOrdinateur() {
		return nbOrdinateur;
	}

	public void setNbOrdinateur(int nbOrdinateur) {
		this.nbOrdinateur = nbOrdinateur;
	}

	public List<Epreuve> getEpreuves() {
		return epreuves;
	}

	public void setEpreuves(List<Epreuve> epreuves) {
		this.epreuves = epreuves;
	}

	@Override
	public String toString() {
		return "Laboratoire [numero=" + numero + ", nom=" + nom + ", nbOrdinateur=" + nbOrdinateur + ", epreuves="
				+ epreuves + "]";
	}
	
	

}
