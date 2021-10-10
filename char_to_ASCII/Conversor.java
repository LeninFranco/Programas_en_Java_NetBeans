import java.util.Scanner;

public class Conversor {
    
    private static Scanner input;
    
    public static void main(String[] args) {
	input = new Scanner(System.in);
	System.out.print("Ingrese un caracter: ");
	char caracter = input.next().charAt(0);
	System.out.println("Codigo ASCII de " + caracter + " es: " + (int) caracter);
    }
}
