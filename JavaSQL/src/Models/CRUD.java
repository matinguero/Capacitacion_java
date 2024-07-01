package Models;
import java.sql.*;
import java.util.Scanner;

public class CRUD {
	
	 public void createStudent(String name, int age) {
	        String sql = "INSERT INTO students (name, age) VALUES (?, ?)";

	        try (Connection conn = Conexion.getConnection();
	             PreparedStatement pstmt = conn.prepareStatement(sql)) {

	            pstmt.setString(1, name);
	            pstmt.setInt(2, age);
	            pstmt.executeUpdate();

	            System.out.println("Student added successfully!");

	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }

	    public void readStudents() {
	        String sql = "SELECT * FROM students";

	        try (Connection conn = Conexion.getConnection();
	             Statement stmt = conn.createStatement();
	             ResultSet rs = stmt.executeQuery(sql)) {

	            while (rs.next()) {
	                System.out.println(rs.getInt("id") + "\t" +
	                                   rs.getString("name") + "\t" +
	                                   rs.getInt("age"));
	            }

	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }

	    public void updateStudent(int id, String name, int age) {
	        String sql = "UPDATE students SET name = ?, age = ? WHERE id = ?";

	        try (Connection conn = Conexion.getConnection();
	             PreparedStatement pstmt = conn.prepareStatement(sql)) {

	            pstmt.setString(1, name);
	            pstmt.setInt(2, age);
	            pstmt.setInt(3, id);
	            pstmt.executeUpdate();

	            System.out.println("Student updated successfully!");

	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }

	    public void deleteStudent(int id) {
	        String sql = "DELETE FROM students WHERE id = ?";

	        try (Connection conn = Conexion.getConnection();
	             PreparedStatement pstmt = conn.prepareStatement(sql)) {

	            pstmt.setInt(1, id);
	            pstmt.executeUpdate();

	            System.out.println("Student deleted successfully!");

	        } catch (SQLException e) {
	            System.out.println(e.getMessage());
	        }
	    }
	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
}
