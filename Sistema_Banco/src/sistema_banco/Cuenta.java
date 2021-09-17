package sistema_banco;

public class Cuenta {
    private double saldo;

    public Cuenta(double saldoInicial) {
	this.saldo = saldoInicial;
    }
    
    public double ConsultarSaldo(){
	return this.saldo;
    }
    
    public void Depositar(double monto){
	if(monto < 0){
	    System.out.println("El monto debe ser un valor positivo");
	}
	else{
	    this.saldo += monto;
	}
    }
    
    public void Retirar(double monto){
	if(monto < 0){
	    System.out.println("El monto debe ser un valor positivo");
	}
	else if(this.saldo < monto){
	    System.out.println("Saldo Insuficiente");
	}
	else{
	    this.saldo -= monto;
	}
    }
    
}
