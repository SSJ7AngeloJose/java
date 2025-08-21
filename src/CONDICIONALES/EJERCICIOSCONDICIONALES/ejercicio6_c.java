package CONDICIONALES.EJERCICIOSCONDICIONALES;

import javax.swing.*;


//Ejercicio 6: Hacer un programa
//que tome dos números y diga si
//ambos son pares o impares.

public class ejercicio6_c {
    public static void main(String[] args) {
        int numero1, numero2;

        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número: "));
        // Verificar si ambos números son pares
        if (numero1 % 2 == 0 && numero2 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Ambos números son pares.");
        }
        // Verificar si ambos números son impares
        else if (numero1 % 2 != 0 && numero2 % 2 != 0) {
            JOptionPane.showMessageDialog(null, "Ambos números son impares.");
        }
        // Si uno es par y el otro impar
        else {
            JOptionPane.showMessageDialog(null, "Uno de los números es par y el otro es impar.");
        }


    }
}
