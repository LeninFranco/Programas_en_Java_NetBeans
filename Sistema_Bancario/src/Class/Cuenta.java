package Class;

public class Cuenta {
    
    private Integer NumCuenta;
    private String Titular;
    private String Password;
    private float Saldo;

    public Cuenta(Integer NumCuenta, String Titular, String Password, float Saldo) {
	this.NumCuenta = NumCuenta;
	this.Titular = Titular;
	this.Password = Password;
	this.Saldo = Saldo;
    }
    
    public Cuenta(){
	
    }

    public Integer getNumCuenta() {
	return NumCuenta;
    }

    public void setNumCuenta(Integer NumCuenta) {
	this.NumCuenta = NumCuenta;
    }

    public String getTitular() {
	return Titular;
    }

    public void setTitular(String Titular) {
	this.Titular = Titular;
    }

    public String getPassword() {
	return Password;
    }

    public void setPassword(String Password) {
	this.Password = Password;
    }

    public float getSaldo() {
	return Saldo;
    }

    public void setSaldo(float Saldo) {
	this.Saldo = Saldo;
    }
    
    public void Depositar(float Saldo){
	this.Saldo += Saldo;
    }
    
    public void Retirar(float Saldo){
	if(this.Saldo > Saldo){
	    this.Saldo -= Saldo;
	}
    }
    
    
}
