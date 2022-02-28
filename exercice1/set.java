package exercice1;

import java.util.*;
import exercice1.list;

public class set {
	TreeSet<Integer> mySet = new TreeSet<Integer>();
	public set(int m){
		this.remplirSet(m, this.mySet);
		System.out.println("Deuxieme Version"+mySet);
	}
	
	public void remplirSet(int compt, TreeSet<Integer> myset){
		int m=0;
		while(m<=compt) {
			myset.add(this.randomNumber(1000,0));
			m++;
		}
	}
	public int randomNumber(int max, int min) {
		return (int)((Math.random() * (max - min)) + min);
	}
}
