package condicionales_else_if;

import javax.swing.*;

public class Condicionales_mayor_e_menor {
    public  static void main(String[] args) {
       int numero , data = 5;
       numero = Integer.parseInt(JOptionPane.showInputDialog(null, "digite un numero"));

       if (numero >= data){
           JOptionPane.showMessageDialog(null, "el numero es mayor o igua la 5   :");
       }
       else {
           JOptionPane.showMessageDialog(null, "el numero es menor a 5   :");
       }
    }
}
