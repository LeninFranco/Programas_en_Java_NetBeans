package Pack1;

public class Circulo extends FiguraGeo{
    private double radio;

    public Circulo(double radio) {
	super("0");
	this.radio = radio;
    }

    @Override
    public double Area() {
	return Math.PI*(Math.pow(radio, 2));
    }

    @Override
    public double Perimetro() {
	return Math.PI*(2*radio);
    }

    @Override
    public String toString() {
	return "Circulo = {"+super.toString()+", Radio: "+radio+"}";
    }
    
}
