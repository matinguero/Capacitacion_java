package ProyectoCatalogo;

import entidades.Producto;
import entidades.IProducto;
import entidades.*;
import entidades.TvLcd;
public class ProyectoCatalogo {

	public static void main(String[] args) {
		
		IProducto producto = new TvLcd(340000,40);
		
		IProducto[] productos = new Producto[6];
		productos[2]= new TvLcd(340000, 40);
		
	//	imprimir(IProducto);
			
	}

}
