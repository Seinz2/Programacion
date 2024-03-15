package parecidoAlExamen;

public class Electrodomestico {
	private String iden;
	private String nombre;
	private String fabricante;
	private double precio;
	private boolean enStock;
	
	
	public Electrodomestico(String iden, String nombre, String fabricante, double precio, boolean enStock) {
		super();
		this.iden = iden;
		this.nombre = nombre;
		this.fabricante = fabricante;
		this.precio = precio;
		this.enStock = enStock;
		
		
	}


	/**
	 * @return the iden
	 */
	public String getIden() {
		return iden;
	}


	/**
	 * @param iden the iden to set
	 */
	public void setIden(String iden) {
		this.iden = iden;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	/**
	 * @return the fabricante
	 */
	public String getFabricante() {
		return fabricante;
	}


	/**
	 * @param fabricante the fabricante to set
	 */
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}


	/**
	 * @return the precio
	 */
	public double getPrecio() {
		return precio;
	}


	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}


	/**
	 * @return the enStock
	 */
	public boolean isEnStock() {
		return enStock;
	}


	/**
	 * @param enStock the enStock to set
	 */
	public void setEnStock(boolean enStock) {
		this.enStock = enStock;
	}


	@Override
	public String toString() {
		return "electrodomestico [iden=" + iden + ", nombre=" + nombre + ", fabricante=" + fabricante + ", precio="
				+ precio + ", enStock=" + enStock + "]";
	}
	
	
}
