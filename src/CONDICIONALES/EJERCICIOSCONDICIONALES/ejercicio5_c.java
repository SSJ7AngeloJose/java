package CONDICIONALES.EJERCICIOSCONDICIONALES;

import javax.swing.*;

//. Ejercicio 5: Un obrero necesita calcular su salario
//semanal, el cual se obtiene de la siguiente manera:
//V Si trabaja 40 horas o menos se le paga $16 por hora
//V Si trabaja mas de 40 horas se le paga $16 por cada
//una de las primeras 40 horas y $20 por cada hora
//extra.

public class ejercicio5_c {
    public static void main(String[] args) {
        int horasTrabajadas, horasExtra, salarioFinal;

        horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Introduce las horas trabajadas en la semana: "));
        if (horasTrabajadas <= 40) {
            salarioFinal = horasTrabajadas * 16;
            JOptionPane.showMessageDialog(null, "El salario semanal es: $" + salarioFinal);
        } else {
            horasExtra = horasTrabajadas - 40;
            salarioFinal = (40 * 16) + (horasExtra * 20);
            JOptionPane.showMessageDialog(null, "El salario semanal es: $" + salarioFinal);
        }


    }
}
