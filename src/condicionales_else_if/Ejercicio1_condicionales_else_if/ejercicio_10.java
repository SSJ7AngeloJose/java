package condicionales_else_if.Ejercicio1_condicionales_else_if;

import javax.swing.*;

public class ejercicio_10 {
    public static void main(String[] args) {
        int dia, mes, año;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Digite el día:"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digite el mes:"));
        año = Integer.parseInt(JOptionPane.showInputDialog("Digite el año:"));

        boolean fechaValida = false;

        if (mes >= 1 && mes <= 12) {
            if (año != 0) {
                switch (mes) {
                    case 2: // Febrero
                        if (dia >= 1 && dia <= 28) fechaValida = true;
                        break;
                    case 4: case 6: case 9: case 11: // Meses de 30 días
                        if (dia >= 1 && dia <= 30) fechaValida = true;
                        break;
                    default: // Meses de 31 días
                        if (dia >= 1 && dia <= 31) fechaValida = true;
                }

                if (fechaValida) {
                    JOptionPane.showMessageDialog(null, "Fecha correcta");
                } else {
                    JOptionPane.showMessageDialog(null, "Fecha incorrecta: día inválido para el mes");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Fecha incorrecta: año inválido");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Fecha incorrecta: mes inválido");
        }
    }
}