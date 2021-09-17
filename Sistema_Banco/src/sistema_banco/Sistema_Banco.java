package sistema_banco;

import java.util.*;

public class Sistema_Banco {

    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
	Integer opc1, opc2;
	String Nombre, Apellido, Ncuenta;
	double saldoInicial, monto;
	Banco bankito = new Banco();
	do{
	    opc1 = Menu_Banco();
	    switch(opc1){
		case 1:
		    System.out.print("Ingrese el Nombre del cliente: ");
		    Nombre = input.nextLine();
		    System.out.print("Ingrese el Apellido del cliente: ");
		    Apellido = input.nextLine();
		    System.out.print("Ingrese el saldo inicial: $");
		    saldoInicial = input.nextDouble();
		    bankito.agregarCliente(Nombre, Apellido, saldoInicial);
		    System.out.println("Cliente registrado correctamente");
		    input.nextLine();
		break;
		case 2:
		    System.out.print("Ingrese el Numero de Cuenta del cliente: ");
		    Ncuenta = input.nextLine();
		    if(bankito.obtenerCliente(Ncuenta) != null){
			System.out.println("Se ha encontrado al Cliente");
			System.out.println(bankito.obtenerCliente(Ncuenta).toString());
		    }
		    else{
			System.out.println("No se encontro al cliente con el Numero de Cuenta: "+Ncuenta);
		    }
		    input.nextLine();
		break;
		case 3:
		    System.out.print("Ingrese el Numero de Cuenta del cliente: ");
		    Ncuenta = input.nextLine();
		    bankito.borrarCliente(Ncuenta);
		    input.nextLine();
		break;
		case 4:
		    bankito.imprimirClientes();
		    input.nextLine();
		break;
		case 5:
		    System.out.print("Ingrese el Numero de Cuenta del cliente: ");
		    Ncuenta = input.nextLine();
		    if(bankito.obtenerCliente(Ncuenta) != null){
			do{
			    opc2 = Menu_Cliente();
			    switch(opc2){
				case 1:
				    System.out.print("Ingrese el monto a depositar: $");
				    monto = input.nextDouble();
				    bankito.obtenerCliente(Ncuenta).getCuenta().Depositar(monto);
				    System.out.println("Se ha realizado la transaccion correctamente");
				    input.nextLine();
				break;
				case 2:
				    System.out.print("Ingrese el monto a depositar: $");
				    monto = input.nextDouble();
				    bankito.obtenerCliente(Ncuenta).getCuenta().Retirar(monto);
				    System.out.println("Se ha realizado la transaccion correctamente");
				    input.nextLine();
				break;
			    }
			}while(opc2 != 3);
		    }
		    else{
			System.out.println("No se encontro al cliente con el Numero de Cuenta: "+Ncuenta);
			input.nextLine();
		    }
		break;
	    }
	}while(opc1 != 6);
    }
    
    private static Integer Menu_Banco(){
	Integer opc;
	System.out.println("1. Agregar Cliente al Sistema");
	System.out.println("2. Buscar a un Cliente");
	System.out.println("3. Eliminar a un Cliente");
	System.out.println("4. Mostrar lista de Clientes");
	System.out.println("5. Transacciones de un Cliente");
	System.out.println("6. Salir");
	System.out.print("Opcion: ");
	String temp = input.nextLine();
	if(isNumeric(temp)){
	    opc = Integer.parseInt(temp);
	    return opc;
	}
	else{
	    return -1;
	}
    }
    
    private static Integer Menu_Cliente(){
	Integer opc;
	System.out.println("1. Depositar a Cuenta");
	System.out.println("2. Retirar a Cuenta");
	System.out.println("3. Salir");
	System.out.print("Opcion: ");
	String temp = input.nextLine();
	if(isNumeric(temp)){
	    opc = Integer.parseInt(temp);
	    return opc;
	}
	else{
	    return -1;
	}
    }
    
    private static boolean isNumeric(String var){
	try{
	    Integer.parseInt(var);
	    return true;
	}
	catch(NumberFormatException e){
	    return false;
	}
    }

}
