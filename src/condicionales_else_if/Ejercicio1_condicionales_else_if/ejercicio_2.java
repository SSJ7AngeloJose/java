package condicionales_else_if.Ejercicio1_condicionales_else_if;

import javax.swing.*;

public class ejercicio_2 {
    public static void main(String[] args){
        int numero1, numero2;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2:"));

        if (numero1  >= numero2){
            JOptionPane.showMessageDialog(null, "el numero 1 es mayor o igual al numero 2:");
        }
        else{
            JOptionPane.showMessageDialog(null, "el numero 2  es mayor al numero 1:");
    }
}
}

/* version mejorada
            if (numero1 > numero2){
            JOptionPane.showMessageDialog(null, "El número 1 es mayor que el número 2.");
        } else if (numero1 < numero2){
            JOptionPane.showMessageDialog(null, "El número 2 es mayor que el número 1.");
        } else {
            JOptionPane.showMessageDialog(null, "Ambos números son iguales.");
        }
*/