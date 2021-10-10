import java.util.Scanner;

public class Factorial {
    
    private static Scanner input;
    
    private static double factorial(double numero){
	if(numero == 1){
	    return 1;
	}
	return numero * factorial(numero - 1);
    }
    
    public static void main(String[] args) {
	input = new Scanner(System.in);
	double numero;
	System.out.print("Ingrese un numero: ");
	numero = input.nextDouble();
	System.out.println("Su factorial es: " + factorial(numero));
    }
}
