package Models;

public class Cubo extends Figura{
    
    private double lado;
    
    public Cubo(double lado){
	super(0.0);
	this.lado = lado;
    }

    public double getLado() {
	return lado;
    }

    public void setLado(double lado) {
	this.lado = lado;
    }

    public double getVolumen() {
	return volumen;
    }

    public void setVolumen(double volumen) {
	this.volumen = volumen;
    }
    
    @Override
    public void calcularVolumen() {
	volumen = lado * lado * lado;
    }

    @Override
    public String toString() {
	return "El volumen del Cubo es: " + volumen;
    }
    
    
    
}
