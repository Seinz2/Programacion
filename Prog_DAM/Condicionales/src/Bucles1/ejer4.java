package Bucles1;

import java.util.Scanner;

public class ejer4 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int NUMERO_SECRETO = (int) ((Math.random()*20)+1);
		
		boolean condicion=true;
		int numIntentos=0;
		
		while(condicion==true ) {
			System.out.println("Pedir numero:");
			int num= teclado.nextInt();
			numIntentos++;
			
			if(num==NUMERO_SECRETO) {
				System.out.println("CORRRECTO ");
				condicion=false;
			}
			else if(num<NUMERO_SECRETO) {
				System.out.println("El numero secreto es mayor");
			}
			else { //num>NUMERO_SECRETO
				System.out.println("El numero secreto es menor");
			}
		}
		if (numIntentos<5)
			System.out.println("Enhorabuena!!!");
		if (numIntentos>=5 && numIntentos<=10)
			System.out.println("No esta mal");
		if (numIntentos>10)
			System.out.println("Debes practicar mas");
	}

}
