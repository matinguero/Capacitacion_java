package TAREAS;

import java.util.Scanner;

public class Tarea1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese nombre");
		String Nombre = scanner.nextLine();
		System.out.println("Ingrese Apellido");
		String Apellido = scanner.nextLine();
		System.out.println("Ingrese Domicilio");
		String Domicilio = scanner.nextLine();
		System.out.println("Ingrese Edad");
		int Edad = scanner.nextInt();
	
		
		
		System.out.println("Nombre: " + Nombre);

		System.out.println("Apellido: " + Apellido);
		
		System.out.println("Edad: " + Edad);

		System.out.println("Domicilio: " + Domicilio);
		
		System.out.println("Fin del programa");
			
	}

	
	

	
}
