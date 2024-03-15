package ActividadAula;

import java.util.Scanner;

public class Libreria {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static int menu (){
		System.out.println("Calculo de area ================");
		System.out.println("1 - Calcular el area de un triangulo");
		System.out.println("2 - Calcular el area de un trapecio");
		System.out.println("3 - Calcular el area de un rectangulo");
		System.out.println("4 - Calcular el area de un cuadrado");
		int op=teclado.nextInt();
		return op;
		
	}
	/**
	 * Calcula el area de un triangulo
	 * @param altura : int
	 * @param base : int
	 */
	public static void areaTriangulo (int alturaTriangulo, int baseTriangulo) {
		int area = baseTriangulo*alturaTriangulo/2;
		System.out.println("Area triangulo"+area);
	}
	/**
	 * Calcula el area de un trapecio
	 * @param baseMayor : int
	 * @param baseMenor : int
	 * @param alturaTrapecio : int
	 */
	public static void areaTrapecio (int baseMayor, int baseMenor, int alturaTrapecio) {

		int area = (baseMayor+baseMenor)*alturaTrapecio/2;
		System.out.println("Area Trapecio"+area);
	}
	/**
	 * Calcula el area de un rectangulo
	 * @param baseRectangulo : int
	 * @param alturaRectangulo : int
	 */
	public static void areaRectangulo (int baseRectangulo, int alturaRectangulo) {
		
		int area = baseRectangulo*alturaRectangulo;
		System.out.println("Area rectangulo"+area);
	}
	/**
	 * Calcula el area de un cuadrado
	 * @param ladoCuadrado : int
	 */
	public static void areaCuadrado (int ladoCuadrado) {
		int area = ladoCuadrado*ladoCuadrado;
		System.out.println("Area cuadrado"+area);
	}
}
