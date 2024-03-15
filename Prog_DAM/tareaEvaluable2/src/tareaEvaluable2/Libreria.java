package tareaEvaluable2;

import java.util.Scanner;

public class Libreria {
	static Scanner teclado = new Scanner (System.in);
	/**
	 * Calcula el numero de digitos de un numero
	 * @param numero : int
	 * @return : int
	 */
	public static int numeroDeDigitos (int numero) {
		if (numero == 0) {
            return 1;
        }
        int contador = 0;
        
        while (numero > 0) {
            numero = numero / 10;
            contador++;
        }
        return contador;
	}
	/**
	 * Calcula el numero inverso de un numero
	 * @param numero : int
	 * @return : int
	 */
	public static int numeroInverso(int numero) {
        int cifra;
        int inverso = 0;
		while (numero!=0) {
        	cifra=numero%10;
        	numero = numero/10;
        	inverso= inverso*10+cifra;
        }
		return inverso;
	}
	/**
	 * Devuelve verdadero si el numero contiene el digito
	 * @param num : int
	 * @param digito : int
	 * @return
	 */
	public static boolean contieneDigito(int num, int digito) {
        boolean contiene = false;
        while (num != 0) {
            if (num % 10 == digito) {
                contiene = true;
            }
            num /= 10;
        }
        return contiene;
    }
	/**
     * Método que devuelve la opción elegida en el menú
     * @return
     */
    public static int menu() {
        System.out.println("1.- números cuñados");
        System.out.println("2.- números familia");
        int opcion = teclado.nextInt();
        return opcion;
    }
}
