package entidades;

public class Empleado extends Persona{
	
	int idEmpleado;

	
	public Empleado(String nombre, String apellido, int edad, int idEmpleado) {
		super(nombre, apellido, edad);
		this.idEmpleado = idEmpleado;
	}



	public Empleado() {
		super();
	}


	
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	
	
	
}
