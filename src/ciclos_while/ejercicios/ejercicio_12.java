package ciclos_while.ejercicios;

import javax.swing.*;

/*pedir un numero y calcular su factorial*/
public class ejercicio_12 {
    public static void main(String[] args){

   int num = Integer.parseInt( JOptionPane.showInputDialog("ingrese un numero"));

     long factorial = 1;

     for (int i=1; i <= num; i++) {
          factorial = factorial * i;
     }
        System.out.println("el factorial de " + num + " es: " + factorial);
    }
}
