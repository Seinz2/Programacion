package Bucles1;

import java.util.Scanner;

public class quinielaConResultado {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int veces = 1;
		while(veces<=15) {
			int num=(int)(Math.random()*3);
			int resul=(int)(Math.random()*3);
			
			if(num==0) {
				System.out.println("X gana equipo local "+resul);
			}
			if(num==1) {
				System.out.println(num+" empate "+resul);
			}
			if(num==2) {
				System.out.println(num+" gana equipo visitante "+resul);
			}
			if(resul==num) {
				System.out.println("apuesta acertada");
			}
			else {
				System.out.println("apuesta fallida");
			}
			veces++;
		}
	}

}
