package Entrada_JOptionPane;

import javax.swing.*;

public class cadenas {
    public static void main(String[] args) {
        String cadena;
        int entero;
        char letra;
        double decimal;
        //input dialog es para poder escribir- entrada de datos
        cadena = JOptionPane.showInputDialog("digite una cadena :");
        entero = Integer.parseInt(JOptionPane.showInputDialog("el numero entero es :" ));
        letra =  JOptionPane.showInputDialog("digite un caracter:" ).charAt(0);
        decimal =Double.parseDouble(JOptionPane.showInputDialog("digite :"));
        //show message es para recibir la respuesta - salida de datos
        JOptionPane.showMessageDialog(null, "la cadena es:" + cadena);
        JOptionPane.showMessageDialog(null, "la cadena es:" + entero);
        JOptionPane.showMessageDialog(null, "la cadena es:" + letra);
        JOptionPane.showMessageDialog(null, "la cadena es:" + decimal);
    }
}
