package exercice4;
import java.util.ArrayList;


public class ListeOrdonnablesTries<E extends Ordonnable> extends ArrayList<E>{
	public void inserer(E e) {
		int i = size();	
		add(e);
		while ((i >= 1) && (get(i - 1).plusGrand(e))) {
		    set(i, get(i - 1));
		    i--;
		}
		set(i, e);
	    }

	    public void supprimer(E e) {
	    	//Decompte du nombre d'occurence 
			int taille = size();
			int compt=0;
			for(int i=0; i< taille; i++) {
				if(get(i).equals(e)) compt++;
			}
			//Suprression selon le nombre d'occurences
			if(compt==1) {
				remove(indexOf(e));
			}
			else if (compt>1){
				int i=0;
				while(i< compt) {
					remove(indexOf(e));
					i++;
				}
			}
			else {
				System.out.println("Element non trouve");
			}
	  }

	  public String toString() { 
	    String chaine="";

	    for (E e : this) chaine = chaine.concat(e + " ");
	    return chaine;
	  }

	  public void  afficher() { 
	    System.out.println(this);
	  }
}
