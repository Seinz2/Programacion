package ejercicioComoExamenXD;

public class Producto {
	protected String ref;
	protected String nombre;
	protected double precio;
	
	public Producto(String ref, String nombre, String precio) {
		super();
		this.ref = ref;
		this.nombre = nombre;
		this.precio = precio;
	}



	@Override
	public String toString() {
		return "Producto [ref=" + ref + ", nombre=" + nombre + ", precio=" + precio + "]";
	}



	public double precioConIva(int porcentaje) {
		return (precio+(precio*porcentaje/100));
	}
}
