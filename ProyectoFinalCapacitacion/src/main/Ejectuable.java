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
		List<Concesionario> listaM = new ArrayList<Concesionario>();
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
		 
		Cliente.setNombre(Nombre);
		Cliente.setApellido(Apellido);
		Cliente.setEdad(Edad);
		
		System.out.println("Carga de Persona Empleado");
		
		System.out.println("Nombre:");
		Nombre = scanner.nextLine(); 
		System.out.println("Apellido:");
		Apellido = scanner.nextLine();
		System.out.println("Edad:");
		Edad = scanner.nextInt();
		 
		Empleado.setNombre(Nombre);
		Empleado.setApellido(Apellido);
		Empleado.setEdad(Edad);
		
		
		EntidadCliente = new Cliente(Cliente.getNombre(),Cliente.getApellido(), Cliente.getEdad(), 23, Cliente, true);
		EntidadEmpleado = new Empleado(Empleado.getNombre(), Empleado.getApellido(), Empleado.getEdad(), Empleado, 1);
		
		
		String Marca;  
		String Modelo;  
		int Cilindrada;  
		String Color; 
		int Anio;  
		for(int i = 0; i<8; i++) {
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
			
			listaM.add(new Concesionario(Marca, Modelo, Cilindrada, Color, Anio, EntidadEmpleado, null, EntidadCliente));
			
		}
		
		
		
		
		
		
		
		
	}

}
