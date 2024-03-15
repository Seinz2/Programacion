package programacion_modular;

import java.util.Scanner;

public class Ejercicio2 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Lado ");
		int ladoP = teclado.nextInt ();
		
		FuncionesMatematicas.areaCuadrado(ladoP);
		
		int r=FuncionesMatematicas.perimetroCuadrado(ladoP);
		System.out.println("El valor del perimetro es "+r);
		
		System.out.println("Radios: ");
		double radio = teclado.nextDouble();
		FuncionesMatematicas.calcularAreaCirculo(radio);
		
		System.out.println("Perimetro circulo " + FuncionesMatematicas.perimetroCirculo(radio));
		
		
		
	}
	
}
