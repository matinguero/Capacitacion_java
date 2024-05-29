package main;

import entidades.Fruta;
import entidades.Lacteo;
import entidades.Limpieza;
import entidades.NoPerecible;
import entidades.Producto;

public class Ejemplo {

	public static void main(String[] args) {
		//Declaracion:
		
		
	
		
		Producto[] array = new Producto[8];
		
				array[0] = new Lacteo("sancor", 500,5 , 20);
				array[1] = new Lacteo("sancor2", 5300,45 , 520);
				array[2] = new Fruta("Manzana", 200 ,35 , "roja");
				array[3] = new Fruta("Pera", 220,230, "Amarilla");
				array[4] = new Limpieza("agua", 233, "agua", 253);
				array[5] = new Limpieza("jabon", 456, "jabon", 12451);
				array[6] = new NoPerecible("fideo", 784, 1234, 12312);
				array[7] = new NoPerecible("arroz", 4565, 5346, 12312);
				
	
				for(int i=0; i<8; i++){
				System.out.println(array[i].toString());
				}
				for(int i=0; i<8;i++) {
					  Producto producto = array[i];
				        System.out.println("Nombre: " + producto.getNombre());
				        System.out.println("Precio: " + producto.getPrecio());
					
					
					if(array[i] instanceof Lacteo) {
						Lacteo lacteo = (Lacteo) producto; // Casting a Lacteo
			            						
						System.out.println("InstanceOf: LACTEO");
						System.out.println(lacteo.toString());
						
				}else if(array[i] instanceof Fruta) {
					Fruta fruta = (Fruta) producto; // Casting a Fruta
			           
					
					System.out.println("InstanceOf: FRUTA");
					System.out.println(fruta.toString());
					
				}else if(array[i] instanceof Limpieza) {
					Limpieza limpieza = (Limpieza) producto; // Casting a Limpieza
			           
					
					System.out.println("InstanceOf: LIMPIEZA");
					System.out.println(limpieza.toString());
				
				}else if(array[i] instanceof NoPerecible) {
					NoPerecible noperecible = (NoPerecible) producto; // Casting a NoPerecible
			           
					
					System.out.println("InstanceOf: NoPerecible");
					System.out.println(noperecible.toString());
				
				}
					
				}
		
	}
		
		
	}


