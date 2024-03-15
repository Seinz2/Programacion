package clases;


public class Banco {
	private Cuenta v[];
	
	//constructor de la clase banco, dimensiona el vector a 4 posiciones
	public Banco() {
		v=new Cuenta[4];
	}
	
	public void addCuenta(Cuenta c, int pos) {
		if(pos>=0 && pos<v.length) {
			v[pos]=c;
		}else {
			System.out.println("Error en la posicion");
		}
	}
	
	//muestra por pantalla el contenido del vector
	
	public void mostrarCuentas() {
		for (int i = 0; i < v.length; i++) {
			Cuenta c = v[i];
			System.out.println(c.toString());
			
		}
	}
}
