package Bucles1;

import java.util.Scanner;

public class act2_1_ejer1 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad = teclado.nextInt();
		
		int año = 2023 - edad;
		while (año<=2023) {
			System.out.println(año);
			año++;
		}
	}

}
