package sistema_banco;

import java.util.*;

public class Banco {
    private final ArrayList<Cliente> clientes = new ArrayList<>();

    public Banco() {
    }
    
    public void agregarCliente(String nombre, String apellido, double saldoInicial){
	clientes.add(new Cliente(nombre,apellido,new Cuenta(saldoInicial)));
    }
    
    private int obtenerIndice(String Ncuenta){
	int indice = 0;
	for(Cliente i:clientes){
	    if(i.getNcuenta().equals(Ncuenta)){
		return indice;
	    }
	    indice++;
	}
	return -1;
    }
    
    public void borrarCliente(String Ncuenta){
	int indice = obtenerIndice(Ncuenta);
	if(indice != -1){
	    clientes.remove(indice);
	    System.out.println("Se elimino al cliente correctamente");
	}
	else{
	    System.out.println("No se encontro al cliente con el Numero de Cuenta: "+Ncuenta);
	}
    }
    
    public Cliente obtenerCliente(String Ncuenta){
	int indice = obtenerIndice(Ncuenta);
	if(indice != -1){
	    return clientes.get(indice);
	}
	return null;
    }
    
        
    public int obtenerNumClientes(){
	return clientes.size();
    }
    
    public void imprimirClientes(){
	for(Cliente i:clientes){
	    System.out.println(i.toString());
	    System.out.println("-------------------------------------------");
	}
    }
    
}
