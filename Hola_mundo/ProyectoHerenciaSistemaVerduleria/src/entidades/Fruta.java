package entidades;

public class Fruta extends Producto{
	double peso;
	String color;
	
	
	

	public Fruta(String nombre, double precio, double peso, String color) {
		super(nombre, precio);
		this.peso = peso;
		this.color = color;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String toString() {
		return super.toString() +"\n-Fruta: \npeso= " + peso + "\ncolor= " + color + "\n\n";
	}
	
	
	
}
