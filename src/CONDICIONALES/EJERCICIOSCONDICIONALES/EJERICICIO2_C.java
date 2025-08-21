package CONDICIONALES.EJERCICIOSCONDICIONALES;

import com.sun.tools.javac.Main;

import javax.swing.*;

public class EJERICICIO2_C {
    public static void main(String[] args) {
        int numero, numero2;
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero mayor o menor:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("digite un numero entero:"));

        if (numero > numero2) {
            JOptionPane.showMessageDialog(null, "el numero es  mayor" + numero);
        } else if (numero < numero2) {
            JOptionPane.showMessageDialog(null, "el numero es  menor" + numero2);
        }
        else{
            JOptionPane.showMessageDialog(null, "los numeros son iguales");
        }
    }
    }

