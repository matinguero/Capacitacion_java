package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Personanumero49000;

public class Principal {

	public static void main(String[] args) {
		
		List<Personanumero49000> lista = new ArrayList<Personanumero49000>();
		
		Scanner scanner = new Scanner(System.in);
		String nom;
		String ape;
		String gen = null;
		int edad;
	

		
		for(int i = 0; i<5 ; i++) {
			
			System.out.println("Persona N°: " + (i+1));
			System.out.println("Ingrese el nombre: ");
			nom = scanner.nextLine();
			System.out.println("Ingrese el apellido: ");
			ape = scanner.nextLine();
			System.out.println("Ingrese el genero(M/F): ");
			gen = scanner.nextLine();
			
			
			System.out.println("Ingrese edad: ");
			edad = Integer.parseInt(scanner.nextLine());
			lista.add(new Personanumero49000(nom, ape, gen, edad));
			
		}
		
		
		
		Promedio();
		MyF();
		
		
		
		
		
		
		
		
		


	}
	public static void MyF() {
		int m=0, f = 0 ;

		for(int i = 0; i<5; i++) {
			if(lista.get(i).getGenero().equalsIgnoreCase("m")) {
				m++;
			}else if(lista.get(i).getGenero().equalsIgnoreCase("f")) {
				f++;
			}
			
			
		}
		
		System.out.println("masculinos = " + m);
		System.out.println("femeninos = " + f);
		
	}
	
	public static void Promedio() {
		int promedio=0;
		int edadtotal=0;
		for(int i = 0; i<5; i++) {
			
			edadtotal = edadtotal + lista.get(i).getEdad();
			
		}
		System.out.println("promedio edad = " + promedio);
	
		
	}
}
