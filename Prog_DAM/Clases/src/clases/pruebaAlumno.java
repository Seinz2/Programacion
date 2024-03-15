package clases;

import java.util.Scanner;

public class pruebaAlumno {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno a1 = new Alumno("11111111E","pepe",15);
		a1.mostrarDatos();
		Alumno a2 = new Alumno();
		a2.mostrarDatos();
		
		System.out.println("Nombre a3");
		String nombre = teclado.next();
		Alumno a3 = new Alumno (nombre,15);
		a3.mostrarDatos();
	}

}
