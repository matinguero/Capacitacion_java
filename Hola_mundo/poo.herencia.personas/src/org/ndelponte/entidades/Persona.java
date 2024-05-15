package org.ndelponte.entidades;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private String email;
	
	
	

	public Persona() {
				super();
				System.out.println("Ejectuando el constructor de la clase persona sin parametros....");

	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String saludar() {
		return "hola que tal";
	}
	
	

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", email=" + email + "]";
	}
 
	public Persona(String nombre, String apellido, int edad, String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.email = email;
		System.out.println("Ejectuando el constructor de la clase persona con todos los parametros....");

	}

}
