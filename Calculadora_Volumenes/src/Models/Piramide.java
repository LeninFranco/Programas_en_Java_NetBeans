package Models;

public class Piramide extends Figura{
    
    private double base;
    private double altura;

    public Piramide(double base, double altura) {
	super(0.0);
	this.base = base;
	this.altura = altura;
    }

    public double getBase() {
	return base;
    }

    public void setBase(double base) {
	this.base = base;
    }

    public double getAltura() {
	return altura;
    }

    public void setAltura(double altura) {
	this.altura = altura;
    }

    public double getVolumen() {
	return volumen;
    }

    public void setVolumen(double volumen) {
	this.volumen = volumen;
    }
    
    @Override
    public void calcularVolumen() {
	volumen = (base * base * altura)/3;
    }

    @Override
    public String toString() {
	return "El volumen de la Piramide es: " + volumen;
    }
    
    
}
