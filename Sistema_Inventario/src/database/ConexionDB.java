package database;

import java.sql.*;

public class ConexionDB {
    private static final String url = "jdbc:mysql://localhost:3306/inventario";
    private static final String username = "root";
    private static final String password = "P0L1m4s7er!";

    public static Connection getInstance() throws SQLException {
        return DriverManager.getConnection(url,username,password);
    }
}
