package tareaEntregaVectores;

public class Actividad1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v[] = Libreria.leerVector();
		Libreria.imprimirVector(v);
		Libreria.mostrarRepetidos(v);
		Libreria.buscarAusentes(v);
		System.out.println("El valor promedio de este vector es: " + Libreria.promedio(v));
	}

}
