package TAREAS;

import javax.swing.JOptionPane;

public class tarea8corregida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= new int[10];
        for(int i=0; i<10;i++) {
            array[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese"));
        }
        int memoria=0;
        int memcount = 1;
         int count=0;
        for (int i = 0;i<10; i++) {
            count=0;
            for (int j = 0;j<10; j++) {

            if(array[i] == array[j])
            {
                count++;
            }
            }

         if (count > memcount)
        {
            memcount=count;
            memoria=array[i];
        }
        }
        System.out.println("Numero: "+memoria);
        System.out.println("Cantidad de veces que se repite: "+memcount);
}
	}


