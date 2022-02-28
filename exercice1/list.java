package exercice1;

import java.util.*;

public class list {
	ArrayList<Integer> l= new ArrayList<Integer>();
	public list(int n) {
		this.remplir(n, l);
		Collections.sort(this.l);
		System.out.println("Apres tri: "+this.l);
	}
	
	public int randomNumber(int max, int min) {
		return (int)((Math.random() * (max - min)) + min);
	}
	
	public void remplir(int m, ArrayList<Integer> li){
		int compt=0;
		while(compt<=m) {
			int a= (int)this.randomNumber(1000,0);
			li.add(a);
			compt++;
		}
		System.out.println("Premiere version"+li);
	}
}
