package Models;

import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Logger;

public class Conexion {
	private final String base = "tienda";
	private final String user = "root";
	private final String password = "1234";
	private final String url = "jdbc:mysql://localhost:3306/" + base;
	private Connection con = null;

	public Connection getConexion() throws ClassNotFoundException
	{
	    try{
	        Class.forName("com.mysql.jdbc.Driver");
	        con = (Connection) DriverManager.getConnection(this.url, this.user, this.password);
	    }
	    catch(SQLException e)
	    {
	        System.err.println(e);
	    }
	    
	    return con;
	}

}
