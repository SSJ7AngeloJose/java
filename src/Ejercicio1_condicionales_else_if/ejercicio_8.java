package Ejercicio1_condicionales_else_if;

import javax.swing.*;

/*digite numero y muestra cuantas cifras tiene*/
public class ejercicio_8 {
    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite un número entre 0 y 99,999"));

        if (num >= 0 && num <= 99999) {
            int cifras;

            if (num < 10) {
                cifras = 1;
            } else if (num < 100) {
                cifras = 2;
            } else if (num < 1000) {
                cifras = 3;
            } else if (num < 10000) {
                cifras = 4;
            } else {
                cifras = 5;
            }

            JOptionPane.showMessageDialog(null, "El número " + num + " tiene " + cifras + " cifras.");
        } else {
            JOptionPane.showMessageDialog(null, "El número está fuera del rango permitido.");
        }
    }
}

