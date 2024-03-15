package examen_vectores_y_matrices;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vector = {4, 6, 9, 3, 19, 10, 15, 2, 14, 12};

        System.out.println("Vector: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();

        System.out.println("Puntos de luz:");
        mostrarPuntosLuz(vector);
		
	}
	public static void mostrarPuntosLuz(int[] v){
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 3 == 0 && v[i] % 2 != 0 && i % 2 == 0) {
                System.out.println("Punto de luz en la posición " + i);
            }
        }
    }

}
