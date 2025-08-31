package condicionales_else_if.Ejercicio1_condicionales_else_if;


/*hacer un programa que lea un numero entero y muestre si el numero es multiplo de 10*/

import javax.swing.*;

public class ejercicio_1 {
    public static void main(String[] args){
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));

        if (numero %10 == 0){
            JOptionPane.showMessageDialog(null, "el numero " + numero + " es multiplo de 10");
        }
        else{
            JOptionPane.showMessageDialog(null, "el numero no es multiplo de 10");
        }


    }
}
