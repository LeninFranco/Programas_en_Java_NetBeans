package Models;

public class Cilindro extends Figura{
    
    private double radio;
    private double altura;

    public Cilindro(double radio, double altura) {
	super(0.0);
	this.radio = radio;
	this.altura = altura;
    }

    public double getRadio() {
	return radio;
    }

    public void setRadio(double radio) {
	this.radio = radio;
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
	volumen = Math.PI * radio * radio * altura;
    }

    @Override
    public String toString() {
	return "El volumen del Cilindro es: " + volumen;
    }

}
