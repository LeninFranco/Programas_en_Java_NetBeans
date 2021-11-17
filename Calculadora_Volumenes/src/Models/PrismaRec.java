package Models;

public class PrismaRec extends Figura{
    
    private double base;
    private double altura_base;
    private double altura;

    public PrismaRec(double base, double altura_base, double altura) {
	super(0.0);
	this.base = base;
	this.altura_base = altura_base;
	this.altura = altura;
    }

    public double getBase() {
	return base;
    }

    public void setBase(double base) {
	this.base = base;
    }

    public double getAltura_base() {
	return altura_base;
    }

    public void setAltura_base(double altura_base) {
	this.altura_base = altura_base;
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
	volumen = base * altura_base * altura;
    }

    @Override
    public String toString() {
	return "El volumen del Prisma Rectangular es: " + volumen;
    }
    
    
    
}
