package com.dic2.git.tpjava.exo4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        ListeOrdonnablesTries<Identite> liste = new  ListeOrdonnablesTries<Identite> ();

        Scanner entreeFichier = new Scanner(new FileInputStream("identite.txt"));
        Identite identite;

        while (entreeFichier.hasNext()) {
            identite = new Identite(entreeFichier.next(),entreeFichier.next());
            liste.inserer(identite);
        }
        liste.afficher();

        System.out.println("Donnez un prenom et un nom pour une identité à supprimer : ");
        Scanner entreeClavier = new Scanner(System.in);
        identite = new Identite(entreeClavier.next(),entreeClavier.next());
        liste.supprimer(identite);
        System.out.println();
        liste.afficher();
    }
}

