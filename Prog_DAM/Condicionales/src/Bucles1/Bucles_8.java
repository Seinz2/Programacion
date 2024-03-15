package Bucles1;

import java.util.Scanner;

public class Bucles_8 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int temp;
		int opcion;
		
		System.out.println("temperatura ");
		temp = teclado.nextInt();
		System.out.println("Medida 1-F 2-C");
		opcion = teclado.nextInt();
		
		double resul = 0.0;
		
		if (opcion == 1) {
			resul = ((temp-32)*5)/(double)9.0;
		}
		else {
			resul = ((9/5)*temp+32);
		}
		System.out.println("Resul "+resul);
		
		
	}

}
