package Models;

public class Detalle {
    private Integer id;
    private String nombre;
    private Float precio;
    private Integer cantidad;
    private Float subtotal;

    public Detalle() {
    }

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
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

    public Integer getCantidad() {
	return cantidad;
    }

    public void setCantidad(Integer cantidad) {
	this.cantidad = cantidad;
    }

    public Float getSubtotal() {
	return subtotal;
    }

    public void setSubtotal(Float subtotal) {
	this.subtotal = subtotal;
    }
 
}
