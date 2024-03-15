package ClasesParticulares;

import java.util.Scanner;

public class repaso4_5_Ejercicio_1 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hora = teclado.nextInt();
		
		if (hora>=6 && hora<=12) {
		System.out.println("Buenos dias!!!");
		}
		else if (hora>=13 && hora<=20) {
		System.out.println("Buenas tardes!!!");
		}
		else if (hora>=21 && hora<=24 || hora>=1 && hora<=5) {
		System.out.println("Buenas noches!!!");
		}
		else {
			System.out.println("ERROR");
		}
	}

}
