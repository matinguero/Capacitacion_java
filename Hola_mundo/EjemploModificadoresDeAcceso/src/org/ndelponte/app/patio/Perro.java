package org.ndelponte.app.patio;

import org.ndelponte.app.hogar.Persona;

public class Perro {
	private String nombre;
	private String Raza;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return Raza;
	}
	public void setRaza(String raza) {
		Raza = raza;
	}
	
	String Jugar (Persona p) {
		return("El perro esta jugando con la persona : " + p.getNombre() + "  " + p.arrojarPelota() + this.nombreYRaza());
	}
	
	private String nombreYRaza() {  
	    return this.nombre + this.Raza;  
	}  
	
}
