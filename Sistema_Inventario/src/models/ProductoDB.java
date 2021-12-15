package models;

import database.ConexionDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class ProductoDB {
    
    public static List<Producto> findAll(){
	List<Producto> productos = new ArrayList<>();
	try (Connection conn = ConexionDB.getInstance();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM producto")){
	    while(rs.next()){
		Producto p = new Producto();
		p.setCodigoP(rs.getString(1));
		p.setNombre(rs.getString(2));
		p.setEntrada(rs.getInt(3));
		p.setSalida(rs.getInt(4));
		p.setCantidad(rs.getInt(5));
		productos.add(p);
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return productos;
    }
    
    public static Producto findOne(String codigoP){
	Producto p = null;
	try (Connection conn = ConexionDB.getInstance();
		PreparedStatement stmt = conn.prepareStatement("SELECT * FROM producto WHERE codigoP = ?")){
	    stmt.setString(1, codigoP);
	    ResultSet rs = stmt.executeQuery();
	    if(rs.next()){
		p = new Producto();
		p.setCodigoP(rs.getString(1));
		p.setNombre(rs.getString(2));
		p.setEntrada(rs.getInt(3));
		p.setSalida(rs.getInt(4));
		p.setCantidad(rs.getInt(5));
	    }
	    rs.close();
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return p;
    }
    
    public static void create(Producto p){
	try (Connection conn = ConexionDB.getInstance();
		PreparedStatement stmt = conn.prepareStatement("INSERT INTO producto(codigoP, nombre, entrada, salida, cantidad) VALUES(?,?,?,?,?)")){
		stmt.setString(1, p.getCodigoP());
		stmt.setString(2, p.getNombre());
		stmt.setInt(3, p.getEntrada());
		stmt.setInt(4, p.getSalida());
		stmt.setInt(5, p.getCantidad());
		stmt.executeUpdate();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
    
    public static void update(Producto p){
	try (Connection conn = ConexionDB.getInstance();
		PreparedStatement stmt = conn.prepareStatement("UPDATE producto SET nombre=?, entrada=?, salida=?, cantidad=? WHERE codigoP=?")){
		stmt.setString(1, p.getNombre());
		stmt.setInt(2, p.getEntrada());
		stmt.setInt(3, p.getSalida());
		stmt.setInt(4, p.getCantidad());
		stmt.setString(5, p.getCodigoP());
		stmt.executeUpdate();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
    
    public static void delete(String codigoP){
	try (Connection conn = ConexionDB.getInstance();
		PreparedStatement stmt = conn.prepareStatement("DELETE FROM producto WHERE codigoP = ?")){
		stmt.setString(1, codigoP);
		stmt.executeUpdate();
	} catch (Exception e) {
	    e.printStackTrace();
	}
    }
}
