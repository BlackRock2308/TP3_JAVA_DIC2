package com.dic2.git.tpjava.exo3;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {

        TableauGenerique tableauGenerique = new TableauGenerique();

        Tableau tableau = new Tableau();

        int[] intArray = {24, 2, 0, 34, 12, 110, 2};


        System.out.println("The maximum value of this interger's list is :");
        System.out.println(tableau.maxValue(intArray));

        System.out.println("The maximum value of this list is :");
        System.out.println(tableauGenerique.maxValue(Arrays.asList(1.0, 3.09, 6.0, 2.0, 4.0, 5.0)));

        System.out.println("The maximum value of this list is :");
        System.out.println(tableauGenerique.maxValue(Arrays.asList(1.7D, 3.2D, 2.5D, 2.1D, 0.05D, 1.84D)));

        System.out.println("The sulm of value is: ");
        System.out.println(tableauGenerique.sumValue(Arrays.asList(1, 3, 6, 2, 4, 5)));

        System.out.println("The multiplication of values is:");
        System.out.println(tableauGenerique.multiplyValue(Arrays.asList(1, 3, 6, 2, 4, 5)));
    }



}
