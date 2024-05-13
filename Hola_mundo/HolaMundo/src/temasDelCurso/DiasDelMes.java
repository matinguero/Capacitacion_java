package temasDelCurso;

public class DiasDelMes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeromes = 2;
		
		if(numeromes == 11 || numeromes== 4|| numeromes== 6|| numeromes== 9) {
			System.out.println("El mes tiene 30 dias");
			
		}else if(numeromes == 2) {
			System.out.println("El mes tiene 28 dias");
			
		} else {
			System.out.println("El mes tiene 31 dias");
		}
	}

}
