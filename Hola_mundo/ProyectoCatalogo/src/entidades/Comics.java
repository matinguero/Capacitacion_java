package entidades;

import java.util.Date;

public class Comics extends Libro {
	
	String personaje;

	public Comics(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
		super(precio, fechaPublicacion, autor, titulo, editorial);
		this.personaje = personaje;
	}
	
 @Override	
public double getPrecioventa() {
		
		return this.getPrecioventa();
	}

@Override
public String toString() {
	return "personaje= " + personaje +  super.toString();
}
	
 	
 
 
}
