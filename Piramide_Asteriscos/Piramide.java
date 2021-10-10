import java.util.Scanner;

public class Piramide {
    
    private static Scanner input;
    
    public static void main(String[] args) {
	      input = new Scanner(System.in);
	      int Altura, NumAsteriscos = 1, NumEspacios;
	      System.out.print("Ingrese la altura de la piramide: "); 
	      Altura = input.nextInt();
	      if(Altura > 0){
	          NumEspacios = Altura - 1;
	          for(int i = 0; i < Altura; i++){
		            for(int j = 0; j < NumEspacios; j++) System.out.print(" ");
		            for(int j = 0; j < NumAsteriscos; j++) System.out.print("*");
		            NumEspacios--;
	            	NumAsteriscos += 2;
		            System.out.println("");
	          }
	      }
    }
}
