package tareaEntregaTema1;

import java.util.Scanner;

public class Ejercicio1 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// EJERCICIO 1 TAREA DE ENTREGA
		
		int limiteInf = 0;
		int limiteSup = 0;

		boolean esValido = false;

		while (!esValido) {
			System.out.println("Escribe dos numeros: ");
			limiteInf = teclado.nextInt();
			limiteSup = teclado.nextInt();

			if (limiteInf < limiteSup) {
				esValido = true;
			} else {
				System.out.println("El limite inferior no puede ser mayor que el superior.");
			}
		}
		int num = 1;
		int sumaIntervalo = 0;
		int cont = 0;
		boolean seIntrodujoLimite = false;

		while (num != 0) {
			System.out.println("Introduce numeros y pulsa 0 para terminar: ");
			num = teclado.nextInt();
			if (num > limiteInf && num < limiteSup) {
				sumaIntervalo = sumaIntervalo + num;
			}
			if ((num < limiteInf || num > limiteSup) && num != 0) {
				cont++;
			}
			if (num == limiteInf || num == limiteSup) {
				seIntrodujoLimite = true;
			}
		}

		System.out.println("La suma de los números dentro del intervalo es: " + sumaIntervalo);
		System.out.println("Cantidad de números fuera del intervalo: " + cont);
		if (seIntrodujoLimite) {
			System.out.println("Se introdujo al menos un número igual a los límites del intervalo.");
		} else {
			System.out.println("No se introdujeron números iguales a los límites del intervalo.");
		}
	}
}