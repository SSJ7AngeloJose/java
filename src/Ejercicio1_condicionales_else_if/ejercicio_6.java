package Ejercicio1_condicionales_else_if;

import javax.swing.*;

public class ejercicio_6 {
    public static void main(String[] args){
        int num1 , num2 ;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("digete el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("digete el segundo numero"));

        if (num1 % 2 == 0 && num2 % 2 == 0){
            JOptionPane.showMessageDialog(null, "los dos son pares");
        }
        else {
            JOptionPane.showMessageDialog(null, "los dos son impares");
        }


    }
}
