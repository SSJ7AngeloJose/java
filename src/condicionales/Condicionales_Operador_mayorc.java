package condicionales;

import javax.swing.*;

public class Condicionales_Operador_mayorc {
    public static void main(String[] args) {
        int numero , dato =5;

        numero =   Integer.parseInt(JOptionPane.showInputDialog(null, "digite un numero"));

        if (numero > dato  ){
            JOptionPane.showMessageDialog(null, "el numero es mayor 5:");
        }
        else {
            JOptionPane.showMessageDialog(null, "el numero es menor a 5 o menor :");
        }
    }
    }

