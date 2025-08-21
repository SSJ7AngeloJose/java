package entradasalidadatos;

import javax.swing.*;

public class Entrada_SalidaDatos {

    public static void main(String[] args) {

        String Cadena;
        int entero;
        char letra;
        double decimal;

        Cadena = JOptionPane.showInputDialog("Introduzca una cadena de texto:");
        entero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un número entero:"));
        letra = JOptionPane.showInputDialog("digite una letra").charAt(0);
        decimal = Double.parseDouble(JOptionPane.showInputDialog("introduzca nuemro decimal:"));

        //dos opciones para mostrar resultados tanto consola o en el dialog
       // System.out.println("los datos ingresados son:" + Cadena  + entero   + letra     + decimal);

        JOptionPane.showMessageDialog(null, "ingrese los datos : " + Cadena);
        JOptionPane.showMessageDialog(null, "ingrese el numero ; " + entero);
        JOptionPane.showMessageDialog(null, "ingrese la letra : " + letra);
        JOptionPane.showMessageDialog(null, "ingrese el numero decimal : " + decimal);



    }
}
