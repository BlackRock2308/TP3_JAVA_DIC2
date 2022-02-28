package com.dic2.git.tpjava.exo4;

import java.util.Locale;

public class Identite implements Ordonnable {

    private String prenom;
    private String nom;


    public Identite( String prenom,String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public boolean plusGrand(Object o) {

        Identite autre = (Identite) o;
        if (nom.compareTo(autre.nom) < 0) return false;
        else if (nom.compareTo(autre.nom) > 0) return true;
        else if (prenom.compareTo(autre.prenom) < 0) return false;
        else return true;
    }

    public  boolean equals(Object o) {
        Identite autre = (Identite) o;
        //Conversion des nom et prénom à comparer en lowerCase
        String nom_lower = nom.toLowerCase(Locale.ROOT);
        String prenom_lower = prenom.toLowerCase(Locale.ROOT);
        String autre_nom_lower = autre.nom.toLowerCase(Locale.ROOT);
        String autre_prenom_lower = autre.prenom.toLowerCase(Locale.ROOT);
        return ((nom_lower.equals(autre_nom_lower)) && (prenom_lower.equals(autre_prenom_lower)));
    }

    public String toString() {
        return prenom + " " + nom;
    }
}
