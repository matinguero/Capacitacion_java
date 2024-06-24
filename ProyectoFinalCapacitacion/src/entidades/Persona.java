package entidades;

public class Persona {
	String Nombre;
	String Apellido;
	int    Edad;
	
	
	
	
	
	
	
	public Persona(String nombre, String apellido, int edad) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		Edad = edad;
	}
	
	
	public Persona() {
		super();
	}


	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public int getEdad() {
		return Edad;
	}
	public void setEdad(int edad) {
		Edad = edad;
	}
	
	
	
	
	
	
}
