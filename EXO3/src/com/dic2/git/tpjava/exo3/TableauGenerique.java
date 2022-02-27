package com.dic2.git.tpjava.exo3;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;

public class TableauGenerique {

    public TableauGenerique() {
    }

    public  <T extends Comparable<T>> T maxValue(List<T> array){
        T max = array.get(0);
        for(T data: array){
            if(data.compareTo(max)>0)
                max =data;
        }
        return max;
    }

    public  <T extends Number, U extends Collection<T>> BigDecimal sumValue(U numbers) {

        BigDecimal sum = BigDecimal.ZERO;

        for ( T number : numbers ) {
            sum = sum.add(new BigDecimal(number.toString()));
        }

        return sum;
    }

    public  <T extends Number, U extends Collection<T>> BigDecimal multiplyValue(U numbers) {

        BigDecimal sum = BigDecimal.ONE;

        for ( T number : numbers ) {
            sum = sum.multiply(new BigDecimal(number.toString()));
        }

        return sum;
    }
}
