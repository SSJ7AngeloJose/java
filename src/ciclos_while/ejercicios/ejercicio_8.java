package ciclos_while.ejercicios;

/*
 pedir un numero N y mostrar todos los numeros del 1 al N
*/

import javax.swing.*;

public class ejercicio_8 {
    public   static void main(String[] args){

        int num, i= 1;

        num = Integer.parseInt(JOptionPane.showInputDialog("digite un numero : "));


        while (i <= num){
            System.out.println(i);
            i++;
        }



    }
}
