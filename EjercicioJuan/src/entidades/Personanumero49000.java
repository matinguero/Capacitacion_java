 package entidades;

public class Personanumero49000 {
	//ESTOY PODRIDO DE HACER CLASES DE PERSONA, GRACIAS!!!
	
	private String Nombre;
	private String Apellido;
	private String genero;
	private int edad;
	public Personanumero49000(String nombre, String apellido, String genero, int edad) {
		super();
		Nombre = nombre;
		Apellido = apellido;
		this.genero = genero;
		this.edad = edad;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		Apellido = apellido;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
	
	
	
}

