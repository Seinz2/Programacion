package ActividadEvaluable2;

import java.util.Scanner;

public class ActividadEvaluable2 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Ingresa el día: ");
        int dia = teclado.nextInt();

        System.out.print("Ingresa el mes: ");
        int mes = teclado.nextInt();

        System.out.print("Ingresa el año: ");
        int anio = teclado.nextInt();

        // Verificar si el año es bisiesto
        boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0);

        // Verificar límites del mes y calcular la fecha sumando un día
        if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= 31) {
            dia++; // Sumar un día

            // Verificar si se excede el número de días en el mes
            if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30) {
                dia = 1;
                mes++;
            } else if (mes == 2) {
                if ((esBisiesto && dia > 29) || (!esBisiesto && dia > 28)) {
                    dia = 1;
                    mes++;
                }
            } else if (dia > 31) {
                dia = 1;
                mes++;
            }

            // Verificar si se excede el número de meses en un año
            if (mes > 12) {
                mes = 1;
                anio++;
            }

            // Mostrar la fecha resultante
            System.out.println("La fecha al sumar un día es: " + dia + "/" + mes + "/" + anio);
        } else {
            System.out.println("Fecha ingresada no válida.");
        }
	    }
	
	}
