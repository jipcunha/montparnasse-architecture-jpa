package com.infotel.presentation;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.infotel.metier.Adresse;
import com.infotel.metier.Client;
import com.infotel.metier.Connexion;
import com.infotel.metier.Employe;
import com.infotel.metier.Personne;
import com.infotel.service.Iservice;
import com.infotel.service.ServiceImpl;

public class Lanceur {

		public static void main(String[] args) {	
	//	Pour creer les classes sans methodes on ecrit:
	//	EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-pu"); // demojpa-pu est le nom de la persistence-unit
		
		Iservice service = new ServiceImpl();
	/*	Personne p = new Personne();
		p.setNom("Cunha");
		p.setPrenom("Joana");
		p.setAge(23);  */
		
	/*	Client c = new Client();
		c.setNom("Doe");
		c.setPrenom("John");
		c.setAge(31);  
		c.setNumeroAdherent(10); */
		
	/*	Employe e = new Employe();
		e.setNom("Blue");
		e.setPrenom("Joon");
		e.setAge(24);
		e.setSalaire(2000.0); */
		
	//	service.ajouterPersonne(p); 
	//	service.ajouterPersonne(c);
	//	service.ajouterPersonne(e); 
		
		
	//	System.out.println(service.getPersonne(1));
		
	/*	Personne p = new Personne();
		p = service.getPersonne(2); // sert à seleccioner la personne pour supprimer
		service.supprimerPersonne(p); */
		
	/*	Personne p = new Personne();
		p = service.affichagePersonne(1); //sert à voir la personne et aussi la modifier
		p.setNom("Kim");
		p.setPrenom("Taehyung");
		p.setAge(25);
		service.modifierPersonne(p); */
		
	//	System.out.println(service.findAllPersonnes());
		
	/*	//ou
		for(Personne p : service.rechercheParMC("Cu")) {
			System.out.println(p);
		} */
		
		// System.out.println(service.rechercheParMC("Cu"));
		
	/*	Adresse a = new Adresse();
		a = service.affichageAdresse(1);
		a.setNomRue("Rue des Renouilleres");
		a.setNumRue("47");
		a.setVille("Saint-Denis");
		a.setCp("93200");
		service.modifierAdresse(a); */
		
	/*	Connexion c = new Connexion();
		c = service.affichageConnexion(2);
		c.setLogin("jjk");
		c.setMdp("ertyuiop");
		service.modifierConnexion(c); */
		
	//	service.ajouterAdresse(a);
	//	service.ajouterConnexion(c); 
		
	//	 System.out.println(service.affichageAdresse(1));
	//	 System.out.println(service.affichageConnexion(1));
		
	//	System.out.println(service.rechercheAdresseParMC("93"));
	//	System.out.println(service.rechercheConnexionParMC("j"));
		
	/*	Personne p = new Personne();
		Adresse a = new Adresse();
		a.setCp("78000");
		a.setNomRue("rue de lilas");
		a.setNumRue("25");
		a.setVille("Paris");	
		p.setAge(25);
		p.setNom("Dupont");
		p.setPrenom("Jean");
		p.setAdresse(a);
		
		service.ajouterPersonne(p);  */
		
	/*	Adresse a = new Adresse(); 
		a = service.getAdresse(4);
		service.supprimerAdresse(a);  
		
	/*	Personne p = new Personne();
		Connexion c = new Connexion();
		p = service.affichagePersonne(9);
		c = service.affichageConnexion(2);
		p.setConnexion(c);
		service.modifierPersonne(p);  */
		
	/*	for( Personne pers : service.findAllPersonnesConnexion()) {
			System.out.println(pers + " " + pers.getConnexion());
		} */
		
	/*	Personne p = new Personne();
		Adresse a = new Adresse();
		p = service.affichagePersonne(3);
		a = service.affichageAdresse(2);
		p.setAdresse(a);
		service.modifierPersonne(p);  */
		
	/*	for( Personne pers : service.findAllPersonnesAdresse()) {
			System.out.println(pers + " " + pers.getAdresse());
		}  */ // retourne la methode Personne p left join p.adresse
		
		for(Personne pers : service.findAllPersonnesAdresse()) {
			System.out.println(pers + " " + pers.getAdresse());
		}
		
	}

}
