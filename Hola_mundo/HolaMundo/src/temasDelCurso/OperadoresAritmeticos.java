package temasDelCurso;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		//suma
		
		int i = 6;
		int j = 6;
		int suma;
		//TAMBIEN SE PUEDE DECLARAR ASI
		// int i, j, suma;
		suma = i + j;
		
		System.out.println("La suma es " + suma);
		System.out.println("La suma es " + (i+j));
		
		//resto
		int resto = 5 % 1;
		System.out.println("El resto es = " + resto);
		
		//Division
		Double div = (double)j / (double)i;
		System.out.println("La division es = " + div);
		
		//INCREMENTO
		int IncrementoI = 0;
		
		i++;
		i+=1;
		
			
		System.out.println("Incremento = " + (++IncrementoI));
		System.out.println("Incremento = " + (++IncrementoI));
		System.out.println("Incremento = " + (++IncrementoI));
		
		//DECREMENTO
		
		System.out.println("Decremento = " + (--IncrementoI));
		System.out.println("Decremento = " + (--IncrementoI));
		System.out.println("Decremento = " + (--IncrementoI));
		
		//Multiplicacion
		
		int Multiplicacion= i*j;
		
		System.out.println("La multiplicacion es = "+ Multiplicacion);
		
		
		
		
	}

}
