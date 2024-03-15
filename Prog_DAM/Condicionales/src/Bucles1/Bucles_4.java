package Bucles1;

import java.util.Scanner;

public class Bucles_4 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int cont = 1;
	int contPares = 0;
	while(cont <= 5) {
		
		System.out.println("Introduce numero");
		int num = teclado.nextInt();
		System.out.println("("+cont+") : "+num);
		
		int resto = num % 2;
		if (resto == 0) {
			System.out.println("el numero es par");
			contPares = contPares + 1;
		}
		
		// avance del bucle
		System.out.println("Numero de pares"+ contPares);
	}
	}
}
