package Bucles1;

import java.util.Scanner;

public class Bucles_26 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Actividad 30
		
		System.out.println("Introduce numero: ");
		int num = teclado.nextInt();
		
		boolean encontreDivisor=false;
		for(int div=2;div<=(num-1);div++) {
			if(num%div==0) {
				encontreDivisor=true;
			}
		}
		if(encontreDivisor==true) {
			System.out.println("Numero NO primo");
		}else {
			System.out.println("Numero SI primo");
		}
	}

}
