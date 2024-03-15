package Matrices;

import java.util.Scanner;

public class ejemplo1 {
	public static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Filas ");
		int filas=teclado.nextInt();
		System.out.println("Columnas ");
		int columnas=teclado.nextInt();
		
		int m[][]=new int[filas][columnas];
		Libreria.leerMatriz(m);
		Libreria.mostrarMatriz(m);
		Libreria.sumaFilas(m);
	}

}
