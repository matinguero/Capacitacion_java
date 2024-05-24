package org.nicolas;

import java.sql.Date;

import Entidades.Cliente;
import Entidades.Producto;

public class OrdenCompra {
	//ATRIBUTOS
	private int identificador;
	private String descripcion;
	private Date fecha;
	private Producto productos[] = new Producto[4];
	private Cliente cliente;
	//ATRIBUTOS
	
	
	




	public OrdenCompra(String descripcion) {
		super();
		this.descripcion = descripcion;
	}



	public Date getFecha() {
		return fecha;
	}



	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public int getIdentificador() {
		return identificador;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public Producto[] getProductos() {
		return productos;
	}
	private int cosa = 0;
	
	
	public void addProducto(Producto producto) {
		if(cosa < 4) {
			productos[cosa] = producto;
			cosa++;
		}
	}
	
	public int Total(){
		//888df40dfcea9c0b-EZE error
		
		 int totalprecio = 0;
		for(int i =0; i<4; i++) {
		totalprecio+=productos[i].getPrecio();
		
		}
		
		
		return totalprecio;
	}
	
	public void imprimir(){
		for(Producto prod: productos) {
			System.out.println("");
			System.out.println("Fabricante: " + prod.getFabricante());
			System.out.println("Nombre: " + prod.getNombre());
			System.out.println("Precio: " +prod.getPrecio());
			
			
			
		}
		
	}
	
	
	
	
}
