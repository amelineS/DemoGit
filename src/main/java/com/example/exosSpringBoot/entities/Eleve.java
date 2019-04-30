package com.example.exosSpringBoot.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Eleve implements Serializable{
	
	@Id 
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column (name="id_eleve")
	private Long id;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	
	@ManyToOne
	@JoinColumn(name="id")
	private Section section;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(
			name="convocation" , 
			joinColumns=@JoinColumn(name="id_eleve" ,referencedColumnName="id_eleve" ),
		    inverseJoinColumns=@JoinColumn(name="id_epreuve" ,referencedColumnName="id_epreuve" )
		
			)
	private List<Epreuve> epreuves;


	public Eleve() {
	}


	public Eleve(String nom, String prenom, Date dateNaissance, Section section) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.section = section;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
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
		return "Eleve [nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + ", section=" + section
				+ "]";
	}
	
	

}
