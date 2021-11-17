package Models;

public abstract class Figura {
    
    protected double volumen;
    
    public Figura(double volumen){
	this.volumen = volumen;
    }
    
    public abstract void calcularVolumen();
}
