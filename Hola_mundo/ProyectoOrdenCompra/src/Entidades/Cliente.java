 package Entidades;

public class Cliente {
	public String Nombre;
	public String Apellido;
	
	
	


	public Cliente(String nombre, String apellido) {
		super();
		Nombre = nombre;
		Apellido = apellido;
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
	
	
	
}
