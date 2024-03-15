package ClasesParticulares;

import java.util.Scanner;

public class repaso4_5_Ejercicio_7 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ejercicio 14
		
		System.out.println("Introduce un numero:");
		int num = teclado.nextInt();
		
		if (num%2==0) {
			System.out.println("Es par");
		}
		if (num%5==0) {
			System.out.println("Es divisible entre 5");
			
		}
		if (num%2!=0 && num%5!=0) {
			System.out.println("No es divisible ni entre dos ni entre 5");
		}
	}

}
