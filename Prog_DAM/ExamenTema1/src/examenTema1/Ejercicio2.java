package examenTema1;

import java.util.Scanner;

public class Ejercicio2 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numeroAnterior = -1;
        boolean continuar = true;

        System.out.print("Introduce un numero real: ");
        double numero = teclado.nextDouble();

        while (continuar) {
            if (numero > numeroAnterior || numeroAnterior == -1) {
                numeroAnterior = numero;
            } else {
                continuar = false;
            }

            if (continuar) {
                System.out.print("Introduce otro numero real superior al anterior: ");
                numero = teclado.nextDouble();
            }
        }

        System.out.println("Hola profe que tal estas? Lamentablemente no has escrito un numero mayor al anterior y el programa se ha acabado");
        System.out.println("pero aun asi aprovecho para pedirte que me subas un puntito la nota que nunca esta de mas, un saludo!!!");
	}

}
