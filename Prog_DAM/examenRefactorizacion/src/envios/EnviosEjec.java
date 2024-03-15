package envios;

//@Sergio Alvarez
//@Version 2.0

public class EnviosEjec {

    /**
     * El método principal.
     */
	public static void main(String[] args) {

		Envios paqueteJuan;
		Persona p1, p2;
		p1 = new Persona("1111111a", "LUIS");
		p2 = new Persona("2222222b", "JUAN");
		paqueteJuan = new Envios(p1, p2, "urgente");
		System.out.println(paqueteJuan.toString());
		System.out.println("Tipo envio" + paqueteJuan + "Importe Envio " + 
		                                   paqueteJuan.calculaImporte(5));

	}

}
