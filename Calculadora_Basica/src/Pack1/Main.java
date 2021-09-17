package Pack1;

import java.io.IOException;
import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
	Operaciones suma, resta, producto, division; 
	String n1,n2,opcion;
	int opc = 0;
	double num1 = 0,num2 = 0;
	do{
	    System.out.println("---------------MENU DE LA CALCULADORA BASICA---------------");
	    System.out.println("1. Suma");
	    System.out.println("2. Resta");
	    System.out.println("3. Multiplicacion");
	    System.out.println("4. Division");
	    System.out.println("5. Salir");
	    System.out.print("Opcion: ");
	    opcion = input.nextLine();
	    if(!isInteger(opcion)){
		continue;
	    }
	    opc = Integer.parseInt(opcion);
	    switch(opc){
		case 1:
		    System.out.print("Ingrese el primer numero: ");
		    n1 = input.nextLine();
		    System.out.print("Ingrese el segundo numero: ");
		    n2 = input.nextLine();
		    if(isDouble(n1)&&isDouble(n2)){
			num1 = Double.parseDouble(n1); 
			num2 = Double.parseDouble(n2);
			suma = new Suma(num1,num2);
			System.out.println("Resultado: "+suma.MostrarResultado());
		    }
		    else{
			System.out.println("Favor de ingresar datos numericos");
		    }
		break;
		case 2:
		    System.out.print("Ingrese el primer numero: ");
		    n1 = input.nextLine();
		    System.out.print("Ingrese el segundo numero: ");
		    n2 = input.nextLine();
		    if(isDouble(n1)&&isDouble(n2)){
			num1 = Double.parseDouble(n1); 
			num2 = Double.parseDouble(n2);
			resta = new Resta(num1,num2);
			System.out.println("Resultado: "+resta.MostrarResultado());
		    }
		    else{
			System.out.println("Favor de ingresar datos numericos");
		    }
		break;
		case 3:
		    System.out.print("Ingrese el primer numero: ");
		    n1 = input.nextLine();
		    System.out.print("Ingrese el segundo numero: ");
		    n2 = input.nextLine();
		    if(isDouble(n1)&&isDouble(n2)){
			num1 = Double.parseDouble(n1); 
			num2 = Double.parseDouble(n2);
			producto = new Multiplicacion(num1,num2);
			System.out.println("Resultado: "+producto.MostrarResultado());
		    }
		    else{
			System.out.println("Favor de ingresar datos numericos");
		    }
		break;
		case 4:
		    System.out.print("Ingrese el primer numero: ");
		    n1 = input.nextLine();
		    System.out.print("Ingrese el segundo numero: ");
		    n2 = input.nextLine();
		    if(isDouble(n1)&&isDouble(n2)){
			num1 = Double.parseDouble(n1); 
			num2 = Double.parseDouble(n2);
			division = new Division(num1,num2);
			System.out.println("Resultado: "+division.MostrarResultado());
		    }
		    else{
			System.out.println("Favor de ingresar datos numericos");
		    }
		break;
	    }
	}while(opc!=5);
    }
    
    private static boolean isInteger(String x){
	try{
	    Integer.parseInt(x);
	    return true;
	}
	catch(NumberFormatException e){
	    return false;
	}
    }
    
    private static boolean isDouble(String x){
	try{
	    Double.parseDouble(x);
	    return true;
	}
	catch(NumberFormatException e){
	    return false;
	}
    }
}
