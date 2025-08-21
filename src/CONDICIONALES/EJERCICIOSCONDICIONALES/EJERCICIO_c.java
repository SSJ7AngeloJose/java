package CONDICIONALES.EJERCICIOSCONDICIONALES;

import javax.swing.*;

//EJERCICO HACER UN PROGRAMA QUE PREGUNTE POR UN NUMERO ENTERO Y MUESTRE SI ES MULTIPLO DE 10 O NO
public class EJERCICIO_c {
    public static void main(String[] args) {
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog("diginte un numero entero:"));

        if (numero % 10 == 0) {
            JOptionPane.showMessageDialog(null," el numero es multiplo a "  + numero + " " );
        }
        else{
            JOptionPane.showMessageDialog(null," el numero multiplo es diferente a :  " + numero + " de 10" );
        }
    }
}
