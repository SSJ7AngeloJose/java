package Ejercicio1_condicionales_else_if;

import javax.swing.*;

public class ejercicio_3 {
    public static  void main(String[] args){
        char letra;
        letra = JOptionPane.showInputDialog("digite una letra :").charAt(0);
        if (Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, "Letra mayuscula");
        }
        else{
            JOptionPane.showMessageDialog(null, "Letra minuscula");
        }

    }
}
