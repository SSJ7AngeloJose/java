package ciclos_while.ejercicios;

import javax.swing.*;

/*
pedir numeros hasta que se introduzca uno negativo y calcular la media
* */
public class ejercicio_7 {
    public static void main(String[] args){
        int num, elementos= 0, suma=0;
        float media;

        num = Integer.parseInt(JOptionPane.showInputDialog("digite un numero : "));

        while (num >= 0){
           suma += num;
           elementos ++;

        num = Integer.parseInt(JOptionPane.showInputDialog("digite otro numero : "));

        }
        if (elementos == 0){
            System.out.println("No se puede calcular la media entre 0 no existe");
        }
        else{
            media = (float) suma/elementos;
            System.out.println("la media es : " + media);
        }



    }
}
