package programacion_modular;

import java.util.Scanner;

public class ejer5 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Escribe el anio: ");
		int anio = teclado.nextInt();
		
		if (FuncionesMatematicas.esBisiesto(anio)==true) {
			System.out.println("Es bisiesto");
		}else {
			System.out.println("No es bisiesto");
		}
		
	}

}
