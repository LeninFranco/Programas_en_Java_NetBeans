package Models;

public class Esfera extends Figura{
    
    private double radio;

    public Esfera(double radio) {
	super(0.0);
	this.radio = radio;
    }

    public double getRadio() {
	return radio;
    }

    public void setRadio(double radio) {
	this.radio = radio;
    }

    public double getVolumen() {
	return volumen;
    }

    public void setVolumen(double volumen) {
	this.volumen = volumen;
    }
    
    @Override
    public void calcularVolumen() {
	volumen = (4 * Math.PI * radio * radio * radio) / 3;
    }

    @Override
    public String toString() {
	return "El volumen de la esfera es: " + volumen;
    }
    
}
