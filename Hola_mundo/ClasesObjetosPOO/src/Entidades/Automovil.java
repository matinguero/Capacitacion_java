package Entidades;

public class Automovil {

public	String marca;
public	double cilindrada;
public	Color color;
public 	int capacidadtanque;
	
	public String Detalle() {
		String CadenaDetalle = "Info del vehiculo: \nMarca: " + this.marca + " \nColor: " + this.color + "\nCilindrada: " + this.cilindrada;  // "this." se usa por si tenemos una variable que esta en el mismo metodo con el mismo nombre
		return CadenaDetalle;
	}

	public String Acelerar() {
		 String detalle = "El auto " + this.marca + " esta acelerando!!";  
		    return detalle;  
	}
	
	public String Frenar() {
		return " El auto esta frenando!";  
	}
	
	public String AcelyFrenar() {
		 return this.Acelerar() + this.Frenar();  
	}
	  
	public float calcularConsumo(int km, float porcentajeGasolina){
		
		
		return km/(capacidadtanque * porcentajeGasolina);
		
	}

	public Automovil(String marca, double cilindrada, Color color, int capacidadTanque) {  
	    super();  
	    this.marca = marca;  
	    this.cilindrada = cilindrada;  
	    this.color = color;  
	    this.capacidadtanque = capacidadTanque;  
	}  
	
	
}
