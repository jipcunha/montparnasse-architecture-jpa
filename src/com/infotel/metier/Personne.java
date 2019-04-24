package com.infotel.metier;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_PERS")
@DiscriminatorValue("PERS")
// @Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)
//@Inheritance (strategy = InheritanceType.JOINED)

public class Personne {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idPersonne;
	
	@Column (length = 32)
	private String nom;
	
	private String prenom;
	
	private int age;
	
	@ManyToOne (cascade = {CascadeType.PERSIST})
	private Adresse adresse; //relation d'association; many personnes to one adresse
	
	@OneToOne (fetch = FetchType.EAGER)
	private Connexion connexion;
	
	@ManyToMany (fetch = FetchType.LAZY)
	private List<Club> club = new ArrayList<Club>();
	
	
	public List<Club> getClub() {
		return club;
	}
	public void setClub(List<Club> club) {
		this.club = club;
	}
	public Connexion getConnexion() {
		return connexion;
	}
	public void setConnexion(Connexion connexion) {
		this.connexion = connexion;
	}
	public Adresse getAdresse() {
		return adresse;
	}
	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public int getIdPersonne() {
		return idPersonne;
	}
	public void setIdPersonne(int idPersonne) {
		this.idPersonne = idPersonne;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Personne [idPersonne=" + idPersonne + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age
				+ ", adresse=" + adresse + "]" + "\n";
	}
	
	
}