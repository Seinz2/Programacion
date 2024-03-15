package tareaMatriz_16_1_24;

public class Libreria {

	    /**
	     * Muestra por patalla el alumno y el curso que ha obtenido un 10
	     * @param notas : int[][] matriz de notas
	     */
	    public static void notaMasAlta(int notas[][]){
	        for (int i = 0; i < notas.length; i++) {
	            for (int j = 0; j < notas[i].length; j++) {
	                if (notas[i][j] == 10){
	                    System.out.println("El alumno " + (j+1) + " del curso " + cursoFila(i) + " ha obtenido un 10");
	                }
	            }
	        }
	    }

	    /**
	     * Muestra por pantalla la nota media de cada curso según la letra que se le pase
	     * @param curso : char curso que se quiere calcular la media
	     * @param notas : int[][] matriz de notas
	     */
	    public static void calcularMediaCurso(char curso, int notas[][]){
	        int suma = 0;
	        int contador = 0;
	        for (int j = 0; j < notas[cursoFila(curso)].length; j++) {
	            suma += notas[cursoFila(curso)][j];
	            contador++;
	        }
	        System.out.println("La media del curso " + curso + " es " + (suma/contador));
	    }

	    /**
	     * Indica el número de aprobados de un curso
	     * @param curso : char curso que se quiere calcular el número de aprobados
	     * @param notas : int[][] matriz de notas
	     * @return : int
	     */
	    public static int numeroAprobados(char curso, int notas[][]){
	        int contador = 0;
	        for (int j = 0; j < notas[cursoFila(curso)].length; j++) {
	            if (notas[cursoFila(curso)][j] >= 5){
	                contador++;
	            }
	        }
	        System.out.println("El número de aprobados del curso " + curso + " es " + contador);
	        return contador;
	    }

	    /**
	     * Indica el número de suspensos de un curso
	     * @param curso : char curso que se quiere calcular el número de suspensos
	     * @param notas : int[][] matriz de notas
	     * @return : int
	     */
	    public static int numeroSuspensos(char curso, int notas[][]){
	        int contador = 0;
	        for (int j = 0; j < notas[cursoFila(curso)].length; j++) {
	            if (notas[cursoFila(curso)][j] < 5){
	                contador++;
	            }
	        }
	        System.out.println("El número de suspensos del curso " + curso + " es " + contador);
	        return contador;
	    }

	    /**
	     * Muestra por pantalla la estadística de cada curso
	     * @param notas : int[][] matriz de notas
	     */
	    public static void mostrarEstadistica(int notas[][]){
	        for (int i = 0; i < notas.length; i++) {
	            System.out.println("Curso " + cursoFila(i));
	            numeroAprobados(cursoFila(i), notas);
	            numeroSuspensos(cursoFila(i), notas);
	        }
	    }

	    /**
	     * Devuelve el curso
	     * @param i : int fila de la matriz
	     * @return : int
	     */
	    private static char cursoFila(int i){
	        switch (i) {
	            case 0:
	                return 'A';
	            case 1:
	                return 'B';
	            case 2:
	                return 'C';
	            case 3:
	                return 'D';        
	            default:
	                return '0';
	        }
	    }

	    /**
	     * Devuelve la fila de la matriz
	     * @param curso : char curso que indica la fila de la matriz
	     * @return : char
	     */
	    private static int cursoFila(char curso){
	        switch (curso) {
	            case 'A':
	                return 0;
	            case 'B':
	                return 1;
	            case 'C':
	                return 2;
	            case 'D':
	                return 3;        
	            default:
	                return 0;
	        }
	    }
	}
