package actividadEvaluable_3;

import java.util.Scanner;

public class ActividadEvaluable_3 {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero;
		int numeroInvertido = 0;
		
            System.out.print("Ingrese un número estrictamente positivo: ");
            numero = teclado.nextInt();
            while (numero <= 0) {
                System.out.println("Error: Debe ingresar un número positivo.");
                numero = teclado.nextInt();
            }

                while (numero != 0) {
                    int digito = numero % 10;
                    numeroInvertido = numeroInvertido * 10 + digito;
                    numero /= 10;
                }

                System.out.println("Número invertido: " + numeroInvertido);
            }
       
	}

