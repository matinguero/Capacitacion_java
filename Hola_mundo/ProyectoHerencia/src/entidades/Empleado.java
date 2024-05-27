package entidades;

public class Empleado extends Persona{
	
	double Remuneracion;
	int EmpleadoID;
	
	
	
	
	
	
	
	
	
	public Empleado(String nombre, String apellido, String numerofiscal, String direccion, double remuneracion,
			int empleadoID) {
		super(nombre, apellido, numerofiscal, direccion);
		Remuneracion = remuneracion;
		EmpleadoID = empleadoID;
	}









	public double getRemuneracion() {
		return Remuneracion;
	}









	public void setRemuneracion(double remuneracion) {
		Remuneracion = remuneracion;
	}









	public int getEmpleadoID() {
		return EmpleadoID;
	}









	public void setEmpleadoID(int empleadoID) {
		EmpleadoID = empleadoID;
	}









	public void aumentarRemuneracion(int porcentaje) {
		double remu;
		remu= (this.getRemuneracion()/100)*porcentaje;
		this.setRemuneracion(this.getRemuneracion()+remu);
	}









	@Override
	public String toString() {
		return "Empleado [Remuneracion=" + Remuneracion + ", EmpleadoID=" + EmpleadoID + "]";
	}
	
	
	
}
