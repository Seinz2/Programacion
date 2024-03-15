package envios;

//@Sergio Alvarez
//@Version 2.0

public class Persona {
	private String dni;
	private String nombre;

	/**
	 * Constructor de la clase Persona.
	 *
	 * @param dni
	 * @param nombre
	 */
	public Persona(String dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}

	/**
	 * Obtiene el número de DNI de la persona.
	 *
	 * @return El número de DNI.
	 */
	public String getDni() {
		return this.dni;
	}

	/**
	 * Obtiene el nombre de la persona.
	 *
	 * @return El nombre de la persona.
	 */
	public String getNombre() {
		return this.nombre;
	}

	/**
	 * Establece el número de DNI de la persona.
	 *
	 * @param dni.
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * Establece el nombre de la persona.
	 *
	 * @param nombre.
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve la información de la persona.
	 *
	 * @return Una cadena que incluye el número de DNI y el nombre de la persona.
	 */
	public String toString() {
		return "DNI: " + this.dni + "\nNOMBRE: " + this.nombre + "\n";
	}
}
