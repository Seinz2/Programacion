package Bucles1;

import java.util.Scanner;

public class Bucles_9 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Num");
		int ant = teclado.nextInt();
		
		int cont = 1;
		boolean consecutivos = true;
		
		while(cont < 5) {
			System.out.println("Num ");
			int act = teclado.nextInt();
			cont = cont +1;
			
			if( (ant-act) !=1 && (ant-act)!=-1) {
				consecutivos = false;
			}
			ant = act;
		}
		if(consecutivos==true) {
			System.out.println("TODOS consecutivos");
		}
		else {
			System.out.println("ERROR");
		}
	}

}
