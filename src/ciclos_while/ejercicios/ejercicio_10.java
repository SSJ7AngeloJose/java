package ciclos_while.ejercicios;
/*pedir 10 num y escribir la suma total*/

import javax.swing.*;

public class ejercicio_10 {
    public static void main(String[] args){
        int num , suma = 0;

        for (int i = 1; i <= 10 ; i++) {
            num  = Integer.parseInt(JOptionPane.showInputDialog("digite   10 numeros  : "+ i + " "));
            suma += num;
        }
        System.out.println("la suma total es: " + suma);
    }
}
