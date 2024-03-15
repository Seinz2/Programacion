package Bucles1;

import java.util.Scanner;

public class Bucles_for1 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce numero: ");
		
		for (int num = teclado.nextInt(); num !=0; num = teclado.nextInt()) {
			System.out.println("valor : "+num);
			
			System.out.println("otronumero: ");
		}
		System.out.println("FIN!!");
		
	}

}
