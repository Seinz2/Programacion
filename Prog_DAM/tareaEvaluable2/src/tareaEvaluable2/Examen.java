package tareaEvaluable2;

import java.util.Scanner;

public class Examen {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	        int num1 = 0;
	        int num2 = 0;
	        System.out.println("Introduce el primer número");
	        num1 = teclado.nextInt();
	        System.out.println("Introduce el segundo número");
	        num2 = teclado.nextInt();
	        int opcion = Libreria.menu();
	        
	        switch (opcion) {
            case 1:
                if (Libreria.numeroDeDigitos(num1) == Libreria.numeroDeDigitos(num2)
                        && Libreria.numeroInverso(num2) == num1) {
                    System.out.println("Los números son cuñados");
                } else {
                    System.out.println("Los números no son cuñados");
                }
                break;
            case 2:
            	boolean contiene = false;
                while (num1 != 0) {
                    if (Libreria.contieneDigito(num2, num1 % 10)) {
                        contiene = true;
                    }
                    num1 /= 10;
                }
                if (contiene) {
                    System.out.println("Los números son familia");
                } else {
                    System.out.println("Los números no son familia");
                }                
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }


    }
	}

