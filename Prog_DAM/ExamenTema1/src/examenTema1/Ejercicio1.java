package examenTema1;

import java.util.Scanner;

public class Ejercicio1 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingresa el primer número: ");
        double numero1 = teclado.nextDouble();
        
        System.out.println("Ingresa el segundo número: ");
        double numero2 = teclado.nextDouble();
        
        System.out.println("Ingresa el tercer número: ");
        double numero3 = teclado.nextDouble();
        
        if (numero1 == numero2 && numero2 == numero3) {
            System.out.println("Los tres números son iguales.");
        } 
        else if (numero1 == numero2 || numero1 == numero3 || numero2 == numero3) {
            System.out.println("Hay dos números iguales.");
        } 
        else {
            System.out.println("Los tres números son distintos.");
        }
	}

}
