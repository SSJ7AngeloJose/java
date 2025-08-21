package CONDICIONALES.EJERCICIOSCONDICIONALES;

import javax.swing.*;
//Operador	Significado
//==	Igual a
//!=	Distinto de
//>	Mayor que
//<	Menor que
//>=	Mayor o igual que
//<=	Menor o igual que

public class ejercicio7_c {
    public static void main(String[] args) {
        int numero1, numero2, numero3;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("digita un numero entero:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("digita otro numero entero:"));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("digita un tercer numero entero:"));

        if (numero1 % 2 == 0 && numero2 % 2 == 0 && numero3 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "EL NUMERO ES PAR");
        } else if (numero1 % 2 != 0 && numero2 % 2 != 0 && numero3 % 2 != 0) {
            JOptionPane.showMessageDialog(null, "EL NUMERO ES IMPAR");
        }
        else {
            JOptionPane.showMessageDialog(null, "UNO DE LOS NUMEROS ES PAR Y OTRO IMPAR");
        }

    }
}
