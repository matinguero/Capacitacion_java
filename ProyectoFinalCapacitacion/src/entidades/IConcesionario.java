package entidades;

public interface IConcesionario {
	public int buscarMoto(String modelo);
	public void eliminarMoto(String modelo);
	public void addMoto(Moto addmoto);
}
