package condicionales_else_if.Ejercicio1_condicionales_else_if.Switch;

import javax.swing.*;


/*/*Suficiente,
Notable y Sobresaliente.

        Insuficiente,

        · Ejercicio 12: Pedir una nota de 0
a 10 y mostrarla de la forma:
Bien,
*/

public class ejercicio_12 {
    public static void main(String[] args){
        int nota = 0 - 10;

        nota = Integer.parseInt(JOptionPane.showInputDialog("digite una nota de 0 a 10: "));

        switch(nota){
            case 0:
            case 1:
            case 2:
            case 3:
            JOptionPane.showMessageDialog(null, "insuficiente" + nota);
            break;
            case 4:
                JOptionPane.showMessageDialog(null, "suficiente" + nota);
                break;
            case 5:
                JOptionPane.showMessageDialog(null, "bien" + nota);
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"Notable" + nota);
                break;
            case 7:
            case 8:
                JOptionPane.showMessageDialog(null, "Sobresaliente" + nota);
                break;
            case 9:
            case 10:
                JOptionPane.showMessageDialog(null, "Matricula de honor" + nota);
                break;
            default:
                JOptionPane.showMessageDialog(null,"no existe la nota ");
        }




    }
}
