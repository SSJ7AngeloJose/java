package ciclos_while.ejercicios;

import javax.swing.*;
//pedir 10 numeros y mostrar al final si se ha introducido algo negativo

public class ejercicio_21 {
    public static void main(String[] args){
        int numero, negativos = 0;

        for (int i = 1; i<=10; i++){
            numero = Integer.parseInt(JOptionPane.showInputDialog("introduce numero del 1 al 10 :" + i));

            if (numero < 0){
                negativos++;
            }
            if (negativos > 0) {
                System.out.println("se ha introducido algun numero negativo");
            }else{
                System.out.println("no se a introducido ningun numero negativo");
            }
        }


    }
}
