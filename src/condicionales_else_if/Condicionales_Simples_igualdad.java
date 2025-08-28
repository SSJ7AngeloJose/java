package condicionales_else_if;

import javax.swing.*;

public class Condicionales_Simples_igualdad {
    public static void main(String[]args) {
        int numero, dato = 5;
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));

        if(numero == dato){
            JOptionPane.showMessageDialog(null, "El numero es: 5");
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero   es diferente a 5");
        }


    }
}
