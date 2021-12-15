package models;

public class Producto {
    
    private String codigoP;
    private String nombre;
    private Integer entrada;
    private Integer salida;
    private Integer cantidad;

    public Producto() {
    }
    
    public Producto(String codigoP, String nombre) {
	this.codigoP = codigoP;
	this.nombre = nombre;
	this.entrada = 0;
	this.salida = 0;
	this.cantidad = 0;
    }
    
    public void actualizarCantidad(){
	cantidad = entrada - salida;
    }
    
    public void comprar(Integer unidades){
	entrada += unidades;
	actualizarCantidad();
    }
    
    public void vender(Integer unidades){
	if(unidades <= cantidad){
	    salida += unidades;
	    actualizarCantidad();
	}
    }

    public String getCodigoP() {
	return codigoP;
    }

    public String getNombre() {
	return nombre;
    }

    public Integer getEntrada() {
	return entrada;
    }

    public Integer getSalida() {
	return salida;
    }

    public Integer getCantidad() {
	return cantidad;
    }

    public void setCodigoP(String codigoP) {
	this.codigoP = codigoP;
    }

    public void setNombre(String nombre) {
	this.nombre = nombre;
    }

    public void setEntrada(Integer entrada) {
	this.entrada = entrada;
    }

    public void setSalida(Integer salida) {
	this.salida = salida;
    }

    public void setCantidad(Integer cantidad) {
	this.cantidad = cantidad;
    }

    @Override
    public String toString() {
	return "Producto{" + "codigoP=" + codigoP + ", nombre=" + nombre + ", entrada=" + entrada + ", salida=" + salida + ", cantidad=" + cantidad + '}';
    }
    
}
