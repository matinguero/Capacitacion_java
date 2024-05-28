package entidades;

public class NoPerecible extends Producto{
	int Contenido;
	int Calorias;
	
	
	
	

	public NoPerecible(String nombre, double precio, int contenido, int calorias) {
		super(nombre, precio);
		Contenido = contenido;
		Calorias = calorias;
	}



	public int getContenido() {
		return Contenido;
	}



	public void setContenido(int contenido) {
		Contenido = contenido;
	}



	public int getCalorias() {
		return Calorias;
	}



	public void setCalorias(int calorias) {
		Calorias = calorias;
	}



	@Override
	public String toString() {
		return super.toString() + "\n-NoPerecible: \nContenido= " + Contenido + "\nCalorias= " + Calorias + "\n\n";
	}
	
	 
	
	
}
