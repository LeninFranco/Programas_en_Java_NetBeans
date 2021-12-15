package models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Entrada {
    private String codigo;
    private String fecha;
    private Integer unidades;
    private String codigoP;

    public Entrada() {
    }

    public Entrada(String codigo, Integer unidades, String codigoP) {
	this.codigo = codigo;
	this.unidades = unidades;
	this.codigoP = codigoP;
	SimpleDateFormat format = new SimpleDateFormat("YYYY-MM-dd");
	this.fecha = format.format(new Date());
    }

    public String getCodigo() {
	return codigo;
    }

    public void setCodigo(String codigo) {
	this.codigo = codigo;
    }

    public String getFecha() {
	return fecha;
    }

    public void setFecha(String fecha) {
	this.fecha = fecha;
    }

    public Integer getUnidades() {
	return unidades;
    }

    public void setUnidades(Integer unidades) {
	this.unidades = unidades;
    }

    public String getCodigoP() {
	return codigoP;
    }

    public void setCodigoP(String codigoP) {
	this.codigoP = codigoP;
    }

    @Override
    public String toString() {
	return "Entrada{" + "codigo=" + codigo + ", fecha=" + fecha + ", unidades=" + unidades + ", codigoP=" + codigoP + '}';
    }
    
}
