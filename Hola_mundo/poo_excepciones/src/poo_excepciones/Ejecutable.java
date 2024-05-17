package poo_excepciones;

import javax.swing.JOptionPane;

public class Ejecutable {

	public static void main(String[] args) {
		
		String numerador = JOptionPane.showInputDialog(null, "Ingrese val num numerador");
		String divisor = JOptionPane.showInputDialog(null, "Ingrese val num divisor");
		
		
		Calculadora cal= new Calculadora();
		int div;
		
		
		
		try {
			div = Integer.parseInt(divisor);
			
			
		double resultado = cal.dividir(Integer.parseInt(numerador),Integer.parseInt(divisor));
		System.out.println(resultado);
		
		
		
		}catch (FormatoNumeroException e) {
			System.out.println("0No se pudo realizar la operacion: " + e.getMessage());
			
		}catch (DivisionPorZeroException e) {
			System.out.println("1No se pudo realizar la operacion: " + e);
			
		}catch (Exception e) {
			System.out.println("2No se pudo realizar la operacion: " + e);
			
		}finally {
			System.out.println("a");
		}
		}

}
