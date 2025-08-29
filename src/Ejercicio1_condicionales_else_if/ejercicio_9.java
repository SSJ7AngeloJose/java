package Ejercicio1_condicionales_else_if;

import javax.swing.*;

public class ejercicio_9 {
    public static void main(String[] args) {
        int dia, mes, año;
        dia = Integer.parseInt(JOptionPane.showInputDialog("digite el dia "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("digite el mes "));
        año = Integer.parseInt(JOptionPane.showInputDialog("digite el año "));

        if ((dia >= 1) && (dia <= 30)){
             if ((mes >= 1) && (mes  <= 12 )){
        if (año != 0){
            JOptionPane.showMessageDialog(null,"fecha correcta");
        }
        else{
            JOptionPane.showMessageDialog(null,"fecha incorrecta , año incorrecta");
        }
            }
            else{
                JOptionPane.showMessageDialog(null, "fecha incorrecta, mes incorrecto");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "El fecha es incorrecta, dia incorrecto");
        }

    }
}
