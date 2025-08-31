package ciclos_while.ejercicios;

import javax.swing.*;

/*
escribir todos los numeros del 100 al 0 de 7 en 7
* */
public class ejercicio_9 {
    public static void main(String[] args){
        int num  ;
        num = Integer.parseInt(JOptionPane.showInputDialog("digite un numero del 100 al 0: "));

        //inciador  //condicion //incremento o decremento
        for (int i = 100; i >= 0; i-=7) {
            System.out.println(i);
        }

    }
}
