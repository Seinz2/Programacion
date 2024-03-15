package ClasesParticulares;

import java.util.Scanner;

public class Ejercicio18 {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double precio = 2.5;
		System.out.println("Introduce la distancia:");
		int distancia = teclado.nextInt();
		System.out.println("Introduce los dias:");
		int dias = teclado.nextInt();
		
		if (distancia > 800 && dias > 7) {
			System.out.println("El precio del viaje es: "+((precio*distancia) - (precio*distancia*0.3)));
		}
		else {
			System.out.println("El precio del viaje es: "+precio*distancia);
		}
	}

}
