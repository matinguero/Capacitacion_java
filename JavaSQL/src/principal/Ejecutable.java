package principal;

import java.util.Scanner;

public class Ejecutable {

	public static void main(String[] args) {
		Boolean flag=true;
		int opc=0;
		Boolean Flag = true;
		Scanner scanner = new Scanner(System.in);
		Boolean Verificacion;
		System.out.println("Programa Musicas con JDBC:");
		while(Flag==true) {
			Verificacion=true;
			System.out.println("Menu:");
			System.out.println("1- Insertar");
			System.out.println("2- Buscar");
			System.out.println("3- Actualizar");
			System.out.println("4- Borrar");
			while (flag==true) {
			try {
			
			opc=scanner.nextInt();

			
			if(opc==1 || opc==2 || opc==3 || opc==4 )
			{
				flag=false;
			}else {
				System.out.println("ingrese un valor valido:");
			}
			
			}catch(Exception ex) {
				flag=true;
				System.err.println("ERROR: Ingreso un String en lugar de INT");
				scanner.nextLine();
				System.out.println("ingrese un valor valido:");
			}
			}
			
			
			 switch (opc) {
	            case 1:
	                System.out.println("Insertar Seleccionado");
	                
	                
	                break;
	            case 2:
	                System.out.println("Buscar Seleccionado");
	                
	                
	                
	                break;
	            case 3:
	                System.out.println("Actualizar Seleccionado");
	                
	                
	                break;
	            case 4:
	                System.out.println("Borrar Seleccionado");
	                
	                
	                
	                break;
	            default:
	                System.out.println("Opcion invalida.");
	                
	                
	                break;
	        }
		
			
			
			
			
			
			while(Verificacion=true) {
				
			try {
				
			System.out.println("Desea continuar la ejecucion del programa? S-si / X-no");

			
			String Letra = scanner.nextLine(); 
			if(Letra.toLowerCase()=="s")
			{
				Flag=true;
				Verificacion=false;
			}else {
				Flag=false;
				Verificacion=false;
			}
				
			
			}catch(Exception e) {
				Verificacion=true;
			System.out.println("Ingrese un valor valido:");
			scanner.nextLine(); 
			}
			}
		} 
		System.out.println("FIN DEL PROGRAMA.");
		
	}

}

