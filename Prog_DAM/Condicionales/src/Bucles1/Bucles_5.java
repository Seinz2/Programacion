package Bucles1;

import java.util.Scanner;

public class Bucles_5 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// leer una secuencia de numeros hasta introducir un cero
		// y sumarlos a medida que se leen
		
		int num = 1;
		int suma = 0;
		
		while (num != 0) {
			System.out.println("introduce numero:");
			num = teclado.nextInt();
					
			suma = suma + num;
			
			System.out.println("suma acumulada: " + suma);
			
		}
		System.out.println("FIN!!!!!!");
	}

}
