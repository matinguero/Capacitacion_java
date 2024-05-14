package TAREAS;

import javax.swing.JOptionPane;

public class Tarea3 {

	public static void main(String[] args) {
		
		int flag = 1;
		while (flag == 1) {
			try {
		int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero: "));
		if(numero % 2 == 0) {
			System.out.println("Es un numero par");
		}else {
			System.out.println("Es un numero impar");
		}
			} catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, e);
			}
			
		flag = Integer.parseInt(JOptionPane.showInputDialog(null, "Desea seguir ingresando numeros? -1 si -x no: "));
		}
		System.out.println("Fin del programa");
	}

	
}
