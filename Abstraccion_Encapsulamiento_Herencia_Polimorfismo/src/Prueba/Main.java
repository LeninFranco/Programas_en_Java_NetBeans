package Prueba;

import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Personaje P1 = new Hechicero("Pato Lucas", 100, 25, 80, 50, 75);
        Personaje P2 = new Guerrero("Leonidas", 125, 90, 10, 85, 30);
        Personaje P3 = new Piromantico("Paco", 100, 75, 80, 70, 80);
        MostrarPersonaje(P1);
        System.out.println("");
        MostrarPersonaje(P2);
        System.out.println("");
        MostrarPersonaje(P3);
    }

    private static void MostrarPersonaje(Personaje P) {
        System.out.println(P.getAttributes());
        P.Saludo();
    }
}
