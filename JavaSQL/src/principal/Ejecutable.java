package principal;
import java.sql.Time;

import java.util.Scanner;

import Models.CRUD;
import java.util.Scanner;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Ejecutable {
	

	public static void main(String[] args) {
		Boolean flag=true;
		int opc=0;
		Boolean Flag = true;
		Scanner scanner = new Scanner(System.in);
		Boolean Verificacion;
		 CRUD crud = new CRUD();
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
			scanner.nextLine();
			
			 switch (opc) {
	            case 1:
	            	
	                System.out.println("Insertar Seleccionado");
	                System.out.print("Ingrese Nombre de cancion: ");
                    String name = scanner.nextLine();
                    System.out.print("Ingrese duracion(HH:MM:SS): ");
                    String duracionStr = scanner.nextLine();
                    Time duracion = parseTime(duracionStr);

                    System.out.print("Ingrese Artista: ");
                    String artista = scanner.nextLine();
                    crud.InsertarCancion(name, duracion, artista);
	                
	                
	                
	                break;
	            case 2:
	            	 
	            	System.out.println("Buscar Seleccionado");
	            	System.out.println("Ingrese el Nombre: ");
	            	String nombre = scanner.nextLine();
	            	crud.BuscarMusica(nombre);
	            	
                    break;
	                
	                
	            case 3:
	                System.out.println("Actualizar Seleccionado");
	                System.out.print("Ingresa el id a updatear: ");
                    int idU = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Ingresa nuevo nombre(no cambiar: ENTER sin escritura): ");
                    String NombreU = scanner.nextLine();
                    System.out.print("Ingresa la duracion en formato (HH:MM:SS)(no cambiar: 00:00:00): ");
                    String duracionStr1 = scanner.nextLine();
                    Time Duracion = parseTime(duracionStr1);
                    System.out.println("Ingresa el artista(no cambiar: ENTER sin escritura): ");
                    String Artista= scanner.nextLine();
                    crud.updateStudent(idU, NombreU, Duracion, Artista);
                    break;
	                
	                
	                
	                
	            case 4:
	                System.out.println("Borrar Seleccionado");
	                System.out.print("Ingrese id de la musica a borrar: ");
                    int idBorrar = scanner.nextInt();
                    crud.BorrarCancion(idBorrar);
                   
	                
	                
	                break;
	            default:
	                System.out.println("Opcion invalida.");
	                
	                
	                break;
	        }
		
			
			
			
			
		
		System.out.println("FIN DEL PROGRAMA.");
		
		
	  
	       
	       
	      

	        scanner.close();
	    
	    
		
	}
	  private static Time parseTime(String timeStr) {
	        try {
	            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	            java.util.Date date = sdf.parse(timeStr);
	            return new Time(date.getTime());
	        } catch (ParseException e) {
	            System.out.println("Invalid time format. Please enter time in HH:mm:ss format.");
	            return null;
	        }
	    }
}

