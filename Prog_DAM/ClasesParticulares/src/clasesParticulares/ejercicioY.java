package clasesParticulares;

import java.util.Scanner;

public class ejercicioY {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce un numero: ");
		double num = teclado.nextDouble();
		
		boolean esDecimal = esDecimal(num);
		if (esDecimal) {
			System.out.println("No es decimal");
		}else {
			System.out.println("Si es decimal");
		}
	}
	public static boolean esDecimal (double num) {
		if(num%1==0) {
			return true;
		}
		return false;
		
	}
	
}
