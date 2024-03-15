package ActividadEvaluable_1;

import java.util.Scanner;

public class ActividadEvaluable_1 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int suma = 0;
		int cantNums = 0;
		
		
		System.out.println("Introduce un numero (multiplo de 5) :");
		System.out.println("Si ingresas un 0 la secuencia finalizara.");
		
		while (true) {
			System.out.println("Ingresa un numero :");
			int numero = teclado.nextInt();
			if (numero == 0) {
				break;
			}
				if (numero > 0 && numero % 5 == 0) {
					suma +=numero;
					cantNums++;
				}else if (numero < 0) {
					System.out.println("Numero negativo ignorado :");
					
			}
				

			
			
		}
		if (cantNums > 0) {
			double media = (double) suma / cantNums;
			System.out.println("La media de los numeros es "+media);
			
		}else {
			System.out.println("No se ingresaron numeros validos 2");
		}
		
		
	}
}