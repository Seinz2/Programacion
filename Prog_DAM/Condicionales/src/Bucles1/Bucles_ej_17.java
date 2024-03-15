package Bucles1;

import java.util.Scanner;

public class Bucles_ej_17 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b, c;
		
		System.out.println("A");
		a= teclado.nextInt();
		System.out.println("B");
		b= teclado.nextInt();
		System.out.println("C");
		c= teclado.nextInt();
		
		int raiz = (b*b) - (4*a*c);
		
		if (raiz < 0) {
			System.out.println("No tiene solucion");
		}
		else
			if (raiz == 0) {
				int sol = (-1*b)/(2*a);
				System.out.println("1 sol :" + sol);
			}
			else {
				double solRaiz = Math.sqrt(raiz);
				double sol1 = (((-1)*b) + solRaiz)/(2*a);
				double sol2 = (((-1)*b) - solRaiz)/(2*a);
				System.out.println("Sol1:"+sol1+" sol2:"+sol2);
			}
	}

}
