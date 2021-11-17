package Main;

import Models.*;
import javax.swing.JOptionPane;

public class App {
    
    private static Figura cilindro, cono, cubo, esfera, piramide, prismaRec;
    
    private static String opciones[] = {"Cilindro", "Cono", "Cubo", "Esfera", "Piramide", "Prisma Rectangular"}; 
    
    public static void main(String[] args) {
	while (true) {	 
	    try {
		String seleccion = JOptionPane.showInputDialog(null, "Seleccione una figura", "Calculadora Volumenes", JOptionPane.QUESTION_MESSAGE, null, opciones, "Salir").toString();
		switch(seleccion){
		    case "Cilindro":
			opcCilindro();
		    break;
		    case "Cono":
			opcCono();
		    break;
		    case "Cubo":
			opcCubo();
		    break;
		    case "Esfera":
			opcEsfera();
		    break;
		    case "Piramide":
			opcPiramide();
		    break;
		    case "Prisma Rectangular":
			opcPrisma();
		    break;
		}
	    } catch (Exception e) {
		JOptionPane.showMessageDialog(null,"Gracias por usarme", "Adios", JOptionPane.INFORMATION_MESSAGE);
		break;
	    }
	}
    }
    
    private static void opcCilindro(){
	try {
	    double radio = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el radio", "Cilindro",JOptionPane.PLAIN_MESSAGE));
	    double altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la altura", "Cilindro", JOptionPane.PLAIN_MESSAGE));
	    cilindro = new Cilindro(radio, altura);
	    cilindro.calcularVolumen();
	    JOptionPane.showMessageDialog(null, cilindro, "Cilindro", JOptionPane.INFORMATION_MESSAGE);
	} catch (Exception e) {
	    JOptionPane.showMessageDialog(null, "Proceso Cancelado", "Cilindro", JOptionPane.ERROR_MESSAGE);
	}
    }
    
    private static void opcCono(){
	try {
	    double radio = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el radio", "Cono",JOptionPane.PLAIN_MESSAGE));
	    double altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la altura", "Cono", JOptionPane.PLAIN_MESSAGE));
	    cono = new Cono(radio, altura);
	    cono.calcularVolumen();
	    JOptionPane.showMessageDialog(null, cono, "Cono", JOptionPane.INFORMATION_MESSAGE);
	} catch (Exception e) {
	    JOptionPane.showMessageDialog(null, "Proceso Cancelado", "Cono", JOptionPane.ERROR_MESSAGE);
	}
    }
    
    private static void opcCubo(){
	try {
	    double lado = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la longitud de uno de los lados", "Cubo",JOptionPane.PLAIN_MESSAGE));
	    cubo = new Cubo(lado);
	    cubo.calcularVolumen();
	    JOptionPane.showMessageDialog(null, cubo, "Cubo", JOptionPane.INFORMATION_MESSAGE);
	} catch (Exception e) {
	    JOptionPane.showMessageDialog(null, "Proceso Cancelado", "Cubo", JOptionPane.ERROR_MESSAGE);
	}
    }
    
    private static void opcEsfera(){
	try {
	    double radio = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese el radio", "Esfera",JOptionPane.PLAIN_MESSAGE));
	    esfera = new Esfera(radio);
	    esfera.calcularVolumen();
	    JOptionPane.showMessageDialog(null, esfera, "Esfera", JOptionPane.INFORMATION_MESSAGE);
	} catch (Exception e) {
	    JOptionPane.showMessageDialog(null, "Proceso Cancelado", "Esfera", JOptionPane.ERROR_MESSAGE);
	}
    }
    
    private static void opcPiramide(){
	try {
	    double base = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la longitud de la base", "Piramide",JOptionPane.PLAIN_MESSAGE));
	    double altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la altura", "Piramide", JOptionPane.PLAIN_MESSAGE));
	    piramide = new Piramide(base, altura);
	    piramide.calcularVolumen();
	    JOptionPane.showMessageDialog(null, piramide, "Piramide", JOptionPane.INFORMATION_MESSAGE);
	} catch (Exception e) {
	    JOptionPane.showMessageDialog(null, "Proceso Cancelado", "Piramide", JOptionPane.ERROR_MESSAGE);
	}
    }
    
    private static void opcPrisma(){
	try {
	    double base = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la longitud de la base", "Prisma Rectangular",JOptionPane.PLAIN_MESSAGE));
	    double altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la altura", "Prisma Rectangular", JOptionPane.PLAIN_MESSAGE));
	    double altura_base = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese la altura de la base", "Prisma Rectangular", JOptionPane.PLAIN_MESSAGE));
	    prismaRec = new PrismaRec(base, altura_base, altura);
	    prismaRec.calcularVolumen();
	    JOptionPane.showMessageDialog(null, prismaRec, "Prisma Rectangular", JOptionPane.INFORMATION_MESSAGE);
	} catch (Exception e) {
	    JOptionPane.showMessageDialog(null, "Proceso Cancelado", "Prisma Rectangular", JOptionPane.ERROR_MESSAGE);
	}
    }
    
}
