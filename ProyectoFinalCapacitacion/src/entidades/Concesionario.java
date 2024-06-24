package entidades;

public class Concesionario extends Moto implements IConcesionario{
	Empleado empleado;
	Moto motos[];
	Cliente cliente;

	
	
	public Concesionario(String marca, String modelo, int motor, String color, int anio, Empleado empleado,
			Moto[] motos, Cliente cliente) {
		super(marca, modelo, motor, color, anio);
		this.empleado = empleado;
		this.motos = motos;
		this.cliente = cliente;
	}
	
	
	public Concesionario() {
		super();
	}


	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public Moto[] getMotos() {
		return motos;
	}
	public void setMotos(Moto[] motos) {
		this.motos = motos;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@Override
	public String buscarMoto() {
		
		
		
		
		
		
		
		return null;
	}
	@Override
	public void eliminarMoto() {
		
		
	}
	@Override
	public void addMoto() {
		
		
	}
	
	
	
	
	

}
