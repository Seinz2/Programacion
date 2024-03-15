package Bucles1;

import java.util.Scanner;

public class act2_1_ejer5 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce numero ");
		int asteriscos = teclado.nextInt();
		
		for (int num = asteriscos;num>=0;num--) {

			System.out.print(num+" ");
			
			for (int numAsts=0;numAsts<=num;numAsts++) {			
				System.out.print("*");
		    }	
		    
			System.out.println();
				
				
		}
	}

}
