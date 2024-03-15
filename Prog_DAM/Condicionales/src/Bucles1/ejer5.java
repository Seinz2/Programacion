package Bucles1;

import java.util.Scanner;

public class ejer5 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce numero");
		int num= teclado.nextInt();
		int posActual = 0;
		boolean esMagico=true;
		while(num>0 && esMagico==true) {
			int cifra=num%10; // sacar una cifra
			num=num/10; // quitamos la ultima cifra
			posActual++; // actualizamos posicion
			
			if (posActual%2==0 && cifra%2!=0) {
				esMagico=false;
			}
			if(posActual%2!=0 && cifra%2==0) {
				esMagico=false;
			}
		}
		if(esMagico==true)
			System.out.println("El numero es magico");
		else
			System.out.println("El numero NO es magico");
	}

}
