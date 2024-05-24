package entidades;

public class Empleado extends Persona{
	
	double Remuneracion;
	int EmpleadoID;
	
	
	public void aumentarRemuneracion(int porcentaje) {
		double remu;
		remu= (this.Remuneracion/100) * porcentaje;
		this.Remuneracion= remu;
	}
	
}
