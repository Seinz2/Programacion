package vectores;

import java.util.Scanner;

public class Ejemplo1 {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int v[] = new int [5];
		//rellenar un vector
		for(int i=0;i<5;i++) {
			v[i] = i;
		}
		//mostrar vector
		for(int i=0;i<5;i++) {
			System.out.println("["+i+"] = "+ v[i]);
		}
	}

}
