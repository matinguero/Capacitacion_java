package entidades;

import java.util.ArrayList;
import java.util.List;

public class Concesionario extends Moto implements IConcesionario{
	Empleado empleado;
public	List<Moto> motos = new ArrayList<Moto>();
	Cliente cliente;

	
	
	
	
	
	public Concesionario(String marca, String modelo, int motor, String color, int anio, Empleado empleado,
			List<Moto> motos, Cliente cliente) {
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

	public List<Moto> getMotos() {
		return motos;
	}


	public void setMotos(List<Moto> motos) {
		this.motos = motos;
	}


	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@Override
	public int buscarMoto(String modelo) {
		int contador = 0;
		for(Moto buscarmoto:motos) {
			
			
			if(buscarmoto.getModelo().equals(modelo)) {
				
				
				return contador;
			}
			contador++;
			
		}
		
		
		
		
		
		return 404;
	}
	@Override
	public String toString() {
		return " \n empleado= " + empleado + "\nmotos= " + motos + "\ncliente= " + cliente + "\nMarca= " + Marca
				+ "\nModelo= " + Modelo + "\nMotor= " + Motor + "\nColor= " + Color + "\nanio= " + anio;
	}


	@Override
	public void eliminarMoto(String modelo) {
		
		motos.remove(this.buscarMoto(modelo));
		
	}
	@Override
	public void addMoto(Moto addmoto) {
		motos.add(addmoto);
		
		
	}
	
	
	
	
	

}
