package entidades;

public abstract class Electronico extends Producto implements IElectronico{
	
	

	public Electronico(int precio, String fabricante) {
		super(precio);
		this.fabricante = fabricante;
	}


	private String fabricante;
	
	
	public String getFabricante() {
		return fabricante;
	}


	@Override
	public String toString() {
		return "\n fabricante= " + fabricante +  super.toString();
	}


	

	


	

	
	
	
}
