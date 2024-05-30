package entidades;

public abstract class Producto implements IProducto{
	



	public Producto(int precio) {
		super();
		this.precio = precio;
	}


	protected int precio;
	
	
	public int getPrecio() {
		return precio;
	}


	@Override
	public String toString() {
		return "\n precio= " + precio;
	}


	

	
	
	
	

}
