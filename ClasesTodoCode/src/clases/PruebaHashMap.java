package clases;

import java.util.HashMap;
import java.util.Map;

public class PruebaHashMap {

	public static void main(String[] args) {
		Map<Integer,String> mapaEmpleados = new HashMap<>();
		
		mapaEmpleados.put(1523, "Suscribite a todocode");
		mapaEmpleados.put(1524, "perro");
		mapaEmpleados.put(1525, "gatito");
		
		boolean estaono = mapaEmpleados.containsValue("Gabriel");
		
		
		if (estaono==true) {
			System.out.println("el valor esta");
		}else {
			System.out.println("el valor no esta");
		}
		estaono = mapaEmpleados.containsValue("gatito");

		if (estaono==true) {
			System.out.println("el valor esta");
		}else {
			System.out.println("el valor no esta");
			
		}
		
		estaono = mapaEmpleados.containsKey(1528);
		
		if (estaono==true) {
			System.out.println("el valor esta");
		}else {
			System.out.println("el valor no esta");
			
		}		
		estaono = mapaEmpleados.containsKey(1523);
		
		if (estaono==true) {
			System.out.println("el valor esta");
		}else {
			System.out.println("el valor no esta");
			
		}
		
		System.out.println("el valor es" + mapaEmpleados.values());
		
		
	}

}
