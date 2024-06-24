package entidades;

public class Moto {
	String Marca;
	String Modelo;
	int Motor;
	String Color;
	int    anio;
	public Moto(String marca, String modelo, int motor, String color, int anio) {
		super();
		Marca = marca;
		Modelo = modelo;
		Motor = motor;
		Color = color;
		this.anio = anio;
	}
	public Moto() {
		super();
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public int getMotor() {
		return Motor;
	}
	public void setMotor(int motor) {
		Motor = motor;
	}
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	@Override
	public String toString() {
		return "\n Marca= " + Marca + "\\nModelo= " + Modelo + "\\nMotor= " + Motor + "\\nColor= " + Color + "\\nanio= "
				+ anio;
	}
	
	
	
}
