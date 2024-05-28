package entidades;

public class Persona {
	
	String nombre;
	String apellido;
	String numerofiscal;
	String direccion;
	
	
	
	public Persona(String nombre, String apellido, String numerofiscal, String direccion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.numerofiscal = numerofiscal;
		this.direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNumerofiscal() {
		return numerofiscal;
	}
	public void setNumerofiscal(String numerofiscal) {
		this.numerofiscal = numerofiscal;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		return "\nnombre= " + nombre + ",\napellido= " + apellido + ",\nnumerofiscal= " + numerofiscal + ",\ndireccion= " + direccion;
	}
	
	
	
	
	
}
