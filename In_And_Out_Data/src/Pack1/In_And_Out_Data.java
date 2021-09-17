package Pack1;

import java.util.Scanner;

public class In_And_Out_Data {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int entero;
        float flotante;
        double doble;
        char simbolo;
        String cadena;
        System.out.print("Ingrese un entero: ");
        entero = input.nextInt();
        System.out.print("Ingrese un flotante: ");
        flotante = input.nextFloat();
        System.out.print("Ingrese un double: ");
        doble = input.nextDouble();
        System.out.print("Ingrese un simbolo o caracter: ");
        simbolo = input.next().charAt(0); 
        input.nextLine();//Limpiar Buffer del Teclado
        System.out.print("Ingrese una cadena: ");
        cadena = input.nextLine();
        System.out.println("Variable Int: "+entero);
        System.out.println("Variable Float: "+flotante);
        System.out.println("Variable Double: "+doble);
        System.out.println("Variable Char: "+simbolo);
        System.out.println("Variable String: "+cadena);
    }
}
