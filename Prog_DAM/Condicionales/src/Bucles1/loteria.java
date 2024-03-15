package Bucles1;

import java.util.Scanner;

public class loteria {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int veces = 1;
		while(veces<=6) {
			int num=(int)((Math.random()*49)+1);
			System.out.println("Pos("+veces+")="+num);
			veces++;
		}
	}

}
