package TAREAS;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Tarea2 {

	public static void main(String[] args) {
		
		//System.out.println("(test)Ingrese nombre");
		String Nombre = JOptionPane.showInputDialog(null, "Ingrese nombre: ");
		//System.out.println("(test)Ingrese Apellido");
		String Apellido = JOptionPane.showInputDialog(null, "Ingrese apellido: ");
		//System.out.println("(test)Ingrese Domicilio");
		String Domicilio =JOptionPane.showInputDialog(null, "Ingrese domicilio: ");
		//System.out.println("(test)Ingrese Edad");
		int Edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese edad: "));
	
		
		
		System.out.println("Nombre: " + Nombre);

		System.out.println("Apellido: " + Apellido);
		
		System.out.println("Edad: " + Edad);

		System.out.println("Domicilio: " + Domicilio);
		
		System.out.println("Fin del programa");
			

	}

}
