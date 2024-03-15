package tareaEntregaTema1;

import java.util.Scanner;

public class Ejercicio2 {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Solicitar el monto del préstamo
		System.out.print("Introduce el precio del producto: ");
		double precio = 0;
		precio = teclado.nextDouble();
		double precioFinal = precio * 1.05;
		System.out.println("Se tiene que pagar: " + precioFinal + "€");
		int mes = 10;
		int cont = 1;
		while (precioFinal > 0) {
			if (precioFinal < mes) {
				System.out.println("Mes " + cont + ": " + precioFinal + "€ (cantidad pendiente " + 0 + ")");
				System.out.println("Se paga en " + cont + " cuotas.");
				break;
			} else {
				precioFinal -= mes;
				System.out.println("Mes " + cont + ": " + mes + "€ (cantidad pendiente " + precioFinal + ")");
				mes *= 2;
				cont++;
			}
		}

	}
}
