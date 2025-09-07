package ciclos_while.ejercicios;

import javax.swing.*;

//pide un numero que debe estar entre 0 y 10 y mostrar tabla de multiplicar de dicho numero
public class ejercicio_16 {
    public static void main(String[] args){
        int num;
        for (int i = 0; i <= 10; i++){
            num = Integer.parseInt(JOptionPane.showInputDialog(("ingrese un numero:  entre 0 y 10 :")));
            if (num >= 0 && num <= 10){
                System.out.println("tabla de multiplicar del " + num);
                for (int j = 0; j <= 10; j++){
                    System.out.println(num + " x " + j + " = " + (num * j));
                }
                break;
            } else {
                System.out.println("numero incorrecto, intente nuevamente");
            }

        }
    }
}
