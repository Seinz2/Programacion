package ClasesParticulares;

import java.util.Scanner;

public class Ejercicio1 {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Escribe el número");
        int num = teclado.nextInt();

        int count =0;

        while(num>0) {
            num = num/10;
            count++;
        }

        System.out.println("El número tiene "+ count + " cifras.");
    }
	}

