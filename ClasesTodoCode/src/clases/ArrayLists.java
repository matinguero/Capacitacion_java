package clases;

import java.util.ArrayList;
import java.util.List;

import entidades.Persona;

public class ArrayLists {

	public static void main(String[] args) {
		
		List<Persona> lista = new ArrayList<Persona>();
		
		lista.add(new Persona(1,"nombre", 30));
		lista.add(new Persona(2,"nombre2", 31));
		lista.add(new Persona(3,"nombre3", 32));
		lista.add(new Persona(4,"nombre4", 33));
		
		//recorrero por indice:
		System.out.println("For comun:");
		for(int i = 0; i<lista.size(); i++) {
			System.out.println("Prueba: " + lista.get(i).getNombre());
			
		}
		System.out.println("Foreach");
		  //Recorrer con For each
		
		for( Persona perso:lista) {
			System.out.println("Prueba: " + perso.getNombre());
		}
		
		
		
		
		
	}

}
