package entidades;

import javax.swing.JOptionPane;

public class Cliente extends Persona{
	int idCompra;
	Boolean esCliente;
	
	
	
	
	public Cliente(String nombre, String apellido, int edad, int idCompra, Boolean esCliente) {
		super(nombre, apellido, edad);
		this.idCompra = idCompra;
		this.esCliente = esCliente;
	}



	public Cliente() {
		super();
	}



	public int getIdCompra() {
		return idCompra;
	}
	public void setIdCompra(int idCompra) {
		this.idCompra = idCompra;
	}

	public Boolean getEsCliente() {
		return esCliente;
	}
	public void setEsCliente(Boolean esCliente) {
		this.esCliente = esCliente;
	}
	
	public void tieneDesc() {
		if(this.getEsCliente()==true) {
			JOptionPane.showMessageDialog(null, "Tiene descuento");
			
			
			
			
			
		}else {
			System.out.println("No tiene descuento");
		}
		
		
	}
	
	
	
	

}
