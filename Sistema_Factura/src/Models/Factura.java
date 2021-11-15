package Models;

public class Factura {
    private Integer codigo;
    private String fecha;
    private String metodoPago;

    public Factura() {
    }

    public Integer getCodigo() {
	return codigo;
    }

    public void setCodigo(Integer codigo) {
	this.codigo = codigo;
    }

    public String getFecha() {
	return fecha;
    }

    public void setFecha(String fecha) {
	this.fecha = fecha;
    }

    public String getMetodoPago() {
	return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
	this.metodoPago = metodoPago;
    }

}
