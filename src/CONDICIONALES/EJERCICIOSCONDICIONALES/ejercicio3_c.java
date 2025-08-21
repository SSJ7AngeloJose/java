package CONDICIONALES.EJERCICIOSCONDICIONALES;

import javax.swing.*;

public class ejercicio3_c {
    public static void main(String[] args) {
        char letra ;
        letra = JOptionPane.showInputDialog("Introduce una letra: ").charAt(0);

        if (Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null, "La letra '" + letra + "' es mayúscula.");
        } else if (Character.isLowerCase(letra)) {
            JOptionPane.showMessageDialog(null, "La letra '" + letra + "' es minúscula.");
        } else {
            JOptionPane.showMessageDialog(null, "El carácter '" + letra + "' no es una letra válida.");

        }


    }
}
