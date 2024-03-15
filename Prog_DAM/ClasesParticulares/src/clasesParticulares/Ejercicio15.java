package clasesParticulares;

import java.util.Scanner;

public class Ejercicio15 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion = 1;
		
		
		while (opcion > 0) {
			System.out.println("1- Suma ");
			System.out.println("2- Resta ");
			System.out.println("3- Multiplicacion ");
			System.out.println("0- Salir ");
			opcion = teclado.nextInt();
			
			switch (opcion) {
			case 0:
				System.out.println("adios ");
				break;
			case 1: 
				System.out.println("marque 1");
				System.out.println("que numeros quieres sumar?");
				int num1 = teclado.nextInt();
				int num2 = teclado.nextInt();
				Libreria.suma(num1, num2);
				break;
			case 2: 
				System.out.println("marque 2");
				break;
			case 3:
				System.out.println("marque 3");
				break;
			default: 
				System.out.println("opcion no valida");
				break;
			
			}
		}
	}
	
}
