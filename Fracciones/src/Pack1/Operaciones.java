package Pack1;

public class Operaciones {
    public static Fraccion Suma(Fraccion a, Fraccion b){
	int n = (a.getNumerador()*b.getDenominador())+(a.getDenominador()*b.getNumerador());
	int d = a.getDenominador()*b.getDenominador();
	Fraccion r = new Fraccion(n,d);
	return r;
    }
    public static Fraccion Resta(Fraccion a, Fraccion b){
	int n = (a.getNumerador()*b.getDenominador())-(a.getDenominador()*b.getNumerador());
	int d = a.getDenominador()*b.getDenominador();
	Fraccion r = new Fraccion(n,d);
	return r;
    }
    public static Fraccion Multiplicacion(Fraccion a, Fraccion b){
	int n = a.getNumerador()*b.getNumerador();
	int d = a.getDenominador()*b.getDenominador();
	Fraccion r = new Fraccion(n,d);
	return r;
    }
    public static Fraccion Division(Fraccion a, Fraccion b){
	int n = a.getNumerador()*b.getDenominador();
	int d = a.getDenominador()*b.getNumerador();
	Fraccion r = new Fraccion(n,d);
	return r;
    }
}
