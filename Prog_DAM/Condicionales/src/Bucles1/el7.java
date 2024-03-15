package Bucles1;

import java.util.Scanner;

public class el7 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Introduce numero: ");
		int num = teclado.nextInt();
		int cont=0;
		while(num<0) {
			int cifra = num%10;
			if(cifra%2==0) {
				cont++;
			}
			num=num/10;
		}
		System.out.println("Numero de cifras pares "+cont);
	}

}
