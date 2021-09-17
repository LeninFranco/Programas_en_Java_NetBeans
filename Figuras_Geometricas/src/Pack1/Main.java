package Pack1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
	ArrayList<FiguraGeo> list = new ArrayList<>();
	FiguraGeo v1 = new Cuadrado(5);
	FiguraGeo v2 = new Rectangulo(8,4);
	FiguraGeo v3 = new Triangulo(5,6,7);
	FiguraGeo v4 = new Circulo(3);
	list.add(v1);
	list.add(v2);
	list.add(v3);
	list.add(v4);
	
	for(FiguraGeo i:list){
	    System.out.println("Figura: "+i.toString()+"\nArea: "+i.Area()+"\nPerimetro: "+i.Perimetro());
	    System.out.println("");
	}
    }
}
