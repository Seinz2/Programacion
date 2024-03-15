package programacion_modular;

import java.util.Scanner;

public class segundo_Ejercicio_Entrega {
	static Scanner teclado = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("dia ");
		int dia = teclado.nextInt();
		System.out.println("mes ");
		int mes = teclado.nextInt();
		System.out.println("Anio ");
		int anio = teclado.nextInt();
		while(validarFecha(dia,mes,anio)==false) {
			//pedir datos
			System.out.println("ERROS fecha incorrecta");
			System.out.println("dia ");
			dia = teclado.nextInt();
			System.out.println("mes ");
			mes = teclado.nextInt();
			System.out.println("Anio ");
			anio = teclado.nextInt();
		}
		//System.out.println("Total dias " + calcularDias(dia, mes, anio));
		int valor=calcularDias(dia, mes, anio)%7;
		switch (valor) {
		case 0: {
			System.out.println("sabado");
			break;
		}
		case 1: {
			System.out.println("domingo");
			break;
		}
		case 2: {
			System.out.println("lunes");
			break;
		}
		case 3: {
			System.out.println("martes");
			break;
		}
		case 4: {
			System.out.println("miercoles");
			break;
		}
		case 5: {
			System.out.println("jueves");
			break;
		}
		case 6: {
			System.out.println("viernes");
			break;
		}
		default:
			
		}
	}
	public static boolean anioBisiesto (int year) {
		if(year%4==0 && year%100!=0) return true;
		if(year%400==0) return true;
		return false;
	}
	
	public static boolean validarFecha ( int dia, int mes, int anio) {
		if(dia<=0 || dia>31) return false;
		if(mes<=0 || mes>12) return false;
		if(anio<1978) return false;
		if(mes ==4 || mes==6 || mes==9 || mes==11) {
			if (dia==31) return false;
		}
		if (mes ==2 && anioBisiesto(anio)==true) {
			if(dia>28) return false;
		}
		return true;
	}
	public static int diasMes (int mes,int anio) {
		if(mes==4 || mes==6 || mes==9 || mes==11) {
			return 30;
		}
		if(mes==2) {
			if(anioBisiesto(anio)==true) return 29;
			else return 28;
		}
		return 31;
	}
	public static int calcularDias(int dia, int mes, int anio) {
		int total=0;
		for(int year=1978;year<anio;year++) {
			if(anioBisiesto(year)==true) total=total+366;
			else total=total+365;
		}
		for (int mesCalculo=1;mesCalculo<mes;mesCalculo++) {
			total=total+diasMes(mesCalculo, anio);
		}
		total=total+dia;
		return total;
	}
}
