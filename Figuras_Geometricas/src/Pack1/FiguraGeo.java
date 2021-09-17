package Pack1;

public abstract class FiguraGeo {
    protected String NLados;

    public FiguraGeo(String NLados) {
	this.NLados = NLados;
    }

    public String getNLados() {
	return NLados;
    }

    @Override
    public String toString() {
	return "Numero de Lados: "+NLados;
    }
    
    public abstract double Area();
    public abstract double Perimetro();
    
    
}
