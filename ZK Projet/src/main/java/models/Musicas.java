package models;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

import models.Conexion;

public class Musicas {
	
	private int id;
	private String Nombre;
	private String Duracion;
	private String Fecha;
	private String Artista;
	
	
	

	public Musicas(int id, String nombre, String duracion, String fecha, String artista) {
		super();
		this.id = id;
		Nombre = nombre;
		Duracion = duracion;
		Fecha = fecha;
		Artista = artista;
	}
	//getters y setters
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDuracion() {
		return Duracion;
	}
	public void setDuracion(String duracion) {
		Duracion = duracion;
	}
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}
	public String getArtista() {
		return Artista;
	}
	public void setArtista(String artista) {
		Artista = artista;
	}
	
	
	//Procesos SQL
	
	public static void BorrarCancion(int id) {
        String sql = "call spBorrarMusica(?)";

        try (Connection conn = Conexion.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            pstmt.executeUpdate();

            System.out.println("Musica borrada con exito!");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
	 public static void InsertarCancion(String name, Time Duracion, String Artista) {
	        String sql = "CALL spInsertarMusica(?,?,?)";
	       
	        try (Connection conn = Conexion.getConnection();
	        		CallableStatement sp = conn.prepareCall(sql)) {

	        	sp.setString(1, name);
	        	sp.setTime(2, Duracion);
	        	sp.setString(3, Artista);
	        	sp.executeUpdate();

	            System.out.println("Musica insertada con exito!");

	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	   public static void ActualizarCancion(int idIN, String nombre, Time duracion, String artista) {
	        String sql = "CALL spUpdateMusica(?,?,?,?)";

	        try (Connection conn = Conexion.getConnection();
	             PreparedStatement pstmt = conn.prepareStatement(sql)) {

	            pstmt.setString(1, nombre);
	            pstmt.setTime(2, duracion);
	            pstmt.setString(3, artista);
	            pstmt.setInt(4, idIN);
	            pstmt.executeUpdate();

	            System.out.println("Cancion updateada con exito!");

	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }
}
