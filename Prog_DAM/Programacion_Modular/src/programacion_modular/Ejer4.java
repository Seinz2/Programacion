package programacion_modular;

import java.util.Scanner;

public class Ejer4 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Numero ");
		int num = teclado.nextInt();
		
		if (num>=0) {
			/*
			 * 
			 */
			System.out.println("Raiz "+FuncionesMatematicas.raizEntera(num));
		} else {
			System.out.println("ERROR numero negatico");
		}
		
	}

}
