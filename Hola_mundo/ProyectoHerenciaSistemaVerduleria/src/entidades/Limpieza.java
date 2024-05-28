package entidades;

public class Limpieza extends Producto{
	String Componentes;
	double litros;
	
	
	


	public Limpieza(String nombre, double precio, String componentes, double litros) {
		super(nombre, precio);
		Componentes = componentes;
		this.litros = litros;
	}


	public String getComponentes() {
		return Componentes;
	}


	public void setComponentes(String componentes) {
		Componentes = componentes;
	}


	public double getLitros() {
		return litros;
	}


	public void setLitros(double litros) {
		this.litros = litros;
	}


	@Override
	public String toString() {
		return super.toString() + "\n-Limpieza: \nComponentes= " + Componentes + "\nlitros= " + litros + "\n\n";
	}


	
	
	
	
	
}
