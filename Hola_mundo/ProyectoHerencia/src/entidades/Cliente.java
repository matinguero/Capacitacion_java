package entidades;

public class Cliente extends Persona {
	int ClienteID;
	

	public Cliente(String nombre, String apellido, String numerofiscal, String direccion, int clienteID) {
		super(nombre, apellido, numerofiscal, direccion);
		ClienteID = clienteID;
	}


	
	
	
	
	public int getClienteID() {
		return ClienteID;
	}


	public void setClienteID(int clienteID) {
		ClienteID = clienteID;
	}






	@Override
	public String toString() {
		return "Cliente [ClienteID=" + ClienteID + "]";
	}
	
	
	
	
	
}
