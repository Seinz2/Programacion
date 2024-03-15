package Bucles1;

import java.util.Scanner;

public class Bucles_6 {
	
	static Scanner teclado = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//leer una secuencia de numeros mientras sean pares
		
		int suma = 0;
		boolean condicion = true;
		
		while (condicion == true) {
			System.out.println("introduce numero: ");
			int num = teclado.nextInt();
			if (num %2 == 0) {
			suma = suma + num;	
			}
			else {
				condicion = false;
				System.out.println("FIN!!!!");
			}
		}
	}

}
