package programacion_modular;

import java.util.Scanner;

public class Ejercicio_ordenarNumeros {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("num1 ");
		int num1=teclado.nextInt();
		System.out.println("num2 ");
		int num2=teclado.nextInt();
		System.out.println("num3 ");
		int num3=teclado.nextInt();
		
		System.out.println("Ordenados : " + estanOrdenados(num1, num2, num3));

	}
	public static boolean esMayor(int num1, int num2) {
		if(num1>num2) return true;
		return false;
	}
	public static boolean estanOrdenados(int a, int b, int c) {
		if(esMayor(a, b)==true && esMayor(b, c)==true)
			return true;
		else return false;
	}
}
