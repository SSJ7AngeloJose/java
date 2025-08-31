package ciclos_while.ejercicios;

/*leer numeros hasta que se introduzca un 0 para cada uno indicar si es par o impar gracias a esto = != */

import javax.swing.*;

public class ejercicio_3 {
    public static void main(String[] args){
     int num;
     num = Integer.parseInt(JOptionPane.showInputDialog("digite un numero : "));
     while (num != 0){
      if(num % 2 == 0){
    JOptionPane.showMessageDialog(null,"el numero : " + num + " es par");
      }
      else{
          JOptionPane.showMessageDialog(null,"el numero : " + num + " es impar");
      }
         num = Integer.parseInt(JOptionPane.showInputDialog("digite otro  numero :  " ));

     }


    }
}
