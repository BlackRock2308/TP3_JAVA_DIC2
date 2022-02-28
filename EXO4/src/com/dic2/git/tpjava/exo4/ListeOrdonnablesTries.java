package com.dic2.git.tpjava.exo4;

import java.util.ArrayList;

public class ListeOrdonnablesTries<E extends Ordonnable> extends ArrayList<E> {

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
        int i = 0;

        int taille = size();
        while ((i < taille) && (!get(i).equals(e))) i++;
        if (i < taille)  {
            while (i < taille - 1) {
                set(i, get(i + 1));
                i++;
            }
            remove(taille - 1);
        }
    }

    public String toString() {
        String chaine="";

        for (E e : this) chaine = chaine.concat(e + "\n");
        return chaine;
    }

    public void  afficher() {
        System.out.println(this);
    }

}
