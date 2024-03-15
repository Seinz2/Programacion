package tareaEntregaVectores;
import java.util.Scanner;

public class Libreria {
	public static Scanner teclado = new Scanner(System.in);
	/**
	 * funcion que lee los valores de un vector
	 * @return : vectores enteros
	 */
	public static int[] leerVector() {
		System.out.println("Leer tamaño ");
		int tam=teclado.nextInt();
		
		int v[]=new int[tam];
		for(int i=0;i<v.length;i++) {
			System.out.println("["+i+"] ");
			v[i]=teclado.nextInt();
		}
		return v;
	}
	/**
	 * muestra el contenido de un vector
	 * @param v : entero
	 */
	public static void imprimirVector (int v[]) {
		for(int i=0;i<v.length;i++) {
			System.out.println("["+i+"] = "+ v[i]);
		} 
	}
	/**
	 * recibe un vector y determinar para cada valor cuantas veces aparece repetido
	 * @param v : int
	 */
	public static void mostrarRepetidos (int v[]) {

        // Encuentra el tamaño máximo del vector
        
        int max = v[0];
        int min = Libreria.encontrarMinimo(v);
        
        for (int i = 0; i < v.length;i++) if(max < v[i]) max=v[i];
       
        for (int num = min; num < max; num++ ) {
        	int repetidos = 0;
        	for (int i = 0; i < v.length;i++) {
				
        		if (v[i]== num) repetidos++;
				
			}
        	
        	if (repetidos >= 2) System.out.println(num + " aparece " + repetidos + " veces");
        }
    }
	/**
	 * calcula el maximo y el minimo de los valores de un vector y dice que numeros estan ausentes dentro de esos valores del vector
	 * @param v : int
	 */
	public static void buscarAusentes (int v[]) {
        if (v.length == 0) {
            System.out.println("El vector está vacío.");
            return;
        }

        int maximo = encontrarMaximo(v);
        int minimo = encontrarMinimo(v);

        System.out.println("Valor máximo: " + maximo);
        System.out.println("Valor mínimo: " + minimo);

        System.out.println("Valores faltantes entre el máximo y el mínimo:");
        for (int i = minimo + 1; i < maximo; i++) {
            if (!contiene(v, i)) {
                System.out.println(i);
            }
        }
    }
	/**
	 * te dice el valor maximo de un vector
	 * @param v : int
	 * @return : int
	 */
    private static int encontrarMaximo(int[] v) {
        int maximo = v[0];
        for (int i=0;i<v.length;i++) {
            if (v[i] > maximo) {
                maximo = v[i];
            }
        }
        return maximo;
    }
    /**
     * te dice el valor minimo de un vector
     * @param v : int
     * @return : int
     */
    private static int encontrarMinimo(int[] v) {
        int minimo = v[0];
        for (int i=0;i<v.length;i++) {
            if (v[i] < minimo) {
                minimo = v[i];
            }
        }
        return minimo;
    }
    /**
     * te dice que valores contiene el vector
     * @param v : int
     * @param valor : int
     * @return : boolean
     */
    private static boolean contiene(int[] v, int valor) {
        for (int i = 0; i < v.length; i++) {
            if (v[i] == valor) {
                return true;
            }
        }
        return false;
    }
    /**
     * calcula el elemento promedio y busca el valor mas cercano a el elemento promedio
     * @param v : int
     * @return : int
     */
    public static int promedio (int v[]) {
    	int media = (encontrarMaximo(v) + encontrarMinimo(v))/2;
    	int promedio = v[0];
    	int distanciaMenor = Math.abs(media-v[0]);
    	for(int i=0;i<v.length;i++) {
    		if (Math.abs(media-v[i])<distanciaMenor) {
    			promedio = v[i];
    			distanciaMenor = Math.abs(media-v[i]);
    		}	
    	}
    	return promedio;
    }
}
