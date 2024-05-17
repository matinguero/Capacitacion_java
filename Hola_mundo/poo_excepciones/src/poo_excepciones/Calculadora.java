package poo_excepciones;

public class Calculadora {
	public double dividir(int dividendo, int divisor) throws DivisionPorZeroException {
		
		if(divisor == 0)
		{
			throw new DivisionPorZeroException("No se puede dividir por cero! :");
		}
		
		return dividendo/(double)divisor;
		
		
	}
	public double dividr(String numerador, String divisor) throws DivisionPorZeroException, FormatoNumeroException {
		int num, div;
try {
	

		num = Integer.parseInt(numerador);
		 div = Integer.parseInt(divisor);
}catch(FormatoNumeroException e) {
	
	throw new FormatoNumeroException("Debe ingresar un valor numerico");
	
}

		return this.dividir(num, div);
	}
	
}
