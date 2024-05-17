package TAREAS;

import javax.swing.JOptionPane;

public class Tarea8 {

	public static void main(String[] args) {
		
		int array[]= new int[10];
	
		
		
		for(int i=0; i<10;i++) {
			array[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese"));
		}
		
		//for(int i=0; i<10;i++) {
		//	System.out.println(array[i]);
		//}
		int Aux;
		int memoria=0;
		int flag = 0;
		int memmemoria=0;
		int memcount = 0;
		 int count=0;
		for (int i = 0;i<10; i++) {
			count=0;
			Aux=array[i];
		
			for (int j = 0;j<10; j++) {
				
			if(Aux == array[j])
			{
				count++;
				memoria=Aux;
				
			}
			
			}	
		if(flag==0)
		{
			memmemoria =memoria;
			memcount=count;
			flag=1;
		}
		else if (count > memcount)
		{
			memmemoria =memoria;
			memcount=count;
			
			
		}
			

		}
		System.out.println("Numero: "+memmemoria);
		System.out.println("Cantidad de veces que se repite: "+memcount);
		

}
}