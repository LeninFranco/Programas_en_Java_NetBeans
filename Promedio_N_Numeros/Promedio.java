import java.util.Scanner;

public class Promedio {
    
    private static Scanner input;
    
    public static void main(String[] args) {
	input = new Scanner(System.in);
	int contador = 0;
	float dato, suma = 0;
	System.out.println("Ingrese los numeros a promediar. Para detener el proceso ingrese un 0");
	while(true){
	   System.out.print("Numero " + (contador + 1) + ": ");
	   dato = input.nextFloat();
	   if(dato == 0) break;
	   suma += dato;
	   contador++; 
	}
	if(suma == 0) System.out.println("Promedio = 0");
	else System.out.println("Promedio = " + (suma/contador));
    }
}
