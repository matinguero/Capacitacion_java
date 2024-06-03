package entidades;

public class Empleado extends Persona{
	Persona datos;
	int idEmpleado;
	public Empleado(String nombre, String apellido, int edad, Persona datos, int idEmpleado) {
		super(nombre, apellido, edad);
		this.datos = datos;
		this.idEmpleado = idEmpleado;
	}
	public Persona getDatos() {
		return datos;
	}
	public void setDatos(Persona datos) {
		this.datos = datos;
	}
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	
	
	
}
