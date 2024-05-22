package org.nicolas;

import java.sql.Date;

import Entidades.Cliente;

public class OrdenCompra extends Cliente{
	
	
	public OrdenCompra(String nombre, String apellido) {
		super(nombre, apellido);
		// TODO Auto-generated constructor stub
	}
	private int identificador;
	private String descripcion;
	private Date fecha;
	@Override
	public void setNombre(String nombre) {
		// TODO Auto-generated method stub
		super.setNombre(nombre);
	}
	@Override
	public void setApellido(String apellido) {
		// TODO Auto-generated method stub
		super.setApellido(apellido);
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	
	
	
}
