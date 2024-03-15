package clases;

public class Alumno {
	//Atributos
	String dni;
	String nombre;
	int edad;
	
	public Alumno(String d, String n, int e) {
		dni=d;
		nombre=n;
		edad=e;
	}
	
	public Alumno() {
		dni="000000000";
		nombre="x";
		edad=0;
	}
	
	public Alumno(String n, int e) {
		dni = "x";
		nombre = n;
		edad = e;
	}
	
	public void mostrarDatos() {
		System.out.println(dni+"-"+nombre+"-"+edad);
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
