package main;

import org.nicolas.OrdenCompra;

import Entidades.Cliente;
import Entidades.Producto;

public class EjemploOrdenes {

	public static void main(String[] args) {
		OrdenCompra orden1 = new OrdenCompra("Orden1");
		Producto producto1=new Producto("apple","iphone", 200);
		Producto producto2=new Producto("HP","Laptop", 200);
		Producto producto3=new Producto("Kingston","RAM", 200);
		Producto producto4=new Producto("Mototrola","Moto Edge 40", 200);
		Cliente ricardo = new Cliente("Fulano", "mengano");
		
		orden1.addProducto(producto1);
		orden1.addProducto(producto2);
		orden1.addProducto(producto3);
		orden1.addProducto(producto4);
		
		System.out.println("Cliente:");

		System.out.println(ricardo.getNombre() + " " + ricardo.getApellido());
		
		
		
		System.out.println("Precio total: " + orden1.Total());
		
		System.out.println("Productos:");
		
	    orden1.imprimir();
		
		
	}

}
