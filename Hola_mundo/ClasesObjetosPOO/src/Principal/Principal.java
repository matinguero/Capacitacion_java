package Principal;

import Entidades.Automovil;
import Entidades.Color;

public class Principal {

	public static void main(String[] args) {
		Automovil auto2 = new Automovil("pepa",0.2,Color.AMARILLO,300);
		Automovil focus = new Automovil("Ford",2.0,Color.AZUL,500);
		Automovil auto = new Automovil("Subaru",1.6,Color.AZUL,400);
		
		
		System.out.println(auto.Detalle()+ "\n");
		System.out.println(focus.Detalle()+ "\n");
		System.out.println(auto2.Detalle()+ "\n");
		System.out.println(auto.AcelyFrenar());
		System.out.println(auto2.AcelyFrenar());
		System.out.println(focus.AcelyFrenar());
		System.out.println("focus- Km recorridos por litro: "+focus.calcularConsumo(500,0.75f));
		System.out.println("auto- Km recorridos por litro: "+auto.calcularConsumo(750,0.5f));
		System.out.println("null- Km recorridos por litro: "+auto2.calcularConsumo(300,0f));
		
		
	}

}
