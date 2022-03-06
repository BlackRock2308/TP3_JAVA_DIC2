package exercice4;
import java.util.*;
import java.io.FileNotFoundException;

public class EssaiOrdonnablesTries{
		public static void main(String[] args) {
			ListeOrdonnablesTries<Identite> liste = new ListeOrdonnablesTries<Identite>();
			Identite identite;
			try {
				Scanner fichier = new Scanner(new java.io.File(args[0]));
				//Insertion des identites depuis le fichier
				while (fichier.hasNext()) {
					identite = new Identite(fichier.next(),fichier.next());
					liste.inserer(identite); 
				    }
				//Affichage de la liste des identites
				    liste.afficher();
				    
				//Supprimer une identite 
				  System.out.println("Saisir le nom et le prenom à supprimer");
				  Scanner entree = new Scanner(System.in);
				  identite = new Identite(entree.next(),entree.next()); 
				  liste.supprimer(identite);
				  System.out.println();
				  liste.afficher();
			} 
			catch (FileNotFoundException e) {
				System.out.println(e);
			}
			
		}
		
		
}
