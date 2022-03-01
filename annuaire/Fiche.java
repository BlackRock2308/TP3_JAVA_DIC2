package annuaire;

public class Fiche {
	private String nom;
	private String adresse;
	private String numero;
	
	
	public Fiche() {
	}
	public Fiche(String nom, String adresse, String numero) {
		this.nom = nom;
		this.adresse = adresse;
		this.numero = numero;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String toString() {
		String chaine = "Nom: "+ this.nom+ "  "+ "Numero:"+ this.numero+ "  "+ "Address: "+ this.adresse+"\n";
		return chaine;
	}
}
