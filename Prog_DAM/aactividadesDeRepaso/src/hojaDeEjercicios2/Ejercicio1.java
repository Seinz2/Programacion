package hojaDeEjercicios2;

import java.util.Scanner;

public class Ejercicio1 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce el lado de un cuadrado");
		int lado = teclado.nextInt();
		
		int area = lado*lado;
		
		System.out.println("El area del cuadrado es: " + area);
		
		System.out.println("Ahora vamos a calcular el perimetro del cuadrado");
		
		int perimetro = lado * 4;
		
		System.out.println("El perimetro del cuadrado es: " + perimetro);
	}

}
