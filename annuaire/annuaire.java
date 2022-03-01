package annuaire;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class annuaire {
	Map<String, Fiche> annuaire;
	
	//Ceci est l'implementation d'un annuaire sans ordre
	
	
	/*public annuaire() {
		this.annuaire = new HashMap<String, Fiche>();
	}*/
	
	
	//Ceci est l'implementation d'un annuaire dans lequel les contacts sont affiches dans un ordre bien precis
	public annuaire() {
		this.annuaire = new TreeMap<String, Fiche>();
	}
	
	public void afficher(Fiche f) {
		System.out.println(f);
	}
	
	public void rechercher(String nom) {
		System.out.println("---Le contact recherche est ----- \n");
		this.afficher(this.annuaire.get(nom));
}
	public void ajouterContact(String nom, String numero, String adresse) {
		Fiche contact = new Fiche(nom, numero, adresse);
		this.annuaire.put(nom, contact);
	}
	
	public String toString(){
		String chaine="";
		Iterator<String> i = this.annuaire.keySet().iterator();
		while(i.hasNext()) {
			String b = i.next();
			Fiche f= this.annuaire.get(b);
		chaine+= f +"\n";
		
		}
		return chaine;
	}
	
	public void commande(String com) {
		char command = com.charAt(0);
		String nom = com.substring(1);
		
		switch(command) {
		case '?':
			this.rechercher(nom);
			break;
		case '+':
			Scanner entree = new Scanner(System.in);
			System.out.println("Saisir l\'adresse");
			String adresee = entree.next();
			System.out.println("Saisir le numero");
			String numero = entree.next();
			this.ajouterContact(nom, numero, adresee);
			System.out.println("Contact enregistre avec succes \n Voici le nouvel annuaire \n"+this.annuaire);
			break;
		case '!':
			System.out.println("------Affichage de l'annuaire------");
			System.out.println(this.annuaire);
			break;
		case '.':
			System.out.println("Fin du programme");
			break;
		}
	}
	}