package envios;

//@Sergio Alvarez
//@Version 2.0

/**
 * Constructor para la clase Envios.
 *
 * @param destinatario
 * @param remitente
 * @param tipoEnvio
 */
public class Envios {
	private Persona destinatario;
	private Persona remitente;
	private String tipoEnvio;

	public Envios(Persona destinatario, Persona remitente, String tipoEnvio) {
		this.destinatario = destinatario;
		this.remitente = remitente;
		this.tipoEnvio = tipoEnvio;
	}

	/**
	 * @return the destinatario
	 */
	public Persona getDestinatario() {
		return destinatario;
	}

	/**
	 * @param destinatario the destinatario to set
	 */
	public void setDestinatario(Persona destinatario) {
		this.destinatario = destinatario;
	}

	/**
	 * @return the remitente
	 */
	public Persona getRemitente() {
		return remitente;
	}

	/**
	 * @param remitente the remitente to set
	 */
	public void setRemitente(Persona remitente) {
		this.remitente = remitente;
	}

	/**
	 * @return the tipoEnvio
	 */
	public String getTipoEnvio() {
		return tipoEnvio;
	}

	/**
	 * @param tipoEnvio the tipoEnvio to set
	 */
	public void setTipoEnvio(String tipoEnvio) {
		this.tipoEnvio = tipoEnvio;
	}

	/**
	 * Calcula el importe del envío en función del tipo de envío y el peso.
	 *
	 * @param peso
	 * @return El importe calculado para el envío.
	 */
	public double calculaImporte(double peso) {
		switch (this.tipoEnvio) {
		case "normal":
			return 3 * peso;
		case "especial":
			return 5 * peso;
		case "urgente":
			return 10 * peso;
		default:
			return 0;
		}
	}

	/**
	 * Devuelve la informacion del envio.
	 *
	 * @return Una cadena que incluye datos del destinatario, remitente y tipo de
	 *         envío.
	 */
	@Override
	public String toString() {
		return "DATOS DESTINATARIO\n" + destinatario.toString() + "DATOS REMITENTE\n" + remitente.toString()
				+ "TIPO ENVIO: " + tipoEnvio;
	}

}
