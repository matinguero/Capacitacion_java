package Models;
import java.sql.*;
import java.util.Scanner;

public class CRUD {
	
	 public void InsertarCancion(String name, Time Duracion, String Artista) {
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

	    public void BuscarMusica(String nombre) {
	    	String sql = "{CALL spBuscarMusica(?)}";

	        try (Connection conn = Conexion.getConnection();
	        		CallableStatement sp = conn.prepareCall(sql)) {
	        	sp.setString(1, nombre);
	        	 ResultSet rs = sp.executeQuery();
	            while (rs.next()) {
	                System.out.println("ID: " + rs.getInt("id") + "\n" +
	                                   "Nombre: " + rs.getString("Nombre") + "\n" +
	                                   "Duracion: " + rs.getTime("Duracion") + "\n"  +
	                				   "Fecha de publicacion: " + rs.getDate("Fecha_publicacion") + "\n" +
	                                   "Artista: " + rs.getString("Artista"));
	            }	

	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }

	    public void updateStudent(int idIN, String nombre, Time duracion, String artista) {
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

	    public void BorrarCancion(int id) {
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
	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
}
