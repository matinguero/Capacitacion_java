package org.ndelponte.entidades;

public class AlumnoInternacional extends Alumno {
	

	
	
	public AlumnoInternacional(String nombre, String apellido, int edad, String email, String institucion,
			double notamath, double notacast, double notahist, String pais, double notaIdiomas) {
		super(nombre, apellido, edad, email, institucion, notamath, notacast, notahist);
		this.pais = pais;
		this.notaIdiomas = notaIdiomas;
	}
	public AlumnoInternacional() {
		System.out.println("AlumnoInternacional: Inicializando constructor....");
	}
	private String pais;
	private double notaIdiomas;
	
	public double getNotaIdiomas() {
		return notaIdiomas;
	}
	public void setNotaIdiomas(double notaIdiomas) {
		this.notaIdiomas = notaIdiomas;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getPais() {
		 return pais;
		 
	}
	@Override
	public String saludar() {
		// TODO Auto-generated method stub
		return super.saludar();
	}
	
	@Override
	public double calcularpromedio() {
		// TODO Auto-generated method stub
		return (this.getNotacast() + this.getNotahist() + this.getNotamath() + this.notaIdiomas) / 4;
	}
	
	

}
