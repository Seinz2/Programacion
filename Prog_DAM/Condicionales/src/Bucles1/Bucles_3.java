package Bucles1;

import java.util.Scanner;

public class Bucles_3 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cont = 1;
		
		while (cont <= 5) {
			//leer numero
			System.out.println("Introduce numero");
			int num = teclado.nextInt();
			//mostrar numero
			System.out.println("("+cont+") :"+num);
			
			//avance del bucle
			cont = cont + 1;
			}
	}

}
