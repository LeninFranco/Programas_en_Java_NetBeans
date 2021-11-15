package Models;

import java.sql.*;
import DataBase.ConexionBaseDatos;

public class FacturaDB {
    public Factura findOne(int codigo){
	Factura f = null;
	try (Connection conn = ConexionBaseDatos.getInstance();
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM factura WHERE codigo = ?")){
	    stmt.setInt(1, codigo);
	    ResultSet rs = stmt.executeQuery();
	    if(rs.next()){
		f = new Factura();
		f.setCodigo(rs.getInt(1));
		f.setFecha(rs.getString(2));
		f.setMetodoPago(rs.getString(3));
	    }
	    rs.close();
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return f;
    }
    
    public void create(Factura factura){
	try (Connection conn = ConexionBaseDatos.getInstance();
		PreparedStatement stmt = conn.prepareStatement("INSERT INTO factura(codigo,fecha,metodoPago) VALUES(?,?,?)")){
	    stmt.setInt(1, factura.getCodigo());
	    stmt.setString(2, factura.getFecha());
	    stmt.setString(3, factura.getMetodoPago());
	    stmt.executeUpdate();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
