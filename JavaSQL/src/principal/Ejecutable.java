package principal;

import java.util.Scanner;

import Models.CRUD;

public class Ejecutable {
	

	public static void main(String[] args) {
		Boolean flag=true;
		int opc=0;
		Boolean Flag = true;
		Scanner scanner = new Scanner(System.in);
		Boolean Verificacion;
		System.out.println("Programa Musicas con JDBC:");

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
	            	String Nombre;
	            	String Duracion;
	            	String Artista;
	                System.out.println("Insertar Seleccionado");
	                
	                
	                
	                
	                break;
	            case 2:
	            	String Nombre2;
	            	System.out.println("Buscar Seleccionado");
	                
	                
	                
	                break;
	            case 3:
	            	String Nombre3;
	                System.out.println("Actualizar Seleccionado");
	                
	                
	                break;
	            case 4:
	            	String Nombre4;
	                System.out.println("Borrar Seleccionado");
	                
	                
	                
	                break;
	            default:
	                System.out.println("Opcion invalida.");
	                
	                
	                break;
	        }
		
			
			
			
			
		
		System.out.println("FIN DEL PROGRAMA.");
		

	  
	       
	        CRUD crud = new CRUD();
	        boolean running = true;

	        while (running) {

	            int option = scanner.nextInt();
	            scanner.nextLine(); // Consume newline

	            switch (option) {
	                case 1:
	                    System.out.print("Enter student name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter student age: ");
	                    int age = scanner.nextInt();
	                    crud.createStudent(name, age);
	                    break;
	                case 2:
	                	crud.readStudents();
	                    break;
	                case 3:
	                    System.out.print("Enter student id to update: ");
	                    int idToUpdate = scanner.nextInt();
	                    scanner.nextLine(); // Consume newline
	                    System.out.print("Enter new name: ");
	                    String newName = scanner.nextLine();
	                    System.out.print("Enter new age: ");
	                    int newAge = scanner.nextInt();
	                    crud.updateStudent(idToUpdate, newName, newAge);
	                    break;
	                case 4:
	                    System.out.print("Enter student id to delete: ");
	                    int idToDelete = scanner.nextInt();
	                    crud.deleteStudent(idToDelete);
	                    break;
	                case 5:
	                    running = false;
	                    break;
	                default:
	                    System.out.println("Invalid option. Try again.");
	            }
	        }

	        scanner.close();
	    
	    
		
	}

}

