package ficheros;

import java.util.Scanner;

public class Main {
	static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Introduce una letra minuscula: ");
		char letra =keyboard.next().charAt(0);
		
		boolean valido = Libreria.validarLetra(letra);
		
		if (valido)System.out.println("En realidad es " + letra);
		else System.out.println("Caracter no valido");

	}

}
