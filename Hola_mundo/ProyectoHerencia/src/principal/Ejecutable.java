package principal;

import entidades.Gerente;
import entidades.Persona;

public class Ejecutable {

	public static void main(String[] args) {
		Gerente gerente1 = new Gerente("Nombre","Apellido","42878761","El Trovador 3185", 250000, 1,400000);

		System.out.println(gerente1.toString());
		
	}

}
