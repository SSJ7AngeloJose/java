package CONDICIONALES.EJERCICIOSCONDICIONALES;

import javax.swing.*;

//pedir un numero entre 0 y 99 999 y decir cuanas cifras tiene
public class ejercicio_9 {
    public static void main(String[] args) {


        int numeros = Integer.parseInt(JOptionPane.showInputDialog("digite un numero entre 0 y 999 99999"));
        int cifras = String.valueOf(numeros).length();
        if (numeros >= 0 && numeros <= 99999 ){
            JOptionPane.showMessageDialog(null, "El numero tiene" + cifras + "cifras");

        }
        else{
            JOptionPane.showMessageDialog(null, "El numero esta fuera de rango 0 - 99999");
        }







    }
}
