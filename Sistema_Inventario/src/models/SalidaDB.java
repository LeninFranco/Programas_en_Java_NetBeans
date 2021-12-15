package models;

import database.ConexionDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class SalidaDB {
    public static List<Salida> findAll(){
	List<Salida> salidas = new ArrayList<>();
	try (Connection conn = ConexionDB.getInstance();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM salida")){
	    while(rs.next()){
		Salida s = new Salida();
		s.setCodigo(rs.getString(1));
		s.setFecha(rs.getString(2));
		s.setUnidades(rs.getInt(3));
		s.setCodigoP(rs.getString(4));
		salidas.add(s);
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return salidas;
    }
    
    public static void create(Salida s){
	try (Connection conn = ConexionDB.getInstance();
		PreparedStatement stmt = conn.prepareStatement("INSERT INTO salida(codigo, fecha, unidades, codigoP) VALUES(?,?,?,?)")){
		stmt.setString(1, s.getCodigo());
		stmt.setString(2, s.getFecha());
		stmt.setInt(3, s.getUnidades());
		stmt.setString(4, s.getCodigoP());
		stmt.executeUpdate();
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
    }
}
