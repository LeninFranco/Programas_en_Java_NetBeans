package Pack1;

import javax.swing.JOptionPane;

public class Main {
    
    public static void main(String[] args) {
        ShowMessage();
        ShowInput();
        ShowConfirm();
        ShowOption();
    }
    
    private static void ShowMessage(){
        //JOptionPane.showMessageDialog(COMPONENTE,MENSAJE,TITULO,TIPO DE MENSAJE, ICONO)
        JOptionPane.showMessageDialog(null, "Hola");
        JOptionPane.showMessageDialog(null, "ERROR", "Usando Error", JOptionPane.ERROR_MESSAGE);
        JOptionPane.showMessageDialog(null, "ADVERTENCIA", "Usando Warning", JOptionPane.WARNING_MESSAGE);
        JOptionPane.showMessageDialog(null, "Hola", "Sin Icono", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Este es una ventana", "Usando Information", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "¿Eres Humano?", "Usando Question", JOptionPane.QUESTION_MESSAGE);
    }
    
    private static void ShowInput(){
        //JOptionPane.showInputDialog(COMPONENTE,MENSAJE,TITULO,TIPO DE MENSAJE,ICONO,ARREGLO,VALOR INCIAL)
        int entero;
        float flotante;
        double doble;
        char simbolo;
        String cadena, Consola;
        String Objetos[] = {"Ninguna","Xbox","PlayStation","Nintento Switch"};
        //Entrada de Datos por Teclado
        entero = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un entero", "Entrada de Entero", JOptionPane.PLAIN_MESSAGE));
        flotante = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese un Flotante", "Entrada de Flotante", JOptionPane.PLAIN_MESSAGE));
        doble = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese un Double", "Entrada de Double", JOptionPane.PLAIN_MESSAGE));
        simbolo = JOptionPane.showInputDialog(null, "Ingrese un Simbolo o Caracter", "Entrada de Simbolo/Caracter",JOptionPane.PLAIN_MESSAGE).charAt(0);
        cadena = JOptionPane.showInputDialog(null, "Ingrese una Cadena", "Entrada de String",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Variable Int: "+entero, "Salida de Entero", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Variable Float: "+flotante, "Salida de Flotante", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Variable Double: "+doble, "Salida de Double", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Variable Char: "+simbolo, "Salida de Simbolo/Caracter", JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null, "Variable String: "+cadena, "Salida de Cadena", JOptionPane.PLAIN_MESSAGE);
        //Entrada de Datos por ComboBox
        Consola = JOptionPane.showInputDialog(null, "¿Que consola tienes?", "Consola", JOptionPane.QUESTION_MESSAGE, null, Objetos, "Ninguna").toString();
        JOptionPane.showMessageDialog(null, "Tu respuesta fue: "+Consola, "¿Que consola tienes?", JOptionPane.INFORMATION_MESSAGE);
    }
    
    private static void ShowConfirm(){
        //JOptionPnae.showConfirmDialog(COMPONENTE,MENSAJE,TITULO,TIPO DE OPCION, TIPO DE MENSAJE, ICONO)
        /*
        TIPOS DE OPCION:
            JOptionPane.DEFAULT_OPTION -> ACEPTAR
            JOptionPane.YES_NO_OPTION -> SI/NO
            JOptionPane.YES_NO_CANCEL_OPTION -> SI/NO/CANCELAR
            JOptionPane.OK_CANCEL_OPTION -> ACEPTAR/CANCELAR
        SALIDAS ENTERAS:
            0: ACEPTAR, SI
            1: NO
            2: CANCEALAR 
        */
        Integer Opc;
        Opc = JOptionPane.showConfirmDialog(null, "Te quiero", "Opcion", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, Opc, "Salida",JOptionPane.PLAIN_MESSAGE);
        Opc = JOptionPane.showConfirmDialog(null, "¿Te gustan los tacos?", "Opcion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, Opc, "Salida",JOptionPane.PLAIN_MESSAGE);
        Opc = JOptionPane.showConfirmDialog(null, "¿Te gustan los tacos?", "Opcion", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, Opc, "Salida",JOptionPane.PLAIN_MESSAGE);
        Opc = JOptionPane.showConfirmDialog(null, "Te quiero", "Opcion", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        JOptionPane.showMessageDialog(null, Opc, "Salida",JOptionPane.PLAIN_MESSAGE);
    }
    
    private static void ShowOption(){
        //JOptionPane.showOptionDialog(COMPONENTE,MENSAJE,TITULO,TIPO DE OPCION, TIPO DE MENSAJE, ICONO, ARREGLO, VALOR SELECCIONADO)
        String Consolas[] = {"Xbox", "PlayStation", "NIntendo", "PC", "NInguna"};
        int opc = JOptionPane.showOptionDialog(null, "¿Que plataforma usas para jugar?", "Opcion", 0, JOptionPane.QUESTION_MESSAGE, null, Consolas, "Ninguno");
        JOptionPane.showMessageDialog(null, "Numero del Arreglo: "+opc+"\nValor del Arreglo: "+Consolas[opc], "Salida", JOptionPane.PLAIN_MESSAGE);
    }
}
