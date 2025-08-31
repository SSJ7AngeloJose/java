package ciclos_while.ejercicios;

import javax.swing.*;

/*leer un numero y mostrar su cuadrado repetir el proceso hasta que se introduzca un numero negativo*/
public class ejercicio_1 {
    public static void main(String[]args){
        int num, cuadrado ;

        num = Integer.parseInt(JOptionPane.showInputDialog("digite un numero :"));
        while(num >= 0){
           cuadrado = (int)Math.pow(num, 2);
           JOptionPane.showMessageDialog(null ,"el numero" + num + "elevado al cuadrado es : "+ cuadrado);
           num  = Integer.parseInt(JOptionPane.showInputDialog("digite un numero :"));
        }
    }
}
