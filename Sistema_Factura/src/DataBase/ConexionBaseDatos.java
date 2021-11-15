package DataBase;

import java.sql.*;

public class ConexionBaseDatos {
    private static final String url = "jdbc:mysql://localhost:3306/tienda";
    private static final String username = "root";
    private static final String password = "P0L1m4s7er!";

    public static Connection getInstance() throws SQLException {
        return DriverManager.getConnection(url,username,password);
    }
}
