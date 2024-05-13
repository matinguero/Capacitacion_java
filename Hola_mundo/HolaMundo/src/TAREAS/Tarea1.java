package TAREAS;

import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.console.ConsolePlugin;

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
		
		clearConsole();
		
		System.out.println("Nombre: " + Nombre);

		System.out.println("Apellido: " + Apellido);
		
		System.out.println("Edad: " + Edad);

		System.out.println("Domicilio: " + Domicilio);
		
		System.out.println("Fin del programa");
			
	}

	
	public static void clearConsole() {
	    MessageConsole console = findConsole("Console");
	    if (console != null) {
	        console.clearConsole();
	    }
	}

	private static MessageConsole findConsole(String name) {
	    ConsolePlugin plugin = ConsolePlugin.getDefault();
	    if (plugin != null) {
	        MessageConsole[] consoles = plugin.getConsoleManager().getConsoles();
	        for (MessageConsole console : consoles) {
	            if (name.equals(console.getName())) {
	                return console;
	            }
	        }
	    }
	    return null;
	}
}
