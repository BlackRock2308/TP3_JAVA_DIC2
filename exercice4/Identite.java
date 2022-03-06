package exercice4;

public class Identite implements Ordonnable{
	
	private String nom;
	private String prenom;
	public Identite(String prenom, String nom) {
		this.prenom=prenom;
		this.nom=nom;
	}
	
	public boolean plusGrand(Object o) {
		Identite autreIdentite = (Identite) o;
		if(nom.compareTo(autreIdentite.nom) < 0 ) {
			return false;
		}
		else if(prenom.compareTo(prenom)<0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public  boolean equals(Object o) {
		Identite autreIdentite = (Identite) o;
		return ((nom.equals(autreIdentite.nom)) && (prenom.equals(autreIdentite.prenom)));
	   }
	
	public String toString() {
		return prenom + " " + nom;
	    }

}
