package condicionales_else_if;

import javax.swing.*;

public class Condicionales_menor_e_igual {
    public static void main(String[] args) {
        int numero , data = 5;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null, "digite un numero"));

        if (numero <= data){
            JOptionPane.showMessageDialog(null, "el numero es 5 o menor 5   :");
        }
        else {
            JOptionPane.showMessageDialog(null, "el numero es mayor a 5   :");
        }
    }

}
