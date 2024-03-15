package tareaEntregaGimnasio;

public class Monitor extends Persona {

	protected String sala;
	
	public Monitor(String nombre, String apellidos, String nif, Direccion direccion, String sala) {
		super(nombre, apellidos, nif, direccion);
		this.sala = sala;
	}

	
	
	/**
	 * @return the sala
	 */
	public String getSala() {
		return sala;
	}



	/**
	 * @param sala the sala to set
	 */
	public void setSala(String sala) {
		this.sala = sala;
	}



	@Override
	public String toString() {
		return "Monitor [sala=" + sala + ", nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif
				+ ", direccion=" + direccion + "]";
	}



	@Override
	public void identificate() {
		
		System.out.println("Monitor: " + this.sala);
		System.out.println(this.toString());
		contVeces++;
	}

	
	
	
	
	
}