package CONDICIONALES;

import javax.swing.*;

public class Switch {
    public static void main(String[] args) {
        int dia = 3;

        dia  = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero entre 1-5"));

        switch (dia){
            case 1: JOptionPane.showMessageDialog(null, "Lunes");
                    break;
            case 2: JOptionPane.showMessageDialog(null, " Martes");
            break;
            case 3: JOptionPane.showMessageDialog(null, " Miercoles");
            break;
            case 4: JOptionPane.showMessageDialog(null, " Jueves");
            break;
            case 5: JOptionPane.showMessageDialog(null, " Viernes");
            break;

            default: JOptionPane.showMessageDialog(null, "Numero no valido, debe ser entre 1 y 5");
                     break;
        }
    }
}
