package entidades;

public class TvLcd extends Electronico{
	private int pulgada;
		

	

	


	public TvLcd(int precio, String fabricante, int pulgada) {
		super(precio, fabricante);
		this.pulgada = pulgada;
	}

	public int getPulgada() {
		return pulgada;
	}

	public void setPulgada(int pulgada) {
		this.pulgada = pulgada;
	}

	

	@Override
	public double getPrecioventa() {
		// TODO Auto-generated method stub
		return this.getPrecioventa();
	}

	@Override
	public String toString() {
		return "TV pulgadas= " + pulgada +  super.toString();
	}

	

	
	
	
}
