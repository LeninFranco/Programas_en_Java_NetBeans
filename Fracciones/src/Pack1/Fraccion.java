package Pack1;

public class Fraccion implements Comparable<Fraccion>{
    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
	if(numerador < 0 && denominador < 0){
	    this.numerador = (-numerador);
	    this.denominador = (-denominador);
	}
	else{
	    this.numerador = numerador;
	    this.denominador = denominador;
	}
    }
    
    public Fraccion(int entero){
	this.numerador = entero;
	this.denominador = 1;
    }

    public int getNumerador() {
	return numerador;
    }

    public int getDenominador() {
	return denominador;
    }

    public void setNumerador(int numerador) {
	this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
	this.denominador = denominador;
    }
    
    private int MCD(int a, int b){
	int r = a%b;
	if(r == 0){
	    return b;
	}
	return MCD(b,r);
    }
    
    public void Simplificar(){
	int mcd = MCD(numerador, denominador);
	numerador = (numerador/mcd);
	denominador = (denominador/mcd);
    }
    
    public double Decimal(){
	double a = numerador;
	double b = denominador;
	return a/b;
    }
    
    public boolean equals(Fraccion f){
	return numerador == f.getNumerador() && denominador == f.getDenominador();
    }
    
    @Override
    public int compareTo(Fraccion f){
	if(equals(f)){
	    return 0;
	}
	if(Decimal() < f.Decimal()){
	    return -1;
	}
	else{
	    return 1;
	}
    }

    @Override
    public String toString() {
	return numerador+"/"+denominador;
    }
    
}
