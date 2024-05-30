package ProyectoCatalogo;

import java.util.Date;

import entidades.*;
public class ProyectoCatalogo {

	public static void main(String[] args) {
		
		IProducto[] productos = new Producto[6];
		
		productos[0] = new TvLcd(0, "JP", 0);
		productos[1] = new Libro(0, new Date(), "Pedro", "El viaje al fondo del oceano", "carisima");
		productos[2] = new Comics(0, new Date(), "Pe", "El viaje afuera del oceano", "baratisima", "Fulanito");
		productos[3] = new IPhone(0, "apel", "78", "rojo");
		productos[4] = new TvLcd(0, "Sasung", 0);
		productos[5] = new Libro(0, new Date(), "PePe", "El viaje a la playa", "truchisima");
		
		
		
		for(int i=0; i<6;i++) {
			  Producto producto = (Producto) productos[i];
		        
			
			if(productos[i] instanceof TvLcd) {
				TvLcd tvlcd = (TvLcd) producto; 
	            						
				System.out.println("\nInstanceOf: TvLcd");
				System.out.println(tvlcd.toString());
				
		}else if(productos[i] instanceof Libro) {
			Libro libro = (Libro) producto;
	           
			
			System.out.println("\nInstanceOf: Libro");
			System.out.println(libro.toString());
			
		}else if(productos[i] instanceof Comics) {
			Comics comics = (Comics) producto; 
	           
			
			System.out.println("\nInstanceOf: Comics");
			System.out.println(comics.toString());
		
		}else if(productos[i] instanceof IPhone) {
			IPhone iphone = (IPhone) producto; 
	           
			
			System.out.println("\nInstanceOf: IPhone");
			System.out.println(iphone.toString());
		
		}
			
		}
		
		
		
			
	}

}
