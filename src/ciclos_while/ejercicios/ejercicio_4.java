package ciclos_while.ejercicios;

/*pedir numeros hasta que se teclee uno negativo y mostrar cuantos numeros se han introducido*/

import javax.swing.*;

public class ejercicio_4 {
    public static void main(String[] args){
        int num;
        int contador = 0;

        num = Integer.parseInt(JOptionPane.showInputDialog("digite un numero : "));

        // Mientras el número no sea negativo
        while (num >= 0){
                 contador++;
            JOptionPane.showMessageDialog(null, "el numero es : "+ num + " y el contador es : " + contador);

            //pedir otro numero
            num = Integer.parseInt(JOptionPane.showInputDialog("digite otro  numero :  "));
        }

                JOptionPane.showMessageDialog(null, "el numero es negativo, el contador final es : " + contador);
            }


        }


