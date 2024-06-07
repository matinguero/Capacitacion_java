package entidades;

public class Concesionario implements IConcesionario{
	Empleado empleado;
	Moto motos[];
	Cliente cliente;

	
	public Concesionario(Empleado empleado, Moto[] motos, Cliente cliente) {
		super();
		this.empleado = empleado;
		this.motos = motos;
		this.cliente = cliente;
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
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addMoto() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	

}
