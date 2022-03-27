package models;

import db.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class UsuarioDAO {
    
    public static ArrayList<Usuario> selectAll(){
	ArrayList<Usuario> users = new ArrayList<>();
	try (Connection conn = ConexionDB.getInstance();
	     Statement stmt = conn.createStatement();
	     ResultSet rs = stmt.executeQuery("SELECT * FROM usuarios")){
	    while(rs.next()){
		Usuario u = new Usuario();
		u.setCodigo(rs.getString(1));
		u.setUsuario(rs.getString(2));
		u.setPassword(rs.getString(3));
		users.add(u);
	    }
	} catch (Exception e) {
	}
	return users;
    }
    
    public static Usuario selectOne(String codigo){
	Usuario u = null;
	try (Connection conn = ConexionDB.getInstance();
	     PreparedStatement stmt = conn.prepareStatement("SELECT * FROM usuarios WHERE codigo=?")){
	    stmt.setString(1, codigo);
	    ResultSet rs = stmt.executeQuery();
	    if(rs.next()){
		u = new Usuario();
		u.setCodigo(rs.getString(1));
		u.setUsuario(rs.getString(2));
		u.setPassword(rs.getString(3));
	    }
	    rs.close();
	} catch (Exception e) {
	}
	return u;
    }
    
    public static void create(Usuario u){
	try (Connection conn = ConexionDB.getInstance();
	     PreparedStatement stmt = conn.prepareStatement("INSERT INTO usuarios(codigo,usuario,contraseña) VALUES(?,?,?)")){
	    stmt.setString(1, u.getCodigo());
	    stmt.setString(2, u.getUsuario());
	    stmt.setString(3, u.getPassword());
	    stmt.executeUpdate();
	} catch (Exception e) {
	}
    }
    
    public static void delete(String codigo){
	try (Connection conn = ConexionDB.getInstance();
	     PreparedStatement stmt = conn.prepareStatement("DELETE FROM usuarios WHERE codigo=?")){
	    stmt.setString(1, codigo);
	    stmt.executeUpdate();
	} catch (Exception e) {
	}
    }
    
    public static void update(Usuario u){
	try (Connection conn = ConexionDB.getInstance();
	     PreparedStatement stmt = conn.prepareStatement("UPDATE usuarios SET usuario=?, contraseña=? WHERE codigo=?")){
	    stmt.setString(1, u.getUsuario());
	    stmt.setString(2, u.getPassword());
	    stmt.setString(3, u.getCodigo());
	    stmt.executeUpdate();
	} catch (Exception e) {
	}
    }
}
