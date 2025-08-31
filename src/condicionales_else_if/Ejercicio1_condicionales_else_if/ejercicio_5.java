package condicionales_else_if.Ejercicio1_condicionales_else_if;

import javax.swing.*;

public class ejercicio_5 {
    public static void main(String[] args) {
        int horastrabajadas;
        float salariototal;
        horastrabajadas = Integer.parseInt(JOptionPane.showInputDialog("digite el total de horas trabajadas."));
        if (horastrabajadas <= 40){
            salariototal = horastrabajadas * 16;
        }
        else{
            salariototal = (40*16) + ((horastrabajadas-40) * 20);

        }
        JOptionPane.showMessageDialog(null,"el salario total es: " + salariototal);

    }
}
