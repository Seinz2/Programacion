package programacion_modular;

import java.util.Scanner;

public class Ejer3 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Leer numero ");
		int num = teclado.nextInt();
		
		if (FuncionesMatematicas.esNegativo(num)==true) {
			System.out.println("Es negativo");
		} else {
			System.out.println("Es positivo");
		}
	}
	
}
