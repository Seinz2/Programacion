package Matrices;

import java.util.Scanner;

public class Libreria {
	public static Scanner teclado = new Scanner(System.in);
	/**
	 * funcion que rellena una matriz con valores pedidos al usuario
	 * @param m : matriz enteros
	 */
	public static void leerMatriz(int m[][]) {
		for (int i=0;i<m.length;i++) {
			for(int j=0;j<m[0].length;j++) {
				System.out.println("["+i+","+j+"]");
				m[i][j]=teclado.nextInt();
			}
		}
	}
	public static void mostrarMatriz(int m[][]) {
		for (int i=0;i<m.length;i++) {
			for(int j=0;j<m[0].length;j++) {
				System.out.println(m[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void sumaFilas (int m[][]) {
		for(int i=0;i<m.length;i++) {
			int suma=0;
		    for(int j=0;j<m[0].length;j++) {
			     suma=suma+m[i][j];
		    }   
		    System.out.println("suma ["+i+"] "+suma);
		}
	}
}
