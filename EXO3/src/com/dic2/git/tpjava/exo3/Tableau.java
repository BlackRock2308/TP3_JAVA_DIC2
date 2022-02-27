package com.dic2.git.tpjava.exo3;


public class Tableau {


    public Tableau() {
    }

    public Integer maxValue(int[] intArray) {

        int maxNum = intArray[0];

        for (int j : intArray) {
            if (j > maxNum)
                maxNum = j;
        }

        return maxNum;
    }

    public Integer SumValue(int[] intArray) {

        int somme = 0;

        for (int j : intArray) {
            somme += j;
        }

        return somme;
    }

    public Integer ProduitValue(int[] intArray) {

        int result = 1;

        for (int j : intArray) {
            result *= j;
        }

        return result;
    }


}