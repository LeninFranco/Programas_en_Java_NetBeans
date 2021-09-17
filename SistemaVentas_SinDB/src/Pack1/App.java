package Pack1;
import java.util.Scanner;

public class App {
    
    Scanner input = new Scanner(System.in);
    String frases[];
    int tam;
    
    public int leerEntero(){
	return input.nextInt();
    }
    
    public String leerCadena(){
	return input.nextLine();
    }
    
    public void setTamanio(int nro){
	frases = new String[nro];
	tam = nro;
    }
    
    public void leerTodasLasFrases(){
	for(int i = 0; i<tam ; i++){
	    System.out.print("Ingrese la frase "+(i+1)+": ");
	    frases[i] = leerCadena();
	}
    }
    
    public void procesarTodasLasFrases(){
	String[] aux;
	for(int i = 0; i<tam ; i++){
	    aux = frases[i].split(" ");
	    System.out.print("Caso #" + (i+1) +": ");
	    for(int j=aux.length-1;j>=0;j--){
		System.out.print(aux[j] + " ");
	    }
	    System.out.println("");
	}
    }
    
    public static void main(String[] args) {
	App obj = new App();
	obj.setTamanio(obj.leerEntero());
	obj.input.nextLine();
	obj.leerTodasLasFrases();
	obj.procesarTodasLasFrases();
    }
}
