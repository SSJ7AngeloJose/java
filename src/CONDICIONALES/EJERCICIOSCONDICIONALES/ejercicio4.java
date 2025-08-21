package CONDICIONALES.EJERCICIOSCONDICIONALES;

import javax.swing.*;

public class ejercicio4 {
    public static void main(String[] args) {
        int precio, descuento, precioFinal;
        precio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el precio del producto: "));
        descuento =(int) Double.parseDouble(JOptionPane.showInputDialog("Introduce el descuento del producto (0-20): "));

        // Validar que el descuento esté entre 0 y 20
            if (descuento < 0 || descuento > 20) {
            JOptionPane.showMessageDialog(null, "El descuento debe estar entre 0 y 20.");
        } else {
            // Calcular el precio final
            precioFinal = precio - (precio * descuento / 100);
            JOptionPane.showMessageDialog(null, "El precio final del producto es: " + precioFinal);
        }




    }
}
