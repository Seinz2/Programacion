package programacion_modular;

import java.util.Scanner;

public class Dni_ejercicio {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("DNI");
		int dni = teclado.nextInt();
		while (compruebaDni(dni)==false) {
			System.out.println("ERROR en el dni");
			System.out.println("nuevo dni");
			dni=teclado.nextInt();
		}
		System.out.println("Letra ");
		char letra = teclado.next().charAt(0);
				if(dniValido(dni, letra)==true) {
					System.out.println("DNI correcto ");
				} else {
					System.out.println("DNI incorrecto");
				}
		
	}
	/**
	 * comprobar que el entero tiene a lo sumo 8 digitos
	 * @param dni
	 * @return
	 */
	public static boolean compruebaDni (int dni) {
	if (dni<0) return false; // es negativo
	if (dni<100000000) 
		return false;
	return true;
	}
	public static char letraDni(int dni) {
		int resto=dni%23;
		if(resto==0) return 'T';
		if(resto==1) return 'R';
		if(resto==2) return 'W';
		if(resto==3) return 'A';
        if(resto==4) return 'G';
        if(resto==5) return 'M';
        if(resto==6) return 'Y';
        if(resto==7) return 'F';
        if(resto==8) return 'P';
        if(resto==9) return 'D';
        if(resto==10) return 'X';
        if(resto==11) return 'B';
        if(resto==12) return 'N';
        if(resto==13) return 'J';
        if(resto==14) return 'Z';
        if(resto==15) return 'S';
        if(resto==16) return 'Q';
        if(resto==17) return 'V';
        if(resto==18) return 'H';
        if(resto==19) return 'L';
        if(resto==20) return 'C';
        if(resto==21) return 'K';
		return 'E';
		
		}
	public static boolean dniValido(int dni, char letra) {
		char letraCalculada=letraDni(dni);
		if(letra==letraCalculada)return true;
		return false;
	}
}
