package TAREAS;

import java.util.Scanner;

public class Tarea6 {

	public static void main(String[] args) {
		int numerowhile=0; //FLAG
		
		while (numerowhile==0)
		{
			
		 Scanner scanner = new Scanner(System.in);
		 int NumeroMes = 0;
		 System.out.println("Ingrese numero de mes");
		 
		 NumeroMes = scanner.nextInt();
		 
		
		switch(NumeroMes) {
		  case 1: 
			  
			  System.out.println("E1 mes tiene 31 dias!");
			  System.out.println("Seguir ejecucion del programa? -0 si -x no");
				numerowhile = scanner.nextInt();
				break;
		  case 2: 
			 System.out.println("Ingrese año");
			  int anio = scanner.nextInt();
			  
			  if(anio % 400 == 0 || (anio % 4 == 0 && !(anio % 100 == 0))) {  
				    System.out.println("El mes tiene 29 dìas!");  
				} else {  
				    System.out.println("El mes tiene 28 dias!");  
				}  
			  System.out.println("Seguir ejecucion del programa? -0 si -x no");
				numerowhile = scanner.nextInt();
				break;
		
		  case 3: 
			  
			  System.out.println("E1 mes tiene 31 dias!");
			  System.out.println("Seguir ejecucion del programa? -0 si -x no");
				numerowhile = scanner.nextInt();
				break;
		  case 4: 
			  System.out.println("El mes tiene 30 dias!");  
			  System.out.println("Seguir ejecucion del programa? -0 si -x no");
				numerowhile = scanner.nextInt();
				break;
			  
		  case 5: 
			  
			  System.out.println("E1 mes tiene 31 dias!");
			  System.out.println("Seguir ejecucion del programa? -0 si -x no");
				numerowhile = scanner.nextInt();
				break;
		  case 6: 
			  System.out.println("El mes tiene 30 dias!");  
			  System.out.println("Seguir ejecucion del programa? -0 si -x no");
				numerowhile = scanner.nextInt();
				break;
			 
		  case 7: 
			  System.out.println("E1 mes tiene 31 dias!");
			  System.out.println("Seguir ejecucion del programa? -0 si -x no");
				numerowhile = scanner.nextInt();
				break;
			  
		  case 8: 
			  System.out.println("E1 mes tiene 31 dias!");
			  System.out.println("Seguir ejecucion del programa? -0 si -x no");
				numerowhile = scanner.nextInt();
				break;
			 
		  case 9: 
			  System.out.println("El mes tiene 30 dias!");  
			  System.out.println("Seguir ejecucion del programa? -0 si -x no");
				numerowhile = scanner.nextInt();
				break;
		
		  case 10: 
			  System.out.println("E1 mes tiene 31 dias!");
			  System.out.println("Seguir ejecucion del programa? -0 si -x no");
				numerowhile = scanner.nextInt();
				break;
			 
		  case 11: 
			  System.out.println("El mes tiene 30 dias!");  
			  System.out.println("Seguir ejecucion del programa? -0 si -x no");
				numerowhile = scanner.nextInt();
				break;
			 
		  case 12: 
			  System.out.println("E1 mes tiene 31 dias!");
			  System.out.println("Seguir ejecucion del programa? -0 si -x no");
				numerowhile = scanner.nextInt();
				break;
			 
		
			  
		
	}
		}
		System.out.println("Fin del programa");
}
	
	public static void CLS() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	}  
}
