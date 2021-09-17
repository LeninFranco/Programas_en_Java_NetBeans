package Pack1;

import javax.swing.JOptionPane;

public class Arrays {
    public static void main(String[] args) {
	/*
        ARRAY CON ELEMENTOS PREVIAMENTE DEFINIDOS
        tipo_dato nombre_array[] = { elem1, elem2, ...}
        ARRAY CON ELEMENTOS A DEFINIR POR EL USUARIO O EL MISMO PROGRAMA
        tipo_dato nombre_array[];
        nombre array[] = new tipo_dato[tamaño]
        */

        int numeros_naturales[] = {0,1,2,3,4,5,6,7,8,9};
        for(int i:numeros_naturales){
            System.out.println(i);
        }

        int tam, j=0;
        String Nombres[];
        tam = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño del arreglo"));
        Nombres = new String[tam];
        for(int i=0;i<tam;i++){
            Nombres[i] = JOptionPane.showInputDialog(null, "Ingrese un nombre", "Elemento "+i, JOptionPane.PLAIN_MESSAGE);
        }
        for (String i: Nombres) {
            JOptionPane.showMessageDialog(null, i, "Elemento "+j, JOptionPane.PLAIN_MESSAGE);
            j++;
        }
    }
}
