package hojaDeEjercicios2;

import java.util.Scanner;

public class Ejercicio2 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Introduce los lados de un rectangulo: ");
		System.out.println("Introduce la base: ");
		int base = teclado.nextInt();
		System.out.println("Introduce la altura: ");
		int altura = teclado.nextInt();
		
		int area = base * altura;
		int perimetro = (base*2)+(altura*2);
		
		System.out.println("El area del rectangulo es: " + area);
		System.out.println("El perimetro del rectangulo es: " + perimetro);
		
	}

}
