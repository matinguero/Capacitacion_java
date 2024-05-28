package entidades;

public class Lacteo extends Producto{
	
	int Cantidad;
	int Proteinas;
	



	public Lacteo(String nombre, double precio, int cantidad, int proteinas) {
		super(nombre, precio);
		Cantidad = cantidad;
		Proteinas = proteinas;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int cantidad) {
		Cantidad = cantidad;
	}

	public int getProteinas() {
		return Proteinas;
	}

	public void setProteinas(int proteinas) {
		Proteinas = proteinas;
	}

	@Override
	public String toString() {
		return super.toString() + "\n-Lacteo: \nCantidad= " + Cantidad + ",\nProteinas= " + Proteinas + "\n\n";
	}
	
	
	
	
	
	
	
	
	
}
