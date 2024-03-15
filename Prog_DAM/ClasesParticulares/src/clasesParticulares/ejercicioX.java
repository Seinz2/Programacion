package clasesParticulares;

import java.util.Scanner;

public class ejercicioX {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un numero: ");
		int num = teclado.nextInt();
		
		if (num>=0) {
			raizCuadrada(num);
		}else {
			System.out.println("ERROR");
		}
		
		
	}
	public static void raizCuadrada (double num) {
		double raiz = Math.sqrt(num);
		System.out.println("La raiz es " + raiz);
	}
}
