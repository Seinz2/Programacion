package ActividadAula;

import java.util.Scanner;

public class ActividadSergioAlvarez {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion=Libreria.menu();
		if(opcion==1) {
			System.out.println("Base ");
			int base=teclado.nextInt();
			System.out.println("Altura");
			int altura=teclado.nextInt();
			Libreria.areaTriangulo(altura, base);
		}
		if(opcion==2) {
			System.out.println("Base ");
			int B=teclado.nextInt();
			System.out.println("base");
			int b=teclado.nextInt();
			System.out.println("Altura");
			int altura=teclado.nextInt();
			Libreria.areaTrapecio(B, b, altura);
		}
		
	}

}
