package condicionales;

import javax.swing.*;

public class Condicionales_operador_Desigualdad {
    public static void main(String[] args) {
        int numero, dato = 5;
        numero = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));

        if(numero != dato){
            JOptionPane.showMessageDialog(null, "El numero es diferente de: 5");
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero   es    5");
        }
    }
}
