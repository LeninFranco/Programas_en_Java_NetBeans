package Pack1;

import java.util.*;

public class Main {
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
	Fraccion f1 = new Fraccion(-2,5);
	Fraccion f2 = new Fraccion(7,-8);
	Fraccion f3 = new Fraccion(1,2);
	Fraccion f4 = new Fraccion(2,3);
	Fraccion f5 = new Fraccion(-3,-4);
	
	Fraccion r = Operaciones.Suma(f3, f4);
	System.out.println(r.toString());
    }
    
}
