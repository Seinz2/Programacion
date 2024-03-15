package tareaEntregaTema2;

import java.util.Scanner;

public class Ejercicio1 {
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Introduce el número del DNI: ");
		int dni = sc.nextInt();

		char letra = letraDni(dni);

		while (compruebaDNI(dni) == false) {
			System.out.println("ERROR en el dni");
			System.out.println("Introduce nuevo dni");
			dni = sc.nextInt();
		}

		System.out.print("Introduce la letra del DNI: ");
		letra = sc.next().charAt(0);

		letra = Character.toUpperCase(letra);

		if (dniValido(dni, letra)) {
			System.out.println("El DNI es correcto ");
		} else {
			System.out.println("El DNI no es correcto ");
		}

	}

	/**
	 * Comprueba que el valor entero tiene a lo sumo 8 digitos
	 * 
	 * @param dni : entero
	 * @return : boolean
	 */

	public static boolean compruebaDNI(int dni) {
		if (dni < 0)
			return false;

		if (dni >= 100000000)
			return false;

		return true;
	}

	/**
	 * Introduciendo el numero, devuelve la letra que le corresponde
	 * 
	 * @param dni : entero
	 * @return : char
	 */

	public static char letraDni(int dni) {
		int resto = dni % 23;
		switch (resto) {
		case 0:
			return 'T';
		case 1:
			return 'R';
		case 2:
			return 'W';
		case 3:
			return 'A';
		case 4:
			return 'G';
		case 5:
			return 'M';
		case 6:
			return 'Y';
		case 7:
			return 'F';
		case 8:
			return 'P';
		case 9:
			return 'D';
		case 10:
			return 'X';
		case 11:
			return 'B';
		case 12:
			return 'N';
		case 13:
			return 'J';
		case 14:
			return 'Z';
		case 15:
			return 'S';
		case 16:
			return 'Q';
		case 17:
			return 'V';
		case 18:
			return 'H';
		case 19:
			return 'L';
		case 20:
			return 'C';
		case 21:
			return 'K';
		case 22:
			return 'E';
		}
		return (char) resto;
	}

	/**
	 * Comprueba si la letra corresponde o no al DNI introducido
	 * 
	 * @param dni   : entero
	 * @param letra : char
	 * @return : boolean
	 */

	public static boolean dniValido(int dni, char letra) {

		return letraDni(dni) == letra;

	}

}