package org.ndelponte.entidades;

public class Alumno extends Persona{
	
	
	private String institucion;
	private double notamath;
	private double notacast;
	private double notahist;
	
	
	
	
	@Override
	public String saludar() {
		String saludoPadre = super.saludar();
		return saludoPadre + " Soy el alumno de la institucion" + this.institucion;
		
	}
	
	public Alumno(String nombre, String apellido, int edad, String email, String institucion, double notamath,
			double notacast, double notahist) {
		super(nombre, apellido, edad, email);
		this.institucion = institucion;
		this.notamath = notamath;
		this.notacast = notacast;
		this.notahist = notahist;
	}
	
	
	
	public Alumno() {
		System.out.println("Alumno: Inicializando constructor....");
	}

	public String getInstitucion() {
		return institucion;
	}
	public void setInstitucion(String institucion) {
		this.institucion = institucion;
	}
	public double getNotamath() {
		return notamath;
	}
	public void setNotamath(double notamath) {
		this.notamath = notamath;
	}
	public double getNotacast() {
		return notacast;
	}
	public void setNotacast(double notacast) {
		this.notacast = notacast;
	}
	public double getNotahist() {
		return notahist;
	}
	public void setNotahist(double notahist) {
		this.notahist = notahist;
	}
	
	public double calcularpromedio() {
		return (this.notacast + this.notahist + this.notamath) / 3;
	}
	
	@Override
	public String toString() {
		
		return super.toString() +  
				"\ninstitucion='" + this.institucion + '\'' +  
				", notaMatematica=" + this.notamath +  
				", notaCastellano=" + this.notacast +  
				", notaHistoria=" + this.notahist +  
				", promedio=" + this.calcularpromedio();
	
	
	}

	
}
