package examenTema1;

import java.util.Scanner;

public class Ejercicio3 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Introduce un número para calcular su raíz entera: ");
        int numero = teclado.nextInt();

        if (numero < 0) {
            System.out.println("No se puede calcular la raíz entera de un número negativo hombre, eso se da en primero de la ESO!!!");
        } 
        else {
            int resultado = 0;
            
        while (resultado * resultado <= numero) {
                resultado++;
            }
            resultado--;
            
            System.out.println("La raíz entera de " + numero + " es " + resultado);
        }
	}

}
