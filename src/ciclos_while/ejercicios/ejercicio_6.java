package ciclos_while.ejercicios;


/*
· Ejercicio 6: Pedir números hasta
que se teclee un 0, mostrar la
suma de todos los números
introducidos.
 */

import javax.swing.*;

public class ejercicio_6 {
    public static void main (String[] args) {
        int num;
        int suma = 0;
        num = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));

        while (num != 0){
            suma += num;
            JOptionPane.showMessageDialog(null, "la suma "  + num + "de todos los resultados es : " +  suma );

            num = Integer.parseInt(JOptionPane.showInputDialog("digite un numero: "));

        }
    }
}
