package entidades;

import java.util.Date;

public class Libro extends Producto implements ILibro{
	Date fechaPublicacion;
	String autor;
	String titulo;
	String editorial;
	
	public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
		super(precio);
		this.fechaPublicacion = fechaPublicacion;
		this.autor = autor;
		this.titulo = titulo;
		this.editorial = editorial;
	}

	public Date getFechaPublicacion() {
		return fechaPublicacion;
	}

	public String getAutor() {
		return autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	@Override
	public double getPrecioventa() {
		
		return this.getPrecioventa();
	}

	@Override
	public String toString() {
		return " fechaPublicacion= " + fechaPublicacion + "\nautor= " + autor + "\ntitulo= " + titulo
				+ "\neditorial= " + editorial +  super.toString();
	}

	}

	
	
	
	
	
	

