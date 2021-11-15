package Models;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import DataBase.ConexionBaseDatos;

public class ProductoDB {
    public List<Producto> findAll(){
	List<Producto> productos = new ArrayList<>();
	try (Connection conn = ConexionBaseDatos.getInstance();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM producto")){
	    while (rs.next()) {		
		Producto p = new Producto();
		p.setID(rs.getInt(1));
		p.setNombre(rs.getString(2));
		p.setPrecio(rs.getFloat(3));
		productos.add(p);
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return productos;
    }
    public Producto findOne(int id){
	Producto p = null;
	try (Connection conn = ConexionBaseDatos.getInstance();
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM producto WHERE id = ?")){
	    stmt.setInt(1, id);
	    ResultSet rs = stmt.executeQuery();
	    if(rs.next()){
		p = new Producto();
		p.setID(rs.getInt(1));
		p.setNombre(rs.getString(2));
		p.setPrecio(rs.getFloat(3));
	    }
	    rs.close();
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return p;
    }
    
    public void create(Producto producto){
	try (Connection conn = ConexionBaseDatos.getInstance();
		PreparedStatement stmt = conn.prepareStatement("INSERT INTO producto(id,nombre,precio) VALUES(?,?,?)")){
		stmt.setInt(1, producto.getID());
		stmt.setString(2, producto.getNombre());
		stmt.setFloat(3, producto.getPrecio());
		stmt.executeUpdate();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
    
    public void update(Producto producto){
	try (Connection conn = ConexionBaseDatos.getInstance();
		PreparedStatement stmt = conn.prepareStatement("UPDATE producto SET nombre=?, precio=? WHERE id=?")){
		stmt.setString(1, producto.getNombre());
		stmt.setFloat(2, producto.getPrecio());
		stmt.setInt(3, producto.getID());
		stmt.executeUpdate();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
    
    public void delete(int id){
	try (Connection conn = ConexionBaseDatos.getInstance();
		PreparedStatement stmt = conn.prepareStatement("DELETE FROM producto WHERE id = ?")){
		stmt.setInt(1, id);
		stmt.executeUpdate();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
