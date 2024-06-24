package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Concesionario;
import entidades.Empleado;
import entidades.Moto;
import entidades.Persona;

public class Ejectuable {

	public static void main(String[] args) {
		Cliente EntidadCliente;
		Empleado EntidadEmpleado;
		Persona Cliente = new Cliente();
		Persona Empleado = new Empleado();
		Concesionario listaM = new Concesionario();
		Scanner scanner = new Scanner(System.in);
		String Nombre,Apellido;
		int Edad;
		/*
		String input = "hello";
		String padded = String.format("%-150s", input); // Pads the string with spaces to the right
		*/
		System.out.println("Carga de Persona Cliente");
		
		System.out.println("Nombre:");
		Nombre = scanner.nextLine(); 

		System.out.println("Apellido:");
		Apellido = scanner.nextLine();

		System.out.println("Edad:");
		Edad = scanner.nextInt();
		scanner.nextLine();
		EntidadCliente = new Cliente(Nombre,Apellido, Edad, 23, false);
		
		EntidadCliente.tieneDesc();
		
		System.out.println("Carga de Persona Empleado");
		
		System.out.println("Nombre:");
		Nombre = scanner.nextLine(); 
		System.out.println("Apellido:");
		Apellido = scanner.nextLine();
		System.out.println("Edad:");
		Edad = scanner.nextInt();
		scanner.nextLine();
		EntidadEmpleado = new Empleado(Nombre, Apellido, Edad, 1);
		
		
		 
		
		
		
		String Marca;  
		String Modelo;  
		int Cilindrada;  
		String Color; 
		int Anio;  
		for(int i = 0; i<2; i++) {
			System.out.println("Ingrese moto " + i);
			System.out.println("Ingrese Marca:");
			Marca =scanner.nextLine(); 
			System.out.println("Ingrese Modelo:");
			Modelo = scanner.nextLine(); 
			System.out.println("Ingrese Color:");
			Color = scanner.nextLine(); 
			System.out.println("Ingrese Anio:");
			Anio = scanner.nextInt(); 
			System.out.println("Ingrese Cilindrada:");
			Cilindrada = scanner.nextInt(); 
			scanner.nextLine();
			
			Moto moto = new Moto(Marca, Modelo, Cilindrada, Color, Anio);
			
			listaM.addMoto(moto);
			
		}
		
		

		
		
		System.out.println("Producto Sin eliminar:");
	    System.out.println(listaM.getMotos().toString());
			
		
		String borrar;
		System.out.println("ingrese modelo a borrar:");
		borrar = scanner.nextLine();
		
		listaM.eliminarMoto(borrar);
		

	
			System.out.println("Producto eliminado.");
			System.out.println(listaM.getMotos().toString());
			
			
		
	}

}
