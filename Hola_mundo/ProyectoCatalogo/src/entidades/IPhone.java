package entidades;

public class IPhone  extends Electronico{
	
	

	private String modelo;
	private String color;
	
	
	
	
	
	public IPhone(int precio, String modelo, String color) {
		super(precio);
		this.modelo = modelo;
		this.color = color;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public double getPrecioventa() {
		// TODO Auto-generated method stub
		return this.getPrecio();
	}
	
	
	
	
}
