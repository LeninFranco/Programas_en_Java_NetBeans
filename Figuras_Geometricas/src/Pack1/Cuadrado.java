package Pack1;

public class Cuadrado extends FiguraGeo{
    private double lado;

    public Cuadrado(double lado) {
	super("4");
	this.lado = lado;
    }

    @Override
    public double Area() {
	return lado * lado;
    }

    @Override
    public double Perimetro() {
	return 4*lado;
    }

    @Override
    public String toString() {
	return "Cuadrado = {"+super.toString()+", Lado: "+lado+"}";
    }
   
    
}
