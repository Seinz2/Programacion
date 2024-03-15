package ficheros;

public class Libreria {

	public static boolean validarLetra (char letra) {
		
		
		char lector = '2';
		int cont = 0;
		
		while (lector != '1') {
			
			if (lector == letra) return true;
			String vector = "abcdefghijklmnopqrstuwxyz1";
			lector = vector.charAt(cont);
			if (lector != letra)System.out.println("No es " + lector);
			cont++;
		}
		
		
		return false;
	}

}
