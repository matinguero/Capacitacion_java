package entidades;

public class Gerente extends Empleado {
	double Presupuesto;

	
	
	public Gerente(String nombre, String apellido, String numerofiscal, String direccion, double remuneracion,
			int empleadoID, double presupuesto) {
		super(nombre, apellido, numerofiscal, direccion, remuneracion, empleadoID);
		Presupuesto = presupuesto;
	}

	public double getPresupuesto() {
		return Presupuesto;
	}

	public void setPresupuesto(double presupuesto) {
		Presupuesto = presupuesto;
	}

	@Override
	public String toString() {
		return "Clase Gerente \n Nombre: " + nombre + "\n Apellido: " + apellido +"\n DNI: "  + numerofiscal+"\n Direccion: " + direccion+ "\n Remuneracion sin aumento: " + Remuneracion + "\n ID de empleado: "+ EmpleadoID +  "\n Presupuesto: " + Presupuesto;
	}
	
	
	
	
}
