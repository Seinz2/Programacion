package programacion_modular;

public class FuncionesMatematicas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * muestra el area de un cuadrado
	 * @param lado : entero
	 */
	public static void areaCuadrado (int lado) {
		int area = lado*lado;
		System.out.println("Area cuadrado"+area);
	}
	/**
	 * calcula el valor del perimetro de un cuadrado
	 * @param lado : entero
	 * @return entero
	 */
	public static int perimetroCuadrado (int lado) {
		int resul = lado*4;
		return resul;
	}
	/**
	 * calcular el area del circulo
	 * @param r : double
	 */
	public static void calcularAreaCirculo (double r) {
		double resul=Math.PI*r*r;
		System.out.println("Area "+resul);
	}
	/**
	 * calcula el perimetro de un circulo
	 * @param r : double
	 * @return double
	 */
	public static double perimetroCirculo (double r) {
		double resul=2*Math.PI*r;
		return resul;
		
	}
	public static boolean esNegativo (int num) {
		if(num<0) return true;
		else return false;
	}
	/**
	 * calcula la raiz entera de un numero
	 * @param num : int
	 * @return int
	 */
	public static int raizEntera (int num) {
		int raiz = 1;
		while((raiz*raiz)<=num) {
			raiz++;
		}
		return (raiz-1);
	}
	/**
	 * Dice si un anio es bisiesto o no
	 * @param anio : int
	 * @return : boolean
	 */
	public static boolean esBisiesto (int anio) {
		if (anio%100!=0 && anio%4==0) {
			return true;
		} else {
			if (anio%400==0) {
				return true;
			}
		}
		return false;
	}
	/**
	 * determina si un numero tiene decimales
	 * @param num : real
	 * @return boolean
	 */
	public static boolean tieneDecimales (int num) {
		if (num%1==0) return false;
		return true;
		
	}
	
}