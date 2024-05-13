package temasDelCurso;

import java.util.Scanner;

public class EjemploArrayNotasDeAlumnos {

	public static void main(String[] args) {
		double [] clasematematicas, ClaseHistoria, claseLengua;
		double summath=0, sumhistoria=0, sumlengua=0;
		
		
		clasematematicas = new double[7];  
		ClaseHistoria = new double[7];  
		claseLengua  = new double[7];
		Scanner s = new Scanner(System. in);
		System.out.println("Ingrese 7 notas de estudiantes para matematicas:");
		for(int i = 0; i<clasematematicas.length; i++)
		{
			clasematematicas[i] = s.nextDouble();
			
		}
		System.out.println("Ingrese 7 notas de estudiantes para historia:");
		for(int i = 0; i<ClaseHistoria.length; i++)
		{
			ClaseHistoria[i] = s.nextDouble();
			
		}
		System.out.println("Ingrese 7 notas de estudiantes para lengua:");
		for(int i = 0; i<claseLengua.length; i++)
		{
			claseLengua[i] = s.nextDouble();
			
		}
		
		for(int i = 0; i<7; i++) {
			summath += clasematematicas[i];
			sumhistoria += ClaseHistoria[i];
			sumlengua += claseLengua[i];
		}
		
		double promedioMatematica = (summath/clasematematicas.length);  
		double promedioHistoria = (sumhistoria/ClaseHistoria.length);  
		double promedioLengua = (sumlengua/claseLengua.length);  
		System.out.println("Promedio clase matematicas: " + promedioMatematica);  
		System.out.println("Promedio clase historia: " + promedioHistoria);  
		System.out.println("Promedio clase lenguaje: " + promedioLengua);  
		System.out.println("Promedio total del curso: "  
		        + (promedioMatematica + promedioHistoria + promedioLengua)/3);  
		System.out.println("Ingrese el identificador del alumno (de 0 - 6):");  
		int id = s.nextInt();  
		double promedioAlumno = (ClaseHistoria[id] + claseLengua[id] + clasematematicas[id])/3;  
		System.out.println("Promedio alumno Nro " + id + " : " + promedioAlumno);  
		System.out.println("Fin del programa");
	}

}
