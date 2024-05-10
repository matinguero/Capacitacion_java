package HolaMundo;

import javax.swing.*;

public class HolaMundo {

	public static void main (String[] args)
	{
		/* Linea de comentarios*/
		System.out.println("CLASE 5");
		System.out.println("");
		System.out.println("Hola mundo! :D");
		
		System.out.println("Otro ejemplo:");
		System.out.println("");
		System.out.print("En este ejemplo si no ponemos print'ln' no se hace el salto de linea ");
		System.out.println("--Como se puede ver aca");
		System.out.println("alo alo");
		System.out.println("");
		System.out.println("Clase 5 TERMINADA");
		
		String nombre = JOptionPane.showInputDialog(null, "Ingrese nombre: ");
		
		
		System.out.println("Nombre = " + nombre);
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese edad: "));
		
		JOptionPane.showMessageDialog(null, nombre);
		JOptionPane.showMessageDialog(null, edad);
		
		/*
		 * 13:52 clase 6
		 * */
		/*
		 * print: No realiza el salto de linea
		 * println: realiza salto de linea
		 * 
		 *  */
		
		System.out.println("FIN PROGRAMA");
	}
	
}
