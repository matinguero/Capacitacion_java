package entidades;

public class Cliente extends Persona{
	int idCompra;
	Persona datos;
	Boolean esCliente;
	public Cliente(String nombre, String apellido, int edad, int idCompra, Persona datos, Boolean esCliente) {
		super(nombre, apellido, edad);
		this.idCompra = idCompra;
		this.datos = datos;
		this.esCliente = esCliente;
	}
	public int getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}
	public Persona getDatos() {
		return datos;
	}
	public void setDatos(Persona datos) {
		this.datos = datos;
	}
	public Boolean getEsCliente() {
		return esCliente;
	}
	public void setEsCliente(Boolean esCliente) {
		this.esCliente = esCliente;
	}
	
	public void tieneDesc() {
		if(this.getEsCliente()==true) {
			System.out.println("Tiene descuento");
			
			
			
			
			
		}else {
			System.out.println("No tiene descuento");
		}
		
		
	}
	
	
	
	

}
