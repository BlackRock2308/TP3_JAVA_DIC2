package com.dic2.git.tpjava.tp.exo1;

public class Adresse {
    private String rue;
    private String ville;
    private String pays;
    private String codePostal;

    public Adresse(String rue, String ville, String pays, String codePostal) {
        this.rue = rue;
        this.ville = ville;
        this.pays = pays;
        this.codePostal = codePostal;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String toString(){
        String adress = "";
        adress += rue + " , " + ville + " , " + pays + " , " + codePostal ;
        return adress;
    }
}
