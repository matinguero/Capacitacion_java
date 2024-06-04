package clases;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import entidades.Persona;

public class LinkedLists {

	public static void main(String[] args) {
		List<Persona> listaArray = new ArrayList<Persona>();
		listaArray.add(new Persona(1, "Luisina", 30));
		listaArray.add(new Persona(2, "Gabriel", 30));
		listaArray.add(new Persona(3, "Ibra", 30));
		listaArray.add(new Persona(4, "TodoCode", 2));
		
		LinkedList<Persona> listaLinked = new LinkedList<Persona>();
		listaLinked.add(new Persona(1, "Luisina", 30));
		listaLinked.add(new Persona(2, "Gabriel", 30));
		listaLinked.add(new Persona(3, "Ibra", 30));
		listaLinked.add(new Persona(4, "TodoCode", 2));
		
		//Remove en ArrayList
		listaArray.remove(1);

		//Remove en LinkedList
		String nombreBorrar = "Gabriel";
		for (Persona persona2 : listaLinked) {
		    if (persona2.getNombre().equals(nombreBorrar)) {
		        listaLinked.remove(persona2);
		        break; //corto que deje de recorrer
		    }
		}

		System.out.println("------LUEGO DE ELIMINAR-------");
		//recorrido por foreach
		System.out.println("--------ARRAYLIST----------");
		for (Persona persona : listaArray) {
		    System.out.println("prueba " + persona.getNombre());
		}

		System.out.println("--------LINKEDLIST----------");
		for (Persona persona : listaLinked) {
		    System.out.println("prueba " + persona.getNombre());
		}
		
		//Tamaño lista
		System.out.println("--------Qué tamaño tienen las listas?-------");
		System.out.println("ArrayList: " + listaArray.size());
		System.out.println("LinkedList: " + listaLinked.size());

		//obtener primer objeto
		System.out.println("------PRIMER y último OBJETO (solo para LINKED LIST)-------");
		System.out.println("Primero de LinkedList: " + listaLinked.getFirst().toString());
		System.out.println("Ultimo de LinkedList: " + listaLinked.getLast().toString());

	}

}
