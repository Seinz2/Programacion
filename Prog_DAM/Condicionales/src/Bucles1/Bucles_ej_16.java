package Bucles1;

import java.util.Scanner;

public class Bucles_ej_16 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hora, min, seg;
		System.out.println("hora");
		hora = teclado.nextInt();
		System.out.println("min");
		min = teclado.nextInt();
		System.out.println("seg");
		seg = teclado.nextInt();
		
		seg++;
		
		if(seg==60) {
			seg = 0;
			min++;
			if(min==60) {
				min = 0;
				hora++;
				if(hora==24) {
					hora=0;
				}
			}
		}
		System.out.println(hora + ":" + min + ":" + seg);
	}

}
