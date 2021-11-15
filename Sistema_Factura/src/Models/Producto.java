package Models;

public class Producto {
    private Integer ID;
    private String nombre;
    private Float precio;

    public Producto(Integer ID, String nombre, Float precio) {
	this.ID = ID;
	this.nombre = nombre;
	this.precio = precio;
    }

    public Producto() {
    }

    public Integer getID() {
	return ID;
    }

    public void setID(Integer ID) {
	this.ID = ID;
    }

    public String getNombre() {
	return nombre;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public Float getPrecio() {
	return precio;
    }

    public void setPrecio(Float precio) {
	this.precio = precio;
    }
    
}
