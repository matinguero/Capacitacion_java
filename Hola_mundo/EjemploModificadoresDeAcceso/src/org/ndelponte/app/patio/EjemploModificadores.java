package org.ndelponte.app.patio;

import org.ndelponte.app.hogar.Persona;

public class EjemploModificadores {

	public static void main(String[] args) {
		 Perro perro = new Perro();
		 
		 perro.setNombre("Toby");
		 perro.setRaza("Caniche");
		 
		 System.out.println("Nombre: " + perro.getNombre());
		 
		 Persona p = new Persona("nicolas", "delponte");
		 
		 System.out.println(perro.Jugar(p));
	}

}
