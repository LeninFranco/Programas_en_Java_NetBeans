package models;

import database.ConexionDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class EntradaDB {
    
    public static List<Entrada> findAll(){
	List<Entrada> entradas = new ArrayList<>();
	try (Connection conn = ConexionDB.getInstance();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM entrada")){
	    while(rs.next()){
		Entrada e = new Entrada();
		e.setCodigo(rs.getString(1));
		e.setFecha(rs.getString(2));
		e.setUnidades(rs.getInt(3));
		e.setCodigoP(rs.getString(4));
		entradas.add(e);
	    }
	} catch (Exception e) {
	    e.printStackTrace();
	}
	return entradas;
    }
    
    public static void create(Entrada e){
	try (Connection conn = ConexionDB.getInstance();
		PreparedStatement stmt = conn.prepareStatement("INSERT INTO entrada(codigo, fecha, unidades, codigoP) VALUES(?,?,?,?)")){
		stmt.setString(1, e.getCodigo());
		stmt.setString(2, e.getFecha());
		stmt.setInt(3, e.getUnidades());
		stmt.setString(4, e.getCodigoP());
		stmt.executeUpdate();
	} catch (Exception ex) {
	    ex.printStackTrace();
	}
    }
}
