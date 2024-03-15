package Bucles1;

import java.util.Scanner;

public class Bucles_24 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cont = 0;
		int suma = 0;
		
		System.out.println("Cantidad numeros");
		int cantidad = teclado.nextInt();
		for (; cont<cantidad; cont++) {
			System.out.println("num ("+cont+") :");
			int num = teclado.nextInt();
			suma=suma+num;
		}
		
	}

}
