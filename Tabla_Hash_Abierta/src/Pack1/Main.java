package Pack1;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args){
	String Nombre, Grupo, Boleta, Promedio;
	Alumno a;
	Hash H = new Hash();
	int opc;
	do{
	    do{
		opc = Menu();
	    }while(opc<1||opc>5);
	    if(opc == 5){
		break;
	    }
	    switch(opc){
		case 1:
		    input.nextLine();
		    System.out.print("Ingrese el Nombre completo del alumno: ");
		    Nombre = input.nextLine();
		    System.out.print("Ingrese el grupo del alumno: ");
		    Grupo = input.nextLine();
		    System.out.print("Ingrese la boleta del alumno en el formato XXXXX (X son numeros): ");
		    Boleta = input.nextLine();
		    System.out.print("Ingrese el promedio del alumno: ");
		    Promedio = input.nextLine();
		    a = new Alumno(Nombre, Grupo, Boleta, Promedio);
		    H.Insert(a);
		break;
		case 2:
		    input.nextLine();
		    System.out.print("Ingrese la boleta del alumno en el formato XXXXX (X son numeros): ");
		    Boleta = input.nextLine();
		    a = new Alumno("","",Boleta,"");
		    H.Delete(a);
		break;
		case 3:
		    input.nextLine();
		    System.out.print("Ingrese la boleta del alumno en el formato XXXXX (X son numeros): ");
		    Boleta = input.nextLine();
		    a = new Alumno("","",Boleta,"");
		    H.Search(a);
		break;
		case 4:
		    H.Show();
		break;
	    }
	}while(opc != 5);
	System.out.println("Gracias por usarme");
    }
    
    private static int Menu(){
	System.out.println("--------REGISTRO DE ALUMNOS--------");
	System.out.println("Eliga una opcion del menu");
	System.out.println("1. Insertar nuevo alumno");
	System.out.println("2. Eliminar alumno existente");
	System.out.println("3. Buscar alumno por su boleta");
	System.out.println("4. Mostrar todos los alumnos");
	System.out.println("5. Salir");
	System.out.print(">>> ");
	int opcion = input.nextInt();
	return opcion;
    }
}
