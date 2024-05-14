package TAREAS;

import javax.swing.JOptionPane;

public class Tarea4 {

	public static void main(String[] args) {
		int flag = 1;
		int i=0;
		int cantidadN = 0;
		
		
		
		cantidadN = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos nombres va a ingresar?"));
		String Nombres[] = new String[cantidadN];
		while(flag == 1 && i<cantidadN){
		
		Nombres[i]= JOptionPane.showInputDialog(null, "Ingrese nombre: ");
		i++;	
		
		
		
		
		}
		
	/*	for(int k=0; k<cantidadN; k++) {
			System.out.println(Nombres[k]);
		}
		*/
		for (int j=0;j<cantidadN-1;j++) {
			String Nombreaux;
			if(Nombres[j].length()<Nombres[j+1].length() ) {
				Nombreaux=Nombres[j+1];
				Nombres[j+1]=Nombres[j];
				Nombres[j]=Nombreaux;
				
			}
			
			
		}
		for(int k=0; k<cantidadN; k++) {
			System.out.println(Nombres[k]);
		}
		//flag = Integer.parseInt(JOptionPane.showInputDialog(null, "desea seguir cargando? -1 si x- no"));
		
		

	}

}
