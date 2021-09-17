package sistema_banco;

public class Cliente {
    private String nombre;
    private String apellido;
    private String Ncuenta;
    private Cuenta cuenta;

    public Cliente(String nombre, String apellido, Cuenta cuenta) {
	this.nombre = nombre;
	this.apellido = apellido;
	this.Ncuenta = GenNcuenta();
	this.cuenta = cuenta;
    }
    
    private String GenNcuenta(){
	int num = (int) (Math.random()*(99-10+1)+10);
	return String.valueOf(apellido.toUpperCase().charAt(0))+String.valueOf(nombre.toUpperCase().charAt(0))+String.valueOf(nombre.toUpperCase().charAt(1))+String.valueOf(apellido.toUpperCase().charAt(1))+String.valueOf(num);
    }

    public String getNombre() {
	return this.nombre;
    }

    public String getApellido() {
	return this.apellido;
    }

    public String getNcuenta() {
	return this.Ncuenta;
    }

    public Cuenta getCuenta() {
	return this.cuenta;
    }

    @Override
    public String toString() {
	return "Nombre: "+this.nombre+"\nApellido: "+this.apellido+"\nNumero de Cuenta: "+this.Ncuenta+"\nSaldo Actual: $"+this.cuenta.ConsultarSaldo();
    }
    
}
