package com.dic2.git.tpjava.tp.exo1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Annuaire {


            private Map<String,Fiche> table;

            public Annuaire(){
                this.table = new HashMap<String, Fiche>();
            }

            //Rechercher une fiche en fonction du nom
            public Fiche rechercher(String nom){
                Fiche fiche = this.table.get(nom);

                return fiche;
            }


            // Insérer une nouvelle fiche

            public void insert(String nom, String numero, String adresse){
                this.table.put(nom, new Fiche(nom, numero, adresse));
            }

            //Afichage de toutes les fiches de l'annuaire

            public String toString(){
                String ch = "";
                Iterator<String> it = this.table.keySet().iterator();
                int compteur = 0;
                while(it.hasNext()){
                    String key = it.next();
                    Fiche fiche = this.table.get(key);
                    ch += (compteur++) + "." + key + ", Fiche = " + fiche + "\n";
                }
                return ch;
            }

            public void commande(String chaine){
                char c = chaine.charAt(0);
                String nom = chaine.substring(1);
                switch (c){
                    case '?':
                        System.out.println("Recherche de la fiche de " + nom + ".....");
                        System.out.println(this.rechercher(nom));
                        break;

                    case '+':
                        System.out.println("Ajout de la fiche de " + nom + ".....");
                        Scanner	entreeFichier	=	new Scanner(System.in);
                        System.out.println("Entrer votre numéro de téléphone");
                        String telephone = entreeFichier.next();
                        System.out.println("Entrer votre Adresse ");
                        String adresse = entreeFichier.next();
                        this.insert(nom, telephone, adresse);
;                        break;

                    case '!':
                        System.out.println("-------Affiche de l'annuaire-------");
                        System.out.println(this);
                        break;

                    case '.':
                        System.out.println("------Fin du programme--------");
                        break;
                }

            }






            /**for(int i = 0, n = args.length; i<n; i++){

                String entree = args[i];
                String test = annuaire.get(entree).getNom();
                if(entree.charAt(0)=='?' && entree.length()>1){

                }


        }
             **/
}


