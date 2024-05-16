package entidades;

public abstract class Electronico extends Producto implements IElectronico{
	
	
	public Electronico(int precio) {
		super(precio);
		// TODO Auto-generated constructor stub
	}


	private String fabricante;
	
	
	public String getFabricante() {
		return fabricante;
	}


	


	

	
	
	
}
