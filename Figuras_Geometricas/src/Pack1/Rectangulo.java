package Pack1;

public class Rectangulo extends FiguraGeo{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
	super("4");
	this.base = base;
	this.altura = altura;
    }

    @Override
    public double Area() {
	return base * altura;
    }

    @Override
    public double Perimetro() {
	return (2*base)+(2*altura);
    }
    
    @Override
    public String toString() {
	return "Rectangulo = {"+super.toString()+", Base: "+base+", Altura: "+altura+"}";
    }
}
