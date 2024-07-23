package models;

import java.sql.Date;

public class Musicas {
	
	private int id;
	private String Nombre;
	private String Duracion;
	private String Fecha;
	private String Artista;
	
	
	

	public Musicas(int id, String nombre, String duracion, String fecha, String artista) {
		super();
		this.id = id;
		Nombre = nombre;
		Duracion = duracion;
		Fecha = fecha;
		Artista = artista;
	}
	//getters y setters
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDuracion() {
		return Duracion;
	}
	public void setDuracion(String duracion) {
		Duracion = duracion;
	}
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	public String getArtista() {
		return Artista;
	}
	public void setArtista(String artista) {
		Artista = artista;
	}
	
	
	//Procesos SQL
	

	

	
	
}
