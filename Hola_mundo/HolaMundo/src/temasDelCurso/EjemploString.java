package temasDelCurso;

public class EjemploString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String stringUno = "Curso java"; // ESTO EN REALIDAD POR DETRAS ESTA HACIENDO LO MISMO QUE LA LINEA 10
		
		
		String stringDos = new String("Curso Java");
		
		int entero = 1;
		 
		System.out.println("String stringUno " + stringUno);
		System.out.println("String stringDos " + stringDos);
		
		System.out.println("Largo del stringUno " + stringUno.length());
		System.out.println("Largo del stringDos " + stringDos.length());
		
		boolean sonIguales = stringUno == stringDos; //SE ESTA DECLARANDO UNA VARIABLE COMPARANDO STRINGS  
		
		System.out.println("Son iguales? " + sonIguales);
		
		boolean sonIgualesEquals = stringUno.equals(stringDos); //DETECTA SI ES CASE SENSITIVE O NO
		boolean sonIgualesEqualsIgnoreCase = stringUno.equalsIgnoreCase(stringDos); //NO DETECTA SI ES CASE SENSITIVE O NO SOLO LEE LOS CARACTERES 
			
		System.out.println("Son Iguales 'Equals'? " + sonIgualesEquals);
		System.out.println("Son Iguales 'Equals'? " + sonIgualesEqualsIgnoreCase);
		
		char caracter = stringUno.charAt(3); //DEVUELVE EL CARACTER EN EL INDICE INDICADO SOBRE LA CADENA DE CARACTERES
		
		System.out.println("Caracter en el indice 3 : " + caracter);
		String nombre = "Nick";
		String ape = "Delponte";
		System.out.println("Nombre completo: " + nombre.concat(ape));
		
		boolean contiene = nombre.contains("ck");
		
		System.out.println("Contiene = nombre contains (/k/) = " + contiene);
		
		boolean terminacon = nombre.endsWith("k");
		boolean empiezacon = nombre.startsWith("N");
		
		System.out.println("Ends with K: " + terminacon);
		
		System.out.println("Starts with N: " + empiezacon);
		
		
		String NombreDos = null;
		
		System.out.println("Concatenacion de objeto String null: " + NombreDos.concat(nombre));
		
		
		
		
		
	}

}
