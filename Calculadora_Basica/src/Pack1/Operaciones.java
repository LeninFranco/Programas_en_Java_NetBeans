package Pack1;

public class Operaciones {
    protected double n1;
    protected double n2;
    protected double resultado;
    protected char operador;

    public Operaciones(double n1, double n2, char operador) {
	this.n1 = n1;
	this.n2 = n2;
	this.operador = operador;
    }

    public double getN1() {
	return n1;
    }

    public double getN2() {
	return n2;
    }

    public double getResultado() {
	return resultado;
    }

    public char getOperador() {
	return operador;
    }
    
    public String MostrarResultado(){
	return n1+" "+operador+" "+n2+" = "+resultado;
    }
}
