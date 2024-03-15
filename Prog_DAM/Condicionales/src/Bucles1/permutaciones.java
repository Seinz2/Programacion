package Bucles1;

import java.util.Scanner;

public class permutaciones {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int total = 0;
		for (int a = 1; a <= 4; a++) {
			for (int b=1; b<=4 ; b++) {
				for(int c=1; c<=4; c++) {
					for (int d=1;d<=4;d++) {
						System.out.println(a+ ","+b+","+c+","+d+"\t");
						total++;
						
					}
					System.out.println();
				}
			}
		}
		System.out.println("Total de permutaciones : "+ total);
	}

}
