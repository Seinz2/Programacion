package tareaEntregaGimnasio;

public class Abonado extends Persona {

	protected int id;
	private static int contAbonado = 0;

	public Abonado(String nombre, String apellidos, String nif, Direccion direccion) {
		super(nombre, apellidos, nif, direccion);
		contAbonado++;
		this.id = contAbonado;
	}

	
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Abonado [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", nif=" + nif
				+ ", direccion=" + direccion + "]";
	}



	@Override
	public void identificate() {
		
		System.out.println("---> Abonado");
		System.out.println(toString());
		contVeces++;
		
	}

	
	
	
}