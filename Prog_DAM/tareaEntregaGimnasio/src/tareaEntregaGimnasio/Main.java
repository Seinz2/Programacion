package tareaEntregaGimnasio;

import java.util.Scanner;

public class Main {
	static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		Gimnasio gimnasio = new Gimnasio();
		cargarDatos(gimnasio);
		int opcion = menu();

		while (opcion != 0) {
			switch (opcion) {
			case 1: {
				insertarMonitor(gimnasio);
				break;
			}
			case 2: {
				insertarAbonado(gimnasio);
				break;
			}
			case 3: {
				gimnasio.listarGimnasio();
				break;
			}
			case 4: {
				System.out.println("Introduce el nif: ");
				String nif = teclado.next();
				Persona p = gimnasio.buscarPersona(nif);
				if (p == null) {
					System.out.println("Nombre no encontrado.");
				} else {
					System.out.println(p.toString());
				}
				break;
			}
			case 5: {
				System.out.println("Introduce el nif: ");
				String nif = teclado.next();
				gimnasio.borrarPersona(nif);
			}
			}
			;
			opcion = menu();

		}

	}

	private static int menu() {

		System.out.println("\n\n*******************");
		System.out.println("1.- Insertar Monitor");
		System.out.println("2.- Insertar Abonado");
		System.out.println("3.- Listar gimnasio");
		System.out.println("4.- Buscar persona");
		System.out.println("5.- Borrar persona");
		System.out.println("0.- Salir ");
		System.out.println("opcion");
		int opcion = teclado.nextInt();
		return opcion;
	}

	private static void cargarDatos(Gimnasio gimnasio) {

		Direccion d1 = new Direccion("Calle manolito", "Langreo", 33010, "España");
		Direccion d2 = new Direccion("d2", "Langreo", 33010, "España");

		Abonado a1 = new Abonado("David", "Bisbal", "56293167", d1);
		Abonado a2 = new Abonado("e2", "Bisbal", "56293168", d1);

		Monitor m1 = new Monitor("Laura", "Fernandez", "721847123", d2, "Pesas");
		Monitor m2 = new Monitor("p2", "Fernandez", "721847124", d2, "Pesas");

		Persona v[] = new Persona[4];

		v[0] = m1;
		v[1] = m2;
		v[2] = a1;
		v[3] = a2;

		for (int i = 0; i < v.length; i++) {
			gimnasio.insertarPersona(v[i]);
		}

	}

	private static void insertarAbonado(Gimnasio gimnasio) {
		Direccion d2 = new Direccion("d2", "Langreo", 33010, "España");
		System.out.println("Nif: ");
		String hif = teclado.next();
		System.out.println("Nombre: ");
		String nombre = teclado.next();
		System.out.println("Apellidos");
		String ape = teclado.next();

		Abonado a = new Abonado(hif, nombre, ape, d2);
		gimnasio.insertarPersona(a);

	}

	public static void insertarMonitor(Gimnasio gimnasio) {
		Direccion d1 = new Direccion("Calle manolito", "Langreo", 33010, "España");
		System.out.println("Nif: ");
		String hif = teclado.next();
		System.out.println("Nombre: ");
		String nombre = teclado.next();
		System.out.println("Apellidos");
		String ape = teclado.next();
		System.out.println("Sala: ");
		String sala = teclado.next();

		Monitor m = new Monitor(hif, nombre, ape, d1, sala);
		gimnasio.insertarPersona(m);

	}

}