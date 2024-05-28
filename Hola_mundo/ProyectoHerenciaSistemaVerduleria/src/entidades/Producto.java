package entidades;

public class Producto {
	String Nombre;
	double precio;
	
	
	public Producto(String nombre, double precio) {
		super();
		Nombre = nombre;
		this.precio = precio;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "-Producto: \nNombre= " + Nombre + "\nprecio= " + precio;
	}
	
	
	
	
}
