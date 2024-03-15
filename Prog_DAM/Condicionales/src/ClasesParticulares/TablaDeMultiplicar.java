package ClasesParticulares;

import java.util.Scanner;

public class TablaDeMultiplicar {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("introduce numero");
		int num = teclado.nextInt();
		int count = 1;
		
		while (count <= 10) {
			System.out.println(num +"*"+count+ "=" + num*count);
			count++;
		}
	}

}
