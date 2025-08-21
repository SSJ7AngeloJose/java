package CONDICIONALES;

import javax.swing.*;

public class condicionales {
    public static void main(String[] args) {
        int numero, dato = 5;

        numero = Integer.parseInt(JOptionPane.showInputDialog("digita un numero entero:"));

        //!= operador desigualdad
        //== operador igualdad
        // > operador mayor que
        // < operador menor que

        // >= operador mayor o igual que
        // <= operador menor o igual que
        // && operador AND
        // || operador OR
        // ! operador NOT
        // if (condicion) { // si la condicion es verdadera
        //     // hacer algo
        // } else { // si la condicion es falsa

        if(numero == dato){
            JOptionPane.showMessageDialog(null,"el numero es 5");
        }
        else{
            JOptionPane.showMessageDialog(null," el numero es diferente de 5 ");
        }

    }
}
