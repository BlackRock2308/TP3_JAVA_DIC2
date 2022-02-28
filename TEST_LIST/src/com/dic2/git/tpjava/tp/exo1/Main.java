package com.dic2.git.tpjava.tp.exo1;

public class Main {
    public static void main(String[] args) {

        Annuaire annuaire = new Annuaire();

        for (int i=0 ; i<args.length; i++){
            annuaire.commande("+" + args[i]);
        }

        annuaire.insert("Sahaba Ndiaye", "774445200","Thies");
        annuaire.insert("Soudou Faye", "78445470","Ouakam");
        annuaire.insert("Aissatou Balde", "770021400","Sébi");


        annuaire.commande("!");
        annuaire.commande("?Sahaba Ndiaye");
        annuaire.commande(".");
    }
}
