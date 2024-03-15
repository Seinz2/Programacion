package Bucles1;

import java.util.Scanner;

public class extra1 {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//clase particular de Ronnie
		
		int cont, num, contDiv;
		System.out.println("Introducir numero: ");
		num = teclado.nextInt();
		
		cont = 1;
		contDiv = 0;
		
		while (cont <= num) {
			
			if (num%cont==0) {
				System.out.println(cont);
				contDiv++;
			}
			cont++;
			
		}
	System.out.println("Numero de contadores: "+ contDiv);	
	}

}
