package examenTema2;

public class Funciones {
	
	/**
	 * te dice si un numero es primo o no
	 * @param numero : int
	 * @return : boolean
	 */
	public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }
	/**
	 * devuelve el menor primo que es mayor que el numero que se pasa como parametro
	 * @param numero : int
	 * @return : int
	 */
	public static int siguientePrimo(int numero) {
        while (true) {
            numero++;

            if (esPrimo(numero)) {
                return numero;
            }
        }
    }
	/**
	 * cuenta el numero de digitos de un numero entero
	 * @param numero : int
	 * @return : int
	 */
	public static int digitos(int numero) {

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
	 * le da la vuelta a un numero
	 * @param numero : int
	 * @return : int
	 */
	public static int voltea(int numero) {
        int numInvertido = 0;

        while (numero != 0) {
            int digito = numero % 10;
            numInvertido = numInvertido * 10 + digito;
            numero = numero / 10;
        }

        return numInvertido;
    }
	/**
	 * le quita a un numero un digito por detras
	 * @param numero : int
	 * @return : int
	 */
	public static int quitarPorDetras(int numero) {

        if (numero < 10) {
            return 0;
        }

        numero = numero / 10;

        return numero;
    }
	/**
	 * le quita a un numero un digito por delante
	 * @param numero : int
	 * @return : int
	 */
	 public static int quitaPorDelante(int numero) {
	        if (numero >= 10) {
	            int potenciaDiez = 1;

	            while (numero / potenciaDiez >= 10) {
	                potenciaDiez *= 10;
	            }

	            numero %= potenciaDiez;
	        } else {
	            numero = 0;
	        }

	        return numero;
	    }
	 /**
	  * añade un digito a un numero por detras
	  * @param numero : int
	  * @param digito : int
	  * @return : int
	  */
	 public static int pegarPorDetras(int numero, int digito) {
	        // Combinar el número y el dígito añadiéndolo por detrás
	        int numeroConDigito = numero * 10 + digito;

	        return numeroConDigito;
	    }
	 /**
	  * añade un digito a un numero por delante
	  * @param numero : int
	  * @param digito : int
	  * @return : int
	  */
	 public static int pegarPorDelante(int numero, int digito) {

	        int longitud = digitos(numero);
	        int potenciaDiez = 1;

	        for (int i = 0; i < longitud; i++) {
	            potenciaDiez *= 10;
	        }

	        int numeroConDigito = numero + digito * potenciaDiez;

	        return numeroConDigito;
	    }

}
