package Bucles1;

import java.util.Scanner;

public class Bucles_23 {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce numero: ");
		int num = teclado.nextInt();
		int fact = 1;
		int cont = 1;
		for (;cont<=num; cont++) {
			fact = fact*cont;
		}
		System.out.println("Factorial de " + num+ "! es "+ fact);
	}

}
