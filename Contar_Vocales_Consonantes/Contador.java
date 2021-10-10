import java.util.Scanner;

public class Contador {
    
    private static Scanner input;
    
    public static void main(String[] args) {
	input = new Scanner(System.in);
	int ContVocales = 0, ContConsonantes = 0;
	System.out.print("Ingrese una palabra: ");
	String palabra = input.nextLine();
	for(char letra : palabra.toLowerCase().toCharArray()){
	    if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
		ContVocales++;
	    }
	    else{
		ContConsonantes++;
	    }
	}
	System.out.println("Numero de vocales: " + ContVocales + "\nNumero de consonantes: " + ContConsonantes);
    }
}
