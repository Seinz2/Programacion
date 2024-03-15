package tareaEntregaMatrices;

import java.util.Scanner;

public class Libreria {

	static Scanner teclado = new Scanner (System.in);
	
    /**
     * dice si una matriz es mccud
     * @param matriz: int
     * @return : boolean
     */
    public static boolean mccud(int[][] matriz) {
        boolean result = true;
        for (int i = 0; i < matriz.length; i++) {
            result = result && todosDistintos(matriz[i]);
        }

        for (int i = 0; i < matriz.length - 1; i++) {
            result = result && maximo(matriz[i]) < maximo(matriz[i + 1]);
        }

        int diferencia = maximo(matriz[1]) - maximo(matriz[0]);
        for (int i = 1; i < matriz.length - 1; i++) {
            result = result && diferencia == maximo(matriz[i + 1]) - maximo(matriz[i]);
        }

        int[] posMaximosColumnas = new int[matriz[0].length];
        for (int i = 0; i < posMaximosColumnas.length; i++) {
            posMaximosColumnas[i] = posMax(matriz[i]);
        }     
        result = todosDistintos(posMaximosColumnas);
        return result;
    }

    /**
     * devuelve el máximo de una fila
     * @param : int
     * @return : int
     */
    public static int maximo(int[] fila) {
        int maximo = fila[0];
        for (int i = 1; i < fila.length; i++) {
            if (fila[i] > maximo) {
                maximo = fila[i];
            }
        }
        return maximo;
    }

    /**
     * devuelve la columna donde está el máximo de una fila
     * @param : int
     * @return : int
     */
    public static int posMax(int[] fila) {
        int maximo = fila[0];
        int postMax = 0;
        for (int i = 1; i < fila.length; i++) {
            if (fila[i] > maximo) {
                maximo = fila[i];
                postMax = i;
            }
        }
        return postMax;
    }

    /**
     * imprime por pantalla una matriz
     * @param : int
     */
    public static void imprimeMatriz(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            imprimeFila(m[i]);
        }
    }

    /**
     * lee por teclado los valores de una matriz 
     * @param : int
     */
    public static void leerMatriz(int[][] m) {
        int filas = m.length;
        int columnas = m[0].length;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; i++) {
                System.out.println("Introduce el elemento " + i + " " + j);
                m[i][j] = teclado.nextInt();
            }
        }
        imprimeMatriz(m);
    }

    /**
     * determina si los elementos de una fila son distintos
     * @param : int
     * @return : boolean
     */
    public static boolean todosDistintos(int[] fila) {
        boolean result = true;
        for (int i = 0; i < fila.length; i++) {
            for (int j = i + 1; j < fila.length; j++) {
                if (fila[i] == fila[j]) {
                    result = false;
                }
            }
        }
        return result;
    }

    /**
     * imprime por pantalla una fila
     * @param : int
     */
    private static void imprimeFila(int[] fila) {
        System.out.print("[ ");
        for (int i = 0; i < fila.length; i++) {
            System.out.print(fila[i] + " ");
        }
        System.out.println("]");
    }

}
