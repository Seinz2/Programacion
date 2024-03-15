package parecidoAlExamen;

public class Tienda {
	private Electrodomestico electrodomesticos[];
	private int contElectrodomesticos;
	
	public Tienda() {
		electrodomesticos = new Electrodomestico[10];
		this.contElectrodomesticos=0;
	}
	
	public void nuevoElectrodomestico (Electrodomestico e) {
		if (this.contElectrodomesticos<electrodomesticos.length) {
			
		}else {
			System.out.println("ERROR no hay hueco");
		}
	}
}
