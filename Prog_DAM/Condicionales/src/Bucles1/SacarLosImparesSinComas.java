package Bucles1;

import java.util.Scanner;

public class SacarLosImparesSinComas {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce un numero: ");
		int num = teclado.nextInt();
		System.out.println("1");
		for(int valor=3;valor<=num;valor++) {
			if(valor%2!=0) {
				System.out.println(","+valor);
			}
		}
		
	}

}
