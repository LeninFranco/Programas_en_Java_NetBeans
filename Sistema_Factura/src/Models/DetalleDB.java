package Models;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import DataBase.ConexionBaseDatos;

public class DetalleDB {
    
    public List<Detalle> findAll(int codigo){
	List<Detalle> detalles = new ArrayList<>();
	try (Connection conn = ConexionBaseDatos.getInstance();
		PreparedStatement stmt = conn.prepareStatement("CALL getDetalle(?)")){
	    stmt.setInt(1, codigo);
	    ResultSet rs = stmt.executeQuery();
	    while(rs.next()){
		Detalle d = new Detalle();
		d.setId(rs.getInt(1));
		d.setNombre(rs.getString(2));
		d.setPrecio(rs.getFloat(3));
		d.setCantidad(rs.getInt(4));
		d.setSubtotal(rs.getFloat(5));
		detalles.add(d);
	    }
	    rs.close();
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return detalles;
    }
    
    public void create(int cantidad, float subtotal, int codigo, int id){
	try (Connection conn = ConexionBaseDatos.getInstance();
		PreparedStatement stmt = conn.prepareStatement("INSERT INTO detalle(cantidad,subtotal,codigo,id) VALUES(?,?,?,?)")){
	    stmt.setInt(1,cantidad);
	    stmt.setFloat(2, subtotal);
	    stmt.setInt(3, codigo);
	    stmt.setInt(4, id);
	    stmt.executeUpdate();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
