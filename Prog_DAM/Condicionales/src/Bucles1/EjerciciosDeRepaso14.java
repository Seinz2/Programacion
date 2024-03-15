package Bucles1;

import java.util.Scanner;

public class EjerciciosDeRepaso14 {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce un numero: ");
		int num = teclado.nextInt();
		
		System.out.println("Descomposicion en factores primos: ");
		
		int div = 2;
		while(num%div != 0) {
			div++;
		}
		System.out.println(div+" ");
		num=num/div;
	}

}
