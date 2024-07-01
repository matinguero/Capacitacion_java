package Models;

import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class Conexion {
	
	
	    private static final String URL = "jdbc:mysql://localhost:3306/bdmusica";
	    private static final String USERNAME = "root";
	    private static final String PASSWORD = "enzo109";

	    public static Connection getConnection() throws SQLException {
	        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	    }
	

}
