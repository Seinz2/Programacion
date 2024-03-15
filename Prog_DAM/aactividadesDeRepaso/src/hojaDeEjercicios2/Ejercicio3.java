package hojaDeEjercicios2;

import java.util.Scanner;

public class Ejercicio3 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Introduce el radio del circulo: ");
		double radio = teclado.nextDouble();
		
		double area = Math.PI * (radio * radio);
		
		double circunferencia = 2*Math.PI * radio;
		
		System.out.println("El area del circulo es: " + area);
		System.out.println("La circunferencia del circulo es: " + circunferencia);
	}

}
