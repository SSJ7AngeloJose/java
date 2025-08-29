package Ejercicio1_condicionales_else_if;

import javax.swing.*;

/*pedir tres numeros y mostrarlos ordenados de mayor a menor*/
public class ejercicio_7 {
    public static void main(String[] args) {
        int n1,n2,n3;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("digite un numero"));

        if ((n1 > n2) && (n2  > n3)) {
            JOptionPane.showMessageDialog(null, "ORDEN: "+n1+"- "+n2+" - "+n3);
        }
        else if ((n1 > n3) && (n3  > n2)) {
            JOptionPane.showMessageDialog(null, "ORDEN: "+n1+"- "+n3+" - "+n2);
        }
        else if ((n2 > n1) && (n1  > n2)) {
            JOptionPane.showMessageDialog(null, "ORDEN: "+n1+"- "+n1+" - "+n3);
        }
        else if ((n2 > n3) && (n3  > n1)) {
            JOptionPane.showMessageDialog(null, "ORDEN: "+n2+"- "+n3+" - "+n2);
        }
        else if ((n3 > n2) && (n1  > n2)) {
            JOptionPane.showMessageDialog(null, "ORDEN: "+n3+"- "+n1+" - "+n2);
        }
        else{
            JOptionPane.showMessageDialog(null, "ORDEN no valido : " +n3+" - "+n2+" - "+n1 );
        }

    }
}
