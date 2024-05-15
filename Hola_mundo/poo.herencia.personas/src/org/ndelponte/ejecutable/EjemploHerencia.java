package org.ndelponte.ejecutable;

import org.ndelponte.entidades.Alumno;
import org.ndelponte.entidades.AlumnoInternacional;
import org.ndelponte.entidades.Persona;
import org.ndelponte.entidades.Profesor;

public class EjemploHerencia {

	public static void main(String[] args) {
		
		
		System.out.println("======== Creando la instancia de la clase Alumno ========");  
		Alumno alumno = new Alumno();
		
		alumno.setApellido("delponte");
		alumno.setEdad(23);
		alumno.setEmail("nicolasdelponte2012@gmail.com");
		alumno.setNombre("nicolas");
		
		 
		alumno.setNotacast(6.5);  
		alumno.setNotahist(7.0);  
		alumno.setNotamath(6.3);  
		alumno.setInstitucion("Instituto Nacional");  
		
		
		
		System.out.println("======= Creando la instancia de la clase AlumnoInternacional ======= ");  
		AlumnoInternacional alumnoInt = new AlumnoInternacional();  
		alumnoInt.setNombre("Javier");  
		alumnoInt.setApellido("Garcia");  
		alumnoInt.setPais("Argentina");  
		alumnoInt.setEdad(15);  
		alumnoInt.setInstitucion("Instituto Nacional");  
		alumnoInt.setNotaIdiomas(6.8);  
		alumnoInt.setNotacast(6.2);  
		alumnoInt.setNotahist(5.8);  
		alumnoInt.setNotamath(6.5);  
		
		System.out.println("======= Creando la instancia de la clase de Profesor =======");  
		Profesor profesor = new Profesor();  
		profesor.setNombre("Lucia");  
		profesor.setApellido("Pérez");  
		profesor.setAsignatura("Matemáticas");  
		
		imprimir(alumno);
		imprimir(alumnoInt);
		imprimir(profesor);
		
	}

	public static void imprimir(Persona persona) {  
	    System.out.println("======================================================");  
	    System.out.println(persona);  
	}  
	
}
