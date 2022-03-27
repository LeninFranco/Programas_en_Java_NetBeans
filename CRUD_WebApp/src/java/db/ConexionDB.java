package db;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionDB {
    private static final String url = "jdbc:mysql://localhost:3306/example";
    private static final String username = "root";
    private static final String password = "P0L1m4s7er!";

    public static Connection getInstance() throws SQLException {
	try {
	    Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException ex) {
	    Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
	}
        return DriverManager.getConnection(url,username,password);
    }
}

