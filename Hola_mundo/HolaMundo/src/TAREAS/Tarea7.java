package TAREAS;

import javax.swing.JOptionPane;

public class Tarea7 {

	public static void main(String[] args) {
		int array[] = new int[10];
		
		for(int i=0; i<10;i++) {
			array[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "ingresa numero"));
		}
		
		
	    for (int x = 0; x < 10; x++) {
	        for (int i = 0; i < 10-x-1; i++) {
	            if(array[i] < array[i+1]){
	                int tmp = array[i+1];
	                array[i+1] = array[i];
	                array[i] = tmp;
	            }
	        }
	    }

	    for(int i=0; i<10;i++) {
			System.out.println(array[i]);
		}
	    
}
}
